package com.interceptor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "stock", catalog = "test")
public class Stock implements java.io.Serializable, IAuditLog {
	
	private static final long serialVersionUID = 1L;

	private Long stockId;
	private String stockCode;
	private String stockName;
	
    @Transient
	@Override
	public Long getId(){
		return this.stockId.longValue();
	}
 
	@Transient
	@Override
	public String getLogDeatil(){
		StringBuilder sb = new StringBuilder();
		sb.append(" Stock Id : ").append(stockId)
		.append(" Stock Code : ").append(stockCode)
		.append(" Stock Name : ").append(stockName);
 
		return sb.toString();
	}

	public Long getStockId() {
		return stockId;
	}

	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	
}