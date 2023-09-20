package com.example.services

import com.example.data.dto.Book
import com.example.data.entities.BookEntity
import com.example.repositories.BookRepository

/**
 *
 */
class BookService(private val repository: BookRepository) {
    suspend fun getAllBooks():List<Book> {
        //return listOf<Book>(Book(1,"test title","vishwas test"))
        return repository.findAll().map(BookEntity::toBook)
    }

    suspend fun addBook(book: Book): Int {
        val entity = repository.create(book)
        return entity.id.value
    }

    suspend fun deleteBook(bookId: Int) {

    }
}