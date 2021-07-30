package Ex7_7;

import org.springframework.transaction.annotation.Transactional;

public class ChangePasswordService {
	private MemberDAO memberDAO;

	public ChangePasswordService(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	@Transactional
	public void changePassword(String email, String oldPwd, String newPwd) throws Exception {
		Member member = memberDAO.selectByEmail(email);

		if (member == null)
			throw new MemberNotFoundException();
		member.changePassword(oldPwd, newPwd);
		memberDAO.update(member);
	}
}
