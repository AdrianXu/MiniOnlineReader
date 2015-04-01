package com.bdqn.minitxt.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.bdqn.minitxt.common.ServerConstant;

/**
 * 
 * @ClassName: ServerService
 * @Description: �������˷�����
 * @���⣺���������Ķ���
 * @author Adrian Xu
 * @date 2014��3��25�� ����8:46:18
 * 
 */
public class ServerService<T> {
	/**
	 * ��Ӧ�ͻ��˵�����
	 */
	public void responseToClient() {

		try {
			ServerSocket server = new ServerSocket(ServerConstant.SERVER_PORT);
			while (true) {
				Socket client = server.accept();
				new Thread(new ServerThread<T>(client)).start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
