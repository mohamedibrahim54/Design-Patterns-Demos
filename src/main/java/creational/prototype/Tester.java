package creational.prototype;

import java.time.Duration;

public class Tester {
    public static void main(String[] args){
        ItemCreator itemCreator = new ItemCreator();
        System.out.println("Book prototypes:");
        Book b1 = (Book) itemCreator.createItem(ItemType.BOOK);
        System.out.println(b1);
        Book b2 = (Book) itemCreator.createItem(ItemType.BOOK);
        System.out.println(b2);

        System.out.println("Movie prototypes:");
        Movie m1 = (Movie) itemCreator.createItem(ItemType.MOVIE);
        System.out.println(m1);
        System.out.println(m1.getDuration().toMinutes());
        Movie m2 = (Movie) itemCreator.createItem(ItemType.MOVIE);
        System.out.println(m2);
        m2.setDuration(Duration.ofMinutes(120));
        System.out.println(m2.getDuration().toMinutes());
    }
}
