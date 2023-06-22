package in.neuw.oauth2.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.reactive.ReactiveUserDetailsServiceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@SpringBootApplication(exclude = {UserDetailsServiceAutoConfiguration.class, ReactiveUserDetailsServiceAutoConfiguration.class})
public class SpringOauth2ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringOauth2ServerApplication.class, args);
    }

}
