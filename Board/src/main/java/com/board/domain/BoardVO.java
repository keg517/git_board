package com.board.domain;

import java.util.Date;

public class BoardVO {
/* CREATE TABLE "KSPTEST"."TEST_BOARD" 
   (	"BNO" NUMBER, 
	"TITLE" VARCHAR2(30), 
	"CONTENTS" VARCHAR2(100), 
	"CONTENT_CNT" NUMBER(1,0), 
	"DEL_GB" CHAR(1), 
	"WRITE_DTM" DATE, 
	"WRITE_ID" VARCHAR2(10), 
	 PRIMARY KEY ("BNO")
*/
	private int bno;
	private String title;
	private String contents;
	private int content_cnt;
	private char del_gb;
	private Date write_dtm;
	private String write_id;
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getContent_cnt() {
		return content_cnt;
	}
	public void setContent_cnt(int content_cnt) {
		this.content_cnt = content_cnt;
	}
	public char getDel_gb() {
		return del_gb;
	}
	public void setDel_gb(char del_gb) {
		this.del_gb = del_gb;
	}
	public Date getWrite_dtm() {
		return write_dtm;
	}
	public void setWrite_dtm(Date write_dtm) {
		this.write_dtm = write_dtm;
	}
	public String getWrite_id() {
		return write_id;
	}
	public void setWrite_id(String write_id) {
		this.write_id = write_id;
	}
	
}
