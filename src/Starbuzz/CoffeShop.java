package Starbuzz;

public class CoffeShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Beverage b= new TurkishCoffee();
		b= new MilkCondiment(b);
		b= new HoneyCondiment(b);
		b= new MilkCondiment(b);
		System.out.println( b.getDescription()+ ", "+ 
		b.cost() +" TL");
		

	}

}
