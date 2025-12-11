package Structural.Flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Author {
    String name;
    String birthday;

    public Author(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}

// imagine you are inputting multiple books by the same author
// if you continuosly ask the user for the author and name and bday when their the same
// it gets tiring
// this is where Flyweight comes in
// plus you would be continuously creating a new author class even though its the same author

public class Book {
    String name;
    Author author;

    public Book(String name, Author author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return name + "author: " + author;
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        String name;
        String author;

        Scanner sc = new Scanner(System.in);

        AuthorFlyweightFactory aff = new AuthorFlyweightFactory();

        System.out.println("Enter book name: ");
        name = sc.nextLine();
        System.out.println("Enter author: ");
        author = sc.nextLine();
//
//        removed because we have the flyweight factory
//        System.out.println("Enter birthday: ");
//        String bday = sc.nextLine();

        Book b = new Book(name, new Author(author, aff.getAuthor()));
        books.add(b);
        System.out.println("BOOKS");
        for (Book b1 : books ) {
            System.out.println(b1);
        }
    }
}
