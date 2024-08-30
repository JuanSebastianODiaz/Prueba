package Ejercicios;

import javax.swing.JOptionPane;

public class Ejercicio1_1 {

	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de estudiantes: "));
		
		String[] listaEst1 = new String[n];
			for (int i = 0; i < n; i++) {
				listaEst1[i] = JOptionPane.showInputDialog("Ingrese el nombre del estudiante "+ i +":\n");
			}		
		int[] listaEst2 = new int[n];
			for (int i = 0; i < n; i++) {
				listaEst2[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del documento del estudiante "+ listaEst1[i] +":"));
			}	
		int[] listaEst3 = new int[n];
			for (int i = 0; i < n; i++) {
				listaEst3[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante "+ listaEst1[i] +":"));
			}			
		int[] listaEst4 = new int[n];
			for (int i = 0; i < n; i++) {
				listaEst4[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono del estudiante "+ listaEst1[i] +":"));
			}		
		String[] listaEst5 = new String[n];
			for (int i = 0; i < n; i++) {
				listaEst5[i] = JOptionPane.showInputDialog("Ingrese la dirección de correo del estudiante "+ listaEst1[i] +":\n");
			}
	}
}

		