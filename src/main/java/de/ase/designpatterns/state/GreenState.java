package de.ase.designpatterns.state;

public class GreenState implements TestState {

	public TestState doWork() throws InterruptedException {
		writeNewTests();
		return new RedState();
	}

	private void writeNewTests() throws InterruptedException {
		System.out.println("start writing new Test");
		Thread.sleep(30000);
		System.out.println("finished new Test");
	}
}
