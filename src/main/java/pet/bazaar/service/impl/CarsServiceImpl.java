package pet.bazaar.service.impl;

import pet.bazaar.dao.CarsDao;
import pet.bazaar.entity.CarsEntity;
import pet.bazaar.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("carsService")
public class CarsServiceImpl implements CarsService {
    @Autowired
    private CarsDao carsDao;

    @Override
    public CarsEntity getById(Long id) {
        return carsDao.getById(id);
    }

    @Override
    public CarsEntity addCarsEntity(CarsEntity carsEntity) {
        return carsDao.add(carsEntity);
    }

    @Override
    public CarsEntity updateCarsEntity(CarsEntity carsEntity) {
        return carsDao.update(carsEntity);
    }

    @Override
    public List<CarsEntity> getList() {
        return carsDao.getList();
    }
}
