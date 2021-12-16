package de.ase.designpatterns.proxy;

public class MovieClientImpl implements MovieClient {

	public MovieClientImpl() {
		heavyInitialConfiguration();
	}

	public Movie loadMovie(String name) {
		System.out.println("loading some movie....this takes a lot of time...");
		return new Movie();
	}

	private void heavyInitialConfiguration() {
		System.out.println("Loading initial configuration...");
	}

}