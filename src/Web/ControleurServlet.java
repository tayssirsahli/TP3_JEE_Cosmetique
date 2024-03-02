package Web;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Cosmetique;
import metier.ImetierCatalogue;
import metier.MetierImpl;

@WebServlet(name = "cs", urlPatterns = { "/controleur" })
public class ControleurServlet extends HttpServlet {
	private ImetierCatalogue metier;

	@Override
	public void init() throws ServletException {
		metier = new MetierImpl();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String mc = request.getParameter("motCle");
		CosmetiqueModele mod = new CosmetiqueModele();
		mod.setMotCle(mc);
		List<Cosmetique> cosm = metier.getCosmetiquesParMotCle(mc);
		mod.setCosmetiques(cosm);
		request.setAttribute("modele", mod);
		request.getRequestDispatcher("CosmetiquesView.jsp").forward(request, response);
	}
}
