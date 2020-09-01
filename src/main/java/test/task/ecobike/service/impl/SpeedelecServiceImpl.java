package test.task.ecobike.service.impl;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import test.task.ecobike.mapper.SpeedelecMapper;
import test.task.ecobike.model.Speedelec;
import test.task.ecobike.model.dto.request.SpeedelecRequestDto;
import test.task.ecobike.repository.SpeedelecRepository;
import test.task.ecobike.service.SpeedelecService;

@Service
@AllArgsConstructor
public class SpeedelecServiceImpl implements SpeedelecService {
    private SpeedelecRepository speedelecRepository;
    private SpeedelecMapper speedelecMapper;

    @Override
    public Speedelec add(Speedelec speedelec) {
        return speedelecRepository.saveAndFlush(speedelec);
    }

    @Override
    public List<Speedelec> getByParams(SpeedelecRequestDto speedelecRequestDto) {
        Speedelec speedelec = speedelecMapper.getSpeedelecFromSpeedelecRequestDto(speedelecRequestDto);
        return speedelecRepository.findAll(Example.of(speedelec));
    }

    @Override
    public List<Speedelec> getAll() {
        return speedelecRepository.findAll();
    }
}
