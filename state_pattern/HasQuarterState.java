

public class HasQuarterState implements State {
	GumballMachine gumballMachine;
	int totalCoinValue = 0;
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		totalCoinValue=gumballMachine.getTotalCoinValue()+25;
		gumballMachine.setTotalCoinValue(totalCoinValue);
	}
 
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}
 
	public void turnCrank() {
		System.out.println("You turned crank");
		System.out.println("Before turning crank im displaying money entered"+gumballMachine.getTotalCoinValue());
		gumballMachine.valToBeReturned=gumballMachine.valToBeReturned+gumballMachine.getTotalCoinValue()-50;
		gumballMachine.setState(gumballMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}

	@Override
	public void insertDime() {
		System.out.println("You inserted a dime");
		totalCoinValue=gumballMachine.getTotalCoinValue()+10;
		gumballMachine.setTotalCoinValue(totalCoinValue);
	}

	@Override
	public void insertNickel() {
		System.out.println("You inserted a nickel");
		totalCoinValue=gumballMachine.getTotalCoinValue()+5;
		gumballMachine.setTotalCoinValue(totalCoinValue);
	}

}
