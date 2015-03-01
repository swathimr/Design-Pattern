public class Toppings extends Decorator{

	private double addedState;
	private String[] toppingArray;
	
	public Toppings(Decorator c,String[] topping)
	{
		super(c);
		toppingArray = new String[topping.length];
		toppingArray= topping;	
	}
	
	public double operation()
	{
		
		addedState = super.operation() ;
        return addedBehavior(addedState) ;
    }

	private double addedBehavior(double in) {
		/*if(toppingArray.length>4)
		{
			int valToBeAdded = toppingArray.length-4;
			addedState = addedState+(valToBeAdded*0.75);
		}*/
		return addedState;
	}
	
	public void printDescription() {
		super.printDescription();
		for(int i=0;i<toppingArray.length;i++)
		{
			String get = toppingArray[i];
			if(i==toppingArray.length-1)
			{
				System.out.print(get);
			}
			else
			{
				System.out.print(get+" + ");
			}	
		}
		System.out.println();
	}
}
