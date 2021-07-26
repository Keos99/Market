package pet.bazaar.service.impl;

import pet.bazaar.dao.GoodsDao;
import pet.bazaar.entity.Goods;
import pet.bazaar.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;

    @Override
    public Goods getById(Long id) {
        return goodsDao.getById(id);
    }

    @Override
    public List<Goods> getGoodsByName(String name) {
        return goodsDao.getGoodsByName(name);
    }

    @Override
    public Goods addGoods(Goods goods) {
        goods.setSellerLogin(SecurityContextHolder.getContext().getAuthentication().getName());
        return goodsDao.add(goods);
    }

    @Override
    public Goods updateGoods(Goods goods) {
        return goodsDao.update(goods);
    }

    @Override
    public Goods deleteGoods(Long id) {
        Goods goods = goodsDao.getById(id);
        return goodsDao.delete(goods);
    }

    @Override
    public List<Goods> getList() {
        return goodsDao.getList();
    }

    @Override
    public Goods reserveGoods(Long id, Integer quantity) {
        Goods goods = goodsDao.getById(id);
        goods.setQuantityInStock(goods.getQuantityInStock() - quantity);
        goods.setQuantityReserved(goods.getQuantityReserved() + quantity);
        return goodsDao.update(goods);
    }

    @Override
    public Goods unreserveGoods(Long id, Integer quantity) {
        Goods goods = goodsDao.getById(id);
        goods.setQuantityInStock(goods.getQuantityInStock() + quantity);
        goods.setQuantityReserved(goods.getQuantityReserved() - quantity);
        return goodsDao.update(goods);
    }

    @Override
    public Goods buyGoods(Long id, Integer quantity) {
        Goods goods = goodsDao.getById(id);
        goods.setQuantityReserved(goods.getQuantityReserved() - quantity);
        return goodsDao.update(goods);
    }
}