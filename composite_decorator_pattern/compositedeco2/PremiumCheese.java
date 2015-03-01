public class PremiumCheese extends Decorator{

    private double addedState;
    private String[] premiumCheeseArray;
    
    public PremiumCheese(Decorator c,String[] premiumCheese) 
    {
        super(c);
        premiumCheeseArray = new String[premiumCheese.length];
        premiumCheeseArray = premiumCheese;
    }
    
    public double operation()
    {
        addedState = super.operation() ;
        return addedBehavior(addedState) ;
    }

    private double addedBehavior(double in) {
        int valToBeAdded =premiumCheeseArray.length;
		addedState = addedState+(valToBeAdded*1.50);
        return addedState;
    }
    
    public void printDescription() {
        super.printDescription();
        for(int i=0;i<premiumCheeseArray.length;i++)
        {
            String get = premiumCheeseArray[i];
            if(i==premiumCheeseArray.length-1)
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
