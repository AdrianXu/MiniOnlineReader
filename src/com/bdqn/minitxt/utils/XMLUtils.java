package com.bdqn.minitxt.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * 
 * @ClassName: XMLUtils
 * @Description: XML������
 * @���⣺���������Ķ���
 * @author Adrian Xu
 * @date 2014��3��25�� ����5:02:52
 * 
 */
public class XMLUtils {
	/**
	 * ���Document����
	 */

	public static Document getDocument(File file) {
		SAXReader reader = new SAXReader();
		try {
			return reader.read(file);
		} catch (DocumentException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	/**
	 * ��Document����������XML�ļ���
	 */
	public static void writeToXml(Document doc, File file) {
		XMLWriter writer = null;

		try {
			Writer out = new BufferedWriter(new FileWriter(file));
			OutputFormat format = OutputFormat.createPrettyPrint();
			format.setEncoding("GBK");
			writer = new XMLWriter(out, format);
			writer.write(doc);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
