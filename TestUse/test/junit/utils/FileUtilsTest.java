/**
 * 
 */
package test.junit.utils;

import org.junit.Test;

import com.bdqn.minitxt.novel.entity.Novel;
import com.bdqn.minitxt.utils.FileUtils;

/**
 * @ClassName: FileUitlsTest
 * @Description: TODO(������һ�仰��������������)
 * @���⣺���������Ķ���
 * @author Adrian Xu
 * @date 2014��3��25�� ����5:18:12
 * 
 */
public class FileUtilsTest {

	@Test
	public void testFileCopy() {
		Novel novel = new Novel();

		String targetDirectory = "D:\\Tony\\Documents\\�γ���������\\ʵѵ��Ŀ\\Youth.txt";
		String sourceDirectory = "Story\\Martial arts\\Youth.txt";
		novel.setSourceDirectory(sourceDirectory);
		novel.setTargetDirectory(targetDirectory);

		FileUtils.fileCopy(novel);

	}

}
