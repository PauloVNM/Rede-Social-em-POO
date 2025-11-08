package com.mycompany.atividadefinal_poo;
import Auxiliares.gerador_de_login;
public final class Usuarios extends Pessoa{
    private String login = "";
    private int totAssistido;

    public Usuarios(String nome,int idade,String sexo,String log) {
        super(nome,idade,sexo);
        gerador_de_login login = new gerador_de_login();
        if("".equals(log)){
            this.setLogin(nome+login.geradorLogin());
        }else{
            this.setLogin(log);
        }
        this.setTotAssistido(0);
    }
    
    protected String getLogin() {
        return login;
    }
    
    protected void setLogin(String login) {
        this.login = login;
    }

    protected int getTotAssistido() {
        return totAssistido;
    }

    protected void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return  "Nome = "+this.getNome()+"\n"+
                "Idade = "+this.getIdade()+"\n"+
                "Sexo = "+this.getSexo()+"\n"+
                "login = "+this.getLogin()+"\n"+
                "total assist. = "+this.getTotAssistido();
    }
    
}
