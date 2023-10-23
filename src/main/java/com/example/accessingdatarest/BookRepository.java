package com.example.accessingdatarest;

public interface BookRepository {

    Book getByIsbn(String isbn);

}
