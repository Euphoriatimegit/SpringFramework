import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld hWBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld hWBean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat cBean = (Cat) applicationContext.getBean("cat");
        Cat cBean1 = (Cat) applicationContext.getBean("cat");

        System.out.println("HelloWorldBeans = "+ (hWBean==hWBean1));
        System.out.println("CatBeans = "+ (cBean==cBean1));


    }
}