package pet.bazaar.dao;

import pet.bazaar.entity.GoodsCategory;

import java.util.List;

public interface GoodsCategoryDao extends BasicDao<GoodsCategory> {
    /**
     * Method for retrieving goods categories from the database by their name.
     * @param name - name of the category
     * @return - returns all the goods categories with the given name
     */
    List<GoodsCategory> getGoodsCategoriesByName(String name);
}