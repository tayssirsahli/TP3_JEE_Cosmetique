package metier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class MetierImpl implements ImetierCatalogue {
	@Override
	public List<Cosmetique> getCosmetiquesParMotCle(String mc) {
		List<Cosmetique> cos = new ArrayList<Cosmetique>();
		Connection conn = SingletonConnection.getConnection();
		try {

			PreparedStatement ps = conn.prepareStatement("select * from cosmetique where NOM_Cosmetique LIKE ?");

			ps.setString(1, "%" + mc + "%");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Cosmetique p = new Cosmetique();
				p.setIdCosmetique(rs.getLong("ID_Cosmetique"));
				p.setNomCosmetique(rs.getString("NOM_Cosmetique"));
				p.setPrix(rs.getDouble("PRIX"));
				cos.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cos;
	}

	@Override
	public void addCosmetique(Cosmetique p) {
// TODO Auto-generated method stub
	}
}