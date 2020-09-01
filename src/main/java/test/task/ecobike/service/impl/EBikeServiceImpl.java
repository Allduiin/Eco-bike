package test.task.ecobike.service.impl;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import test.task.ecobike.mapper.EBikeMapper;
import test.task.ecobike.model.EBike;
import test.task.ecobike.model.dto.request.EBikeRequestDto;
import test.task.ecobike.repository.EBikeRepository;
import test.task.ecobike.service.EBikeService;

@Service
@AllArgsConstructor
public class EBikeServiceImpl implements EBikeService {
    private EBikeRepository ebikeRepository;
    private EBikeMapper ebikeMapper;

    @Override
    public EBike add(EBike ebike) {
        return ebikeRepository.saveAndFlush(ebike);
    }

    @Override
    public List<EBike> getByParams(EBikeRequestDto ebikeRequestDto) {
        EBike ebike = ebikeMapper.getEBikeFromEBikeRequestDto(ebikeRequestDto);
        return null;
    }

    @Override
    public List<EBike> getAll() {
        return ebikeRepository.findAll();
    }
}
