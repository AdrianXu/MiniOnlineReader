/**
 * 
 */
package test.junit.utils;

import org.junit.Test;

import com.bdqn.minitxt.utils.PasswordEncodeUtils;

/**
 * @ClassName: PasswordEncodeUtilsTest
 * @Description: TODO(������һ�仰��������������)
 * @���⣺���������Ķ���
 * @author Adrian Xu
 * @date 2014��3��27�� ����8:17:34
 * 
 */
public class PasswordEncodeUtilsTest {

	@Test
	public void getMD5EncodeAfterPwd() {
		String password = "abcdefg";
		System.out.println(PasswordEncodeUtils.getMD5EncodeAfterPwd(password));
	}

}
