package application;

public class NProizvod extends Proizvod{
	
	private int udioDrveta;

	public NProizvod(String proizvodjac, int popust, int kolicina, double cijena, int udioDrveta) {
		super(proizvodjac, popust, kolicina, cijena);
		this.udioDrveta = udioDrveta;
	}

	@Override
	public double isplativostNabavke() {
		return (this.getCijena() - (this.getCijena()*this.getPopust())*this.getUdioDrveta());
	}

	public int getUdioDrveta() {
		return udioDrveta;
	}

	@Override
	public String toString() {
		return "NProizvod [udioDrveta=" + udioDrveta + ", toString()=" + super.toString() + "]";
	}

}
