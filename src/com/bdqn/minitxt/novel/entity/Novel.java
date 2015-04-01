/**
 * 
 */
package com.bdqn.minitxt.novel.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import com.bdqn.minitxt.common.ServerConstant;

/**
 * @ClassName: Novel
 * @���⣺���������Ķ���
 * @Description: С˵��
 * @author Adrian Xu
 * @date 2014��3��25�� ����4:22:22
 * 
 */
public class Novel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;// С˵��
	private String author;// ����
	private String introduction;// ���
	private String catogory;// ���1.����2.����
	private String status;// �����Ķ�txt��3.����TXT��2.�ϴ�TXT��1.���أ�0.��ʾ�б�
	private String sourceDirectory;// С˵Դ·��
	private String targetDirectory;// С˵Ŀ��·��
	private boolean result;// true���ɹ� false��ʧ��
	private int downloadTimes;// ���ش���
	private Date downloadTime;// �������ʱ��
	private Date updateTime;// �ϴ�ʱ��
	private Set<Novel> novels = new LinkedHashSet<>();// ����С˵�����ѯ
	private String partContent;// ����ʱ��������

	public Novel() {
		super();
	}

	public Novel(String name, String author, String introduction,
			String catogory, String status, String sourceDirectory,
			String targetDirectory, int downloadTimes, Date downloadtime,
			Date updateTime) {
		super();
		this.name = name;
		this.author = author;
		this.introduction = introduction;
		this.catogory = catogory;
		this.status = status;
		this.sourceDirectory = sourceDirectory;
		this.targetDirectory = targetDirectory;
		this.downloadTimes = downloadTimes;
		this.downloadTime = downloadtime;
		this.updateTime = updateTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getCatogory() {
		return catogory;
	}

	public void setCatogory(String catogory) {
		this.catogory = catogory;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSourceDirectory() {
		return sourceDirectory;
	}

	public void setSourceDirectory(String sourceDirectory) {
			this.sourceDirectory = sourceDirectory;
	}

	public String getTargetDirectory() {
		return targetDirectory;
	}

	public void setTargetDirectory(String targetDirectory) {
		if (targetDirectory.indexOf("\\") != -1||targetDirectory.indexOf("/") != -1
				&& targetDirectory.substring(targetDirectory.length() - 4,
						targetDirectory.length()).equals(".txt")) {
			this.targetDirectory = targetDirectory;
		}else{
			System.out.println("�ļ�·�����ԣ�ʹ��Ĭ��·��");
			this.targetDirectory=ServerConstant.DEFAULT_FILE_PATH+name+".txt";
		}
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public int getDownloadTimes() {
		return downloadTimes;
	}

	public void setDownloadTimes(int downloadTimes) {
		this.downloadTimes = downloadTimes;
	}

	public Date getDownloadTime() {
		return downloadTime;
	}

	public void setDownloadTime(Date downloadtime) {
		this.downloadTime = downloadtime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Set<Novel> getNovels() {
		return novels;
	}

	public void setNovels(Set<Novel> novels) {
		this.novels = novels;
	}

	public String getPartContent() {
		return partContent;
	}

	public void setPartContent(String partContent) {
		this.partContent = partContent;
	}

}
