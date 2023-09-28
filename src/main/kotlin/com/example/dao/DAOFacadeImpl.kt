package com.example.dao

import com.example.models.Item
import com.example.models.LatLong
import com.example.models.Reservation
import com.example.models.User
import kotlinx.datetime.LocalDate

class DAOFacadeImpl : DAOFacade {
    override suspend fun allItems(): List<Item> {
        TODO("Not yet implemented")
    }

    override suspend fun item(id: Int): Item? {
        TODO("Not yet implemented")
    }

    override suspend fun addItem(name: String, description: String, latLong: LatLong): Item? {
        TODO("Not yet implemented")
    }

    override suspend fun deleteItem(id: Int): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun allUsers(): List<User> {
        TODO("Not yet implemented")
    }

    override suspend fun user(id: Int): User? {
        TODO("Not yet implemented")
    }

    override suspend fun addUser(name: String, email: String): User? {
        TODO("Not yet implemented")
    }

    override suspend fun deleteUser(id: Int): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun allReservations(): List<Reservation> {
        TODO("Not yet implemented")
    }

    override suspend fun addReservation(userId: Int, itemId: Int, date: LocalDate): Reservation? {
        TODO("Not yet implemented")
    }
}