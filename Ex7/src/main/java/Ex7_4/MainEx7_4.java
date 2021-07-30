package Ex7_4;

import org.springframework.context.support.*;

public class MainEx7_4 {
	private static MemberDAO memberDAO;

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx7_3.xml");
		memberDAO = ctx.getBean("memberDAO", MemberDAO.class);

		int count = memberDAO.count();

		System.out.println(count);

		ctx.close();
	}
}
