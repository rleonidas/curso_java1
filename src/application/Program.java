package application;


//import java.util.ArrayList;
//import java.util.List;
import java.util.Locale;
import java.util.Scanner;
//import entities.Employee;
//import entities.Employee2;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		/*Rectangle retangulo = new Rectangle();
		System.out.println("Enter rectangle width and height:");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		System.out.println("AREA = " + retangulo.area());
		System.out.println("PERIMETER = " + retangulo.perimeter());
		System.out.println("DIAGONAL = " + retangulo.diagonal());*/
		
		
		/*double p;
		Employee empregado = new Employee();
		System.out.print("Name: ");
		empregado.name = sc.nextLine();
		System.out.print("Salario Bruto: ");
		empregado.grossSalary = sc.nextDouble();
		System.out.print("Imposto: ");
		empregado.tax = sc.nextDouble();
		System.out.println();
		System.out.println("Empregado: " + empregado.name + ", $ " + String.format("%.2f",empregado.netSalary()));
		System.out.println();
		System.out.print("Qual a porcentagem para aumentar o salario? ");
		p = sc.nextDouble();
		System.out.println();
		System.out.println("Dados atualizados: " + empregado.name + ", $ " + String.format("%.2f",empregado.increaseSalary(p)));*/
		
		/*Student aluno = new Student();
		aluno.name = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.println(aluno);*/
		
		/*System.out.printf("What is the dollar price? ");
		double precoDollar = sc.nextDouble();
		System.out.printf("How many dollars will be bought? ");
		double quantDollar = sc.nextDouble();
		double result = CurrencyConverter.valorPago(precoDollar, quantDollar);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);*/
		
		/*System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		
		Product product = new Product(name, price);
		
		System.out.println();
		System.out.println("Product data: " + product);		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");		
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);*/
		
		
		
		
		/*System.out.print("Entre com o numero da conta: ");
		int numero = sc.nextInt();
		System.out.print("Entre com o titular da conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
				
		System.out.print("Existe um deposito inicial? (s/n)");
		char resp = sc.next().charAt(0);
		
		Account pessoa = new Account(numero, nome);
		
		if (resp == 's') {			
			System.out.print("Entre com o valor do deposito inicial: ");
			pessoa.depositar(sc.nextDouble());
		}		
				
		System.out.println();		
		System.out.println("Dados da conta");
		System.out.println(pessoa);
				
		System.out.print("Entre com um valor pra deposito: ");
		pessoa.depositar(sc.nextDouble());
		System.out.println("Dados da conta atualizados:");
		System.out.println(pessoa);
				
		System.out.print("Entre com um valor pra sacar: ");
		pessoa.sacar(sc.nextDouble());
		System.out.println("Dados da conta atualizados:");
		System.out.println(pessoa);*/
		
		
		/*List<Employee2> list = new ArrayList<>();
						
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");

			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employee2(id, name, salary));
		}

				
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
				
		System.out.println();
		System.out.println("List of employees:");
		for (Employee2 obj : list) {
			System.out.println(obj);
		}*/
		
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		
				
		sc.close(); 
	}
	
	/*public static boolean hasId(List<Employee2> list, int id) {
		Employee2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}*/
	

}
