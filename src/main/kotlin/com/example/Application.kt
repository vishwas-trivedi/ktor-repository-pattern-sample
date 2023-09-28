package com.example

import com.example.config.*
import io.ktor.server.application.*
import io.ktor.server.netty.*

fun main(args: Array<String>) {
    EngineMain.main(args)
}

/**
 * Registration for all the modules required
 */
fun Application.module() {
    configureSerialization()
    configureDatabases()
    configureRouting()
    configureKoinDI()
    configureExceptionInterceptor()
}
