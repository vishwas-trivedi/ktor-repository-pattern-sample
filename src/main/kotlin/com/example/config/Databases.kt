package com.example.config

import com.example.data.entities.Books
import io.ktor.server.application.*
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.StdOutSqlLogger
import org.jetbrains.exposed.sql.addLogger
import org.jetbrains.exposed.sql.transactions.transaction

fun Application.configureDatabases() {
    val database = Database.connect(
        url = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1",
        user = "root",
        driver = "org.h2.Driver",
        password = ""
    )

    //region DB transaction initialization
    // transaction definition
    transaction {
        // Added warning log
        addLogger(StdOutSqlLogger)

        // Creating tables at init
        SchemaUtils.create(
            Books
        )
    }
    //endregion
}
