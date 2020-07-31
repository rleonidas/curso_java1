package entities;

public class Student {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;		
	}
	
	public String toString() {
		return "Nota Final = " 
				+ String.format("%.2f", notaFinal())
				+ ((notaFinal() >= 60) ? "\nPASS" : ("\nFAILED\nMISSING " + String.format("%.2f", 60 - notaFinal())) + " POINTS");					
	}

}
