package br.com.mhbp.rest.authorizationserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.support.ResourceBundleMessageSource
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters
import org.springframework.web.servlet.LocaleResolver
import org.springframework.web.servlet.i18n.SessionLocaleResolver
import java.util.*

@EntityScan(basePackageClasses = [AuthorizationServerApplication::class, Jsr310JpaConverters::class])
@SpringBootApplication
class AuthorizationServerApplication

fun main(args: Array<String>) {
    runApplication<AuthorizationServerApplication>(*args)

    @Bean
    fun localeResolver(): LocaleResolver {
        val localeResolver: SessionLocaleResolver = SessionLocaleResolver();
        localeResolver.setDefaultLocale(Locale.US)
        return localeResolver
    }

    @Bean
    fun messageSource(): ResourceBundleMessageSource {
        val messageSource = ResourceBundleMessageSource();
        messageSource.setBasename("messages")
        return messageSource
    }
}
