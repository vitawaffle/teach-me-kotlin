package by.vitalylobatsevich.teachme.repository

import by.vitalylobatsevich.teachme.entity.Course
import jakarta.transaction.Transactional
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.dao.EmptyResultDataAccessException

@SpringBootTest
class CourseRepositoryTests {

    @Autowired
    lateinit var repository: CourseRepository

    @Test
    fun `findAll should return not empty`() = assertFalse(repository.findAll().isEmpty())

    @Test
    fun `findById with existing id should return not null`() = assertNotNull(repository.findById(1))

    @Test
    fun `findById with not existing id should return null`() = assertNull(repository.findById(0))

    @Test
    @Transactional
    fun `save valid entity should does not throw`() = assertDoesNotThrow {
        repository.save(Course(name = "Test Course"))
    }

    @Test
    @Transactional
    fun `delete with existing id should delete`() {
        repository.delete(Course("Test Course 1", 1))
        assertNull(repository.findById(1))
    }

    @Test
    @Transactional
    fun `delete with not existing id should does not throw`() = assertDoesNotThrow {
        repository.delete(Course("Not Existing Course", 0))
    }

    @Test
    @Transactional
    fun `deleteById with existing id should delete`() {
        repository.deleteById(1)
        assertNull(repository.findById(1))
    }

    @Test
    @Transactional
    fun `deleteById with not existing id should throws EmptyResultDataAccessException`() {
        assertThrows(EmptyResultDataAccessException::class.java) {
            repository.deleteById(0)
        }
    }

    @Test
    fun `findByName with existing name should return not null`() =
        assertNotNull(repository.findByName("Test Course 1"))

    @Test
    fun `findByName with not existing name should return null`() =
        assertNull(repository.findByName("Not Existing Name"))

    @Test
    fun `existsByName with existing name should return true`() =
        assertTrue(repository.existsByName("Test Course 1"))

    @Test
    fun `existsByName not existing name should return false`() =
        assertFalse(repository.existsByName("Not Existing Name"))

}
