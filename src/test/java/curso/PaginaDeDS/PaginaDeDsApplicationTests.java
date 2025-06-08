package curso.PaginaDeDS;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(properties = {
		"spring.datasource.url=jdbc:mysql://localhost:3306/paginadeds",
		"spring.datasource.username=root",
		"spring.datasource.password="
})
class PaginaDeDsApplicationTests {

	@Test
	void contextLoads() {
	}

}
