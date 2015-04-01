/**
 * 
 */
package com.bdqn.minitxt.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

/**
 * @ClassName: PasswordEncodeUtils
 * @Description: ������м���
 * @���⣺���������Ķ���
 * @author Adrian Xu
 * @date 2014��3��26�� ����12:01:24
 * 
 */
public class PasswordEncodeUtils {

	public static String getMD5EncodeAfterPwd(String pwd) {

		// md5�����㷨
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] pwdBytes = md.digest(pwd.getBytes());

			// ��JDK�в�����ʹ��
			BASE64Encoder encoder = new BASE64Encoder();
			return encoder.encode(pwdBytes);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}
}
