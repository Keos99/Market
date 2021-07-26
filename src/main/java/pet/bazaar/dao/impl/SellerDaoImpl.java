package pet.bazaar.dao.impl;

import pet.bazaar.dao.SellerDao;
import pet.bazaar.entity.Seller;

import java.util.List;

public class SellerDaoImpl extends BasicDaoImpl<Seller> implements SellerDao {
    public SellerDaoImpl(Class<Seller> entityClass) {
        super(entityClass);
    }

    @Override
    public List<Seller> getSellerByLogin(String login) {

        return (List<Seller>) getCurrentSession().createQuery("from Seller where login = ?").setParameter(0, login).list();
    }
}