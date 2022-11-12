package com.Anil.JDBCmaven.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.sound.midi.SysexMessage;

@Entity
@Table(name = "jdbc")
public class jdbc {

	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "mailid")
	private String mailid;
	
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
	public String getMailid() {
		return mailid;
	}
	public void setmailid(String mailid) {
		this.mailid = mailid;
	}
	@Override
	public String toString() {
		return "jdbc [id=" + id + ", name=" + name + ", mailid=" + mailid + "]";
	}
	
	}
	

