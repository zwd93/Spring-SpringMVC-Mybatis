package com.shop.ssm.po;import java.util.Date;/******************************************************************************* * javaBeans * orders --> Orders  * <table explanation> * @author 2019-06-08 02:15:42 *  */	public class Orders implements java.io.Serializable {	//field	/** 订单id **/	private int id;	/** 用户id **/	private int userid;	/** 产品id **/	private int productid;	/** 状态代码 **/	private int statuscode;	/** 收货地址 **/	private String useraddress;	/** 购买日期 **/	private Date submittime;	/**  **/	private String 备用1;	/**  **/	private String 备用2;	/**  **/	private String 备用3;	/**  **/	private String 备用4;	/**  **/	private String 备用5;	//method	public int getId() {		return id;	}	public void setId(int id) {		this.id = id;	}	public int getUserid() {		return userid;	}	public void setUserid(int userid) {		this.userid = userid;	}	public int getProductid() {		return productid;	}	public void setProductid(int productid) {		this.productid = productid;	}	public int getStatuscode() {		return statuscode;	}	public void setStatuscode(int statuscode) {		this.statuscode = statuscode;	}	public String getUseraddress() {		return useraddress;	}	public void setUseraddress(String useraddress) {		this.useraddress = useraddress;	}	public Date getSubmittime() {		return submittime;	}	public void setSubmittime(Date submittime) {		this.submittime = submittime;	}	public String get备用1() {		return 备用1;	}	public void set备用1(String 备用1) {		this.备用1 = 备用1;	}	public String get备用2() {		return 备用2;	}	public void set备用2(String 备用2) {		this.备用2 = 备用2;	}	public String get备用3() {		return 备用3;	}	public void set备用3(String 备用3) {		this.备用3 = 备用3;	}	public String get备用4() {		return 备用4;	}	public void set备用4(String 备用4) {		this.备用4 = 备用4;	}	public String get备用5() {		return 备用5;	}	public void set备用5(String 备用5) {		this.备用5 = 备用5;	}	//override toString Method 	public String toString() {		StringBuffer sb=new StringBuffer();		sb.append("{");		sb.append("'id':'"+this.getId()+"',");		sb.append("'userid':'"+this.getUserid()+"',");		sb.append("'productid':'"+this.getProductid()+"',");		sb.append("'statuscode':'"+this.getStatuscode()+"',");		sb.append("'useraddress':'"+this.getUseraddress()+"',");		sb.append("'submittime':'"+this.getSubmittime()+"',");		sb.append("'备用1':'"+this.get备用1()+"',");		sb.append("'备用2':'"+this.get备用2()+"',");		sb.append("'备用3':'"+this.get备用3()+"',");		sb.append("'备用4':'"+this.get备用4()+"',");		sb.append("'备用5':'"+this.get备用5()+"'");		sb.append("}");		return sb.toString();	}}