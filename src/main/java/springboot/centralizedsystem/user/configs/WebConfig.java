package springboot.centralizedsystem.user.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter  {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/webjars/**", "/fonts/**", "/css/**", "/js/**", "/img/**", "/vendor/**",
                "/scss/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/", "classpath:/static/fonts/",
                        "classpath:/static/css/", "classpath:/static/js/", "classpath:/static/img/",
                        "classpath:/static/vendor/", "classpath:/static/scss/");
    }
}
