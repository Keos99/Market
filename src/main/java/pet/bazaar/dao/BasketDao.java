package pet.bazaar.dao;

import pet.bazaar.entity.Basket;

import java.util.List;

public interface BasketDao extends BasicDao<Basket> {
    List<Basket> getBasketByOrderId(String name);
}
