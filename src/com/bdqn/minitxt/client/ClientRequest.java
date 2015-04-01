/**
 * 
 */
package com.bdqn.minitxt.client;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import com.bdqn.minitxt.common.ClientConstant;

/**
 * @ClassName: ClientRequest
 * @Description: �ͻ�����
 * @���⣺���������Ķ���
 * @author Adrian Xu
 * @date 2014��3��25�� ����8:45:02
 * 
 */
public class ClientRequest {

	public <T> T requestToServer(T t) {
		try (Socket client = new Socket(ClientConstant.SERVER_NAME,
				ClientConstant.SERVER_PORT);
		// ��������˷��Ͷ���
				ObjectOutputStream oos = new ObjectOutputStream(
						client.getOutputStream());
				// ���շ������˴����Ķ���
				ObjectInputStream ois = new ObjectInputStream(
						client.getInputStream());) {

			oos.writeObject(t);
			client.shutdownOutput();
			oos.flush();

			T obj = (T) ois.readObject();
			client.shutdownInput();
			return obj;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
