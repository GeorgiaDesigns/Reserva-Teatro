package DAOs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login 
{
    public boolean pesquisaLogin (String cpf, String senha,Connection c) throws Exception
    {
        boolean retorno = false;
        Statement st;
        ResultSet resultado;
        try
        {
            st = c.createStatement();
            String sql = "SELECT * FROM CLIENTE WHERE SENHA='" + senha + "' AND CPF='" + cpf + "'";
            
            resultado = st.executeQuery(sql);
            int contador = 0;
            while(resultado.next()){										                                   //mesmo usando um select *, nesse ponto defino que quero usar	
		contador++;
	    }
            retorno = contador != 0;
        }
        catch (SQLException erro)
        {
            throw new Exception("Erro na PESQUISALOGIN");
        }

        resultado.close();
        st.close();
        return retorno;
        
    }

    
}
