
public class Main {

	public static void main(String[] args) {

		
		BuggyTelekomPorts testRouter = new BuggyTelekomPorts();
		
		testRouter.openSinglePort(443);
		testRouter.openSinglePort(5000);
		testRouter.tellOpenPorts();
		
		int[] somePorts = {1,2,6000, 65000, 4, 10};
		testRouter.openMultiplePorts(somePorts);
		testRouter.tellOpenPorts();
		
	}

}
