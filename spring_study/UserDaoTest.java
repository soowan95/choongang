import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.sql.SQLException;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class UserDaoTest {

  public static void main(String[] args) {
    JUnitCore.main("UserDaoTest");
  }

  @Test
  public void addAndGet() throws SQLException, ClassNotFoundException {
    ApplicationContext context = new GenericXmlApplicationContext("application.xml");

    UserDao dao = context.getBean("userDao", UserDao.class);
    User user = new User();
    user.setId("yes");
    user.setName("그래");
    user.setPassword("test1");

    dao.add(user);

    User user2 = dao.get(user.getId());

    assertThat(user2.getName(), is(user.getName()));
  }
}
