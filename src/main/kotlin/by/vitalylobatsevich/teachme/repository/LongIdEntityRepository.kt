package by.vitalylobatsevich.teachme.repository

import by.vitalylobatsevich.teachme.entity.LongIdEntity
import org.springframework.data.repository.NoRepositoryBean

@NoRepositoryBean
interface LongIdEntityRepository<T : LongIdEntity> : AppRepository<T, Long>
