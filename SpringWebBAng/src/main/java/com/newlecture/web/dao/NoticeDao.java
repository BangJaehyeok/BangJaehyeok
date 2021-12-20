package com.newlecture.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

@Mapper
public interface NoticeDao {
	
	//@Result(property ="memberName", column="member_name")
	//@Select("select * from noticeview where ${field} like '$%{query}%' order by regdate desc limit #{offset}, #{size}")
	   
	
	//@Select("select * from noticeview where id >= #{start} and id <=#{end} order by regdate desc")
	
	List<NoticeView> getViewList(int size, int i, String end, String query, boolean pub);
	
	Notice get(int id);
	Notice getNext(int id);
	Notice getPrev(int id);
	Notice getView(int id);
	
	List<NoticeView> getViewList(int size, String string, String string2);
	int getCount(String field, String query);	
	int updatePubAll(int[] ids, boolean pub);
	//int updatePubAll(int[] pubIds, int[] closeIds);
	int deleteAll(int[] ids);
	int delete(int id);
	int update(Notice notice);
	int delete(Notice notice);
	int insert(Notice notice);

	List<NoticeView> getList(int size, int start, int end);

	List<NoticeView> getViewList(int i, int j, String string, boolean b);

	


}
