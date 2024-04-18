package creational.prototype.exercise;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private Map<ItemType, Item> items = new HashMap<>();
	
	public Registry() {
		loadItems();
	}
	
	public Item createItem (ItemType itemType) {
		Item item = null;

		try {
			item = (Item) (items.get(itemType)).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return item;
	}
	
	private void loadItems() {
		Movie movie = new Movie();
		movie.setTitle("Basic Movie");
		movie.setPrice(24.99);
		movie.setRuntime("2 hours");
		items.put(ItemType.MOVIE, movie);
		
		Book book = new Book();
		book.setNumberOfPages(335);
		book.setPrice(19.99);
		book.setTitle("Basic Book");
		items.put(ItemType.BOOK, book);
	}
}
