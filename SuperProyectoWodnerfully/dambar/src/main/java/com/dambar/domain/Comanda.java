package com.dambar.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "comandas")
public class Comanda {
    @Schema (description = "Identificador", example = "1", required = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long idComanda;

    @Schema(description = "Indica si se ha pagado", example = "1", required = true)
    @NotBlank
    @Column(name = "pagado")
    private boolean pagado;

    @Schema(description = "Fecha del pedido", example = "", required = true)
    @NotBlank
    @Column(name = "fecha_pedido")
    private LocalDate fechaPedido;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "linea_id")
    Set<LineaComanda> lineaComandas;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Camarero_id")
    private Camarero camarero;

    public Set<LineaComanda> getLineaComandas() {
        return lineaComandas;
    }
}
