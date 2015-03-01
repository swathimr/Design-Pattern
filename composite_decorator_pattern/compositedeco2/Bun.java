
public class Bun extends Decorator{

	private double addedState;
	private String bunType;
	
	public Bun(Decorator c,String bun) 
	{
		super(c);
		bunType = bun;
	}
	
	public double operation()
	{
		addedState = super.operation() ;
        return addedBehavior(addedState) ;
    }

	private double addedBehavior(double in) {
		if(bunType.contains("Hawaiian Bun") || bunType.contains("Gluten-Free Bun"))
		{
		    addedState= addedState+1.00;
		}
		else if (bunType.contains("Pretzel Bun"))
		{
		    addedState= addedState+0.50;
		}
		return addedState;
	}
	
	public void printDescription() {
		super.printDescription();
		System.out.println(bunType);
	}
	
}
