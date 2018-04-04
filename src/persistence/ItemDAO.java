package persistence;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.ConexaoComercio;
import transference.Item;

public class ItemDAO {
	private ConexaoComercio cc;

	public ItemDAO() throws ClassNotFoundException, SQLException {
		cc = new ConexaoComercio();
	}

	public void incluir(Item item) throws SQLException {
		PreparedStatement pst = cc.getConexao().prepareStatement("INSERT INTO ITEM VALUES(?,?,?,?)");
		pst.setInt(1, item.getIdPedido());
		pst.setInt(2, item.getIdProduto());
		pst.setInt(3, item.getQuantidade());
		pst.setDouble(4, item.getUnitario());
		pst.executeUpdate();
		pst.close();
	}
}