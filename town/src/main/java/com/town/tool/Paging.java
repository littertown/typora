package com.town.tool;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Paging<T> extends PageInit implements Serializable{
	
	private static final long serialVersionUID = 1426035130272350980L;
	
	List<T> list = new ArrayList();
	
	public Paging(Integer pageNo,Integer pageSize,int total){
		super(pageNo, pageSize, total);
	}
	
	public Paging(String pageNo,String pageSize,int total){
		super(pageNo, pageSize, total);
	}
	
	public Paging(Integer pageNo,Integer pageSize,int total,List list){
		super(pageNo, pageSize, total);
		this.setList(list);
	}
	
	public Paging(String pageNo,String pageSize,int total,List list){
		super(pageNo, pageSize, total);
		this.setList(list);
	}
	
	/**
	 * 开始位置
	 */
	public int begin(){
		pageNo = this.LastPage(pageNo);
		return (pageNo-1)*pageSize;
	}
	/**
	 * 当前页的条数
	 */
	public int getCurrentPageNum(){
		return list.size();
	}
	/**
	 * 下一页
	 */
	public int getNextPage(){
		return pageNo+1 >= this.getPagingSum() ? this.getPagingSum() : pageNo+1;
	}
	/**
	 * 当前页
	 */
	public int getCurrentPage(){
		return LastPage(pageNo);
	}
	/**
	 * 上一页
	 */
	public int getPreviousPage(){
		return pageNo-1 > 0 ? pageNo-1 : 1;
	}
	
	/**
	 * 总页数
	 */
	public int getPagingSum(){
		return (total+pageSize-1)/pageSize;
	}
	
	/**
	 * 最后一页
	 */
	public int LastPage(int lastnum){
		int sum = this.getPagingSum();
		return lastnum >= sum ? sum : lastnum;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
}
