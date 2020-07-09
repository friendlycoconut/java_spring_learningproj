package nure.ua.spring04;

import nure.ua.spring04.dao.TestRepositoryImpl;
import nure.ua.spring04.model.TestEntity;
import nure.ua.spring04.service.TestService;
import nure.ua.spring04.service.TestServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.shell.jline.InteractiveShellApplicationRunner;
import org.springframework.shell.jline.ScriptShellApplicationRunner;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = {
		InteractiveShellApplicationRunner.SPRING_SHELL_INTERACTIVE_ENABLED + "=false",
		ScriptShellApplicationRunner.SPRING_SHELL_SCRIPT_ENABLED + "=false"
})

class Spring04ApplicationTests {
	public static final String PATH_TO_CSV = "D:\\spring04\\spring04\\src\\main\\resources\\book.csv";
	public static final String WRONG_PATH = "D:\\spring04\\spring04\\src\\main\\resources\\book_empty.csv";



	@Test
	void fileLoads() throws IOException {
		TestRepositoryImpl dao = new TestRepositoryImpl();
		TestService testService = new TestServiceImpl(dao);


		List<TestEntity> testListWRONG = testService.input(WRONG_PATH);
		//List<TestEntity> testList = testService.input(PATH_TO_CSV);

		assertEquals(0,testListWRONG.size() );//empty List

		List<TestEntity> testList = testService.input(PATH_TO_CSV);

		assertNotNull(testList);

	}

}


