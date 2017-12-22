package cn.gsw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.gsw.dao.StockDao;
import cn.gsw.entity.Stock;
import cn.gsw.service.StockService;
@Service(value="stockService")
public class StockServiceImpl implements StockService{
	@Autowired
	@Qualifier(value="stockDao")
	private StockDao stockDao;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean addStock(Stock stock) {
		if (stockDao.save(stock)>0) {
			return true;
		}
		return false;
	}

	@Override
	public List<Stock> getAll() {
		
		return stockDao.getAll();
	}

}
