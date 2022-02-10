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

    @Schema(description = "Codigo de la mesa", example = "1", required = true)
    @NotBlank
    @Column(name = "codigo_mesa")
    private int codMesa;

    @Schema(description = "Codigo del camarero", example = "1", required = true)
    @NotBlank
    @Column(name="codigo_camarero")
    private int codCamarero;

    @Schema(description = "Fecha del pedido", example = "", required = true)
    @NotBlank
    @Column(name = "fecha_pedido")
    private LocalDate fechaPedido;

    @ManyToOne (fetch = FetchType.LAZY)
    private Mesa mesa;

    @ManyToOne (fetch = FetchType.LAZY)
    private Camarero camarero;


    @OneToMany(mappedBy = "comanda")
    Set<LineaComanda> lineaComandas;



 /*   @OneToMany(mappedBy = "lineacomanda",cascade = CascadeType.ALL)
    private List<LineaComanda> lineasComanda = new ArrayList<>();*/


}
