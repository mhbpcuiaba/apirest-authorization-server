package br.com.mhbp.rest.authorizationserver.repository

import br.com.mhbp.rest.restfulwebservice.model.UserEntity
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.security.access.prepost.PreAuthorize

@PreAuthorize("hasRole('ROLE_USER')")
@RepositoryRestResource(collectionResourceRel = "user", path = "user")
interface UserRepository : PagingAndSortingRepository<UserEntity, String> {

    @PreAuthorize("permitAll")
    @Query("select u from UserEntity u left join fetch u.groups g where u.login = :login")
    fun authenticateUser(@Param("login") login: String): UserEntity

    @PreAuthorize("permitAll")
    override fun <S : UserEntity?> save(p0: S): S


}