import annotationConfig.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author ltx
 * @Date 13:53 2020/8/9
 */

public class MyApplication {

	public static void main(String[] args) {
//		System.out.println("123");
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("person.xml");

		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();

		annotationContext.register(MyConfig.class);
		annotationContext.refresh();
	}

}
