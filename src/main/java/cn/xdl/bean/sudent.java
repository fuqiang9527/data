package cn.xdl.bean;

public class sudent {
   int id;
   String name;
   int age;
public sudent(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}
public sudent() {
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "sudent [id=" + id + ", name=" + name + ", age=" + age + "]";
}
   
}
