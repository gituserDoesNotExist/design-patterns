package de.ase.designpatterns.state;

public class SoftwareEngineer {

	private TestState currentState;

	public SoftwareEngineer() {
		this.currentState = new GreenState();
	}

	public void startWorking() throws InterruptedException {
		while (true) {
			doWork();
		}
	}

	private void doWork() throws InterruptedException {
		currentState = currentState.doWork();
	}
}