package com.dambar.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@Entity(name = "lineacomanda")
/*@IdClass(producto_ComandaID.class)*/
public class LineaComanda {

    @Schema(description = "Identificador", example = "15", required = true)
    @EmbeddedId
    @Column(name = "id")
    private long id;

    @Schema(description = "Cantidad", example = "1", required = true)
    @NotBlank
    @Column(name = "cantidad")
    private int cantidad;

   /* @OneToOne (cascade = {CascadeType.ALL})
    @JoinColumn(name="id_producto")
    private Producto producto;

    @ManyToOne(fetch = FetchType.LAZY)
    private Comanda comanda;*/
}
