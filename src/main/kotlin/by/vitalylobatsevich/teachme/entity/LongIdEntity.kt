package by.vitalylobatsevich.teachme.entity

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType.IDENTITY
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass

@MappedSuperclass
open class LongIdEntity(
    @Id
    @GeneratedValue(strategy = IDENTITY)
    var id: Long? = null,
) : AppEntity()
