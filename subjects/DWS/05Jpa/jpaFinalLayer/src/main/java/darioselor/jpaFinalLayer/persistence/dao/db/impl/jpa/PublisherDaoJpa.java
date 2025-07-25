package darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa;


import darioselor.jpaFinalLayer.domain._1model.ListWithCount;
import darioselor.jpaFinalLayer.domain._1model.Publisher;
import darioselor.jpaFinalLayer.persistence.dao.db.PublisherDaoDb;
import darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa.entity.PublisherEntity;
import darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa.mapper.PublisherJpaMapper;
import darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa.repository.PublisherJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
@Primary
public class PublisherDaoJpa implements PublisherDaoDb {

    private final PublisherJpaRepository publisherJpaRepository;

    @Override
    public List<Publisher> findAll() {
        return publisherJpaRepository
                .findAll()
                .stream()
                .map(PublisherJpaMapper.INSTANCE::toPublisher)
                .toList();
    }

    @Override
    public ListWithCount<Publisher> findAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<PublisherEntity> publisherPage = publisherJpaRepository.findAll(pageable);
        return new ListWithCount<>(
                publisherJpaRepository.findAll(pageable)
                        .stream()
                        .map(PublisherJpaMapper.INSTANCE::toPublisher)
                        .toList(),
                publisherPage.getNumberOfElements()
        );

    }

    @Override
    public Optional<Publisher> findById(long id) {
        return publisherJpaRepository.findById(id)
                .map(PublisherJpaMapper.INSTANCE::toPublisher);
    }

    @Override
    public long insert(Publisher publisher) {
        PublisherEntity PublisherEntity = publisherJpaRepository
                .save(PublisherJpaMapper.INSTANCE.toPublisherEntity(publisher));
        return PublisherEntity.getId();
    }

    @Override
    public void update(Publisher publisher) {
        publisherJpaRepository.save(PublisherJpaMapper.INSTANCE.toPublisherEntity(publisher));
    }

    @Override
    public void delete(long id) {
        publisherJpaRepository.deleteById(id);
    }

    @Override
    public long count() {
        return publisherJpaRepository.count();
    }

    @Override
    public Publisher save(Publisher publisher) {
        return PublisherJpaMapper.INSTANCE.toPublisher(
                publisherJpaRepository.save(PublisherJpaMapper.INSTANCE.toPublisherEntity(publisher))
        );
    }
}