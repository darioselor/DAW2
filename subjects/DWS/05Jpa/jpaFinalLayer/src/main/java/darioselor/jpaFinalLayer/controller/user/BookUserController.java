package darioselor.jpaFinalLayer.controller.user;

import darioselor.jpaFinalLayer.config.PropertiesConfig;
import darioselor.jpaFinalLayer.controller.PaginatedResponse;
import darioselor.jpaFinalLayer.controller.user.webmodel.book.BookCollection;
import darioselor.jpaFinalLayer.controller.user.webmodel.book.BookDetail;
import darioselor.jpaFinalLayer.controller.user.webmodel.book.BookMapper;
import darioselor.jpaFinalLayer.domain._1model.Book;
import darioselor.jpaFinalLayer.domain._1model.ListWithCount;
import darioselor.jpaFinalLayer.domain._2usecase.book.BookCountUseCase;
import darioselor.jpaFinalLayer.domain._2usecase.book.BookFindByIsbnUseCase;
import darioselor.jpaFinalLayer.domain._2usecase.book.BookGetAllUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("${app.api.path}/books")
public class BookUserController {
    public static final String URL = PropertiesConfig.getSetting("app.api.path") + "/books";
    private final String defaultPageSize = PropertiesConfig.getSetting("app.pageSize.default");

    private final BookGetAllUseCase bookGetAllUseCase;
    private final BookCountUseCase bookCountUseCase;
    private final BookFindByIsbnUseCase bookFindByIsbnUseCase;

    @GetMapping
    public ResponseEntity<PaginatedResponse<BookCollection>> findAll(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(required = false) Integer size
    ){
        int pageSize = (size != null) ? size : Integer.parseInt(defaultPageSize);
        String baseUrl = PropertiesConfig.getSetting("app.base.url") + URL;
        ListWithCount<Book> bookList = bookGetAllUseCase.execute(page - 1, pageSize);
        PaginatedResponse<BookCollection> response = new PaginatedResponse<>(
                bookList
                        .getList()
                        .stream()
                        .map(BookMapper.INSTANCE::toBookCollection)
                        .toList(),
                bookList.getCount(), page, pageSize, baseUrl
        );
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @GetMapping("/{isbn}")
    public ResponseEntity<BookDetail> findByIsbn(@PathVariable String isbn) {
        BookDetail bookDetail = BookMapper.INSTANCE.toBookDetail(bookFindByIsbnUseCase.execute(isbn));
        return new ResponseEntity<>(bookDetail, HttpStatus.OK);
    }

}
