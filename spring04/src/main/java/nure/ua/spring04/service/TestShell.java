package nure.ua.spring04.service;

import nure.ua.spring04.model.TestEntity;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.io.IOException;
import java.util.List;

@ShellComponent
public class TestShell {

    public static final String CVS_FILE_PATH = "D:\\spring04\\spring04\\src\\main\\resources\\book.csv";
    private final TestService testService;

    public TestShell(TestService testService) {
        this.testService = testService;
    }



    @ShellMethod(key = "hello-to", value = "Say hello to username")
    public void countTest(@ShellOption({"username", "u"}) String username) throws IOException {
        List<TestEntity> testList  = testService.input(CVS_FILE_PATH);
        testService.countTest(testList,username);
    }
}
