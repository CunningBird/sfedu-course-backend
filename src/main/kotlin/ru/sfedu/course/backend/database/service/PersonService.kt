package ru.sfedu.course.backend.database.service

import org.springframework.stereotype.Service
import ru.sfedu.course.backend.database.entity.Account
import ru.sfedu.course.backend.database.entity.Person
import ru.sfedu.course.backend.database.repository.AccountRepository
import ru.sfedu.course.backend.database.repository.PersonRepository

@Service
class PersonService(
    private val personRepository: PersonRepository,
    private val accountRepository: AccountRepository
) {

    init {
        val person1 = Person().apply {
            name = "Ricardo"
            age = 35
        }

        val account1 = Account().apply {
            amount = 25.33
            person = person1
        }
        val account2 = Account().apply {
            amount = 33.77
            person = person1
        }

        person1.accounts = listOf(account1, account2)

        personRepository.save(person1)

        val person = personRepository.findById(1).orElseThrow()
        println("Person - ${person.id}")
        println("Person - ${person.name}")
        println("Person - ${person.age}")
        person.accounts.forEachIndexed{ id, account ->
            println("Account $id - id: ${account.id}")
            println("Account $id - amount ${account.amount}")
        }
    }
}