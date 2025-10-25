package mx.edu.utng.mahg.basicdatabase.local.dao

import androidx.room.*
import androidx.room.Insert
import mx.edu.utng.mahg.basicdatabase.local.entity.PostEntity


@Dao
interface PostDao {
    @Query("SELECT * FROM posts ORDER BY id DESC")
    suspend fun getAll(): List<PostEntity>

    @Insert
    suspend fun insert(post: PostEntity)

    @Delete
    suspend fun delete(post: PostEntity)
}
