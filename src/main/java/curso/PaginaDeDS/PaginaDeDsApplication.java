package curso.PaginaDeDS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class PaginaDeDsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaginaDeDsApplication.class, args);
	}

	@Configuration
	public static class Myconfiguration{
		@Bean
		public WebMvcConfigurer corsConfigurer(){
			return new WebMvcConfigurer() {
				@Override
				public void addCorsMappings(CorsRegistry registry) {
					registry.addMapping("/**")
							.allowedOrigins("https://alamblanco.github.io/pagina_ds_front/") //origen desde donde va a recibir solicitudes HTTP
							.allowedMethods("HEAD", "GET", "PUT", "POST", "DELETE", "PATCH");  //Metodos HTTP permitidos
					        //.allowedHeaders("*"); cabeceras especiales, aun no las veo pero es para loggins y otras cosas
				}
			};
		}
	}

}
