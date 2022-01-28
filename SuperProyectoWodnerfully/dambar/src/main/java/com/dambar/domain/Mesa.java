package com.dambar.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "mesas")
public class Mesa {

    estadoMesa estado = estadoMesa.Libre;


}
