import db.DBAuthor;
import db.DBBook;
import models.Author;
import models.Book;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Author author1 = new Author("Terry", "Pratchett");
        DBAuthor.save(author1);

        Author author2 = new Author("Carlos", "Ruiz Zafon");
        DBAuthor.save(author2);

        Author author3 = new Author("God", "Almighty");

        DBAuthor.delete(author3);

        author2.setFirstName("Gabriel");
        DBAuthor.update(author2);

        author2.setLastName("Garcia Marquez");
        DBAuthor.update(author2);

        Author foundAuthor = DBAuthor.find(2);

        List<Author> authors = DBAuthor.getAuthors();


        Book book1 = new Book("Guards! Guard!", "Fantasy");
        DBBook.save(book1);

        Book book2 = new Book("The Shadow of the Wind", "Thriller");
        DBBook.save(book2);

        Book book3 = new Book("The Bible", "General Fiction");

        DBBook.delete(book3);

        book2.setTitle("The Angels Game");
        DBBook.update(book2);

        book2.setGenre("Literary Fiction");
        DBBook.update(book2);

        Book foundBook = DBBook.find(2);

        List<Book> books = DBBook.getBooks();

    }

}