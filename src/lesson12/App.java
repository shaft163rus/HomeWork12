package lesson12;

public class App {

    public static void main(String[] args) {
        Author one = new Author("Boris", "Moiseev");
        Author two = new Author("Rob", "Zombie");

        Book oneBook = new Book("book1", one, 2023);
        Book twoBook = new Book("book2", two, 2022);

        System.out.println("twoBook year = " + twoBook.getPublishYear());

        twoBook.setPublishYear(1900);

        System.out.println("twoBook year = " + twoBook.getPublishYear());

    }
}
