package com.example.config.routes.api

import com.example.controllers.BookController
import io.ktor.server.application.*
import io.ktor.server.routing.*


fun Route.books() {

    val bookController = BookController()

    route("/books"){
        /**
         *
         */
        get {
            bookController.find(call)
        }
    }

}