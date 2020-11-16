package refTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class refTypesTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("refTypesConfig.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
}
