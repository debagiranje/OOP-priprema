package application;

public abstract class Proizvod {
	
	private String proizvodjac;
	private int popust;
	private int kolicina;
	private double cijena;
	
	public Proizvod(String proizvodjac, int popust, int kolicina, double cijena) {
		this.proizvodjac = proizvodjac;
		this.popust = popust;
		this.kolicina = kolicina;
		this.cijena = cijena;
	}

	public String getProizvodjdac() {
		return proizvodjac;
	}

	public int getPopust() {
		return popust;
	}

	public int getKolicina() {
		return kolicina;
	}

	public double getCijena() {
		return cijena;
	}

	@Override
	public String toString() {
		return "Proizvod [proizvodjdac=" + proizvodjac + ", popust=" + popust + ", kolicina=" + kolicina + ", cijena="
				+ cijena + "]";
	}

	public abstract double isplativostNabavke();

}
