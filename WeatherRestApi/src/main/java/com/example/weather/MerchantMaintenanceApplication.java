package com.fiserv.merchantmaintenance;

import com.fdc.emea.api.logging.EnableLogging;;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@EnableEncryptableProperties
@SpringBootApplication
@EnableLogging
@OpenAPIDefinition(
		info = @Info(
				title="Weather API",
				version = "1.0" ,
				description = "Weather API"),
		servers = {@Server(
				url = "https://{hostname}:{port}/{basePath}/{version}",
				description = "Generic construct of API's base path",
				variables = {
						@ServerVariable(name = "hostname", defaultValue= "", description = "This is where the API can be accessed and will be provided by API provider"),
						@ServerVariable(name = "port", defaultValue = "", description = "Port number where API has been exposed and will be provided by API provider and is only going to be needed if specified."),
						@ServerVariable(name = "basePath", defaultValue = "omnipay/maintenance",description = "Basepath of the API"),
						@ServerVariable(name = "version", defaultValue = "v1.0",description = "Version that the api currently is in"),
				})
		}
)
@SecurityScheme(name = "Authorization", type = SecuritySchemeType.HTTP, scheme= "bearer", bearerFormat = "JWT" )

public class WeatherApplication extends SpringBootServletInitializer{


	public static void main(String[] args) {

		SpringApplication.run(WeatherApplication.class, args);
	}
}


