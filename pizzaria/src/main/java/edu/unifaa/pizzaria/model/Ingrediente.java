package edu.unifaa.pizzaria.model;

import java.util.Date;

import edu.unifaa.pizzaria.model.Enum.EUnidadeMedida;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.Table;

@Entity
public class Ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ingredientes")
    private long id;

    @Column(nullable = false)
    private String descricao;

    @Column (nullable = false)
    private Date dataValidade;

    private double valor;

    @Column (nullable = false)
    private EUnidadeMedida medida;

    private String observacao;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public EUnidadeMedida getMedida() {
        return medida;
    }

    public void setMedida(EUnidadeMedida medida) {
        this.medida = medida;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
