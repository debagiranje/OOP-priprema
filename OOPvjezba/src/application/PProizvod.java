package application;

public class PProizvod extends Proizvod{
	
	private boolean uRoku;
	
	public boolean isuRoku() {
		return uRoku;
	}

	public PProizvod(String proizvodjac, int popust, int kolicina, double cijena, boolean uRoku) {
		super(proizvodjac, popust, kolicina, cijena);
		this.uRoku = uRoku;
	}

	@Override
	public String toString() {
		return "PProizvod [uRoku=" + uRoku + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double isplativostNabavke() {
		
		double ppc = this.getCijena() - (this.getCijena()*this.getPopust());
		
		return this.uRoku ? ppc : ppc - 0.1 * this.getKolicina();
	}

}
