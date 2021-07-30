package Ex6_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericXmlApplicationContext;

@SpringBootApplication
public class HelloApp {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:appctxEx6_2.xml");
		MessageBean msgBean = (MessageBean)ctx.getBean("proxy");
		
		msgBean.sayHello();
		ctx.close();
	}

}
