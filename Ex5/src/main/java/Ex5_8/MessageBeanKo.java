package Ex5_8;


public class MessageBeanKo implements MessageBean {
	public void sayHello(String name) {
		System.out.println("안녕하세요, " + name);
	}

	public void initialize() throws Exception {
		System.out.println("initialize() 실행");
	}

	public void close() throws Exception {
		System.out.println("close() 실행");
	}
}
