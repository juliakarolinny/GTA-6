package juliakarol.gta6.Entityes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Arma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomeDaArma;
    private String categoria;
    private String fabricante;
    private String imagem;
    private String descricao;

    public Arma(){}

    public Arma(int id, String nomeDaArma, String categoria, String fabricante, String imagem, String descricao) {
        this.id = id;
        this.nomeDaArma = nomeDaArma;
        this.categoria = categoria;
        this.fabricante = fabricante;
        this.imagem = imagem;
        this.descricao = descricao;
    }
    public Arma(String nomeDaArma, String categoria, String fabricante, String imagem, String descricao) {

        this.nomeDaArma = nomeDaArma;
        this.categoria = categoria;
        this.fabricante = fabricante;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDaArma() {
        return nomeDaArma;
    }

    public void setNomeDaArma(String nomeDaArma) {
        this.nomeDaArma = nomeDaArma;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
