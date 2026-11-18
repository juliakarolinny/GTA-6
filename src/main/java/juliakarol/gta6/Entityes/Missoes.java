package juliakarol.gta6.Entityes;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Missoes {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomeDaMissao;
    private String local;
    private String dificuldade;
    private String imagem;
    private String descricaoObjetivo;

    public Missoes(){}

    public Missoes(int id, String nomeDaMissao, String local, String dificuldade, String imagem, String descricaoObjetivo) {
        this.id = id;
        this.nomeDaMissao = nomeDaMissao;
        this.local = local;
        this.dificuldade = dificuldade;
        this.imagem = imagem;
        this.descricaoObjetivo = descricaoObjetivo;
    }
    public Missoes(String nomeDaMissao, String local, String dificuldade, String imagem, String descricaoObjetivo) {

        this.nomeDaMissao = nomeDaMissao;
        this.local = local;
        this.dificuldade = dificuldade;
        this.imagem = imagem;
        this.descricaoObjetivo = descricaoObjetivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDaMissao() {
        return nomeDaMissao;
    }

    public void setNomeDaMissao(String nomeDaMissao) {
        this.nomeDaMissao = nomeDaMissao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricaoObjetivo() {
        return descricaoObjetivo;
    }

    public void setDescricaoObjetivo(String descricaoObjetivo) {
        this.descricaoObjetivo = descricaoObjetivo;
    }
}

