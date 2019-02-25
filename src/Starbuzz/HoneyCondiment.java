package Starbuzz;

public class HoneyCondiment extends CoffeeDecorator {
	public  HoneyCondiment(Beverage b) {
		// TODO Auto-generated constructor stub
		beverage=b;
	
	}
	
	 @Override
		public String getDescription() {
			// TODO Auto-generated method stub
			return beverage.getDescription() + ", Honey";
		}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		
		return 0.65 + beverage.cost();
	}
}
