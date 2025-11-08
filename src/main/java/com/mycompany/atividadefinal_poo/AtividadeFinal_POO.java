package com.mycompany.atividadefinal_poo;


public class AtividadeFinal_POO {

    public static void main(String[] args) {
        Usuarios u[] = new Usuarios[2];
        u[0] = new Usuarios("paulo",20,"M","");
        u[1] = new Usuarios("victor",49,"M","");
        
        Video v[] = new Video[1];
        v[0] = new Video("meu video",12);
        
        Visualizacao view[] = new Visualizacao[2];
        
        view[0] = new Visualizacao(u[0],v[0]);
        view[1] = new Visualizacao(u[1],v[0]);
        view[1].like();
        view[1].avaliar(5,"muito foda");
        view[0].avaliar(5);
        view[0].avaliar(5,"muito bom");
        view[0].avaliar(3,"mais ou menos");
        view[0].like();

System.out.println("===== Espectadores =====================================================");
        for (int i = 0; i < u.length; i++) {System.out.println(u[i].toString());}
System.out.println("===== Videos ===========================================================");
        for (int i = 0; i < v.length; i++) {System.out.println(v[i].toString());}
System.out.println("===== Visualizações ====================================================");
        for (int i = 0; i < view.length; i++) {System.out.println(view[i].toString());}


    }
}
