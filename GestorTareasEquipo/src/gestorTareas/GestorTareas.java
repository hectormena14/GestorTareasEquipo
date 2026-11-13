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
		System.out.println("Gestor de tareas - versión A");
		}
	
	public static void listarTareas() {
	    if (tareas.isEmpty()) {
	        System.out.println("No hay tareas registradas");
	        return;
	    }
	    for (int i = 0; i < tareas.size(); i++) {
	        System.out.println((i + 1) + ". " + tareas.get(i));
	    }
	}

	
}
