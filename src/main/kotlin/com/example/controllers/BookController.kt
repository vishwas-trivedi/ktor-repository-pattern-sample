package com.example.controllers

import io.ktor.server.application.*
import io.ktor.server.response.*

/**
 * Controller to handle all Book related operation
 */
class BookController {
    suspend fun find(call : ApplicationCall){
        val bookId = call.parameters["id"]
        call.respondText("Hello World from controller!")
    }
}