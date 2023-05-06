package entidades;

public class Video {
    private String titulo;
    private String diretor;
    private String genero;
    private String sinopse;
  
    
    public Video(String titulo, String diretor, String genero, String sinopse) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.genero = genero;
        this.sinopse = sinopse;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
   
    
}