package com.bdqn.minitxt.novel.service.impl;

import com.bdqn.minitxt.novel.dao.NovelDao;
import com.bdqn.minitxt.novel.entity.Novel;
import com.bdqn.minitxt.novel.service.NovelService;
import com.bdqn.minitxt.utils.InstanceFactory;

/**
 * 
 * @ClassName: NovelServiceImpl
 * @Description: TODO(������һ�仰��������������)
 * @���⣺���������Ķ���
 * @author Adrian Xu
 * @date 2014��3��27�� ����10:02:05
 * 
 */
public class NovelServiceImpl implements NovelService {

	private NovelDao dao = (NovelDao) InstanceFactory.getInstance()
			.createInstance(NovelDao.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bdqn.minitxt.novel.service.NovelService#uploadNovel(com.bdqn.minitxt
	 * .novel.entity.Novel)
	 */
	@Override
	public void uploadNovel(Novel novel) {

		dao.saveNovel(novel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bdqn.minitxt.novel.service.NovelService#downloadNovel(com.bdqn.minitxt
	 * .novel.entity.Novel)
	 */
	@Override
	public void downloadNovel(Novel novel) {

		dao.updataNovel(novel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bdqn.minitxt.novel.service.NovelService#listNovel(com.bdqn.minitxt
	 * .novel.entity.Novel)
	 */
	@Override
	public void listNovel(Novel novel) {

		novel.setNovels(dao.findNovels(novel.getCatogory()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bdqn.minitxt.novel.service.NovelService#searchNovelByName(com.bdqn
	 * .minitxt.novel.entity.Novel)
	 */
	@Override
	public void searchNovelByName(Novel novel) {

		novel.setResult(dao.findNovelByName(novel.getName()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.bdqn.minitxt.novel.service.NovelService#onlineReadNovel(com.bdqn.
	 * minitxt.novel.entity.Novel)
	 */
	@Override
	public void onlineReadNovel(Novel novel) {

		dao.updataNovel(novel);
	}

}
