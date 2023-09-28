package com.example.controllers

import com.example.data.dto.Book
import com.example.services.BookService
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

/**
 * Book controller
 */
fun Route.booksController() {

    val service by inject<BookService>()

    route("/books"){
        /**
         * used to fetch all the books from database
         */
        get {
            //bookController.findAll(call)
            call.respond(service.getAllBooks())
        }

        /**
         * Create new Book
         */
        post {
            val objBook = call.receive<Book>().validate()
//            val objBook = call.receive<Book>()
            val result = service.addBook(objBook)
            call.respond(result)
        }
    }

}
