/**
 * 
 */
package test.junit.dao;

import java.util.Date;

import org.junit.Test;

import com.bdqn.minitxt.user.dao.UserDao;
import com.bdqn.minitxt.user.entity.User;
import com.bdqn.minitxt.utils.InstanceFactory;
import com.bdqn.minitxt.utils.PasswordEncodeUtils;

/**
 * @ClassName: UserDaoImplTest
 * @Description: TODO(������һ�仰��������������)
 * @���⣺���������Ķ���
 * @author Adrian Xu
 * @date 2014��3��26�� ����4:49:23
 * 
 */
public class UserDaoImplTest {
	private UserDao dao = (UserDao) InstanceFactory.getInstance()
			.createInstance(UserDao.class);

	@Test
	public void testSaveUser() {
		// String name, String password, String status,
		// int loginTimes, Date lastLoginTime, Date registTime, int role
		User user = new User("Adrian",
				PasswordEncodeUtils.getMD5EncodeAfterPwd("abcdefg"), "2", 0,
				null, new Date(), 1);
		dao.saveUser(user);
	}

	@Test
	public void testFindUser() {
		User user = new User();
		user.setName("Tony");
		user.setPassword(PasswordEncodeUtils.getMD5EncodeAfterPwd("abc"));
		System.out.println(dao.findUser(user.getName(), user.getPassword()));
	}

	@Test
	public void testFindUserByName() {
		User user = new User();
		user.setName("Adrian");
		System.out.println(dao.findUserByName(user.getName()));
	}

	@Test
	public void testUpdatUser() {
		User user = new User();
		user.setName("Tony");
		user.setPassword(PasswordEncodeUtils.getMD5EncodeAfterPwd("tony"));
		user.setStatus("1");
		user.setLastLoginTime(new Date());
		dao.updateUser(user);
		System.out.println(user.isResult());
	}

}
