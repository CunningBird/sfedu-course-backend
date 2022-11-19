package ru.sfedu.course.backend.database.service

import org.springframework.stereotype.Service
import ru.sfedu.course.backend.database.entity.Account
import ru.sfedu.course.backend.database.entity.Article
import ru.sfedu.course.backend.database.entity.Person
import ru.sfedu.course.backend.database.repository.AccountRepository
import ru.sfedu.course.backend.database.repository.ArticleRepository
import ru.sfedu.course.backend.database.repository.PersonRepository

@Service
class PersonService(
    private val personRepository: PersonRepository,
    private val accountRepository: AccountRepository,
    private val articleRepository: ArticleRepository,
) {

    fun createPerson(person: Person) {
        personRepository.save(person)
    }

    fun createAccount(account: Account) {
        accountRepository.save(account)
    }

    fun createArticle(article: Article) {
        articleRepository.save(article)
    }

    fun getPersonById(id: Long): Person {
        return personRepository.findById(id).orElseThrow()
    }

    fun getArticles(): List<Article> {
        return articleRepository.findAll()
    }

}