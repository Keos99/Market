package pet.bazaar.dao.impl;

import pet.bazaar.dao.DeliveryDao;
import pet.bazaar.entity.Delivery;

import java.util.List;

public class DeliveryDaoImpl extends BasicDaoImpl<Delivery> implements DeliveryDao {

    public DeliveryDaoImpl(Class<Delivery> entityClass) {
        super(entityClass);
    }

    @Override
    public List<Delivery> getDeliveriesByRecipient(String recipient) {
        return (List<Delivery>) sessionFactory.getCurrentSession().
                createQuery("from Delivery as d where d.recipient = ?").setParameter(0, recipient).list();
    }
}