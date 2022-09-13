package com.bikkadIT.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
private Integer Sid;
private String Sname;
private String Semail;
private int Sage;
public int getSid() {
	return Sid;
}
public void setSid(int sid) {
	Sid = sid;
}
public String getSname() {
	return Sname;
}
public void setSname(String sname) {
	Sname = sname;
}
public String getSemail() {
	return Semail;
}
public void setSemail(String semail) {
	Semail = semail;
}
public int getSage() {
	return Sage;
}
public void setSage(int sage) {
	Sage = sage;
}
@Override
public String toString() {
	return "Student [Sid=" + Sid + ", Sname=" + Sname + ", Semail=" + Semail + ", Sage=" + Sage + "]";
}

}
