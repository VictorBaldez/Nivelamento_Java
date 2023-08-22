package entities;

public class DataFuncionario {
	public String Name;
	public double GrossSalary;
	public double Tax;
	public double percentage;
	
	public double NewSalary() {
		return GrossSalary - Tax;
	}
	public double IncreaseSalary() {
		return GrossSalary + GrossSalary*(percentage/100) - Tax;
	}
	public String ToString() {
		return "Employee: "+Name +
				", R$"+NewSalary();
	}
}
