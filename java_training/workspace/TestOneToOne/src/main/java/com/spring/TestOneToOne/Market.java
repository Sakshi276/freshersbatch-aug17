package com.spring.TestOneToOne;

import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="MARKETS")
public class Market {
	
	@Id
	@GeneratedValue
	@Column(name="marketId")
	private Long marketId;
	
	@Column(name="marketName")
	private String marketName;
	
	@OneToMany(cascade={CascadeType.PERSIST, CascadeType.REMOVE}, 
			fetch=FetchType.EAGER, mappedBy = "market")
	private Map<Long,Stock> stocks;

	public Market() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Market(String marketName) {
		super();
		this.marketName = marketName;
	}

	public Market(String marketName, Map<Long, Stock> stocks) {
		super();
		this.marketName = marketName;
		this.stocks = stocks;
	}

	public Long getMarketId() {
		return marketId;
	}

	public void setMarketId(Long marketId) {
		this.marketId = marketId;
	}

	public String getMarketName() {
		return marketName;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}

	public Map<Long, Stock> getStocks() {
		return stocks;
	}

	public void setStocks(Map<Long, Stock> stocks) {
		this.stocks = stocks;
	}

	@Override
	public String toString() {
		return "Market [ marketName=" + marketName + ", stocks=" + stocks + "]";
	}

	
}
