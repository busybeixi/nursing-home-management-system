import com.kuang.dao.UserDaoImpl;
import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        /**
         * 用户实际调用的是业务层，dao层不需要他们接触
         */
        UserService userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoImpl());
        userService.getUser();
//        bean.xml
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("beans.xml");
        UserService userService1= (UserServiceImpl) applicationContext.getBean("userservice");
        userService1.getUser();
    }
}
