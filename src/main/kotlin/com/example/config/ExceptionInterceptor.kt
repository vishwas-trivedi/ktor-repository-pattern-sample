package com.example.config

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.response.*

fun Application.configureExceptionInterceptor() {
    install(StatusPages) {
        exception<IllegalArgumentException> { call, cause ->
            //call.respondText(text = "500: $cause", status = HttpStatusCode.InternalServerError)
            call.respond(HttpStatusCode.BadRequest, cause.localizedMessage)
        }
    }
}
