package com.array.mese.giorni;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci il numero del mese di cui vuoi sapere i giorni");
		int monthNum = in.nextInt();
		String[] monthName = {"Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"};
		int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		

		
		System.out.println(monthName[monthNum-1] + " ha: " + monthDays[monthNum-1]  + " giorni");
	}
}
