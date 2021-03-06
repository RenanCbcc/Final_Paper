package e_testes_Item;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;

import org.junit.AfterClass;
import org.junit.Test;

import aspects.Exceptions.DAOException;
import connection.ResetComercio;
import persistence.ItemDAO;
import transference.Item;

public class Buscar_Item_Test {

	@Test
	public void deveEncontrarItemComSucesso()
			throws SQLFeatureNotSupportedException, ClassNotFoundException, SQLException, DAOException, Exception {

		Item incluido = new ItemDAO().pesquisar(1);
		assertNotNull(incluido);
		assertEquals(1, incluido.getIdPedido());
	}

	@Test
	public void naoDeveEncontrarItem()
			throws SQLFeatureNotSupportedException, ClassNotFoundException, SQLException, DAOException, Exception {

		Item incluido = new ItemDAO().pesquisar(-11);
		assertNull(incluido);
		
	}
	
	@AfterClass
	public static void limparBase() throws ClassNotFoundException, SQLException {
		ResetComercio rc = new ResetComercio();
		rc.resetar();
	}

	
}
