package Ex5_3;

import org.springframework.context.annotation.*;

@Configuration
public class JavaConfig {
	// 함수 이름이 Bean 객체가 된다.

	@Bean
	@Scope("prototype")
	public OperatorBean operatorBean() {
		OperatorBean op = new MinusOp();

		/*
		 * op.setOperand1(op1()); op.setOperand2(op2());
		 */

		return op;
	}

	@Bean
	@Scope("prototype")
	public Operand op1() {
		Operand value = new Operand();

		value.setValue(20);

		return value;
	}

	@Bean
	@Scope("prototype")
	public Operand op2() {
		Operand value = new Operand();

		value.setValue(40);

		return value;
	}

}
