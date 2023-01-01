package by.vitalylobatsevich.teachme.repository

import by.vitalylobatsevich.teachme.entity.Course
import org.springframework.stereotype.Repository

@Repository
interface CourseRepository : LongIdEntityRepository<Course> {
    fun findByName(name: String): Course?
    fun existsByName(name: String): Boolean
}
