package ru.sfedu.course.backend.database.entity

import javax.persistence.*

@Entity
data class Account(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    var id: Long? = null,

    var amount: Float? = null,
)