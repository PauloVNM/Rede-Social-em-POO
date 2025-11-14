package classes;

public class Visualizacao {
    
    private Usuarios espctador;
    private Video video;
    
    public Visualizacao(Usuarios U, Video V) {
        this.setEspctador(U);
        this.setVideo(V);
        this.espctador.setTotAssistido(this.espctador.getTotAssistido()+1);
        this.video.setViews(this.video.getViews()+1);
    }
    
    
    public void avaliar(int n){
        this.video.setAvaliacoes(this.video.getAvaliacoes()+1);
        this.video.setAvaliacao(this.video.getAvaliacao()+n);
        
    }
    public void avaliar(int n,String c){
        this.video.setAvaliacoes(this.video.getAvaliacoes()+1);
        this.video.setAvaliacao(this.video.getAvaliacao()+n);
        this.video.getComentarios().add(this.espctador.getNome()+": "+c);
    }    
        public void play() {
            this.video.play();
        }
        
        public void pause() {
            this.video.pause();
        }

        public void like() {
            this.video.like();
        }
    protected Usuarios getEspctador() {
        return espctador;
    }

    protected void setEspctador(Usuarios espctador) {
        this.espctador = espctador;
    }

    protected Video getVideo() {
        return video;
    }

    protected void setVideo(Video video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return  "Espctador = " + this.getEspctador().getNome() + "\n"+
                "Video assistido = " + this.getVideo().getTitulo();
    }
    
}
