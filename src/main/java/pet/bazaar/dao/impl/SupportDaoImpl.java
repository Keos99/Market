package pet.bazaar.dao.impl;

import pet.bazaar.dao.SupportDao;
import pet.bazaar.entity.Support;

import java.util.List;

public class SupportDaoImpl extends BasicDaoImpl<Support> implements SupportDao {

    public SupportDaoImpl(Class<Support> entityClass) {
        super(entityClass);
    }

    @Override
    public List<Support> getSupportByCountRequests(String countRequests) {
        Long question = Long.parseLong(countRequests);
        return (List<Support>) sessionFactory.getCurrentSession().
                createQuery("from Support as s where s.countRequests = ?").setParameter(0, question).list();
    }
}