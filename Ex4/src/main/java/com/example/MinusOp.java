package com.example;

import org.springframework.beans.factory.annotation.Autowired;

public class MinusOp implements OperatorBean {
	Operand operand1, operand2;

	@Autowired
	public void setOperand1(Operand operand1) {
		this.operand1 = operand1;
	}

	@Autowired
	public void setOperand2(Operand operand2) {
		this.operand2 = operand2;
	}

	public int calc() {
		return operand1.getValue() - operand2.getValue();
	}
}
