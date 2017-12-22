package cn.gsw.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.gsw.entity.Stock;
import cn.gsw.service.StockService;

public class TestStock {

	@Test
	public void test1(){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		StockService service = (StockService) ctx.getBean("stockService");
		Stock stock = new Stock();
		stock.setName("珍珠护肤品");
		stock.setNumStock(200);
		stock.setAddress("海龙港东顺街208号");
		stock.setMemo("特别好的护肤品哦！！");
		stock.setUnit("海龙港质检部");
		service.addStock(stock);
	}
}
