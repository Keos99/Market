package pet.bazaar.dao;

import pet.bazaar.entity.News;
import pet.bazaar.entity.NewsTag;

import java.util.List;

public interface NewsDao extends BasicDao<News> {

    List<News> getNewsByTitle(String name);

    List<NewsTag> getNewsTagsList(Long id);
}
