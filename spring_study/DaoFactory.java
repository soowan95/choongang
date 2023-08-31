import org.springframework.context.annotation.Configuration;

public class DaoFactory {
//  @Configuration
  public UserDao userDao() {
    return new UserDao(connectionMaker());
  }

  public ConnectionMaker connectionMaker() {
    return new DConnectionMaker();
  }
}
