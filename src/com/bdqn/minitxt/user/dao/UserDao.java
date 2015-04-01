package com.bdqn.minitxt.user.dao;

import com.bdqn.minitxt.user.entity.User;

/**
 * 
 * @ClassName: UserDao
 * @Description: �û��־ò����
 * @���⣺���������Ķ���
 * @author Adrian Xu
 * @date 2014��3��26�� ����4:15:03
 * 
 */
public interface UserDao {
	/**
	 * �����û�
	 */
	void saveUser(User user);

	/**
	 * ��ѯ�û�����½�������û������룩
	 */
	boolean findUser(String userName,String password);
	/**
	 * ��ѯ�û���ע���ʱ��
	 */
	boolean findUserByName(String userName);
	/**
	 * �����û�
	 */
	void updateUser(User user);


}
