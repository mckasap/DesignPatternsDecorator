package Starbuzz;

public class MilkCondiment extends CoffeeDecorator {

	public  MilkCondiment(Beverage b) {
		// TODO Auto-generated constructor stub
		beverage=b;
	
	}
	
	 @Override
		public String getDescription() {
			// TODO Auto-generated method stub
			return beverage.getDescription()+ ", Milk";
		}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.5 + beverage.cost();
	}

}
