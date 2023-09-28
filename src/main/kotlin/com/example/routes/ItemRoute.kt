package com.example.routes

import com.example.dao.daoInMemoryImpl
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.itemRoutes() {
    route("item") {
        get {
            val items = daoInMemoryImpl.allItems()
            call.respond(message = items)
        }
    }
}
