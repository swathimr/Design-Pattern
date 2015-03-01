 

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Composite implements Component {

    private ArrayList<Component> components = new ArrayList<Component>() ;
    private String description ;
    
    public Composite ( String d )
    {
        description = d ;
    }

	public void printDescription() {
		DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println( description);
        for (Component obj  : components)
        {
            obj.printDescription();
        }
        System.out.println("Sub Total:: $"+ fmt.format(customBurger.totalCost));
    }

	public void addChild(Component c) {
        components.add( c ) ;
	}
	 
	public void removeChild(Component c) {
        components.remove(c) ;
	}
	 
	public Component getChild(int i) {
	    return components.get( i ) ;
	}
	 
}
 
