package com.fcrizante.journalhub.backend.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "revista")
public class Revista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer revistaId;

    @Column(name = "edicao")
    private String edicao;

    @Column(name = "estoque")
    private Integer estoque;

    @Column(name = "qtdentregue")
    private Integer qtdeEntregue;

    @Column(name = "preco")
    private float preco;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="produtoid",referencedColumnName = "id")
    private Produto produto;

    public Integer getId() {
        return revistaId;
    }

    public void setId(Integer id) {
        this.revistaId = id;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public Integer getQtdeEntregue() {
        return qtdeEntregue;
    }

    public void setQtdeEntregue(Integer qtdeEntregue) {
        this.qtdeEntregue = qtdeEntregue;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
