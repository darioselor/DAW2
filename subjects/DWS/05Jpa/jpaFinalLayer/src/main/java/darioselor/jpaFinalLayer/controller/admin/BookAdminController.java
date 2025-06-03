package darioselor.jpaFinalLayer.controller.admin;

import darioselor.jpaFinalLayer.config.PropertiesConfig;
import darioselor.jpaFinalLayer.controller.PaginatedResponse;
import darioselor.jpaFinalLayer.controller.user.webmodel.book.BookCollection;
import darioselor.jpaFinalLayer.controller.user.webmodel.book.BookMapper;
import darioselor.jpaFinalLayer.domain._1model.Author;
import darioselor.jpaFinalLayer.domain._1model.Book;
import darioselor.jpaFinalLayer.domain._1model.Genre;
import darioselor.jpaFinalLayer.domain._1model.ListWithCount;
import darioselor.jpaFinalLayer.domain._2usecase.book.BookFindByIsbnUseCase;
import darioselor.jpaFinalLayer.domain._2usecase.book.BookGetAllUseCase;
import darioselor.jpaFinalLayer.domain._2usecase.book.admin.BookDeleteUseCase;
import darioselor.jpaFinalLayer.domain._2usecase.book.admin.BookInsertAuthorsUseCase;
import darioselor.jpaFinalLayer.domain._2usecase.book.admin.BookInsertGenresUseCase;
import darioselor.jpaFinalLayer.domain._2usecase.book.admin.BookInsertUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("${app.admin.path}/books")
public class BookAdminController {
    public static final String URL = PropertiesConfig.getSetting("app.admin.path")+"/books";
    private final String defaultPageSize = PropertiesConfig.getSetting("app.pageSize.default");

    private final BookGetAllUseCase bookGetAllUseCase;
    private final BookFindByIsbnUseCase bookFindByIsbnUseCase;
    private final BookInsertUseCase bookInsertUseCase;
    private final BookInsertAuthorsUseCase bookInsertAuthorsUseCase;
    private final BookInsertGenresUseCase bookInsertGenresUseCase;
    private final BookDeleteUseCase bookDeleteUseCase;

    @GetMapping
    public ResponseEntity<PaginatedResponse<BookCollection>> findAll(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(required = false) Integer size
    ){
        int pageSize = (size != null) ? page : Integer.parseInt(defaultPageSize);
        String baseUrl = PropertiesConfig.getSetting("app.base.url")+URL;
        ListWithCount<Book> bookList = bookGetAllUseCase.execute(page - 1, pageSize);
        PaginatedResponse<BookCollection> response = new PaginatedResponse<>(
                bookList
                        .getList()
                        .stream()
                        .map(BookMapper.INSTANCE::toBookCollection)
                        .toList(),
                bookList.getCount(), page, pageSize, baseUrl);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/{isbn}")
    public ResponseEntity<Book> findByIsbn(@PathVariable String isbn) {
        Book book = bookFindByIsbnUseCase.execute(isbn);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @PostMapping("/{id}/authors")
    public ResponseEntity<Void> insertAuthors(@PathVariable Integer id, @RequestBody List<Author> authors) {
        bookInsertAuthorsUseCase.execute(id, authors);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/{id}/genres")
    public ResponseEntity<Void> insertGenres(@PathVariable Integer id, @RequestBody List<Genre> genres){
        bookInsertGenresUseCase.execute(id, genres);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody Book book){
        bookInsertUseCase.execute(book);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id){
        bookDeleteUseCase.execute(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
