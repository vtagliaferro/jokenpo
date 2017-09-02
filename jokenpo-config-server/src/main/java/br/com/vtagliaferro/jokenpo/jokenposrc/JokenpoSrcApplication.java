package br.com.vtagliaferro.jokenpo.jokenposrc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class JokenpoSrcApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokenpoSrcApplication.class, args);
	}
}
