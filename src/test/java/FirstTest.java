import com.surkov.cloudservice.config.DbConfig;
import com.surkov.cloudservice.repository.UserRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FirstTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DbConfig.class);
        UserRepository userRepository = (UserRepository) applicationContext.getBean(UserRepository.class);
        System.out.println(userRepository.findUser(1L).getRole());
    }
}
