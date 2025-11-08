package com.mycompany.atividadefinal_poo;
import java.util.ArrayList;
import java.util.List;
//Ismael Costa Lira RA: G420BE5
//José Augusto Oliveira da Costa RA: N907363
//Matheus Lucas Magalhães de Souza RA: N7636F2
//Paulo Victor do Nascimento Monteiro RA: N940344
//Pedro Paulo dos Santos Gonzalez RA: G476JD0

//Atividade Final de orientação a objeto
public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacoes;
    private float avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    private List<String> comentarios = new ArrayList();

    public Video(String titulo,int restricao) {
        this.setTitulo(titulo);
        this.setAvaliacoes(0);
        this.setAvaliacao(0);
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproduzindo(false);
    }
    
    @Override
    public void play() {
        this.setReproduzindo(true);
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
    }

    
    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas()+1);
    }

    protected String getTitulo() {
        return titulo;
    }

    protected void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(int avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    protected float getAvaliacao() {
        return avaliacao;
    }

    protected void setAvaliacao(float ava) {
        this.avaliacao = ava;
    }

    protected int getViews() {
        return views;
    }

    protected void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    protected void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    protected boolean getReproduzindo() {
        return reproduzindo;
    }

    protected void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<String> comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return  "titulo = " + this.getTitulo() + "\n"+
                "avaliacão = " + ((this.getAvaliacoes() == 0)?"Sem avaliações":this.getAvaliacao()/this.getAvaliacoes())+ "\n"+
                "Avaliações = "+this.getAvaliacoes()+"\n"+
                "views = " + this.getViews() + "\n"+
                "curtidas = " + this.getCurtidas() + "\n"+
                "reproduzindo = " + ((this.getReproduzindo())?"reproduzindo":"pausado") + "\n"+
                "comentarios = " + comentarios;
    }
    
}
