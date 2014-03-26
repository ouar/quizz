package fr.gfi.quiz.entite.hibernate;

// Generated 26 mars 2014 17:52:51 by Hibernate Tools 3.4.0.CR1

/**
 * UserRoles generated by hbm2java
 */
public class UserRoles implements java.io.Serializable {

	private Integer userRoleId;
	private User user;
	private Role role;

	public UserRoles() {
	}

	public UserRoles(User user, Role role) {
		this.user = user;
		this.role = role;
	}

	public Integer getUserRoleId() {
		return this.userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
