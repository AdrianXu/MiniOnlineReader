/**
 * 
 */
package com.bdqn.minitxt.user.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: User
 * @���⣺���������Ķ���
 * @Description: �û���
 * @author Adrian Xu
 * @date 2014��3��25�� ����4:22:49
 * 
 */
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;// �û���
	private String password;// ����
	private String status;// 1.��¼ 2.ע�� 3.�˳�
	private boolean result;// true�ɹ� false ʧ��
	private int loginTimes;// ��¼����
	private Date lastLoginTime;// ����¼ʱ��
	private Date registTime;// ע��ʱ��
	private int role;// 0������Ա 1.��ͨ�û�

	public User() {
		super();
	}

	public User(String name, String password, String status,
			int loginTimes, Date lastLoginTime, Date registTime, int role) {
		super();
		this.name = name;
		this.password = password;
		this.status = status;
		this.loginTimes = loginTimes;
		this.lastLoginTime = lastLoginTime;
		this.registTime = registTime;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public int getLoginTimes() {
		return loginTimes;
	}

	public void setLoginTimes(int loginTimes) {
		this.loginTimes = loginTimes;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Date getRegistTime() {
		return registTime;
	}

	public void setRegistTime(Date registTime) {
		this.registTime = registTime;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
