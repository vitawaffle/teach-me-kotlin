package by.vitalylobatsevich.teachme.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpMethod.GET
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.http.SessionCreationPolicy.STATELESS
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class SecurityConfiguration {

    @Bean
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain =
        http.authorizeHttpRequests {
            it.requestMatchers(GET, "/", "/login").permitAll()
                .anyRequest().authenticated()
        }.formLogin {
            it.disable()
        }.logout {
            it.permitAll()
        }.sessionManagement {
            it.sessionCreationPolicy(STATELESS)
        }.csrf {
            it.disable()
        }.cors {
            it.disable()
        }.build()

}
