/**
 * 
 */
package com.bdqn.minitxt.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.bdqn.minitxt.common.ServerConstant;

/**
 * @ClassName: DataFormatUtils
 * @Description: ʱ���ʽ����
 * @���⣺���������Ķ���
 * @author Adrian Xu
 * @date 2014��3��25�� ����11:52:48
 * 
 */
public class DataFormatUtils {
	/**
	 * ��ʱ���ʽת�����ַ���
	 */

	public static String getStringFormatDate(Date date) {
		return new SimpleDateFormat(ServerConstant.TIME_PATH).format(date);
	}

	/**
	 * ���ַ���������������
	 */

	public static Date getDateFromString(String str) {
		try {
			return new SimpleDateFormat(ServerConstant.TIME_PATH).parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
