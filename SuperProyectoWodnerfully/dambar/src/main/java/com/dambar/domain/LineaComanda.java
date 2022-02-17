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
@Entity(name = "lineacomanda")
public class LineaComanda {

    @Schema(description = "Identificador", example = "15", required = true)
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    
    @Schema(description = "Cantidad", example = "1", required = true)
    @NotBlank
    @Column(name = "cantidad")
    private int cantidad;


}
