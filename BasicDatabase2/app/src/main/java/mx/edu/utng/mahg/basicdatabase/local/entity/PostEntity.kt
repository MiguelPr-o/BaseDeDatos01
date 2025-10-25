package mx.edu.utng.mahg.basicdatabase.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "posts")
data class PostEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val content: String
)


