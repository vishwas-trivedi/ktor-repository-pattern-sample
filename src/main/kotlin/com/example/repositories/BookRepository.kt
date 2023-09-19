package com.example.repositories

import com.example.data.dto.Book

/**
 *
 */
class BookRepository : IBookRepository {
    override suspend fun findByName(name: String): Book? {
        TODO("Not yet implemented")
    }

    override suspend fun findAll(): List<Any>? {
        TODO("Not yet implemented")
    }

    override suspend fun findById(id: Int): Any {
        TODO("Not yet implemented")
    }

    override suspend fun create(bookEntity: Book): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun modify(book: Book): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun delete(id: Int): Boolean {
        TODO("Not yet implemented")
    }

}