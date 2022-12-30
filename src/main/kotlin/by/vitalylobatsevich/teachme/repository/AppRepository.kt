package by.vitalylobatsevich.teachme.repository

import by.vitalylobatsevich.teachme.entity.AppEntity
import org.springframework.data.repository.NoRepositoryBean
import org.springframework.data.repository.Repository

@NoRepositoryBean
interface AppRepository<T : AppEntity, ID> : Repository<T, ID> {
    fun findAll(): List<T>
    fun findById(id: ID): T?
    fun save(entity: T): T
    fun delete(entity: T)
    fun deleteById(id: ID)
}
