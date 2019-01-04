package br.com.mhbp.rest.restfulwebservice.model

import br.com.mhbp.rest.restfulwebservice.dto.UserDTO
import org.hibernate.annotations.NaturalId
import java.time.LocalDate
import javax.persistence.*
import javax.validation.constraints.Email
/*
https://blog.codecentric.de/en/2017/06/kotlin-spring-working-jpa-data-classes/
 */

@Entity
@Table(schema = "user_mgmt", name = "Users")
class UserEntity() : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column(nullable = false)
    var name: String? = null

    @Column(nullable = false)
    @Email
    @NaturalId
    var email: String? = null

    @Column(nullable = false)
    @NaturalId
    var login: String? = null

    @Column(nullable = false)
    var password: String? = null

    @Column(nullable = false)
    var phone: String? = null

    @Column(nullable = false)
//    @Temporal(TemporalType.DATE)
    var birthday: LocalDate? = null

    @ManyToMany(cascade = [CascadeType.ALL])
    @JoinTable(name = "\"USER_MGMT\".USERS_GROUPS",
            joinColumns = [JoinColumn(name = "user_id", referencedColumnName = "id")],
            inverseJoinColumns = [JoinColumn(name = "group_id", referencedColumnName = "id")])
    var groups: Set<GroupEntity> = mutableSetOf<GroupEntity>()

    constructor(id: Long, name: String, email: String, login: String, password: String, birthday: LocalDate) : this() {
        this.id = id
        this.name = name
        this.email = email
        this.login = login
        this.password = password
        this.birthday = birthday
    }

    override fun toString(): String {
        return "UserEntity(id=$id, name=$name, email=$email, login=$login, password=$password, phone=$phone, birthday=$birthday)"
    }



    fun toUserDTO(): UserDTO = UserDTO(
            id = this.id,
            name = this.name,
            email = this.email,
            login = this.login,
            password = this.password,
            birthday = this.birthday
    )

  companion object {

    fun fromDto(dto: UserDTO) = UserEntity(
            id = dto.id?: 0,
            name = dto.name?: "",
            email = dto.email?: "",
            login = dto.login?: "",
            password = dto.password?: "",
            birthday = dto.birthday?: LocalDate.now())


  }
}
