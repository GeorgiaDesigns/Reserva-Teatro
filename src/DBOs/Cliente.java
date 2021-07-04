
package DBOs;

import java.sql.Date;

public class Cliente {
    
    private String CPF;
    private String Nome;
    private Date Idade;
    private String Senha;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) throws Exception 
    {
        //validacao do cpf 
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Date getIdade() {
        return Idade;
    }

    public void setIdade(Date Idade) throws Exception
    {
        //if (Idade<18)
          //  throw new Exception ("O cliente não tem idade suficiente!");
        this.Idade = Idade;
    }

    /**
     *
     * @param CPF
     * @param Nome
     * @param Idade
     * @param Senha
     */
    public Cliente(String CPF, String Nome, Date Idade, String Senha) {
        this.CPF = CPF;
        this.Nome = Nome;
        this.Idade = Idade;
        this.Senha = Senha;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
}
