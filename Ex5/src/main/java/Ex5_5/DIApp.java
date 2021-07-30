package Ex5_5;

import org.springframework.context.annotation.*;
import org.springframework.context.support.*;

public class DIApp {
	public static void main(String[] args) {
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		OperatorBean operator = (OperatorBean) ctx.getBean("defaultOperator");
		
		int value = operator.calc();
		
		System.out.println(value);
		
		ctx.close();
	}
}
