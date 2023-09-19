package com.example.config.routes

import com.example.config.routes.api.books
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        books()
    }
}
