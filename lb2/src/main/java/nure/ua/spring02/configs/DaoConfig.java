package nure.ua.spring02.configs;

import nure.ua.spring02.dao.PersonDao;
import nure.ua.spring02.dao.PersonDaoSimple;
import nure.ua.spring02.dao.TestDao;
import nure.ua.spring02.dao.TestDaoSimple;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoConfig {

    @Bean
    public PersonDao personDao() {
        return new PersonDaoSimple();
    }

    @Bean
    public TestDao testDao(){
        return new TestDaoSimple();
    }
}