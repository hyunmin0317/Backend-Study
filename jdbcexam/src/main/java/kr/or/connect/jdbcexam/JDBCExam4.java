package kr.or.connect.jdbcexam;

import kr.or.connect.jdbcexam.dao.RoleDao4;
import kr.or.connect.jdbcexam.dto.Role;

public class JDBCExam4 {
	public static void main(String[] args) {
//삭제 테스트
		int roleId = 500;

		RoleDao4 dao = new RoleDao4();
		int deleteCount = dao.deleteRole(roleId);

		System.out.println(deleteCount);
	}
}