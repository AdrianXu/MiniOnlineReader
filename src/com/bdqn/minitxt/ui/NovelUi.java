/**
 * 
 */
package com.bdqn.minitxt.ui;

import java.io.File;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.bdqn.minitxt.client.ClientRequest;
import com.bdqn.minitxt.common.ClientConstant;
import com.bdqn.minitxt.common.ServerConstant;
import com.bdqn.minitxt.novel.entity.Novel;

/**
 * @ClassName: NovelUi
 * @Description: TODO(������һ�仰��������������)
 * @���⣺���������Ķ���
 * @author Adrian Xu
 * @date 2014��3��27�� ����10:03:00
 * 
 */
public class NovelUi {

	public NovelUi() {

	}

	String path = null;

	public void NovelList() {
		Scanner input = new Scanner(System.in);
		System.out.print(ClientConstant.NOVEL_MENU);
		String choice = input.nextLine();
		Novel novel = new Novel();
		switch (choice) {
		case ServerConstant.NOVEL_MARTIALARTS_MENU:
			novel.setCatogory(ServerConstant.NOVEL_MARTIAL_ARTS);
			path = ServerConstant.MARTIAL_PATH;
			showNovelListByCatogory(input, novel);
			novelOperator(input, novel);
			break;
		case ServerConstant.NOVEL_ROMANCE_MENU:
			novel.setCatogory(ServerConstant.NOVEL_ROMANCE);
			path = ServerConstant.ROMANCE_PATH;
			showNovelListByCatogory(input, novel);
			novelOperator(input, novel);
			break;
		case ServerConstant.NOVEL_RETURN_UPPER_LEVEL:
			new UserUi().userOperator();
			break;
		default:
			System.out.println("������Ĳ����ڣ�����������");
			NovelList();
		}
	}

	/**
	 * @param input
	 */
	private void novelOperator(Scanner input, Novel novel) {
		System.out.print(ServerConstant.NOVEL_OPERATION);
		String choice = input.nextLine();
		switch (choice) {
		case ServerConstant.NOVEL_UPLOAD:
			novelUpload(input, novel);
			break;
		case ServerConstant.NOVEL_DOWNLOAD:
			novelDownload(input, novel);
			break;
		case ServerConstant.NOVEL_ONLINE_READ:
			novelOnlinrRead(input, novel);
			break;
		case ServerConstant.NOVEL_RETURN:
			NovelList();
			break;
		default:
			System.out.println("������Ĳ����ڣ�����������");
			novelOperator(input, novel);
		}
	}

	/**
	 * @param input
	 */
	private void novelOnlinrRead(Scanner input, Novel novel) {
		while (true) {
			System.out.print(ServerConstant.PLEASE_INPUT_READ_NAME);
			novel.setName(input.nextLine());
			novel.setStatus(ServerConstant.NOVEL_SEARCH);
			Novel novelFromServer = new ClientRequest().requestToServer(novel);
			if (!novelFromServer.isResult()) {
				System.out.println("��Ҫ�Ķ���С˵�����ڣ�����������");
				continue;
			} else {
				while (true) {
					novel.setStatus(ServerConstant.NOVEL_ONLINE_READ);
					novel.setDownloadTime(new Date());
					File dir = new File(ServerConstant.DEFAULT_FILE_PATH);
					if (!dir.exists()) {
						dir.mkdir();
					}
					novel.setTargetDirectory(ServerConstant.DEFAULT_FILE_PATH
							+ novel.getName() + ".txt");
					novelFromServer = new ClientRequest()
							.requestToServer(novel);
					System.out.print(ServerConstant.NOVEL_MESSAGES);
					System.out.println(novelFromServer.getPartContent());
					System.out.print(ServerConstant.CONTINUE_SHOW_OR_DOWNLOADS);
					String choice = input.nextLine();
					if (choice.equals("0")) {
						continue;
					} else if (choice.equals("1")) {
						novelDownload(input, novel);
						break;
					} else {
						NovelList();
						break;
					}

				}
				break;
			}
		}
	}

	/**
	 * @param input
	 */
	private void novelDownload(Scanner input, Novel novel) {
		while (true) {
			System.out.print(ServerConstant.PLEASE_INPUT_DOWNLOAD_NAME);
			novel.setName(input.nextLine());
			novel.setStatus(ServerConstant.NOVEL_SEARCH);
			Novel novelFromServer = new ClientRequest().requestToServer(novel);
			if (!novelFromServer.isResult()) {
				System.out.println("��Ҫ���ص�С˵�����ڣ�����������");
				continue;
			} else {
				System.out.println(ServerConstant.PLEASE_INPUT_DOWNLOAD_PATH);
				String path = input.nextLine();
				if (path.equals("") || path == null) {
					novel.setTargetDirectory(ServerConstant.DEFAULT_FILE_PATH
							+ novel.getName() + ".txt");
				} else {
					novel.setTargetDirectory(path + novel.getName() + ".txt");
				}
				System.out.println(ServerConstant.DOWNLOAD_NAME
						+ novel.getName() + ".txt");
				System.out.println(ServerConstant.DOWNLOAD_PATH
						+ novel.getTargetDirectory());
				novel.setDownloadTime(new Date());
				novel.setStatus(ServerConstant.NOVEL_DOWNLOAD);
				novelFromServer = new ClientRequest().requestToServer(novel);
				System.out.print(ServerConstant.DOWNLOAD_RESULT);
				if (novelFromServer.isResult()) {
					System.out.println("�ɹ�");
				} else {
					System.out.println("ʧ��");
				}
			}
			System.out.print(ServerConstant.CONTINUE_DOWNLOAD_OR_BACK);
			String choice = input.nextLine();
			if (choice.equals("1")) {
				continue;
			} else{
				NovelList();
				break;
			}
		}
	}

	/**
	 * 
	 */
	private void novelUpload(Scanner input, Novel novel) {
		while (true) {
			System.out.print(ServerConstant.PLEASE_INPUT_UPLOAD_NAME);
			novel.setName(input.nextLine());
			novel.setStatus(ServerConstant.NOVEL_SEARCH);
			Novel novelFromServer = new ClientRequest().requestToServer(novel);
			if (novelFromServer.isResult()) {
				System.out.println("��Ҫ�ϴ���С˵�Ѵ��ڣ�����������");
				continue;
			} else {
				System.out.print(ServerConstant.PLEASE_INPUT_UPLOAD_AUTHOR);
				novel.setAuthor(input.nextLine());
				System.out
						.print(ServerConstant.PLEASE_INPUT_UPLOAD_INDRODUCTION);
				novel.setIntroduction(input.nextLine());
				System.out.print(ServerConstant.PLEASE_INPUT_UPLOAD_PATH);
				novel.setSourceDirectory(input.nextLine());
				novel.setUpdateTime(new Date());
				novel.setTargetDirectory(path + novel.getName() + ".txt");
				novel.setStatus(ServerConstant.NOVEL_UPLOAD);
				novelFromServer = new ClientRequest().requestToServer(novel);
				if (novelFromServer.isResult()) {
					System.out.print(ServerConstant.NOVEL_UPLOAD_SUCESSES);
					String choice = input.nextLine();
					if (choice.equals("1")) {
						continue;
					} else if (choice.equals("0")) {
						new NovelUi().NovelList();
						break;
					}
				} else {
					System.out.println("С˵�ϴ�ʧ�ܣ�");
					return;
				}
			}
		}
	}

	private void showNovelListByCatogory(Scanner input, Novel novel) {
		novel.setStatus(ServerConstant.NOVEL_LIST);
		Novel novelFromServer = new ClientRequest().requestToServer(novel);
		Set<Novel> novels = novelFromServer.getNovels();
		if (novels.size() == 0) {
			System.out.println("û��С˵��棬���ϴ�");
			novelUpload(input, novel);
			return;
		}
		System.out.println(ServerConstant.LINE1);
		System.out.println("���" + "\t" + "����" + "\t\t" + "����" + "\t\t" + "���");
		int i = 1;
		for (Iterator<Novel> iter = novels.iterator(); iter.hasNext();) {
			Novel n = iter.next();
			System.out.println(i + "\t" + n.getName() + "\t" + n.getAuthor()
					+ "\t" + n.getIntroduction());
			i++;
		}
		System.out.println(ServerConstant.LINE2);
	}
}
