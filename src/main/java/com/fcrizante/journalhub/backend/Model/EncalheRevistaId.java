package com.fcrizante.journalhub.backend.Model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class EncalheRevistaId {

    @ManyToOne
    @JoinColumn(name = "revistaid", referencedColumnName = "id")
    private Revista revista;

    @ManyToOne
    @JoinColumn(name = "encalheid",referencedColumnName = "id")
    private Encalhe encalhe;

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    public Encalhe getEncalhe() {
        return encalhe;
    }

    public void setEncalhe(Encalhe encalhe) {
        this.encalhe = encalhe;
    }
}
