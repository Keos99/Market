package pet.bazaar.dao;

import pet.bazaar.entity.Seller;

import java.util.List;

public interface SellerDao extends BasicDao<Seller> {
    /**
     * Method for retrieving seller from the database by their login.
     * @param login - login of the seller
     * @return seller with the given login
     */
    List<Seller> getSellerByLogin(String login);
}