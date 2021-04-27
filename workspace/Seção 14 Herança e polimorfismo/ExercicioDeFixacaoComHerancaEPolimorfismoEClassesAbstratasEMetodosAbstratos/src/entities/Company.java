package entities;

public class Company extends TaxPayer {
	
	private Integer numberOfEmploees;
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberOfEmploees) {
		super(name, anualIncome);
		this.numberOfEmploees = numberOfEmploees;
	}

	@Override
	public Double tax() {
		if (numberOfEmploees >= 10) {
			return anualIncome * 0.14;
		} else {
			return anualIncome * 0.16;
		}
	}

}
