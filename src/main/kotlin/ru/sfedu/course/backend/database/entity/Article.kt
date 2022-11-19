package ru.sfedu.course.backend.database.entity

import javax.persistence.*


@Entity
@Table(name="article")
data class Article(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    var id: Long? = null,

    var title: String? = null,

    var content: String? = null,

    @ManyToMany(mappedBy = "articles")
    var persons: List<Person> = listOf()
)