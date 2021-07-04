package DAOs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao 
{
    private final String host;
    private final String user;
    private final String pass;
    private final String database;
    public Connection c;
 
    public conexao (String host, String database, String user, String pass) 
    {
        this.pass = pass;
        this.user = user;
        this.host = host;
        this.database = database;
    }
    public boolean conectaBD() 
    {
        boolean estaConectado = false;
        
        String url;
        String portNumber = "1433";
        String userName   = this.user;
        String passName   = this.pass;

        url = "jdbc:sqlserver://"+ this.host + ":" + portNumber + ";databaseName=" + this.database;
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            this.c = DriverManager.getConnection("jdbc:sqlserver://regulus:1433;databasename=POO16172","POO16172", "POO16172");
            estaConectado = true;
        } catch( SQLException e ) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            estaConectado = false;
        } catch ( ClassNotFoundException e ) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            estaConectado = false;
        } catch ( InstantiationException e ) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            estaConectado = false;
        } catch ( IllegalAccessException e ) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            estaConectado = false;
        }
       
        return estaConectado;
    }
   
    public boolean desconectaBD() 
    {
        boolean estaConectado = false;
       
        String url;
        String portNumber = "1433";
        String userName   = this.user;
        String passName   = this.pass;
        url = "jdbc:sqlserver://"+ this.host+":" +portNumber + ";databaseName=" +this.database;
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            this.c = DriverManager.getConnection(url,userName, passName);
            this.c.close();
            estaConectado = true;
        } catch( SQLException e ) {
            System.out.println(e.getMessage());
            estaConectado = false;
        } catch ( ClassNotFoundException e ) {
            System.out.println(e.getMessage());
            estaConectado = false;
        } catch ( InstantiationException e ) {
            System.out.println(e.getMessage());
            estaConectado = false;
        } catch ( IllegalAccessException e ) {
            System.out.println(e.getMessage());
            estaConectado = false;
        }
       
        return estaConectado;
    }
}