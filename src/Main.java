public class Main {
    public static void main(String[] args) {
        BookManager libraryBook = new BookManager();
        Book[] bookLists = libraryBook.getBookLists();
        bookLists[0] = new ProgrammingBook(1, "trung1", 50000, "trungnguyen1", "Java", "f1");
        bookLists[1] = new ProgrammingBook(2, "trung2", 100000, "trungnguyen2", "Java", "f2");
        bookLists[2] = new ProgrammingBook(3, "trung3", 120000, "trungnguyen3", "Java", "f3");
        bookLists[3] = new ProgrammingBook(4, "trung4", 150000, "trungnguyen4", "ruby", "f4");
        bookLists[4] = new ProgrammingBook(5, "trung5", 160000, "trungnguyen5", "Java", "f5");
        bookLists[5] = new FictionBook(6, "trung6", 200000, "hale1", "c1", 5);
        bookLists[6] = new FictionBook(7, "trung7", 220000, "hale2", "c2", 10);
        bookLists[7] = new FictionBook(8, "trung8", 250000, "hale3", "c3", 15);
        bookLists[8] = new FictionBook(9, "trung9", 260000, "hale4", "c4", 20);
        bookLists[9] = new FictionBook(10, "trung10", 300000, "hale5", "c5", 25);

        System.out.println("Tổng số giá tiền: " + libraryBook.getTotalSumPrice());
        System.out.println("Số sách có ngôn ngữ Java: " + libraryBook.countBookOfLanguage("Java"));
        System.out.println("Tổng tiền được khuyến mãi: " + libraryBook.getSumPromotionalPrice(20));

    }
}

