package com.example.data.dto

import com.example.data.entities.BookEntity
import kotlinx.serialization.Serializable

/**
 *  Data model representing books
 */
@Serializable
data class Book(
    /**
     * Unique ID of the book
     */
    val id: Int,

    /**
     * Title of name of the book
     */
    val title : String,

    /**
     * Author of name of the book
     */
    val author: String
)