package com.accountsoft.model;

public class Tb_outaccount {
	
	private int _id;
	private double money;
	private String time;
	private String type;
	private String address;
	private String mark;
	public Tb_outaccount(){
		super();
		
		
	}
	
	public Tb_outaccount(int id, double money,String time,String type,String address,String mark){
		
		super();
		this._id=id;
		this.money=money;
		this.time=time;
		this.type=type;
		this.address=address;
		this.mark=mark;
		
		
	}
	
	public int getid(){
		return _id;
	}
	
	public double getmoney(){
		return money;
	}
	public String gettime(){
		return time;
	}
	public String gettype(){
		return type;
	}
	public String getaddress(){
		return address;
	}
	
	public String getmark(){
		return mark;
	}
	
	
	
	
	public void setid(int id){
		this._id=id;
	}
	
	
	public void setmoney(double money){
		this.money =money;
	}
	public void settime(String time){
		this.time =time;
	}
	public void settype(String type){
		this.type =type;
	}
	public void setaddress(String address){
		this.address=address;
	}
	
	public  void  setmark(String mark){
		this.mark =mark;
	}
	
	

}
