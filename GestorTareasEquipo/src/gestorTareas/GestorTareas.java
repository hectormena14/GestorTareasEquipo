package gestorTareas;

import java.util.ArrayList;

public class GestorTareas {
	static ArrayList<String> tareas = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("Gestor de tareas compartido");
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
