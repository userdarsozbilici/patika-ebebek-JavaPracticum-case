package patika;

public class Employee {
	private String name;
	private float salary;
	private int workHours;
	private int hireYear;
	
	public Employee(String _name, int _salary, int _workHours, int _hireYear){
		this.name = _name;
		this.salary = _salary;
		this.workHours = _workHours;
		this.hireYear = _hireYear;
	}
	
	public float tax() {
		int THRESHOLD = 1000;

		if(this.salary < THRESHOLD)
			return 0;
		
		else 
			return this.salary * 3 / 100;
	}
	
	
	
	public float bonus() {
		int bonusMoney;
	
		if(this.workHours <= 40)
			return 0;
		else {
			int augmentedHours = this.workHours - 40;
			bonusMoney = augmentedHours * 30;
			return bonusMoney;
		}
		
	}
	
	public float raiseSalary() {
		int CURRENTYEAR = 2021;
		float raiseRate;
		float raise;
		int employmentYear = CURRENTYEAR - this.hireYear;
		
		System.out.println(employmentYear);
		
		if(employmentYear < 10)
			raise = this.salary * 5 / 100;
		else if(employmentYear > 9 && employmentYear < 20)
			raise = this.salary * 10 / 100;
		else if(employmentYear > 19) {
			raise = this.salary * 15 / 100;
		}
			
		else 
			return 0;
		
		this.salary += raise;
		
		return raise;
	}
	
	@Override
	public String toString() {
		
		System.out.println("İsim : " + this.name + "\n" 
		+ "Maaş : " + this.salary + "\n"
		+ "Vergi : " + this.tax() + "\n"
		+ "Bonus : " + this.bonus() + "\n"
		+ "Maaş Artışı : " + this.raiseSalary() + "\n"
 		+ "Toplam Maaş : " + (this.salary + this.bonus()) + "\n"
		+ "Vergi ve Bonuslarla Birlikte Maaş : " + (this.salary + this.bonus() + this.tax()) + "\n" 
		+ "Çalışma Saati : " + this.workHours + "\n" 
		+ "Başlangıç Yılı : " + this.hireYear);
		
		return name;
	}
}
