package com.dambar.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "camarero")
public class Camarero {

    @Schema(description = "Identificador del camarero", example = "1", required = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCamarero;

    @Schema(description = "Nombre del camarero", example = "Pepe", required = true)
    @NotBlank
    @Column
    private String nombre;

    @Schema(description = "Puesto del camarero", example = "Terraza", required = true)
    @NotBlank
    @Column
    private String puesto;

    @Schema(description = "Fecha de inicio del camarero", example = "2022-2-20", required = true)
    @NotBlank
    @Column
    private LocalDate fechaInicio;

    @Schema(description = "telefono del camarero", example = "669447151", required = true)
    @NotBlank
    @Column
    private String telefono;
}
