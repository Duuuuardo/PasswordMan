package xyz.duuuuardo.passwordman.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Table(name="Costumer")
@Entity
class CostumerEntity(
    @Id val id: Long?,
    val username: String,
    val email: String
)