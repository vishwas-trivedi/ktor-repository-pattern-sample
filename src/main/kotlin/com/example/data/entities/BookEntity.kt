package com.example.data.entities

import com.example.data.dto.Book
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID
import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.javatime.datetime
import java.time.LocalDateTime

/**
 * Entity class representing row of `books` table
 */
class BookEntity(id: EntityID<Int>): IntEntity(id) {

    //region Members (with mapping)
    /**
     * Object to be used for mapping
     */
    companion object : IntEntityClass<BookEntity>(Books)

    var title by Books.title
    var author by Books.author
    //endregion

    //region Public Methods
    /**
     * Book object to string
     */
    override fun toString(): String = "Book($title, $author)"

    /**
     *Mapper function to map Books with Book
     */
    fun toBook() = Book(id.value, title, author)
    //endregion
}

/**
 * Books object representing table
 */
object Books : IntIdTable("books", "book_id")
{
    val title = varchar("title", 255).default("default title")
    val author = varchar("author", 255).default("Unknown author")
    val createdAt = datetime("created_at").default(LocalDateTime.now())
    val updatedAt = datetime("updated_at").default(LocalDateTime.now())
}