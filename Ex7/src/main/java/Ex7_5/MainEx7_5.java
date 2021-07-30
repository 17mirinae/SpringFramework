package Ex7_5;

import org.springframework.context.support.*;

public class MainEx7_5 {
	private static MemberDAO memberDAO;

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx7_3.xml");
		memberDAO = ctx.getBean("memberDAO", MemberDAO.class);

		Member member = memberDAO.selectByEmail("madvirus@madvirus.net");
		try {
			member.changePassword("1234", "aaaa");
		} catch (Exception e) {
			e.printStackTrace();
		}

		memberDAO.update(member);
		member = memberDAO.selectByEmail("madvirus@madvirus.net");
		System.out.println(member.getPassword());
	}
}
