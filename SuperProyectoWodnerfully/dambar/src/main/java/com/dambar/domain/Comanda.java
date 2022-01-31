package com.dambar.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "comandas")
public class Comanda {
    @Schema (description = "Identificador", example = "1", required = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Schema(description = "Indica si se ha pagado", example = "1", required = true)
    @Column
    private boolean pagado;

    @Schema(description = "Codigo de la mesa", example = "1", required = true)
    @Column
    private int codMesa;

    @Schema(description = "Codigo del camarero", example = "1", required = true)
    @Column
    private int codCamarero;

    @Schema(description = "Fecha del pedido", example = "", required = true)
    @Column
    private LocalDate fechaPedido;

//    @OneToMany(mappedBy = "lineaComanda")


}
