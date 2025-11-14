package classes;

//Ismael Costa Lira RA: G420BE5
//José Augusto Oliveira da Costa RA: N907363
//Matheus Lucas Magalhães de Souza RA: N7636F2
//Paulo Victor do Nascimento Monteiro RA: N940344
//Pedro Paulo dos Santos Gonzalez RA: G476JD0

//Atividade Final de orientação a objeto
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected double experiencia;

    protected Pessoa(String nome, int idade, String sexo) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setExperiencia(0);
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected int getIdade() {
        return idade;
    }

    protected void setIdade(int idade) {
        this.idade = idade;
    }

    protected String getSexo() {
        return sexo;
    }

    protected void setSexo(String sexo) {
        this.sexo = sexo;
    }

    protected double getExperiencia() {
        return experiencia;
    }

    protected void setExperiencia(double experiencia) {
        this.experiencia = experiencia;
    }
    
    
}
