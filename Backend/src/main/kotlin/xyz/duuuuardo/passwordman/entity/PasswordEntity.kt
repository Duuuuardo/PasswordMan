package xyz.duuuuardo.passwordman.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Table(name="Password")
@Entity
class PasswordEntity(
    @Id val id: Long?,

    val host: String,
    val name: String,
    val hash: String
)