/**
 * 
 */
package com.bdqn.minitxt.common;

/**
 * @ClassName: ServerConstant
 * @Description: �������˵ĳ���
 * @���⣺���������Ķ���
 * @author Adrian Xu
 * @date 2014��3��25�� ����8:48:04
 * 
 */
public interface ServerConstant {
	// xml�ļ�·��
	String USER_XML_PATH = "config\\user.xml";
	String NOVEL_XML_PATH = "config\\novels.xml";

	// ʱ���ʽ
	String TIME_PATH = "yyyy-MM-dd HH:mm:ss";

	// �����Ķ�����
	int CONTENT_SIZE = 500;

	// С˵ģ�����
	String NOVEL_MARTIALARTS_MENU = "1";
	String NOVEL_ROMANCE_MENU = "2";
	String NOVEL_RETURN_UPPER_LEVEL = "0";

	// С˵״̬
	String NOVEL_ONLINE_READ = "3";
	String NOVEL_DOWNLOAD = "2";
	String NOVEL_UPLOAD = "1";
	String NOVEL_RETURN = "0";
	String NOVEL_LIST = "4";
	String NOVEL_SEARCH = "5";

	// С˵���
	String NOVEL_MARTIAL_ARTS = "1";
	String NOVEL_ROMANCE = "2";

	// ����С˵
	String LINE1 = "---------------------����С˵�б�---------------------\n";
	String LINE2 = "---------------------С˵�б����---------------------\n";

	// С˵����
	String NOVEL_OPERATION = "�����Ķ�txt������3������TXT������2���ϴ�TXT������1������������0��";
	String PLEASE_INPUT_UPLOAD_NAME = "������С˵����";
	String PLEASE_INPUT_UPLOAD_AUTHOR = "���������ߣ�";
	String PLEASE_INPUT_UPLOAD_INDRODUCTION = "�������飺";
	String PLEASE_INPUT_UPLOAD_PATH = "�������ϴ���С˵·��.txt����ע��·����/����\\��:";
	String NOVEL_UPLOAD_SUCESS = "С˵�ϴ��ɹ���\n";
	String LINE3 = "*****************************************************\n";
	String CONTINUE_UPLOAD_OR_BACK = "�����ϴ�������1������������0��";
	StringBuffer NOVEL_UPLOAD_SUCESSES = new StringBuffer(LINE3)
			.append(NOVEL_UPLOAD_SUCESS).append(LINE3).append(CONTINUE_UPLOAD_OR_BACK);
	String PLEASE_INPUT_DOWNLOAD_NAME = "������Ҫ���ص�С˵����";
	String PLEASE_INPUT_DOWNLOAD_PATH = "��������Ҫ���ص����ص�С˵·������ע��·����/����\\������������Ĭ�����ص����ش��̵�·����D:\\TEMP\\����";
	String DOWNLOAD_NAME = "���غ���ļ����ǣ�";
	String DOWNLOAD_PATH = "���غ��·���ǣ�";
	String DOWNLOAD_RESULT = "�ļ����ؽ����";
	String CONTINUE_DOWNLOAD_OR_BACK = "��������������1������������0��������";
	StringBuffer CONTINUE_OR_BACKS = new StringBuffer(LINE3)
			.append(CONTINUE_DOWNLOAD_OR_BACK);
	String PLEASE_INPUT_READ_NAME = "��������Ҫ�Ķ���С˵����";
	String CURRENT_OPERATIONS = "��ǰ�������Ķ�\n";
	String NOVEL_MESSAGE = "===========С˵ժҪ��Ϣ���£�===========\n";
	StringBuffer NOVEL_MESSAGES = new StringBuffer(LINE3).append(
			CURRENT_OPERATIONS).append(NOVEL_MESSAGE);
	String CONTINUE_SHOW_OR_DOWNLOAD = "������ʾ�б�������0������TXT������1,��������������";
	StringBuffer CONTINUE_SHOW_OR_DOWNLOADS = new StringBuffer(LINE3)
			.append(CONTINUE_SHOW_OR_DOWNLOAD);
	// �����Ķ�Ĭ�ϱ���·��������һ���ļ����������ڻ�����
	String DEFAULT_FILE_PATH = "D:/temp/";
	String MARTIAL_PATH="Story/Martial arts/";
	String ROMANCE_PATH="Story/Romance/";

	// �������˶˿ں�
	int SERVER_PORT = 8800;

	// ��ǰ�û�����
	String USER_REGIST_COMMAND = "�����ǣ��û�ע��";
	String USER_LOGIN_COMMAND = "�����ǣ��û���¼";
	String USER_SEARCH_COMMAND = "�����ǣ��û���ѯ";
	String NOVEL_LIST_COMMAND = "�����ǣ���ʾС˵�б�";
	String NOVEL_SEARCH_COMMAND = "�����ǣ���ѯС˵";
	String NOVEL_ONLINEREAD_COMMAND = "�����ǣ������Ķ�";
	String NOVEL_DOWNLOAD_COMMAND = "�����ǣ�С˵����";
	String NOVEL_UPLOAD_COMMAND = "�����ǣ�С˵�ϴ�";
	// �û�����ģ��Ĳ���

	String USER_REGIST_STATUS = "2";// ע��
	String USER_LOGIN_STATUS = "1";// ��¼
	String USER_EXIT_STATUS = "3";// �˳�
	String USER_SEARCH_STATUS = "4";// ����
}
