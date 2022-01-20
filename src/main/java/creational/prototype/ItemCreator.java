package creational.prototype;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class ItemCreator {
    private final Map<ItemType, Item> registry;

    public ItemCreator() {
        registry = new HashMap<>();
        Book book = new Book();
        book.setName("Hibernate");
        book.setPrice(20);
        book.setDescription("JPA Implementation");
        book.setNumOfPages(500);
        registry.put(ItemType.BOOK, book);

        Movie movie = new Movie();
        movie.setName("spider man");
        movie.setPrice(10);
        movie.setDescription("blah blah blah");
        movie.setDuration(Duration.ofMinutes(100));
        registry.put(ItemType.MOVIE, movie);
    }

    public Item createItem(ItemType type){
        return registry.get(type).clone();
    }

}
