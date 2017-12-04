package oopsconcept;

public class Order {
	private int OrderID;
	private String custName;
	private String Address;
	private double totalprice;
/*	public Order(int orderID, String custName, String address, double totalprice) {
		super();
		OrderID = orderID;
		this.custName = custName;
		Address = address;
		this.totalprice = totalprice;
	}
	*/
	public int getOrderID() {
		return OrderID;
	}
	public void setOrderID(int orderID) {
		OrderID = orderID;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

}
