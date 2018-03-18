import com.surkov.cloudservice.config.DbConfig;
import com.surkov.cloudservice.repository.UserRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Annotation;

public class FirstTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DbConfig.class);
        UserRepository userRepository = (UserRepository) applicationContext.getBean(UserRepository.class);
        Class<? extends UserRepository> userRepositoryClass=userRepository.getClass();
        Annotation an=userRepositoryClass.getAnnotation(Repository.class);
        an.annotationType();
        System.out.println(userRepository.findUser(1L).getRole());
    }
}
