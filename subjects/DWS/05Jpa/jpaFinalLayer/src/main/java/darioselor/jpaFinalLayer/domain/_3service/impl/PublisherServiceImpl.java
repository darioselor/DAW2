package darioselor.jpaFinalLayer.domain._3service.impl;

import darioselor.jpaFinalLayer.domain._1model.Publisher;
import darioselor.jpaFinalLayer.domain._3service.PublisherService;
import darioselor.jpaFinalLayer.domain._4repository.PublisherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PublisherServiceImpl implements PublisherService {
    private final PublisherRepository publisherRepository;
    @Override
    public Optional<Publisher> findById(Long id) {
        return publisherRepository.findById(id);
    }
}
