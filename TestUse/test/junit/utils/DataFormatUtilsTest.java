/**
 * 
 */
package test.junit.utils;

import java.util.Date;

import org.junit.Test;

import com.bdqn.minitxt.utils.DataFormatUtils;

/**
 * @ClassName: DataFormatUtilsTest
 * @Description: TODO(������һ�仰��������������)
 * @���⣺���������Ķ���
 * @author Adrian Xu
 * @date 2014��3��27�� ����8:13:08
 * 
 */
public class DataFormatUtilsTest {

	@Test
	public void getStringFormatDate() {
		Date date = new Date();
		System.out.println(DataFormatUtils.getStringFormatDate(date));
	}

	@Test
	public void getDateFromString() {
		String str = "2014-03-27 08:15:37";
		System.out.println(DataFormatUtils.getDateFromString(str));
	}

}
