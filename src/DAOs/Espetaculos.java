
package DAOs;


import DBOs.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Espetaculos {
    
    public ResultSet pegarEspetaculo (Connection x) throws Exception
    {
        Statement st;
        ResultSet resultado;
        try
        {
            st = x.createStatement();
            String sql = "SELECT NomeEspetaculo FROM Espetaculo";
            // EXECUTE QUERY USADO PARA SELECT
            resultado = st.executeQuery(sql);        
        }
        
        catch (SQLException erro)
        {
            throw new Exception ("Erro na pesquisa do espetáculo.");
        }
        
        st.close();
        return resultado;
    }
}