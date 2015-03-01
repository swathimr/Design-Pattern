
public class Burger extends Decorator {

	private double price;
	 private String[] burgerArray; 
	
    public Burger(String[] d)
    {
    	super(d);
    	burgerArray = d ;
    }
    
    public double operation() {
		for(int i=0;i<burgerArray.length;i++)
		{
		String get = burgerArray[i];
		if(get.contains("1/3"))
		{
			price=price+ 9.00;
		}
		else if(get.contains("1/2"))
		{
			price=price+12.00;
		}
		else if(get.contains("1"))
		{
			price= price+ 18.00;
		}
		else if(get.contains("Organic Bison"))
		{
			price= price+4.00;
		}
		else if(get.contains("Ahi Tuna"))
		{
			price= price+4.00;
		}
		if(get.equals("In A Bowl"))
		{
			price = price+1.00;
		}
		}
		return price;
	}


	public void printDescription() {
		for(int i=0;i<burgerArray.length;i++)
		{
			String get = burgerArray[i];
			if(i==burgerArray.length-1)
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
