package creational.prototype.exercise;

public class PrototypeDemo {

	public static void main(String[] args) {
		Registry registry = new Registry();
		Movie movie = (Movie) registry.createItem(ItemType.MOVIE); // return cloned instance
		movie.setTitle("Creational Patterns in Java");
		
		System.out.println(">> movie address: " + movie);
		System.out.println(movie.getRuntime());
		System.out.println(movie.getTitle());
		System.out.println(movie.getUrl());

		Movie anotherMovie = (Movie) registry.createItem(ItemType.MOVIE);

		anotherMovie.setTitle("Gang of Four");
		System.out.println(">> anotherMovie address: " + anotherMovie);
		System.out.println(anotherMovie.getRuntime());
		System.out.println(anotherMovie.getTitle());
		System.out.println(anotherMovie.getUrl());
	}

}
