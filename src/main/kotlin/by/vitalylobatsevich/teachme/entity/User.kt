package by.vitalylobatsevich.teachme.entity

import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "users")
class User(id: Long? = null) : LongIdEntity(id)
