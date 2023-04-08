package in.arc.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean-cfg.xml");
		
		UserService service = context.getBean(UserService.class);
		
		service.printName(13);
		
	}

}
