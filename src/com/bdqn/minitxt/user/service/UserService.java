package com.bdqn.minitxt.user.service;

import com.bdqn.minitxt.user.entity.User;

public interface UserService {
	/**
	 * �û���ѯ(�������ֲ�ѯ��
	 */
	void searchUserByName(User user);

	/**
	 * �û�ע��
	 */
	void userRegist(User user);

	/**
	 * �û���¼
	 */
	void userLogin(User user);
}
