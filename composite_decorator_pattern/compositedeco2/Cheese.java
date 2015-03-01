public class Cheese extends Decorator {
	
	private double addedState;
	
    private String[] cheeseArray; 
  
	public Cheese(Decorator c,String[] cheese) {
		super(c);
		cheeseArray = new String[cheese.length];
		cheeseArray = cheese;
		
	}
	
	public double operation()
	{
		addedState = super.operation();	
        return addedBehavior(addedState) ;
    }

	private double addedBehavior(double in) {
		if(cheeseArray.length>1)
		{
			int x = cheeseArray.length-1;
			addedState = addedState+(x*1.00);
		}
		return addedState;
	}
	
	public void printDescription() {
		super.printDescription();
		
		for(int i=0;i<cheeseArray.length;i++)
		{
			String get = cheeseArray[i];
			if(i==cheeseArray.length-1)
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
