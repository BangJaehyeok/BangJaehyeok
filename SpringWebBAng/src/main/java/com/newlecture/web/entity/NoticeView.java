package com.newlecture.web.entity;

import java.util.Date;

public class NoticeView extends Notice{
		private String memberName;
		
		public NoticeView() {
			
		}
		
	 public NoticeView(int id, String title, String memberid, String content, Date regdate, int hit, boolean pub, String membername) {
		 super(id, title, content, regdate, hit, pub, memberid);
		 
		 this.memberName = memberName;
			      // TODO Auto-generated constructor stub
			   }

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "NoticeView [memberName=" + memberName + ", getId()=" + getId() + ", getTitle()=" + getTitle()
				+ ", getContent()=" + getContent() + ", getRegdate()=" + getRegdate() + ", getHit()=" + getHit()
				+ ", isPub()=" + isPub() + ", getMemberid()=" + getMemberid() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	 
	 	
}
