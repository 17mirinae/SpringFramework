package com.example;

public class MinusOp implements OperatorBean {
	int operand1, operand2;

	public void setOperand1(int operand1) {
		this.operand1 = operand1;
	}

	public void setOperand2(int operand2) {
		this.operand2 = operand2;
	}

	public int calc() {
		return operand1 - operand2;
	}
}
