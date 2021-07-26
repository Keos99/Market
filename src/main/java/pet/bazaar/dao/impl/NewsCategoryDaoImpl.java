package pet.bazaar.dao.impl;

import pet.bazaar.dao.NewsCategoryDao;
import pet.bazaar.entity.NewsCategory;

public class NewsCategoryDaoImpl extends BasicDaoImpl<NewsCategory> implements NewsCategoryDao {

    public NewsCategoryDaoImpl(Class<NewsCategory> entityClass) {
        super(entityClass);
    }

}
