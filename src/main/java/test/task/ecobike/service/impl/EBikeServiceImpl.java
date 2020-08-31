package test.task.ecobike.service.impl;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import test.task.ecobike.model.EBike;
import test.task.ecobike.model.dto.request.EBikeRequestDto;
import test.task.ecobike.repository.EBikeRepository;
import test.task.ecobike.service.EBikeService;

@Service
@AllArgsConstructor
public class EBikeServiceImpl implements EBikeService {
    private EBikeRepository ebikeRepository;

    @Override
    public EBike add(EBike ebike) {
        return ebikeRepository.saveAndFlush(ebike);
    }

    @Override
    public EBike getByParams(EBikeRequestDto ebikeRequestDto) {
        return null;
    }

    @Override
    public List<EBike> getAll() {
        return ebikeRepository.findAll();
    }
}
