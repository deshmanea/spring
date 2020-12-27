package com.honeycomb.springWebApp.bootstrap;

import com.honeycomb.springWebApp.domain.Author;
import com.honeycomb.springWebApp.domain.Book;
import com.honeycomb.springWebApp.domain.Distributor;
import com.honeycomb.springWebApp.domain.Publisher;
import com.honeycomb.springWebApp.repositories.AuthorRepository;
import com.honeycomb.springWebApp.repositories.BookRepository;
import com.honeycomb.springWebApp.repositories.DistributorRepository;
import com.honeycomb.springWebApp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;
    private final DistributorRepository distributorRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository,
                         PublisherRepository publisherRepository, DistributorRepository distributorRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
        this.distributorRepository = distributorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("started in Bootstrap");

        Distributor distributor = new Distributor();
        distributor.setDistributorName("John");
        distributorRepository.save(distributor);

        System.out.println("Distributor count : " + distributorRepository.count());

        Publisher publisher = new Publisher();
        publisher.setName("Tiger Publication");
        publisher.setCity("Pune");
        publisher.setAddressLine("St Paul road");
        publisherRepository.save(publisher);
        System.out.println("Publisher count : " + publisherRepository.count());

        Author eric = new Author("Eric", "Evans");
        Book bk = new Book("Domain Driven Design", "8930374");
        eric.getBooks().add(bk);
        bk.getAuthors().add(eric);
        bk.setPublisher(publisher);
        publisher.getBooks().add(bk);

        authorRepository.save(eric);
        bookRepository.save(bk);
        publisherRepository.save(publisher);

        Author rod = new Author("Rod", "Johnson");
        Book noEjb = new Book("J2EE Dev without EJB", "90384008");
        rod.getBooks().add(noEjb);
        noEjb.getAuthors().add(rod);
        noEjb.setPublisher(publisher);
        publisher.getBooks().add(noEjb);
        authorRepository.save(rod);
        bookRepository.save(noEjb);
        System.out.println("Number of books: " + bookRepository.count());
        System.out.println("Publisher Number of Books : " + publisher.getBooks().size());
    }
}
