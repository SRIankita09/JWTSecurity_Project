package JWT.project.demo.security;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfiguration {


    protected  void configure() throws Exception {
      return ;

    }
}

