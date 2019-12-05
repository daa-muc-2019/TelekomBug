
public class BuggyTelekomPorts {

	boolean[] ports = new boolean[65535];

	public BuggyTelekomPorts() {

		for (int i = 0; i < ports.length; i++) {
			ports[i] = false;
		}
	}

	public void openSinglePort(int portNumber) {
		ports[portNumber] = true;
	}

	public void tellOpenPorts() {
		System.out.println("Folgende Ports sind offen:\n");
		
		for (int i = 0; i < ports.length; i++) {
			if (ports[i] == true)
				System.out.println("Port Nummer:\t" + i );
		}
		System.out.println("\nPort Scan abgeschlossen\n\n");
	}

	public void openMultiplePorts(int[] portNumbers) {

		for (int i = 0; i < portNumbers.length; i++) {
			openSinglePort(portNumbers[i]);
		}
	}

}
