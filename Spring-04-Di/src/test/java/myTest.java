import com.kuang.pojo.Student;
import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student.toString());
    }
    /*Student{
     * name='秦疆',
     *  address=Address{
     *      address='null'
     *  },
     *  books=[高等数学, 旅游英语, 大学C语言],
     *  hobbys=[听歌, 看电影, 打游戏],
     *  card={
     *      身份证=123325211452665445,
     *      银行卡=5486695225332566665
     *  },
     *  games=[LOL, COC],
     *  wifi='null',
     *  info={
     *      学号=20190507238,
     *      性别=男
     *  }
     *  }
    */

    @Test
    public void User(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("userbeans.xml");
        User user = applicationContext.getBean("user",User.class);
        System.out.println(user.toString());
    }
}
