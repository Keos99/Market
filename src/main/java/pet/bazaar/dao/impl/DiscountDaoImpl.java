package pet.bazaar.dao.impl;

import pet.bazaar.dao.DiscountDao;
import pet.bazaar.entity.Discount;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public class DiscountDaoImpl extends BasicDaoImpl<Discount> implements DiscountDao {

    public DiscountDaoImpl(Class<Discount> entityClass) {
        super(entityClass);
    }

    @Override
    public List<Discount> getDiscountsByPromoCode(String promoCode1) {
        return (List<Discount>) sessionFactory.getCurrentSession().
                createQuery("from Discount as c where (c.promoCode = :code)").setParameter("code", promoCode1).list();
    }

    @Override
    public List<Discount> getActualDiscounts() {
       return (List<Discount>)sessionFactory.getCurrentSession().
               createQuery("from Discount as c where (c.startDate <= :date and c.endDate >= :date)").setParameter("date", Date.valueOf(LocalDate.now())).list();
    }
}