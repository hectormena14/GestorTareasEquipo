package gestorTareas;

import java.util.ArrayList;

public class GestorTareas {
	static ArrayList<String> tareas = new ArrayList<>();

	public static void agregarTarea(String descripcion) {
	    if (descripcion != null && !descripcion.isBlank()) {
	        tareas.add(descripcion);
	    }
	}

	public static void main(String[] args) {
		System.out.println("Gestor de tareas compartido");
	}
	
	
}
