package ru.sfedu.course.backend.database.entity

import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption
import javax.persistence.*

@Entity
@Table(name="person")
data class Person(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    var id: Long? = null,

    var name: String? = null,

    var age: Int? = null,

    @OneToMany(mappedBy="person", cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
    var accounts: List<Account> = listOf(),

    @ManyToMany
    @JoinTable(
        name = "articles_persons",
        joinColumns = [JoinColumn(name = "person_id")],
        inverseJoinColumns = [JoinColumn(name = "article_id")]
    )
    var articles: List<Article> = listOf()
)

