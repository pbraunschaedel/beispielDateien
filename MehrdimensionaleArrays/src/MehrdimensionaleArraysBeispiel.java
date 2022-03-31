/**
 *  MehrdimensionaleArraysBeispiel 
 *  ---------------------------------------------------------------------- 
 *  Autor: Peter Braunschädel
 *  Erstellungs-Datum: 29.03.2022
 *  Version 1.0
 *  Datum der letzten Änderung: 29.03.2022
 *  Änderung: Quelltext erstellt
 *  ----------------------------------------------------------------------
 */

public class MehrdimensionaleArraysBeispiel {

	public static void main(String[] args) {
		
		int[][] test = new int[10][4];				// anlegen eines Arrays mit 10 Zeilen und 4 Spalten
		
		test[0][0] = 3;								// füllen der 1. Zeile, 1. Spalte (Feld 1,1)
		test[0][1] = 28;							// füllen der 1. Zeile, 2. Spalte (Feld 1,2)
		test[0][2] = 30;							// ...
		test[0][3] = 5;
		
		System.out.println("Buchungen 2023");					// Ausgabe der ersten Zeile
		System.out.println("----------------------------");
		System.out.println("Bungalow-Nr: " + test[0][0]);
		System.out.println("Start-KW: " + test[0][1]);
		System.out.println("End-KW: " + test[0][2]);
		System.out.println("Anzahl Personen: " + test[0][3]);
	}
}
	
