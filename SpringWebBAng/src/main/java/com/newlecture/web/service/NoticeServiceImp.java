package com.newlecture.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.entity.Notice;
import com.newlecture.web.entity.NoticeView;

@Service
public class NoticeServiceImp  implements NoticeService{

	@Autowired
	private NoticeDao noticeDao;
	
	@Override
	public NoticeView getView(int id) {
		
		Notice notice = noticeDao.getView(id);
		
		return  (NoticeView) notice;
	}

	@Override
	public List<NoticeView> getList(int page, String field, String query, int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NoticeView> getViewList(int page, String field, String query) {
		
		int size = 5;
	    int start = ((page-1) * size) + 1;
	    int end = (page * size);
		
		List<NoticeView> list = noticeDao.getList(size, start, end);
		
		return list;
	}
	
	@Override
	public List<NoticeView> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<NoticeView> getViewList() {
		// TODO Auto-generated method stub
		return getViewList(1, "title", "");
	}

	@Override
	public List<NoticeView> getViewList(String field, String query) {
		// TODO Auto-generated method stub
		return getViewList(1, field, query);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return getCount();
	}

	@Override
	public int getCount(String field, String query) {
		// TODO Auto-generated method stub
		return noticeDao.getCount(field, query);
	}

	@Override
	public Notice getNext(int id) {
		// TODO Auto-generated method stub
		return noticeDao.getNext(id);
	}

	@Override
	public Notice getPrev(int id) {
		// TODO Auto-generated method stub
		return noticeDao.getPrev(id);
	}

	public int updatePubAll(int[] ids, boolean pub) {
		// TODO Auto-generated method stub
		return noticeDao.updatePubAll(ids, pub);
	}

	@Override
	public int deleteAll(int[] ids) {
		// TODO Auto-generated method stub
		return noticeDao.deleteAll(ids);
	}

	@Override
	public int update(Notice notice) {
		// TODO Auto-generated method stub
		return noticeDao.update(notice);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return noticeDao.delete(id);
	}

	@Override
	public int insert(Notice notice) {
		// TODO Auto-generated method stub
		return noticeDao.insert(notice);
	}

	@Override
	public List<NoticeView> getList(int page, String field, String query) {
		// TODO Auto-generated method stub
		return noticeDao.getViewList(1, "title", "");
	}

	@Override
	public List<NoticeView> getView() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Notice get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updatePubAll(int[] publds, int[] closelds) {
		// TODO Auto-generated method stub
		return 0;
	}

	
		
}
