package test.task.eco_bike.service.impl;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import test.task.eco_bike.model.FoldingBike;
import test.task.eco_bike.model.dto.request.FoldingBikeRequestDto;
import test.task.eco_bike.repository.FoldingBikeRepository;
import test.task.eco_bike.service.FoldingBikeService;

@Service
@AllArgsConstructor
public class FoldingBikeServiceImpl implements FoldingBikeService {
    private FoldingBikeRepository foldingBikeRepository;

    @Override
    public FoldingBike add(FoldingBike foldingBike) {
        return foldingBikeRepository.saveAndFlush(foldingBike);
    }

    @Override
    public FoldingBike getByParams(FoldingBikeRequestDto foldingBikeRequestDto) {
        return null;
    }

    @Override
    public List<FoldingBike> getAll() {
        return foldingBikeRepository.findAll();
    }
}
