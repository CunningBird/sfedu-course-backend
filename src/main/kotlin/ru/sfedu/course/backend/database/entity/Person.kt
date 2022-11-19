package ru.sfedu.course.backend.database.entity

import javax.persistence.*

@Entity
data class Person(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    var id: Long? = null,

    var name: String? = null,

    var age: Int? = null,
)

