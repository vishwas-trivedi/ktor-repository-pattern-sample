package com.example.data.dto

import io.konform.validation.Invalid
import io.konform.validation.Validation
import io.konform.validation.jsonschema.maxLength
import io.konform.validation.jsonschema.minLength
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
    val title : String?,

    /**
     * Author of name of the book
     */
    val author: String? = null
){
    fun validate() = Validation {
        Book::title required {
            minLength(5)
            maxLength(255)
        }

        Book::author ifPresent {
            maxLength(255)
        }
    }.throwOnFailure(this)
}

/**
 * Extension method to validate the DTO object
 */
private fun <T> Validation<T>.throwOnFailure(value: T) : T {
    val result = validate(value)
    if (result is Invalid<T>) {
        throw IllegalArgumentException(result.errors.toString())
    }

    return value
}