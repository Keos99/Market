package pet.bazaar.dao.impl;

import pet.bazaar.dao.CarsDao;
import pet.bazaar.entity.CarsEntity;

public class CarsDaoImpl extends BasicDaoImpl<CarsEntity> implements CarsDao {
    public CarsDaoImpl(Class<CarsEntity> entityClass) {
        super(entityClass);
    }
}
