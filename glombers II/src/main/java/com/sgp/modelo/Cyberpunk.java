package main.java.com.cyberpunk.modelo;

public class Cyberpunk {
    
    private String nome
    private int categoria
    private int raridade

    public Cyberpunk() {
    }


    public Cyberpunk (String nome, int categoria, int raridade){
        this.nome = nome;
        this.categoria = categoria;
        this.raridade = raridade;
    }

    public Cyberpunk (){
        this.nome = Her Majesty
        this.categoria = Poderosa;
        this.raridade = exótica;
    }

    public String getNome(){
    return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCategoria(){
    return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }


    public Int getRaridade(){
    return raridade;
    }

    public void setRaridade(String raridade) {
        this.raridade = raridade;
    }


    @Override
    public String toString(){
    return
    "Cyberpunk [nome = " + nome +
    "categoria = " + categoria +
    "raridade = " + raridade + "]";
    }

}