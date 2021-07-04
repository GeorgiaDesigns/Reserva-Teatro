
package DAOs;

import DBOs.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Clientes {
    
    public boolean pesquisaCliente (int CPF,Connection x) throws Exception
    {
        boolean retorno = false;
        Statement st;
        ResultSet resultado;
        try
        {
            st = x.createStatement();
            String sql = "SELECT * FROM CLIENTE WHERE CPF = " + CPF;
            // EXECUTE QUERY USADO PARA SELECT
            resultado = st.executeQuery(sql);
            int contador = 0;
            while(resultado.next()){										                                   //mesmo usando um select *, nesse ponto defino que quero usar	
		contador++;
	    }
            retorno = contador != 0;                
        }
        catch (SQLException erro)
        {
            throw new Exception ("Erro na pesquisa do cliente.");
        }

        resultado.close();
        st.close();
        return retorno;
    }

    public void incluirCliente (Cliente cliente,Connection x) throws Exception
    {
        Statement st;
        try
        {
            String sql = "INSERT INTO CLIENTE VALUES ('" + cliente.getCPF() + "','";
            sql += cliente.getNome() + "','";
            sql += cliente.getIdade() + "','";
            sql += cliente.getSenha() + "')";
            
            st = x.createStatement();
            // EXECUTEUPDATE USADO PARA INSERT, UPDATE, DELETE
            st.executeUpdate(sql);
            
            
        }
        catch (SQLException erro)
        {
           // throw new Exception ("Erro no incluir cliente.");
            System.err.println(erro.getMessage());
        }
    }

    public void incluirFilme(int codigoF) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}