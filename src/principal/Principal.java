package principal;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import presentation.JFPrincipal;

public class Principal {
  
	public static void main(String[] args) throws UnsupportedLookAndFeelException {
   
      UIManager.setLookAndFeel(
          new javax.swing.plaf.nimbus.NimbusLookAndFeel());
   
    new JFPrincipal().setVisible(true);
  }
}

/********************************************************************
 * Este arquivo � parte integrante do livro identificado abaixo e � *
 * protegido pela legisla��o que trata dos direitos autorais.       *
 *                                                                  *
 * T�tulo:  Programa��o de Computadores em Java                     *
 * Autor:   Rui Rossi dos Santos                                    *
 * Editora: NovaTerra Editora e Distribuidora Ltda.                 *
 * Ano:     2014                                                    *
 ********************************************************************/