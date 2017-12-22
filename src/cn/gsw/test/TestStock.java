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
		stock.setName("���黤��Ʒ");
		stock.setNumStock(200);
		stock.setAddress("�����۶�˳��208��");
		stock.setMemo("�ر�õĻ���ƷŶ����");
		stock.setUnit("�������ʼ첿");
		service.addStock(stock);
	}
}
