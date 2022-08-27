package encapsulation;

public class Cars {
	private String make;
	private String model;
	private int year;
	
	public Cars() {
		System.out.println("Default Constructor ran");
	}

	public Cars(String make, String model, int year)
	{
		System.out.println("Overloaded Constructor ran");
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	
	public void setMake(String make) {
		this.make=make;
	}
	
	public void setModel(String model) {
		this.model=model;
	}
	
	public void setYear(int year) {
		this.year=year;
	}
	
	public String getMake() {
		return this.make;
	}
	public String getModel() {
		return this.model;
	}
	public int getYear() {
		return this.year;
	}
}	
