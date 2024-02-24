package com.example.demo;

import com.example.demo.components.PostComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.nio.file.Files;
import java.nio.file.Path;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	@Qualifier("com.example.demo.components.PostComponent")
	public PostComponent postComponent;

	public PostService postService;

	public DemoApplication() {

	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		jdbcTemplate.execute("insert into table (id, name) values (1, 'name')");
	Path path = Path.of("src/main/resources/import.sql"); // para leer consulta de un archivo, se puede hacer tb con application properties import y @values
		try (var reader = Files.newBufferedReader(path)) {
			String line;
			while ((line = reader.readLine()) != null) {
//				log.info("Executing: " + line);
				jdbcTemplate.execute(line);
			}
		}
	}

}
