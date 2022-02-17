package com.dambar.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "camarero")
public class Camarero {

    @Schema(description = "Identificador del camarero", example = "1", required = true)
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCamarero;

    @Schema(description = "Nombre del camarero", example = "Pepe", required = true)
    @NotBlank
    @Column(name="nombre")
    private String nombre;

    @Schema(description = "Puesto del camarero", example = "Terraza", required = true)
    @NotBlank
    @Column(name="puesto")
    private String puesto;

    @Schema(description = "Fecha de inicio del camarero", example = "2022-2-20", required = true)
    @NotBlank
    @Column(name="fechaAlta")
    private LocalDate fechaInicio;

    @Schema(description = "telefono del camarero", example = "669447151", required = true)
    @NotBlank
    @Column(name="telefono")
    private String telefono;


    @JoinColumn(name = "Camarero_id")
    @OneToMany(cascade = CascadeType.ALL)
    private List<Comanda> comandas;

    public List<Comanda> getComandas() {
        return comandas;
    }
}
