package Ex7_3;

import org.springframework.context.support.*;

public class MainEx7_3 {
	private static MemberDAO memberDAO;

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx7_3.xml");
		memberDAO = ctx.getBean("memberDAO", MemberDAO.class);

		Member mem = memberDAO.selectByEmail("madvirus@madvirus.net");

		System.out.println(mem.getName());

		ctx.close();
	}
}
