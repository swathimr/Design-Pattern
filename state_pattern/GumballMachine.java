
public class GumballMachine implements IGumballMachine {
 
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State state = soldOutState;
	int count = 0;
	int totalCoinValue =0;
	int gmblInSlot=0;
	int valToBeReturned =0;
	boolean gmbl_in_slot = false;
	
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);

		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noQuarterState;
		} 
	}
 
	public void insertQuarter() {
		state.insertQuarter();
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
		gmblInSlot++;
		gmbl_in_slot=true;
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count = count;
		state = noQuarterState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
 	  
    public int getTotalCoinValue() {
		return totalCoinValue;
	}

	public void setTotalCoinValue(int totalCoinValue) {
		this.totalCoinValue = totalCoinValue;
	}
    
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}

	@Override
	public void insertDime() {
		state.insertDime();
	}

	@Override
	public void insertNickel() {
		state.insertNickel();
	}

	@Override
	public boolean isGumballInSlot() {
			return gmbl_in_slot;
	}

	@Override
	public void takeGumballFromSlot() {
		System.out.println("Gumball is in slot: "+isGumballInSlot());
		System.out.println("Your return value is:::"+valToBeReturned);
		System.out.println("Total number of gumballs returned :: "+gmblInSlot+" Please take them from the slot");
		gmblInSlot=0;
		valToBeReturned=0;
		gmbl_in_slot=false;
	}
}
