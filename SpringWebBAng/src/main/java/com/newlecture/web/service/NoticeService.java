package com.newlecture.web.service;

import java.util.List;

import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

public interface NoticeService {
	// -페이지를 요청할때
	List<NoticeView> getViewList();

	// -검색을 요청할때
	List<NoticeView> getViewList(String field, String query);

	// -페이지버튼 요청
	List<NoticeView> getList(int page, String field, String query);

	int getCount();

	int getCount(String field, String query);

	List<NoticeView> getViewList(int page, String field, String query);

	// -자세한 페이지를 요청할때
	NoticeView getView(int id);

	Notice getNext(int id);

	Notice getPrev(int id);

	// -일괄공개를 요청할때
	int updatePubAll(int[] publds, int[] closelds);

	// -일괄삭제를 요청할때
	int deleteAll(int[] ids);

	// 수정페이지를 요청할때
	int update(Notice notice);

	int delete(int id);

	int insert(Notice notice);

	List<NoticeView> getList(int page, String field, String query, int end, int start);

	List<NoticeView> getList();
	
	List<NoticeView> getView();

	Notice get(int i);

}
