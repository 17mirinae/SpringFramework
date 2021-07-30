package Ex5_5;

import org.springframework.stereotype.*;
import org.springframework.context.annotation.*;

@Component
@Scope("prototype")
public class Operand {

	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
