package pet.bazaar.service.impl;

import pet.bazaar.dao.GoodsCategoryDao;
import pet.bazaar.entity.GoodsCategory;
import pet.bazaar.service.GoodsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("goodsCategoryService")
public class GoodsCategoryServiceImpl implements GoodsCategoryService {
    @Autowired
    private GoodsCategoryDao goodsCategoryDao;

    @Override
    public GoodsCategory getById(Long id) {
        return goodsCategoryDao.getById(id);
    }

    @Override
    public List<GoodsCategory> getGoodsCategoriesByName(String name) {
        return goodsCategoryDao.getGoodsCategoriesByName(name);
    }

    @Override
    public GoodsCategory addGoodsCategory(GoodsCategory goodsCategory) {
        return goodsCategoryDao.add(goodsCategory);
    }

    @Override
    public GoodsCategory updateGoodsCategory(GoodsCategory goodsCategory) {
        return goodsCategoryDao.update(goodsCategory);
    }

    @Override
    public GoodsCategory deleteGoodsCategory(Long id) {
        GoodsCategory goodsCategory = goodsCategoryDao.getById(id);
        return goodsCategoryDao.delete(goodsCategory);
    }

    @Override
    public List<GoodsCategory> getList() {
        return goodsCategoryDao.getList();
    }
}