package Ex5_1;

import org.springframework.context.annotation.*;

public class DIApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		OperatorBean operator = (OperatorBean) ctx.getBean("operatorBean");
		
		int value = operator.calc();
		
		System.out.println("The result value: " + value);
		
		ctx.close();
	}
}
