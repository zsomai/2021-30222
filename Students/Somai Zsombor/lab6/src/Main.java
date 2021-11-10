import lab6.ArrayService;
import lab6.Book;
import java.util.Random;


public class Main {
    public static void main(String... args){
        Random rand = new Random();
        Book[] books = new Book[10];
        for(int i = 0; i < books.length; i++){
            books[i] = new Book(rand.nextInt(600));
        }
        ArrayService.sort(books, false);
        ArrayService.printArray(books);
    }
}
