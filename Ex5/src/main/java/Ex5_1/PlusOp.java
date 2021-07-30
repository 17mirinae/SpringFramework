package Ex5_1;

public class PlusOp implements OperatorBean {

	Operand operand1, operand2;

	public void setOperand1(Operand value) {
		operand1 = value;
	}

	public void setOperand2(Operand value) {
		operand2 = value;
	}

	public int calc() {
		return operand1.getValue() + operand2.getValue();
	}

}
