package br.com.mhbp.rest.authorizationserver.service

import br.com.mhbp.rest.authorizationserver.repository.UserRepository
import br.com.mhbp.rest.restfulwebservice.model.UserEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import java.util.*

class UserService: UserDetailsService {

    @Autowired
    private val userRepository: UserRepository? = null

    @Throws(UsernameNotFoundException::class)
    override fun loadUserByUsername(login: String): UserDetails? {
        val user: UserEntity = userRepository!!.authenticateUser(login)
        println(user)
        return User(user.login, user.password, ArrayList())

    }
}