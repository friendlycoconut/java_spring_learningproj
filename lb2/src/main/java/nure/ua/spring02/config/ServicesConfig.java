package nure.ua.spring02.config;

import nure.ua.spring02.dao.PersonDao;
import nure.ua.spring02.domain.Person;
import nure.ua.spring02.service.PersonService;
import nure.ua.spring02.service.PersonServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfig {
    @Bean
    public PersonService personService(PersonDao dao){return new PersonServiceImpl(dao);}
    }

