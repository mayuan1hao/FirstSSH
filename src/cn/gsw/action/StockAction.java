package cn.gsw.action;

import java.util.List;

import cn.gsw.entity.Stock;
import cn.gsw.service.StockService;

import com.opensymphony.xwork2.ActionSupport;

public class StockAction extends ActionSupport {
	
	private StockService stockService;
	private List<Stock> stocks;
	
	
	public StockService getStockService() {
		return stockService;
	}


	public List<Stock> getStocks() {
		return stocks;
	}


	public void setStockService(StockService stockService) {
		this.stockService = stockService;
	}


	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}


	public String index(){
		this.setStocks(stockService.getAll());
		
		return SUCCESS;
	}
}
