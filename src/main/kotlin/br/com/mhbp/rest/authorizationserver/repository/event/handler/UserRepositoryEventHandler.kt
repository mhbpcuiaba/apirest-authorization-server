package br.com.mhbp.rest.authorizationserver.repository.event.handler

import br.com.mhbp.rest.restfulwebservice.model.UserEntity
import org.springframework.data.rest.core.annotation.HandleBeforeCreate
import org.springframework.data.rest.core.annotation.RepositoryEventHandler
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Component


@Component
@RepositoryEventHandler(UserEntity::class)
class UserRepositoryEventHandler {

    @HandleBeforeCreate
    fun handleUserBeforeCreate(user: UserEntity) {
        val bCryptPasswordEncoder = BCryptPasswordEncoder()
        user.password = bCryptPasswordEncoder.encode(user.password)
    }

}