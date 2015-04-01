package com.bdqn.minitxt.novel.dao;

import java.util.Set;

import com.bdqn.minitxt.novel.entity.Novel;

/**
 * 
 * @ClassName: NovelDao
 * @Description: С˵ģ��־ò����
 * @���⣺���������Ķ���
 * @author Adrian Xu
 * @date 2014��3��25�� ����9:37:43
 * 
 */
public interface NovelDao {
	/**
	 * ����С˵
	 */

	void saveNovel(Novel novel);

	/**
	 * ��ѯ���������С˵
	 */
	Set<Novel> findNovels(String catogory);

	/**
	 * ��ѯС˵���ϴ����������Ķ�����С˵����
	 */
	boolean findNovelByName(String name);

	/**
	 * ����С˵
	 */
	void updataNovel(Novel novel);
}
