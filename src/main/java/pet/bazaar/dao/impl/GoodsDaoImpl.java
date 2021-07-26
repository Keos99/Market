package pet.bazaar.dao.impl;

import pet.bazaar.dao.GoodsDao;
import pet.bazaar.entity.Goods;

import java.util.List;

public class GoodsDaoImpl extends BasicDaoImpl<Goods> implements GoodsDao {
    public GoodsDaoImpl(Class<Goods> entityClass) {
        super(entityClass);
    }

    @Override
    public List<Goods> getGoodsByName(String name) {
        return (List<Goods>) sessionFactory.getCurrentSession().
                createQuery("from Goods as g where g.name = ?").setParameter(0, name).list();
    }
}