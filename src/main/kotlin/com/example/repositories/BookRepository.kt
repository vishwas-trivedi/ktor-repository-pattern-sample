package com.example.repositories

import com.example.data.dto.Book
import com.example.data.entities.BookEntity
import org.jetbrains.exposed.sql.transactions.transaction

/**
 * Repository designed to handle database operation for Books table
 */
class BookRepository : IBookRepository {
    /**
     * Allows to perform find operation used book name
     *
     * @param name Name of the book
     *
     * @return Object of type Book if found, otherwise null
     * @author vishwas-trivedi
     */
    override suspend fun findByName(name: String): Book? {
        TODO("Not yet implemented")
    }

    /**
     * Allow fetch all the books from Book table
     *
     * @return List of Books
     */
    override suspend fun findAll(): List<BookEntity> = transaction {
        BookEntity.all().toList()
    }

    /**
     * Allows to search book by ID
     *
     * @param id Unique ID of target book
     * @return Object of type Book
     */
    override suspend fun findById(id: Int): Any {
        TODO("Not yet implemented")
    }

    /**
     * Create a new Book entity
     *
     * @param bookEntity
     */
    override suspend fun create(bookEntity: Book): BookEntity = transaction {
        BookEntity.new {
            title = bookEntity.title
            author = bookEntity.author
        }
    }

    /**
     * Modify book details
     *
     * @param book Object of Book type
     * @return True if book is update successfully, otherwise false
     */
    override suspend fun modify(book: Book): Boolean {
        TODO("Not yet implemented")
    }

    /**
     * Allows to delete Book based on ID
     *
     * @param id Unique ID of the target book
     * @return True if book is deleted successfully, otherwise false
     */
    override suspend fun delete(id: Int): Boolean {
        TODO("Not yet implemented")
    }

}