package test.task.ecobike.service.impl;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import test.task.ecobike.model.Speedelec;
import test.task.ecobike.model.dto.request.SpeedelecRequestDto;
import test.task.ecobike.repository.SpeedelecRepository;
import test.task.ecobike.service.SpeedelecService;

@Service
@AllArgsConstructor
public class SpeedelecServiceImpl implements SpeedelecService {
    private SpeedelecRepository speedelecRepository;

    @Override
    public Speedelec add(Speedelec speedelec) {
        return speedelecRepository.saveAndFlush(speedelec);
    }

    @Override
    public Speedelec getByParams(SpeedelecRequestDto speedelecRequestDto) {
        // Need to create Mappers
        Speedelec speedelec = new Speedelec();
        return speedelecRepository.findOne(Example.of(speedelec))
                .orElseThrow(() -> new RuntimeException("Can not find speedelec by params"));
    }

    @Override
    public List<Speedelec> getAll() {
        return speedelecRepository.findAll();
    }
}
