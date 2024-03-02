package metier;
import java.util.List;

public class TestMetier {
	public static void main(String[] args) {
		MetierImpl metier = new MetierImpl();
		List<Cosmetique> Cosmetiques = metier.getCosmetiquesParMotCle("svr");
		for (Cosmetique cos : Cosmetiques)
			System.out.println(cos.getNomCosmetique());
	}
}