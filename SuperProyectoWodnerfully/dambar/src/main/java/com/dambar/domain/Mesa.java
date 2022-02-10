package com.dambar.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
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

    //https://refactorizando.com/ejemplo-relacion-onetomany-hibernate/
    @OneToMany(mappedBy = "comanda",cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Comanda> comandas;

    public void addComanda(Comanda comanda){
        if(null == comandas){
            comandas = new HashSet<>();
        }
        comandas.add(comanda);
        comanda.setMesa(this);
    }

    public void removeComanda(Comanda comanda){
        comandas.remove(comanda);
        comanda.setMesa(null);
    }
}
