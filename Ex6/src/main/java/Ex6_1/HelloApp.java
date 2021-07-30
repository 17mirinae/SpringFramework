package Ex6_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericXmlApplicationContext;

@SpringBootApplication
public class HelloApp {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:appctxEx6_1.xml");
		MessageBean msgBean = (MessageBean)ctx.getBean("messageBean");
		
		msgBean.sayHello();
		ctx.close();
	}

}
