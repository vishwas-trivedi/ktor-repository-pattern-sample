package com.example.repositories

import com.example.data.dto.Book

/**
 *
 */
interface IBookRepository: ICrudRepository {

    /**
     *
     */
    suspend fun findByName(name:String): Book?
}