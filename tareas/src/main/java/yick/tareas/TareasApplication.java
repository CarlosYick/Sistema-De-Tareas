package yick.tareas;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import yick.tareas.presentacion.SistemasTareasFX;

@SpringBootApplication
public class TareasApplication {

	public static void main(String[] args) {

		//SpringApplication.run(TareasApplication.class, args);
		Application.launch(SistemasTareasFX.class, args);
	}

}
