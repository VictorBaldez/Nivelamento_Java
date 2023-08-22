package entities;

public class DataAluno {
	public String Name;
	public double a;
	public double b;
	public double c;
	public double FinalGrade() {
		return a+b+c;
	}
	public double GradeCalculus() {
		return 60 - FinalGrade();
	}
	public String Status(){
		if (FinalGrade()<60) 
			return "FAILED\nMISSING "+
					GradeCalculus()+" POINTS";
		else if (FinalGrade()>=60) 
			return "PASS";
		else
			return null;
	}
}
