package metier;
import java.util.List;

public interface ImetierCatalogue {
	public List<Cosmetique> getCosmetiquesParMotCle(String mc);

	public void addCosmetique(Cosmetique p);
}