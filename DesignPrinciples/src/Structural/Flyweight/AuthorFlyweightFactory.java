package Structural.Flyweight;

import java.util.*;

public class AuthorFlyweightFactory {
    List<Author> authors;

    public AuthorFlyweightFactory(List<Author> authors) {
        this.authors = authors;
    }

    public Author getAuthor(String name) {
        for(Author a : authors) {
            if(name.equalsIgnoreCase(a.name)) {
                return a;
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bday: ");
        Author a = new Author(name, sc.nextLine());
        authors.add(a);
        return a;
    }
}
