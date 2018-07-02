package guru.springframework.spring5webapp.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String isin;
    @ManyToMany
    @JoinTable(name = "book_author", joinColumns=@JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors = new HashSet<>();
    @ManyToOne
    private Publisher publisher;

    public Book() {
    }

    public Book(String title, String isin, Publisher publisher) {
        this.title = title;
        this.isin = isin;
        this.publisher = publisher;
    }

    public Book(String name, Set<Author> authors) {
        this.title = name;
        this.authors = authors;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isin='" + isin + '\'' +
                '}';
    }
}
