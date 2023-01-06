package by.vitalylobatsevich.teachme.repository

import by.vitalylobatsevich.teachme.entity.User
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : LongIdEntityRepository<User>
