package com.example.repositories

import com.example.data.dto.Book

/**
 *
 */
interface IBookRepository: ICrudRepository {

    /**
     * Find books by book name
     */
    suspend fun findByName(name:String): Book?
}