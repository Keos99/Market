package pet.bazaar.dao.impl;

import pet.bazaar.dao.BasketDao;
import pet.bazaar.entity.Basket;

import java.util.List;

public class BasketDaoImpl extends BasicDaoImpl<Basket> implements BasketDao {

    public BasketDaoImpl(Class<Basket> entityClass) {
        super(entityClass);
    }

    @Override
    public List<Basket> getBasketByOrderId (String orderid) {
        return (List<Basket>) sessionFactory.getCurrentSession().
                createQuery("from Basket as b where b.order_id = ?").setParameter(0, orderid).list();
    }
}
