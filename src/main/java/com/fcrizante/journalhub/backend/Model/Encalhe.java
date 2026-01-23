package com.fcrizante.journalhub.backend.Model;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="encalhe")
public class Encalhe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer encalheId;

    @Column(name="dtenvio")
    private LocalDate dtEnvio;

    @ManyToOne
    @JoinColumn(name="fornecedorid")
    private Fornecedor fornecedor;

    public Integer getId() {
        return encalheId;
    }

    public void setId(Integer id) {
        this.encalheId = id;
    }

    public LocalDate getDtEnvio() {
        return dtEnvio;
    }

    public void setDtEnvio(LocalDate dtEnvio) {
        this.dtEnvio = dtEnvio;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
