package by.vitalylobatsevich.teachme.entity

import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "courses")
class Course(
    var name: String,
    var userId: String,
    id: Long? = null,
) : LongIdEntity(id)
