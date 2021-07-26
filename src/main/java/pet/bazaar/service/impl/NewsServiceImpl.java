package pet.bazaar.service.impl;

import pet.bazaar.entity.News;
import pet.bazaar.entity.NewsTag;
import pet.bazaar.service.NewsService;
import pet.bazaar.dao.NewsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service("newsService")
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsDao newsDao;

    @Override
    public News getById(Long id) {
        return newsDao.getById(id);
    }

    @Override
    public News add(News news) {
        return newsDao.add(news);
    }

    @Override
    public List<News> getList() {
        return newsDao.getList();
    }

    @Override
    public News delete(Long id) {
        News news = newsDao.getById(id);
        return newsDao.delete(news);
    }

    @Override
    public List<News> getNewsByTitle(String title) {
        return newsDao.getNewsByTitle(title);
    }

    @Override
    public News updateNews(News news) {
        return newsDao.update(news);
    }

    @Override
    public List<NewsTag> getNewsTagList(long id) {
        return newsDao.getNewsTagsList(id);
    }


}
