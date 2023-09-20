package com.example.config

import com.example.repositories.BookRepository
import com.example.repositories.IBookRepository
import com.example.services.BookService
import io.ktor.server.application.*
import org.koin.dsl.bind
import org.koin.dsl.module
import org.koin.ktor.plugin.Koin

//fun Application.configureDI() {
//    DI{
//        bind<BookService>() with singleton { BookService() }
//    }
//}

fun Application.configureKoinDI() {
    install(Koin){
        modules(appModule)
    }
}

val appModule = module {
    single { BookRepository() } bind IBookRepository::class
    single { BookService(get()) }
}