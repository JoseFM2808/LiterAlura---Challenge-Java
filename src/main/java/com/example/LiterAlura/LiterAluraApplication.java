package com.example.LiterAlura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class LiterAluraApplication implements CommandLineRunner {

	@Autowired
	private BookApiClient bookApiClient;

	public static void main(String[] args) {
		SpringApplication.run(LiterAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		mostrarMenu();
	}

	private void mostrarMenu() throws Exception {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\n--- Menú ---");
			System.out.println("1. Consultar libros");
			System.out.println("2. Salir");
			System.out.print("Ingrese una opción: ");

			int opcion = scanner.nextInt();
			scanner.nextLine(); // Consumir la nueva línea

			switch (opcion) {
				case 1:
					bookApiClient.obtenerLibros().forEach(System.out::println);
					break;
				case 2:
					System.out.println("Saliendo del programa...");
					return;
				default:
					System.out.println("Opción inválida. Intente nuevamente.");
			}
		}
	}
}