package oopsconcept;

public class Item {
	public int itemid;
	public String desc;
	public double price;
	
	
	public Item(int itemid, String desc, double price) {
		//super();
		this.itemid = itemid;
		this.desc = desc;
		this.price = price;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
