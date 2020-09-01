package test.task.ecobike.service.impl;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import test.task.ecobike.mapper.FoldingBikeMapper;
import test.task.ecobike.model.FoldingBike;
import test.task.ecobike.model.dto.request.FoldingBikeRequestDto;
import test.task.ecobike.repository.FoldingBikeRepository;
import test.task.ecobike.service.FoldingBikeService;

@Service
@AllArgsConstructor
public class FoldingBikeServiceImpl implements FoldingBikeService {
    private FoldingBikeRepository foldingBikeRepository;
    private FoldingBikeMapper foldingBikeMapper;

    @Override
    public FoldingBike add(FoldingBike foldingBike) {
        return foldingBikeRepository.saveAndFlush(foldingBike);
    }

    @Override
    public List<FoldingBike> getByParams(FoldingBikeRequestDto foldingBikeRequestDto) {
        FoldingBike foldingBike = foldingBikeMapper.getFoldingBikeFromFoldingBikeRequest(foldingBikeRequestDto);
        return foldingBikeRepository.findAll(Example.of(foldingBike));
    }

    @Override
    public List<FoldingBike> getAll() {
        return foldingBikeRepository.findAll();
    }
}
