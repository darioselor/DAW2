package darioselor.jpaFinalLayer.domain._3service.impl;

import darioselor.jpaFinalLayer.domain._1model.Publisher;
import darioselor.jpaFinalLayer.domain._3service.PublisherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PublisherServiceImpl implements PublisherService {
    @Override
    public Optional<Publisher> findById(Long id) {
        return publisherRepository.findById(id);
    }
}
