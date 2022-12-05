package com.mgv.dnd;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"com.mgv.dnd"})
public class DndApplication {

	public static void main(String[] args) {
		SpringApplication.run(DndApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("#############################################\n" +
					"#\t\t       \t\t      \t\t       \t\t#\n" +
					"#\t\tMM   MM\t\tGGGGGG\t\tV     V\t\t#\n" +
					"#\t\tM M M M\t\tG     \t\tV     V\t\t#\n" +
					"#\t\tM  M  M\t\tG  GGG\t\t V   V \t\t#\n" +
					"#\t\tM     M\t\tG    G\t\t  V V  \t\t#\n" +
					"#\t\tM     M\t\tGGGGGG\t\t   V   \t\t#\n" +
					"#             \t\t      \t\t       \t\t#\n" +
					"#############################################");

		};
	}
}
