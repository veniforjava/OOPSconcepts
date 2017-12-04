package oopsconcept;

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Mobile m = new Mobile(1,"iphone10",70000); 
		 System.out.println("1st Order item Desc: "+m.getDesc());
		 System.out.println("1st order item Price:"+m.getPrice());
	       // System.out.println(m.getModel()); 
		 Gadget g = new Gadget(2, "RayBan",30000);  
	        System.out.println("2nd Order Item Desc:  "+g.getDesc());
	        System.out.println("2nd Order item Price: "+g.getPrice());
	}

}
