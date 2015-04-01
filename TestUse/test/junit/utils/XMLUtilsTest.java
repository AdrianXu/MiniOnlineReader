/**
 * 
 */
package test.junit.utils;

import java.io.File;

import org.dom4j.Document;
import org.junit.Test;

import com.bdqn.minitxt.utils.XMLUtils;

/**
 * @ClassName: XMLUtilsTest
 * @Description: TODO(������һ�仰��������������)
 * @���⣺���������Ķ���
 * @author Adrian Xu
 * @date 2014��3��25�� ����5:45:48
 * 
 */
public class XMLUtilsTest {

	private File file = new File("config/user.xml");

	@Test
	public void testGetDocument() {
		System.out.println(XMLUtils.getDocument(file));
	}

	@Test
	public void testWriteToXml() {
		Document doc = XMLUtils.getDocument(file);
		XMLUtils.writeToXml(doc, file);
	}

}
