
public class PremiumTopping extends Decorator{

    private double addedState;
    private String[] premiumToppingArray;
    
    public PremiumTopping(Decorator c,String[] premiumTopping) 
    {
        super(c);
        premiumToppingArray = new String[premiumTopping.length];
        premiumToppingArray = premiumTopping;
    }
    
    public double operation()
    {
        addedState = super.operation() ;
        return addedBehavior(addedState) ;
    }

    private double addedBehavior(double in) {

        for(int i=0;i<premiumToppingArray.length;i++)
        {
            String premiumToppingName =premiumToppingArray[i];
            if(premiumToppingName.contains("Marinated Tomatoes"))
            {
            addedState = addedState+3.00;
            }
            else {
            addedState = addedState+1.00;
            }
        }
        return addedState;
    }
    
    public void printDescription() {
        super.printDescription();
        for(int i=0;i<premiumToppingArray.length;i++)
        {
            String get = premiumToppingArray[i];
            if(i==premiumToppingArray.length-1)
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
