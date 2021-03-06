package pet.bazaar.config.application;

import io.khasang.bazaar.dao.*;
import io.khasang.bazaar.dao.impl.*;
import io.khasang.bazaar.entity.*;
import io.khasang.bazaar.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import pet.bazaar.dao.*;
import pet.bazaar.dao.impl.*;
import pet.bazaar.entity.*;
import pet.bazaar.model.CreateTable;

@Configuration
@PropertySource(value = "classpath:util.properties")
@PropertySource(value = "classpath:auth.properties")
public class AppConfig {
    @Autowired
    private Environment environment;

    @Bean
    public UserDetailsService userDetailsService() {
        JdbcDaoImpl jdbcDao = new JdbcDaoImpl();
        jdbcDao.setDataSource(dataSource());
        jdbcDao.setUsersByUsernameQuery(environment.getRequiredProperty("usersByQuery"));
        jdbcDao.setAuthoritiesByUsernameQuery(environment.getRequiredProperty("rolesByQuery"));
        return jdbcDao;
    }

    @Bean
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.postgresql.driver"));
        dataSource.setUrl(environment.getRequiredProperty("jdbc.postgresql.url"));
        dataSource.setUsername(environment.getRequiredProperty("jdbc.postgresql.name"));
        dataSource.setPassword(environment.getRequiredProperty("jdbc.postgresql.password"));
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    @Bean
    public CreateTable createTable() {
        return new CreateTable(jdbcTemplate());
    }

    @Bean
    public CatDao catDao() {
        return new CatDaoImpl(Cat.class);
    }

    @Bean
    public UserDao userDao() {
        return new UserDaoImpl(User.class);
    }


    @Bean
    public CarsDao carsDao() {
        return new CarsDaoImpl(CarsEntity.class);
    }

    @Bean
    public NewsDao newsDao() {
        return new NewsDaoImpl(News.class);
    }

    @Bean
    public NewsCategoryDao newsCategoryDao() {
        return new NewsCategoryDaoImpl(NewsCategory.class);
    }

    @Bean
    public NewsTagDao newsTagDao() {
        return new NewsTagDaoImpl(NewsTag.class);
    }

    @Bean
    public GoodsCategoryDao goodsCategoryDao() {
        return new GoodsCategoryDaoImpl(GoodsCategory.class);
    }

    @Bean
    public GoodsDao goodsDao() {
        return new GoodsDaoImpl(Goods.class);
    }

    @Bean
    public SellerDao sellerDao() {
        return new SellerDaoImpl(Seller.class);
    }

    @Bean
    public DeliveryDao deliveryDao(){
        return new DeliveryDaoImpl(Delivery.class);
    }

    @Bean
    public DiscountDao discountDao() {
        return new DiscountDaoImpl(Discount.class);
    }

    @Bean
    public SupportDao supportDao() {
        return new SupportDaoImpl(Support.class);
    }

    @Bean
    public BasketDao basketDAO(){
        return new BasketDaoImpl(Basket.class);
    }
}
