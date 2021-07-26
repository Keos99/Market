package pet.bazaar.dao.impl;

import pet.bazaar.dao.GoodsCategoryDao;
import pet.bazaar.entity.GoodsCategory;

import java.util.List;

public class GoodsCategoryDaoImpl extends BasicDaoImpl<GoodsCategory> implements GoodsCategoryDao {
    public GoodsCategoryDaoImpl(Class<GoodsCategory> entityClass) {
        super(entityClass);
    }

    @Override
    public List<GoodsCategory> getGoodsCategoriesByName(String name) {
        return (List<GoodsCategory>) sessionFactory.getCurrentSession().
                createQuery("from GoodsCategory as gc where gc.name = ?").setParameter(0, name).list();
    }
}