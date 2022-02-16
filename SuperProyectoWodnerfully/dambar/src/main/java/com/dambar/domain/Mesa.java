package com.dambar.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "mesa")
public class Mesa {

    @Schema(description = "identificador", example = "1", required = true)
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Schema(description = "Estado de la mesa", example = "Ocupada", required = true)
    estadoMesa estado = estadoMesa.Libre;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "comanda_id")
    private List<Comanda> comandas;

    public List<Comanda> getComandas() {
        return comandas;
    }
}
