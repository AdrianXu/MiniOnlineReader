package com.bdqn.minitxt.novel.service;

import com.bdqn.minitxt.novel.entity.Novel;

/**
 * 
 * @ClassName: NovelService
 * @Description: TODO(������һ�仰��������������)
 * @���⣺���������Ķ���
 * @author Adrian Xu
 * @date 2014��3��27�� ����9:58:23
 * 
 */
public interface NovelService {
	/**
	 * ��ѯС˵���������֣�
	 */
	void searchNovelByName(Novel novel);

	/**
	 * �ϴ�С˵
	 */
	void uploadNovel(Novel novel);

	/**
	 * ����С˵
	 */
	void downloadNovel(Novel novel);

	/**
	 * ��ѯС˵�б�
	 */
	void listNovel(Novel novel);

	/**
	 * �����Ķ�С˵
	 */
	void onlineReadNovel(Novel novel);
}
