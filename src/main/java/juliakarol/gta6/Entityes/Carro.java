package juliakarol.gta6.Entityes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomeDoVeiculo;
    private String marca;
    private String categoria;
    private String imagem;
    private String descricao;

    public Carro(){}

    public Carro(int id, String nomeDoVeiculo, String marca, String categoria, String imagem, String descricao) {
        this.id = id;
        this.nomeDoVeiculo = nomeDoVeiculo;
        this.marca = marca;
        this.categoria = categoria;
        this.imagem = imagem;
        this.descricao = descricao;
    }
    public Carro(String nomeDoVeiculo, String marca, String categoria, String imagem, String descricao) {

        this.nomeDoVeiculo = nomeDoVeiculo;
        this.marca = marca;
        this.categoria = categoria;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDoVeiculo() {
        return nomeDoVeiculo;
    }

    public void setNomeDoVeiculo(String nomeDoVeiculo) {
        this.nomeDoVeiculo = nomeDoVeiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
