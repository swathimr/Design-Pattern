public class GumballMachineTestDrive {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);

		System.out.println(gumballMachine);
		
		// case -1
		gumballMachine.insertNickel();
		gumballMachine.insertQuarter();
		gumballMachine.insertDime();
		gumballMachine.insertDime();
		gumballMachine.insertDime();
		gumballMachine.turnCrank();
		
		gumballMachine.takeGumballFromSlot();
		
		//case-2
		gumballMachine.insertNickel();
		gumballMachine.insertQuarter();
		gumballMachine.insertDime();
		gumballMachine.insertDime();
		gumballMachine.turnCrank();
		
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.takeGumballFromSlot();
		
		//case -3
		gumballMachine.insertNickel();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertDime();
		gumballMachine.insertDime();
		gumballMachine.takeGumballFromSlot();
		
		System.out.println(gumballMachine);
		
	}
}
