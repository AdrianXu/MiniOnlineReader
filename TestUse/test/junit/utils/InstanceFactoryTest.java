/**
 * 
 */
package test.junit.utils;

import org.junit.Test;

import com.bdqn.minitxt.novel.dao.NovelDao;
import com.bdqn.minitxt.utils.InstanceFactory;

/**
 * @ClassName: InstanceFactoryTest
 * @Description: TODO(������һ�仰��������������)
 * @���⣺���������Ķ���
 * @author Adrian Xu
 * @date 2014��3��26�� ����1:11:15
 * 
 */
public class InstanceFactoryTest {

	@Test
	public void testInstanceFactory() {
		InstanceFactory instance = InstanceFactory.getInstance();
		InstanceFactory instance2 = InstanceFactory.getInstance();
		System.out.println(instance == instance2);
	}

	@Test
	public void testCreatInstance() {
		System.out.println(InstanceFactory.getInstance().createInstance(
				NovelDao.class));
	}

}
