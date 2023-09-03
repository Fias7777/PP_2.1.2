import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat bean1 = (Cat) applicationContext.getBean("cat");
        Cat bean2 = (Cat) applicationContext.getBean("cat");

        System.out.println("HelloWorld: " + (bean == bean));
        System.out.println("Cat: " + (bean1 == bean2));

    }
}