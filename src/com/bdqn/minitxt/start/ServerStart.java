/**
 * 
 */
package com.bdqn.minitxt.start;

import com.bdqn.minitxt.server.ServerService;

/**
 * @ClassName: ServerStart
 * @Description: ������������
 * @���⣺���������Ķ���
 * @author Adrian Xu
 * @date 2014��3��27�� ����3:38:14
 * 
 */
public class ServerStart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		new ServerService().responseToClient();
	}

}
