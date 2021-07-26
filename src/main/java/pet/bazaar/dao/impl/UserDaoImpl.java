package pet.bazaar.dao.impl;

import pet.bazaar.dao.UserDao;
import pet.bazaar.entity.User;

public class UserDaoImpl extends BasicDaoImpl<User> implements UserDao {
    public UserDaoImpl(Class<User> entityClass) {
        super(entityClass);
    }

}
