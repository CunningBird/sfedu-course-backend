package ru.sfedu.course.backend.database.service

import org.springframework.stereotype.Service
import ru.sfedu.course.backend.database.repository.PersonRepository

@Service
class PersonService(
    private val repository: PersonRepository
) {

    init {
//        val person1 = Person().apply {
//            name = "Ricardo"
//            age = 35
//        }
//        repository.save(person1)
//
//        val person = repository.findById(2).orElseThrow()
//        println(person.id)
//        println(person.name)
//        println(person.age)
    }
}