package aspects;

import connection.ConexaoComercio;
import persistence.CategoriaDAO;
import persistence.ClienteDAO;
import persistence.ItemDAO;
import persistence.ProdutoDAO;
import presentation.IFCadastro;
import presentation.IFPedidoRegistrar;
import presentation.IFPedidoVer;

public aspect Implementations {
	// ----------------------------------------------------------------------------------------------------
	// Implementations related with persistence layer.
	public static interface Connectable {
		public ConexaoComercio getConnection();
	}

	private ConexaoComercio Connectable.cc;

	public ConexaoComercio Connectable.getConnection() {
		return this.cc;
	}

	declare parents: CategoriaDAO implements Connectable;
	declare parents: ClienteDAO implements Connectable;
	declare parents: ItemDAO implements Connectable;
	declare parents: ProdutoDAO implements Connectable;

	// ----------------------------------------------------------------------------------------------------
	// Implementations related with presentation layer.
	public static interface Exhibitable {

	}

	declare parents: IFPedidoRegistrar implements Exhibitable;
	declare parents: IFPedidoVer implements Exhibitable;
	declare parents: IFCadastro implements Exhibitable;
}
