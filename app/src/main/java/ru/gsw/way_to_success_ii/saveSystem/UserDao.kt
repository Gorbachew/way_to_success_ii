package ru.gsw.way_to_success_ii.saveSystem

import androidx.room.*

@Dao
interface UserDao {
    @Query("SELECT * FROM user")
    fun getAll(): List<User>

    @Query("SELECT * FROM user WHERE id = :userId LIMIT 1")
    fun loadAllByIds(userId: Int): User

    @Query("SELECT * FROM user WHERE first_name LIKE :first AND " +
            "last_name LIKE :last LIMIT 1")
    fun findByName(first: String, last: String): User

    @Insert
    fun insertAll(vararg users: User): List<Long>

    @Delete
    fun delete(user: User)
}