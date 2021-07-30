package Ex5_7;

import org.springframework.beans.factory.*;

public class MessageBeanKo implements MessageBean, InitializingBean, DisposableBean {
	public void sayHello(String name) {
		System.out.println("안녕하세요, " + name);
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("MessageBeanKo.afterPropertiesSet() 실행");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("MessageBeanKo.destroy() 실행");
	}
}
