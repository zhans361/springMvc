/*************************************************************************************
 * Copyright (C) 2015 Shenzhen Zhubaodai Internet Financial Services Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳市珠宝贷互联网金融服务股份有限公司开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件。
 *************************************************************************************/
 /*************************************************************************************
 * Copyright (C) 2015 Shenzhen Zhubaodai Internet Financial Services Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳市珠宝贷互联网金融服务股份有限公司开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件。
 *************************************************************************************/
	

 package com.lzp.model;
 /**
 * 类名: User
 * 类描述: TODO (用一句话描述这个类做什么).
 * 创建日期: 2017-3-30 下午5:50:40
 * @author lzp
 * @version
 * @since JDK 1.6
 * @see
 */
/**
 * 类名: User
 * 类描述: TODO (用一句话描述这个类做什么).
 * 创建日期: 2017-3-30 下午5:50:40
 *
 * @author lzp
 * @version 
 * @since JDK 1.6
 */

public class User {

	/**
	 * Creates a new instance of User.
	 *
	 */
	private String userName;
	private String passWord;
	
	private String firstName;
	private String lastName;
	
	public User() {
		// TODO Auto-generated constructor stub

	}
	public User(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		
	}
	

	/**
	 * userName.
	 *
	 * @return  the userName
	 * @since   JDK 1.6
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * userName.
	 *
	 * @param userName the userName to set
	 * @since JDK 1.6
	 */
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * passWord.
	 *
	 * @return  the passWord
	 * @since   JDK 1.6
	 */
	public String getPassWord() {
		return passWord;
	}
	/**
	 * passWord.
	 *
	 * @param passWord the passWord to set
	 * @since JDK 1.6
	 */
	
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	/**
	 * firstName.
	 *
	 * @return  the firstName
	 * @since   JDK 1.6
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * firstName.
	 *
	 * @param firstName the firstName to set
	 * @since JDK 1.6
	 */
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * lastName.
	 *
	 * @return  the lastName
	 * @since   JDK 1.6
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * lastName.
	 *
	 * @param lastName the lastName to set
	 * @since JDK 1.6
	 */
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}

	