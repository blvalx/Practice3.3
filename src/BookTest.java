public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Горе от ума","А.С.Грибоедов", 1824);

        System.out.println(book.getAuthor());
        System.out.println(book.getName());
        System.out.println(book.getYearOfWriting());

        book.setAuthor("Даниэль Дефо");
        book.setName("Робинзон Крузо");
        book.setYearOfWriting(1719);

        System.out.println(book.getAuthor());
        System.out.println(book.getName());
        System.out.println(book.getYearOfWriting());

    }
}
