package de.ase.designpatterns.proxy;

import java.util.Map;

public class CachingMovieClientProxy implements MovieClient {

	private MovieClient delegate;

	private Map<String, Movie> cachedMovies;

	public MovieClient getDelegate() {
		if (delegate == null) {
			delegate = new MovieClientImpl();
		}
		return delegate;
	}

	public Movie loadMovie(String name) {
		if (delegate == null) {
			delegate = new MovieClientImpl();
		}
		Movie movie = null;
		if (cachedMovies.containsKey(name)) {
			movie = cachedMovies.get(name);
		} else {
			movie = delegate.loadMovie(name);
			cachedMovies.put(name, movie);
		}
		return movie;
	}

}