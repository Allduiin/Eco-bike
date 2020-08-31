package test.task.eco_bike.service.impl;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import test.task.eco_bike.model.Speedelec;
import test.task.eco_bike.model.dto.request.SpeedelecRequestDto;
import test.task.eco_bike.repository.SpeedelecRepository;
import test.task.eco_bike.service.SpeedelecService;

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
        Speedelec speedelec = new Speedelec();/** Need to create Mappers*/
        return speedelecRepository.findOne(Example.of(speedelec))
                .orElseThrow(() -> new RuntimeException("Can not find speedelec by params"));
    }

    @Override
    public List<Speedelec> getAll() {
        return speedelecRepository.findAll();
    }
}
