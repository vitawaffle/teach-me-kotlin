package by.vitalylobatsevich.teachme.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.http.SessionCreationPolicy.STATELESS
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class SecurityConfiguration {

    @Bean
    fun passwordEncoder() = BCryptPasswordEncoder() as PasswordEncoder

    @Bean
    fun filterChain(http: HttpSecurity): SecurityFilterChain =
        http.sessionManagement {
            it.sessionCreationPolicy(STATELESS)
        }.build()

}
