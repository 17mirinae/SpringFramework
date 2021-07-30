package Ex5_3;

import org.springframework.beans.factory.annotation.*;

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

	public int calc() {
		return operand1.getValue() + operand2.getValue();
	}

}
