package test.task.eco_bike.service.impl;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import test.task.eco_bike.model.EBike;
import test.task.eco_bike.model.dto.request.EBikeRequestDto;
import test.task.eco_bike.repository.EBikeRepository;
import test.task.eco_bike.service.EBikeService;

@Service
@AllArgsConstructor
public class EBikeServiceImpl implements EBikeService {
    private EBikeRepository eBikeRepository;

    @Override
    public EBike add(EBike eBike) {
        return eBikeRepository.saveAndFlush(eBike);
    }

    @Override
    public EBike getByParams(EBikeRequestDto eBikeRequestDto) {
        return null;
    }

    @Override
    public List<EBike> getAll() {
        return null;
    }
}
