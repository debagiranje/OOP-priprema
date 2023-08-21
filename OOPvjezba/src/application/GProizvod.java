package application;

public class GProizvod extends Proizvod{
	
	private boolean brendiran;

	public GProizvod(String proizvodjac, int popust, int kolicina, double cijena, boolean brendiran) {
		super(proizvodjac, popust, kolicina, cijena);
		this.brendiran = brendiran;
	}

	@Override
	public double isplativostNabavke() {
		double ppc = this.getCijena() - (this.getCijena()*this.getPopust());
		
		return this.isBrendiran() ? ppc - 0.05 * this.getKolicina() : ppc;
	}

	public boolean isBrendiran() {
		return brendiran;
	}

}
