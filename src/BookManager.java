public class BookManager {
    public static final int LENGTH_OF_ARRAYS = 10;

    private final Book[] bookLists = new Book[LENGTH_OF_ARRAYS];

    public Book[] getBookLists() {
        return bookLists;
    }
    
    //tinh tong tat ca gia sach
    public double getTotalSumPrice() {
        double sum = 0;
        for (Book book : bookLists) {
            sum += book.getPrice();
        }
        return sum;
    }

    //dem so sach co ngon ngu java
    public int countBookOfLanguage(String language) {
        int count = 0;
        for (Book book : bookLists) {
            if (book instanceof ProgrammingBook) {
                String languageOfBook = ((ProgrammingBook) book).getLanguage();
                if (languageOfBook == language)
                    count++;
            }
        }
        return count;
    }

    //tong tien khuyen mai
    public double getSumPromotionalPrice(int percent) {
        double sum = 0;
        for (Book book : bookLists) {
            if (book instanceof FictionBook) {
                FictionBook fictionBook = (FictionBook) book;
                fictionBook.setDiscount(percent);
                sum += fictionBook.getPromotionalPrice();
            }
        }
        return sum;
    }
}
