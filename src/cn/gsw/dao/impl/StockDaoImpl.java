package cn.gsw.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import cn.gsw.dao.StockDao;
import cn.gsw.entity.Stock;

@Repository(value="stockDao")
public class StockDaoImpl extends HibernateDaoSupport implements StockDao {

	public StockDaoImpl(){}
	@Autowired
	public StockDaoImpl(@Qualifier("sessionFactory")
						SessionFactory sessionFactory){
		this.setSessionFactory(sessionFactory);
	}
	
	@Override
	public int save(Stock stock) {
		return (Integer) this.getHibernateTemplate().save(stock);
	}
	@Override
	public List<Stock> getAll() {
		return this.getHibernateTemplate().find("from Stock");
	}

}
