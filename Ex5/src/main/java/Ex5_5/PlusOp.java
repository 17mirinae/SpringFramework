package Ex5_5;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Component
public class PlusOp implements OperatorBean {

	Operand operand1, operand2;

	@Autowired
	public void setOperand1(Operand op1) {
		operand1 = op1;
	}

	@Autowired
	public void setOperand2(Operand op2) {
		operand2 = op2;
	}

	public Operand getOperand1() {
		return operand1;
	}

	public Operand getOperand2() {
		return operand2;
	}

	public int calc() {
		return operand1.getValue() + operand2.getValue();
	}
}
