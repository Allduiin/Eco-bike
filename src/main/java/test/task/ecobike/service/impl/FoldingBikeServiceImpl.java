package test.task.ecobike.service.impl;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import test.task.ecobike.model.FoldingBike;
import test.task.ecobike.model.dto.request.FoldingBikeRequestDto;
import test.task.ecobike.repository.FoldingBikeRepository;
import test.task.ecobike.service.FoldingBikeService;

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
