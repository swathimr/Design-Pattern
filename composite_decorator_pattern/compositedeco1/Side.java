
public class Side extends Decorator{

	private double addedState;
	private String[] sideArray;
	
	public Side(Decorator c,String[] side) 
	{
		super(c);
		sideArray = new String[side.length];
		sideArray = side;
	}
	
	public double operation()
	{
		addedState = super.operation() ;
        return addedBehavior(addedState) ;
    }

	private double addedBehavior(double in) {
		int valToBeAdded =sideArray.length;
		addedState = addedState+(valToBeAdded*3.00);
		return addedState;
	}
	
	public void printDescription() {
		super.printDescription();
		for(int i=0;i<sideArray.length;i++)
		{
			String get = sideArray[i];
			if(i==sideArray.length-1)
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
