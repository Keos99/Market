package pet.bazaar.dao;

import pet.bazaar.entity.NewsTag;

import java.util.List;

public interface NewsTagDao extends BasicDao<NewsTag> {

    List<NewsTag> getNewsTagsByName(String name);
}
