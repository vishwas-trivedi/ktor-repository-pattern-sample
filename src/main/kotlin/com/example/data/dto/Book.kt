package com.example.data.dto

import kotlinx.serialization.Serializable

/**
 *  Data model representing booksDto
 */
@Serializable
data class Book(
    /**
     * Unique ID of the book
     */
    val id: Int? = null,

    /**
     * Title of name of the book
     */
    val title : String,

    /**
     * Author of name of the book
     */
    val author: String
)