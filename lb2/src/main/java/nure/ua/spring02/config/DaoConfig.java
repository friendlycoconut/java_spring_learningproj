package nure.ua.spring02.config;

import nure.ua.spring02.dao.PersonDao;
import nure.ua.spring02.dao.PersonDaoSimple;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class DaoConfig {
    @Bean
    public PersonDao personDao(){return new PersonDaoSimple();}
    }

