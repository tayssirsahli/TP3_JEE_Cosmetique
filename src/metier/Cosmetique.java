package metier;
import java.io.Serializable;

public class Cosmetique implements Serializable {
	private Long idCosmetique;
	private String nomCosmetique;
	private double prix;

	public Cosmetique() {
		super();
	}

	public Cosmetique(String nomCosmetique, double prix) {
		super();
		this.nomCosmetique = nomCosmetique;
		this.prix = prix;
	}

	

	public Long getIdCosmetique() {
		return idCosmetique;
	}

	public void setIdCosmetique(Long idCosmetique) {
		this.idCosmetique = idCosmetique;
	}

	public String getNomCosmetique() {
		return nomCosmetique;
	}

	public void setNomCosmetique(String nomCosmetique) {
		this.nomCosmetique = nomCosmetique;
	}

	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}
}