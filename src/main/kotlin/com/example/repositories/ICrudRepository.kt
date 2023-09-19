package com.example.repositories

import com.example.data.dto.Book

interface ICrudRepository {
    /**
     *
     */
    suspend fun findAll():List<Any>?

    /**
     *
     */
    suspend fun findById(id: Int):Any?

    /**
     *
     */
    suspend fun create(bookEntity: Book):Boolean

    /**
     *
     */
    suspend fun modify(book: Book):Boolean

    /**
     *
     */
    suspend fun delete(id: Int):Boolean
}