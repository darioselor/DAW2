package darioselor.jpaFinalLayer.persistence.repository.impl;

import darioselor.jpaFinalLayer.domain._1model.Publisher;
import darioselor.jpaFinalLayer.domain._4repository.PublisherRepository;
import darioselor.jpaFinalLayer.persistence.dao.db.PublisherDaoDb;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PublisherRepositoryImpl implements PublisherRepository {

    private final PublisherDaoDb publisherDaoDb;

    @Override
    public Optional<Publisher> findById(long id) {
        return publisherDaoDb.findById(id);
    }
}
