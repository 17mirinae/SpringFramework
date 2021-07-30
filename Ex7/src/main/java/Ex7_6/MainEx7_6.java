package Ex7_6;

import java.util.Date;

import org.springframework.context.support.*;

public class MainEx7_6 {
	private static MemberDAO memberDAO;

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx7_3.xml");
		memberDAO = ctx.getBean("memberDAO", MemberDAO.class);

		Member member = new Member("guest1@gmail.com", "aaa", "Mr.Lee", new Date());
		memberDAO.insert(member);
		System.out.println(member.getId());
	}
}
