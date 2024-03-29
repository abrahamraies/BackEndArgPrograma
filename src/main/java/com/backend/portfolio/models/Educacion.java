package com.backend.portfolio.models;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_edu")
    private Long id_edu;

    private String titulo;
    private String nombre;
    private int inicio;
    private String fin;
    private String resumen_edu;
}
