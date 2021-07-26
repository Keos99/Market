package pet.bazaar.service;

import pet.bazaar.entity.CarsEntity;

import java.util.List;

public interface CarsService {
    CarsEntity getById(Long id);

    CarsEntity addCarsEntity(CarsEntity carsEntity);

    CarsEntity updateCarsEntity(CarsEntity carsEntity);

    List<CarsEntity> getList();
}
