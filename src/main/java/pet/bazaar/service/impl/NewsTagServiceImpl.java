package pet.bazaar.service.impl;

import pet.bazaar.entity.NewsTag;
import pet.bazaar.dao.NewsTagDao;
import pet.bazaar.service.NewsTagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service("newsTagService")
public class NewsTagServiceImpl implements NewsTagService {
    @Autowired
    private NewsTagDao newsTagDao;

    @Override
    public NewsTag getById(Long id) {
        return newsTagDao.getById(id);
    }

    @Override
    public NewsTag add(NewsTag newsTag) {
        return newsTagDao.add(newsTag);
    }

    @Override
    public List<NewsTag> getList() {
        return null;
    }

    @Override
    public NewsTag delete(Long id) {
        return null;
    }
}
