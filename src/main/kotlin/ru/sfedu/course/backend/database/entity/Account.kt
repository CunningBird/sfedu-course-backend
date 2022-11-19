package ru.sfedu.course.backend.database.entity

import javax.persistence.*

@Entity
@Table(name="account")
data class Account(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    var id: Long? = null,

    var amount: Double? = null,

    @ManyToOne
    @JoinColumn(name="person_id", nullable=false)
    var person: Person? = null,
)