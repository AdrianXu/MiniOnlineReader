/**
 * 
 */
package com.bdqn.minitxt.common;

/**
 * @ClassName: ClientConstant
 * @Description: �ͻ��˵ĳ���
 * @���⣺���������Ķ���
 * @author Adrian Xu
 * @date 2014��3��25�� ����8:47:19
 * 
 */
public interface ClientConstant {

	String SERVER_NAME = "127.0.0.1";
	int SERVER_PORT = 8800;

	// �û�����ģ�����
	String USER_REGIST_STATUS = "2";// ע��
	String USER_LOGIN_STATUS = "1";// ��¼
	String USER_SEARCH_STATUS = "4";// ��ѯ
	String USER_EXIT_STATUS = "3";// �˳�

	// �û�����ģ��
	String WELCOME_INFO = "��ӭʹ����������TXTС˵������\n";
	String LINE1 = "-----------------------------------------------------\n";
	String USER_LOGIN = "1.��½\n";
	String USER_REGIST = "2.ע��\n";
	String USER_EXIT = "3.�˳�\n";
	String USER_CHOOSE = "��ѡ��";
	StringBuffer WELCOME_INFOS = new StringBuffer(WELCOME_INFO).append(LINE1)
			.append(USER_LOGIN).append(USER_REGIST).append(USER_EXIT)
			.append(LINE1).append(USER_CHOOSE);

	// �û�ע��
	String LINE2 = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
	String USER_REGIST_INFO = "��ǰ������ע���û�\n";
	String PLEASE_INPUT_USERNAME = "�������¼����";
	String PLEASE_INPUT_PASSWORD = "���������룺";
	String PLEASE_REINPUT_PASSWORD = "���ٴ��������룺";
	StringBuffer USER_REGIST_INFOS = new StringBuffer(LINE2)
			.append(USER_REGIST_INFO).append(LINE2)
			.append(PLEASE_INPUT_USERNAME);

	// �û���¼
	String USER_LOGIN_INFO = "��ǰ�������û���¼\n";
	StringBuffer USER_LOGIN_INFOS = new StringBuffer(LINE2)
			.append(USER_LOGIN_INFO).append(LINE2)
			.append(PLEASE_INPUT_USERNAME);
	String LINE3 = "*****************************************************\n";
	String LOGIN_SUCCESS = "��½�ɹ���\n";
	String USER_RETURN_UPPER_LEVEL = "0.�����ϼ��˵�\n";
	String MARTIAL_ARTS_MENU = "1.����\n";
	String ROMANCE_MENU = "2.����\n";
	StringBuffer LOGIN_SUCCESS_INFOS = new StringBuffer(LINE3)
			.append(LOGIN_SUCCESS).append(LINE3);
	StringBuffer NOVEL_MENU = new StringBuffer(LINE1).append(USER_RETURN_UPPER_LEVEL)
			.append(MARTIAL_ARTS_MENU).append(ROMANCE_MENU).append(LINE1)
			.append(USER_CHOOSE);
}
