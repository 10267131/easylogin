package jp.co.internous.easylogin.model.domain;

public class MstUser {

	private int id;
	private String password;
	private String fullname;
	private String userName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUsername(String username) {
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullname;
	}
	public void setFullName(String fullName) {
	}
}
