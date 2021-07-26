package pet.bazaar.service.impl;

import pet.bazaar.dao.SellerDao;
import pet.bazaar.entity.Seller;
import pet.bazaar.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sellerService")
public class SellerServiceImpl implements SellerService {
    @Autowired
    private SellerDao sellerDao;

    @Override
    public Seller getById(Long id) {
        return sellerDao.getById(id);
    }

    @Override
    public List<Seller> getSellerByLogin(String login) {
        return sellerDao.getSellerByLogin(login);
    }

    @Override
    public Seller addSeller(Seller seller) {
        return sellerDao.add(seller);
    }

    @Override
    public Seller updateSeller(Seller seller) {
        return sellerDao.update(seller);
    }

    @Override
    public Seller deleteSeller(Long id) {
        Seller seller = getById(id);
        return sellerDao.delete(seller);
    }

    @Override
    public List<Seller> getList() {
        return sellerDao.getList();
    }

    @Override
    public Seller increaseSellerBalance(Long id, Integer amount) {
        Seller seller = getById(id);
        seller.setBalance(seller.getBalance() + amount);
        return sellerDao.update(seller);
    }
}