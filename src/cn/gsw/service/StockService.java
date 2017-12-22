package cn.gsw.service;

import java.util.List;

import cn.gsw.entity.Stock;

public interface StockService {

	public boolean addStock(Stock stock);

	public List<Stock> getAll();
}
