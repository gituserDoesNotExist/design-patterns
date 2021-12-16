package de.ase.designpatterns.state;

public class RedState implements TestState {

	public TestState doWork() throws InterruptedException {
		writeNewCode();
		return new GreenState();
	}

	private void writeNewCode() throws InterruptedException {
		System.out.println("start writing new Code");
		Thread.sleep(30000);
		System.out.println("finished new Code");
	}
}