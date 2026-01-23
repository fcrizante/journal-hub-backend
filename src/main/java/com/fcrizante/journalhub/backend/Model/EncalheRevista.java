package com.fcrizante.journalhub.backend.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "encalherevista")
public class EncalheRevista {

    @Id
    private EncalheRevistaId id;

    @Column(name = "qtdencalhe")
    private Integer qtdEncalhe;

    public EncalheRevistaId getId() {
        return id;
    }

    public void setId(EncalheRevistaId id) {
        this.id = id;
    }

    public Integer getQtdEncalhe() {
        return qtdEncalhe;
    }

    public void setQtdEncalhe(Integer qtdEncalhe) {
        this.qtdEncalhe = qtdEncalhe;
    }
}
