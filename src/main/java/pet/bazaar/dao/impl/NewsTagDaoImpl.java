package pet.bazaar.dao.impl;

import pet.bazaar.dao.NewsTagDao;
import pet.bazaar.entity.NewsTag;

import java.util.List;

public class NewsTagDaoImpl extends BasicDaoImpl<NewsTag> implements NewsTagDao {
    public NewsTagDaoImpl(Class<NewsTag> entityClass) {
        super(entityClass);
    }

    @Override
    public List<NewsTag> getNewsTagsByName(String name) {
        return (List<NewsTag>) sessionFactory.getCurrentSession().
                createQuery("from news_tags as nt where nt.name = ?").setParameter(0, name).list();
    }
}
