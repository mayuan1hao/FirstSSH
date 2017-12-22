package cn.gsw.dao;

import java.util.List;

import cn.gsw.entity.Stock;

public interface StockDao {
	public int save(Stock stock);

	public List<Stock> getAll();
}
