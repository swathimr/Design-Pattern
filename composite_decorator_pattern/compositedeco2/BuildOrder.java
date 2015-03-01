public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        //order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        //order.addChild(new Leaf("The Purist", 8.00 ));
        
        customBurger customBurger = new customBurger("Build Your Own Burger" );
    
    	String[] cheese = {"Yellow American","Spicy Jalapeni Jack"};
    	String[] premiumcheese ={"Danish Blue Cheese"};
    	String[] sauce = {"Mayonnaise","Thai Peanut Sauce"};
    	String[] topping ={"Dill Pickle Chips","Spicy Pickles","Black Olives"};
    	String[] premiumTopping={"Marinated Tomatoes"};
    	String[] burger = {"Organic Bison","1/2lb.","On A Bun"};
    	String bun = "Caliabatta(Vegan)";
    	String side[]={"Shoestring Fries"};
    	
    	Decorator customObj =new Side(new Sauce(new Bun(new PremiumTopping(new Toppings(new PremiumCheese(new Cheese(new Burger(burger),cheese),premiumcheese),topping),premiumTopping),bun),sauce),side);
        customBurger.addChild(customObj);
        
        customBurger customBurger1 = new customBurger("Build Your Own Burger" );
        
        String[] burger1 = {"Harmone & Antibiotic Free Beek","1/3lb.","On A Bun"};
    	String[] cheese1 = {"Smoked Gouda","Greek Feta"};
    	String[] premiumcheese1 ={"Fresh Mozarella"};
    	String[] sauce1 = {"Habanero Salsa"};
    	String[] topping1 ={"Crushed Peanuts"};
    	String[] premiumTopping1={"Sunny Side Up Egg","Marinated Tomatoes"};
    	
    	String bun1 = "Gluten-Free Bun";
    	String[] side1={"Shoestring Fries"};
    	
    	Decorator customObj1 =new Side(new Sauce(new Bun(new PremiumTopping(new Toppings(new PremiumCheese(new Cheese(new Burger(burger1),cheese1),premiumcheese1),topping1),premiumTopping1),bun1),sauce1),side1);
        customBurger.addChild(customObj1);
        
        order.addChild(customBurger );
        order.addChild(customBurger1);
        return order ;
      }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/