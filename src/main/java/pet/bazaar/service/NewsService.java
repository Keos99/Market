package pet.bazaar.service;

import pet.bazaar.entity.News;
import pet.bazaar.entity.NewsTag;

import java.util.List;

public interface NewsService {
    /**
     *
     * @param id
     * @return
     */
    News getById(Long id);

    /**
     *
     * @param news
     * @return
     */
    News add(News news);

    /**
     *
     * @return
     */
    List<News> getList();

    /**
     *
     * @param id
     * @return
     */

    News delete(Long id);

    List<News> getNewsByTitle(String title);

    News updateNews(News news);

    List<NewsTag> getNewsTagList(long l);

}
