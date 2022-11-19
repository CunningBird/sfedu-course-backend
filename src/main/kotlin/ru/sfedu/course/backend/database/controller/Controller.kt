package ru.sfedu.course.backend.database.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ru.sfedu.course.backend.database.service.PersonService

@RestController
class Controller(
    private val service: PersonService
) {

    @GetMapping
    fun flex(): String {
        service.createAccount()
        return "Flex"
    }
}

//        val person1 = Person().apply {
//            name = "Ricardo"
//            age = 35
//        }
//
//        val account1 = Account().apply {
//            amount = 25.33
//            person = person1
//        }
//        val account2 = Account().apply {
//            amount = 33.77
//            person = person1
//        }
//
//
//        val article1 = Article().apply {
//            title = "Article1"
//            content = "Absdfdsgfse ewfesf ae edwadaw"
//            persons = listOf(person1)
//        }
//        val article2 = Article().apply {
//            title = "Article2"
//            content = "jyjcyjgy,khu trjfy sergytj"
//            persons = listOf(person1)
//        }
//
//        person1.accounts = listOf(account1, account2)
//        person1.articles = listOf(article1, article2)
//        personRepository.save(person1)
//
//        articleRepository.save(article1)
//        articleRepository.save(article2)
//
//        val person = personRepository.findById(1).orElseThrow()
//        println("Person - ${person.id}")
//        println("Person - ${person.name}")
//        println("Person - ${person.age}")
//        person.accounts.forEachIndexed{ id, account ->
//            println("Account $id - id: ${account.id}")
//            println("Account $id - amount ${account.amount}")
//        }
//        person.articles.forEachIndexed{ id, account ->
//            println("Article $id - id: ${account.id}")
//            println("Article $id - amount ${account.title}")
//            println("Article $id - content ${account.content}")
//        }