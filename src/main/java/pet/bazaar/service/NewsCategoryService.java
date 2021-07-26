package pet.bazaar.service;

import pet.bazaar.entity.NewsCategory;

import java.util.List;

public interface NewsCategoryService {

    /**
     * @param id
     * @return
     */
    NewsCategory getById(Long id);

    /**
     * @param newsCategory
     * @return
     */
    NewsCategory add(NewsCategory newsCategory);

    /**
     * @return
     */
    List<NewsCategory> getList();

    /**
     * @param id
     * @return
     */

    NewsCategory delete(Long id);


}
