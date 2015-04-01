/**
 * 
 */
package com.bdqn.minitxt.ui;

import java.util.Date;
import java.util.Scanner;

import com.bdqn.minitxt.client.ClientRequest;
import com.bdqn.minitxt.common.ClientConstant;
import com.bdqn.minitxt.user.entity.User;

/**
 * @ClassName: UserUi
 * @Description: TODO(������һ�仰��������������)
 * @���⣺���������Ķ���
 * @author Adrian Xu
 * @date 2014��3��27�� ����2:18:23
 * 
 */
public class UserUi {

	public UserUi() {

	}

	public void userOperator() {
		Scanner input = new Scanner(System.in);
		System.out.print(ClientConstant.WELCOME_INFOS);
		String choice = input.nextLine();
		switch (choice) {
		case ClientConstant.USER_LOGIN_STATUS:
			userLogin(input);
			break;
		case ClientConstant.USER_REGIST_STATUS:
			userRegist(input);
			break;
		case ClientConstant.USER_EXIT_STATUS:
			break;
		default:
			System.out.println("������Ĳ����ڣ�����������");
			userOperator();
		}
	}

	/**
	 * @param input
	 */
	private void userRegist(Scanner input) {
		while (true) {
			System.out.print(ClientConstant.USER_REGIST_INFOS);
			String name = input.nextLine();
			User user = new User();
			user.setName(name);
			user.setStatus(ClientConstant.USER_SEARCH_STATUS);
			User userFromServer = new ClientRequest().requestToServer(user);
			if (userFromServer.isResult()) {
				System.out.println("�û����Ѵ���");
				continue;
			} else {
				while (true) {
					System.out.print(ClientConstant.PLEASE_INPUT_PASSWORD);
					String password = input.nextLine();
					System.out.print(ClientConstant.PLEASE_REINPUT_PASSWORD);
					String rePassword = input.nextLine();
					if (password.equals(rePassword)) {
						user.setName(name);
						user.setPassword(password);
						user.setStatus(ClientConstant.USER_REGIST_STATUS);
						user.setRegistTime(new Date());
						userFromServer = new ClientRequest()
								.requestToServer(user);
						if (userFromServer.isResult()) {
							userLogin(input);
						}
					} else {
						System.out.println("�������벻һ�£�����������");
						continue;
					}
				}
			}
		}
	}

	/**
	 * @param input
	 */
	private void userLogin(Scanner input) {
		while (true) {
			System.out.print(ClientConstant.USER_LOGIN_INFOS);
			String name = input.nextLine();
			System.out.print(ClientConstant.PLEASE_INPUT_PASSWORD);
			String password = input.nextLine();
			User user = new User();
			user.setName(name);
			user.setPassword(password);
			user.setStatus(ClientConstant.USER_LOGIN_STATUS);
			user.setLastLoginTime(new Date());
			// ���������������
			User userFromServer = new ClientRequest().requestToServer(user);
			if (userFromServer.isResult()) {
				System.out.println(ClientConstant.LOGIN_SUCCESS_INFOS);
				new NovelUi().NovelList();
				break;
			} else {
				// �û�������
				System.out.println("��¼ʧ��");
			}
		}
	}
}
