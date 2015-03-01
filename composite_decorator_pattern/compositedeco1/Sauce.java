public class Sauce extends Decorator{

	private double addedState;
	private String[] sauceArray;
	
	public Sauce(Decorator c,String[] sauce) 
	{
		super(c);
		sauceArray = new String[sauce.length];
		sauceArray=sauce;
	}
	
	public double operation()
	{
		
		addedState = super.operation() ;
        return addedBehavior(addedState) ;
    }

	private double addedBehavior(double in) {
		if(sauceArray.length>1)
		{
			int valToBeAdded = sauceArray.length-1;
			addedState = addedState+(valToBeAdded*0.50);
		}
		return addedState;
	}
	
	public void printDescription() {
		super.printDescription();
		for(int i=0;i<sauceArray.length;i++)
		{
			String get = sauceArray[i];
			if(i==sauceArray.length-1)
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
