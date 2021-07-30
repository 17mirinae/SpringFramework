package ex4_2;

import org.springframework.beans.factory.annotation.Autowired;

public class PlusOp implements OperatorBean {
	@Autowired
	Operand operand1;
	@Autowired
	Operand operand2;

	public void setOperand1(Operand operand1) {
		this.operand1 = operand1;
	}

	public void setOperand2(Operand operand2) {
		this.operand2 = operand2;
	}

	public int calc() {
		return operand1.getValue() + operand2.getValue();
	}
}
