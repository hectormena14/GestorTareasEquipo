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
		System.out.println("Gestor de tareas - versión A y B");
		agregarTarea("Preparar la memoria");
		agregarTarea("Revisar la pull request");
		agregarTarea("Entregar en Moodle");
		listarTareas();
		buscarTareas("moodle");

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

	public static void buscarTareas(String texto) {
	    if (texto == null || texto.isBlank()) {
	        System.out.println("Indica un texto de busqueda");
	        return;
	    }
	    boolean encontrada = false;
	    for (int i = 0; i < tareas.size(); i++) {
	        if (tareas.get(i).toLowerCase().contains(texto.toLowerCase())) {
	            System.out.println((i + 1) + ". " + tareas.get(i));
	            encontrada = true;
	        }
	    }
	    if (!encontrada) {
	        System.out.println("No se han encontrado tareas con ese texto");
	    }
	}

}
