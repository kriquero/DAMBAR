package com.dambar.domain;

import lombok.AllArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@AllArgsConstructor
@Embeddable
public class producto_ComandaID implements Serializable {
    @Column(name="productoID")
    private long productoID;

    @Column(name="comandaID")
    private long comandaID;

}
