package lesson13;

public class App {

    public static void main(String[] args) {
        Author one = new Author("Boris", "Moiseev");
        Author two = new Author("Rob", "Zombie");
        Author three = new Author("Boris", "Moiseev");

        Book oneBook = new Book("book1", one, 2023);
        Book twoBook = new Book("book2", two, 2022);
        Book threeBook = new Book("book2", two, 1900);

        System.out.println("twoBook year = " + twoBook.getPublishYear());
        twoBook.setPublishYear(1900);
        System.out.println("twoBook year = " + twoBook.getPublishYear());

        System.out.println(one);
        System.out.println(one.equals(three));
        System.out.println(one.equals(two));
        System.out.println(one.hashCode());

        System.out.println(oneBook);
        System.out.println(twoBook.equals(threeBook));


    }
}
