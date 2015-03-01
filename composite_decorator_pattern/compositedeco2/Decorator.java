public class Decorator implements DecoratorIntrfce {

	private Decorator decorator;
	private String[] desc;
	
    public Decorator( Decorator c)
    {
    	decorator = c ;
    }
    
    public Decorator(String[] s)
    {
    	desc = s;
    }
	
	public double operation()
    {
        return decorator.operation() ;
    }

	public void printDescription() {
		decorator.printDescription();
	}
}