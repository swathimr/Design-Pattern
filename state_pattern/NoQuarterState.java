

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
    int totalCoinValue =0;
   
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertQuarter() {
		
		System.out.println("You inserted a quarter");
		totalCoinValue = gumballMachine.getTotalCoinValue();
		totalCoinValue = totalCoinValue+25;
		gumballMachine.setTotalCoinValue(totalCoinValue);
		if(totalCoinValue>=50)
		{
		gumballMachine.setState(gumballMachine.getHasQuarterState());
		}
		else
		{
			gumballMachine.setState(gumballMachine.noQuarterState);
		}
	}
 
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}
 
	public void turnCrank() {
		System.out.println("Enough money is not added to dispense a gumball");
	 }
 
	public void dispense() {
		System.out.println("You have not payed yet");
	} 
 
	public String toString() {
		return "waiting for quarter";
	}

	@Override
	public void insertDime() {
		System.out.println("You have inserted a dime");
		totalCoinValue = gumballMachine.getTotalCoinValue();
		totalCoinValue = totalCoinValue+10;
		gumballMachine.setTotalCoinValue(totalCoinValue);

		if(totalCoinValue>=50)
		{
		gumballMachine.setState(gumballMachine.getHasQuarterState());
		}
		else
		{
			gumballMachine.setState(gumballMachine.noQuarterState);
		}
		
	}

	@Override
	public void insertNickel() {
		System.out.println("You have inserted a Nickel");
		totalCoinValue = gumballMachine.getTotalCoinValue();
		totalCoinValue = totalCoinValue+5;
		gumballMachine.setTotalCoinValue(totalCoinValue);

		if(totalCoinValue>=50)
		{
		gumballMachine.setState(gumballMachine.getHasQuarterState());
		}
		else
		{
			gumballMachine.setState(gumballMachine.noQuarterState);
		}
		
	}
}
