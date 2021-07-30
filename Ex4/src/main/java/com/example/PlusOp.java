package com.example;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.*;

public class PlusOp implements OperatorBean {
	@Resource(name = "op1")
	// @Autowired
	// @Qualifier("op1")
	Operand operand1;
	// xml 파일에서 bean id="op1" 지정되도록

	@Resource(name = "op2")
	// @Autowired
	// @Qualifier("op2")
	Operand operand2;
	// xml 파일에서 bean id="op2" 지정되도록

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
