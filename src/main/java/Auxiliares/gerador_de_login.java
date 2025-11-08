package Auxiliares;

import java.util.Random;

public class gerador_de_login {
    Random aleatorio = new Random();
    String codigo = "";
    
    public String geradorLogin(){
         for (int i = 0; i < 6; i++) {
            int numeroInt = this.aleatorio.nextInt(10);
            String numeroString = String.valueOf(numeroInt);
            this.codigo = this.codigo + numeroString;
        }
        return this.codigo;
    }
}
