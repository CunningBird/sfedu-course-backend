package ru.sfedu.course.backend.database.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.sfedu.course.backend.database.entity.Person

@Repository
interface PersonRepository : JpaRepository<Person, Long>