package nure.ua.spring02.configs;

import nure.ua.spring02.dao.PersonDao;
import nure.ua.spring02.dao.TestDao;
import nure.ua.spring02.service.PersonService;
import nure.ua.spring02.service.PersonServiceImpl;
import nure.ua.spring02.service.TestService;
import nure.ua.spring02.service.TestServiceImpl;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;


@Configuration
public class ServicesConfig {

    @Bean
    public PersonService personService(PersonDao dao) {
        return new PersonServiceImpl(dao);
    }

    @Bean
    public TestService testService(TestDao dao) {
        return new TestServiceImpl(dao);
    }

    @Bean
    public MessageSource messageSource(){
        ReloadableResourceBundleMessageSource ms =
                new ReloadableResourceBundleMessageSource();
        ms.setBasename("/fields");
        ms.setDefaultEncoding("UTF-8");
        return ms;
    }


}