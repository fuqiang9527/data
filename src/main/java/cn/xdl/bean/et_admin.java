package cn.xdl.bean;

public class et_admin {
  private int id;
  private String name;
  private String password;
public et_admin(int id, String name, String password) {
	super();
	this.id = id;
	this.name = name;
	this.password = password;
}
public et_admin() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
  
  
}
