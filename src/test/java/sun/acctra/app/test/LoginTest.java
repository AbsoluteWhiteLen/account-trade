package sun.acctra.app.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import sun.acctra.app.controller.login.LoginController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginTest {

	@Autowired
	LoginController loginController;

	@Test
	public void testSomeMethod() {
		assertNotNull(loginController);
	}
}
