package br.com.mhbp.rest.authorizationserver.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.AuthenticationManager

@Configuration
open class Oauth2SecurityConfiguration {

//    @Configuration
//    @EnableAuthorizationServer
//    protected open class AuthorizationServerConfiguration : AuthorizationServerConfigurerAdapter() {
//
//        @Autowired
//        @Qualifier("authenticationManagerBean")
//        private val authenticationManager: AuthenticationManager? = null
//
//        @Bean
//        open fun jwtAccessTokenConverter(): JwtAccessTokenConverter {
//            return JwtAccessTokenConverter()
//        }
//
//        override fun configure(authorizationServerEndpointsConfigurer: AuthorizationServerEndpointsConfigurer) {
//            authorizationServerEndpointsConfigurer
//                    .accessTokenConverter(jwtAccessTokenConverter())
//                    .authenticationManager(authenticationManager)
//        }
//
//        override fun configure(clientDetailsServiceConfigurer: ClientDetailsServiceConfigurer) {
//            clientDetailsServiceConfigurer
//                    .inMemory()
//                    .withClient("clientapp")
//                    .authorizedGrantTypes("password", "refresh_token")
//                    .authorities("USER")
//                    .scopes("read", "write")
//                    .resourceIds("belajar")
//                    .secret("123456")
//        }
//
//    }
}