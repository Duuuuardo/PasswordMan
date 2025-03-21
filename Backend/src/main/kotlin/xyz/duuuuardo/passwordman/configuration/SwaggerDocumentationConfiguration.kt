import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.OpenAPI
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SwaggerDocumentationConfiguration {
    @Bean
    fun customOpenAPI(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("PasswordMan API Docs")
                    .version("1.0.0")
                    .description("Here you can found the complete documentation of PasswordMan API!")
            )
    }
}