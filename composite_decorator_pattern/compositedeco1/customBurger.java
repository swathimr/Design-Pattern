import java.util.ArrayList;
import java.text.DecimalFormat;

public class customBurger extends Composite {

    private ArrayList<Decorator> components = new ArrayList<Decorator>() ;
    String description;
    public static double totalCost=0;
    public customBurger(String d) {
        super(d);
        description =d;
    }
    
public void printDescription() {
	DecimalFormat fmt = new DecimalFormat("0.00");
        for (Decorator obj  : components)
        {
            if(description.contains("Build"))
            {
                double getCost = obj.operation();
                System.out.println( description + " " +fmt.format(getCost));
                totalCost = totalCost+getCost;   
            }
            obj.printDescription();
            System.out.println();
        }
    }


public void addChild(Decorator c) {
    components.add( c ) ;
}

}
