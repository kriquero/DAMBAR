package com.dambar.domain;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Data
@Getter
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
    @Column(name="nombre")
    private String nombre;

    @Schema(description = "Descripcion del producto", example = "Ensalada con salsa cesar", required = true)
    @NotBlank
    @Column(name="descripcion")
    private String descripcion;

    @Schema(description = "Precio del producto", example = "16.5", required = true)
    @NotBlank
    @Column(name="precio")
    private float precio;

    @Schema(description = "Cantidad de productos en el stock", example = "6", required = true)
    @NotBlank
    @Column(name="stock")
    private int stock;

    @Schema(description = "Tipo de producto", example = "Marisco", required = true)
    @NotBlank
    @Column(name="tipo")
    private String tipo;

    @Schema(description = "Foto del producto", example = "https://okdiario.com/img/2020/01/16/potaje-de-garbanzos-con-chorizo.jpg", required = true)
    @NotBlank
    @Column(name="foto")
    private String foto; //URL del producto






}
