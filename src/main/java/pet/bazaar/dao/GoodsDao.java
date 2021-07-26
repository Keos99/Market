package pet.bazaar.dao;

import pet.bazaar.entity.Goods;

import java.util.List;

public interface GoodsDao extends BasicDao<Goods> {
    /**
     * Method for retrieving goods from the database by their name.
     * @param name - name of the goods
     * @return goods with the given name
     */
    List<Goods> getGoodsByName(String name);
}