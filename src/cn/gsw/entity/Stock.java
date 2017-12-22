package cn.gsw.entity;

public class Stock {
	private Integer id;
	private String name;
	private String unit;
	private Integer numStock;
	private String address;
	private String memo;
	public Stock(Integer id, String name, String unit, Integer numStock,
			String address, String memo) {
		this.id = id;
		this.name = name;
		this.unit = unit;
		this.numStock = numStock;
		this.address = address;
		this.memo = memo;
	}
	public Stock() {
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getUnit() {
		return unit;
	}
	public Integer getNumStock() {
		return numStock;
	}
	public String getAddress() {
		return address;
	}
	public String getMemo() {
		return memo;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public void setNumStock(Integer numStock) {
		this.numStock = numStock;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	@Override
	public String toString() {
		return "Stock [id=" + id + ", name=" + name + ", unit=" + unit
				+ ", numStock=" + numStock + ", address=" + address + ", memo="
				+ memo + "]";
	}
	 
}
