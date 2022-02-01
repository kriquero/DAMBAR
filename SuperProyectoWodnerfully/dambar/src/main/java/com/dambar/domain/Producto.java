package com.dambar.domain;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "productos")
public class Producto {

    @Schema(description = "Identificador del producto", example = "1", required = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Schema(description = "Nombre del producto", example = "Ensalada cesar", required = true)
    @NotBlank
    @Column
    private String nombre;

    @Schema(description = "Descripcion del producto", example = "Ensalada con salsa cesar", required = true)
    @NotBlank
    @Column
    private String descripcion;

    @Schema(description = "Precio del producto", example = "6.5", required = true)
    @NotBlank
    @Column
    private float precio;

    @Schema(description = "Cantidad de productos en el stock", example = "6", required = true)
    @NotBlank
    @Column
    private int stock;

    @Schema(description = "Tipo de producto", example = "Marisco", required = true)
    @NotBlank
    @Column
    private String tipo;

    @Schema(description = "Foto del producto", example = "url", required = true)
    @NotBlank
    @Column
    private float foto; //URL del producto

    @OneToOne(mappedBy = "producto", fetch = FetchType.LAZY)
    LineaComanda lineaComanda;

}
