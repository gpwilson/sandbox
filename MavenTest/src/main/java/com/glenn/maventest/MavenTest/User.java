/**
 * 
 */
package com.glenn.maventest.MavenTest;

import java.util.Date;

/**
 * @author gpwil
 *
 */
public class User {

	private Long userId;
	private String name;
	private Date birth_dt;

	public User(Long userId, String name, Date birth_dt) {
		super();
		this.userId = userId;
		this.name = name;
		this.birth_dt = birth_dt;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth_dt() {
		return birth_dt;
	}

	public void setBirth_dt(Date birth_dt) {
		this.birth_dt = birth_dt;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", birth_dt=" + birth_dt + "]";
	}

}
