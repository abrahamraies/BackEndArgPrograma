package com.backend.portfolio.models;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

import lombok.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private Long idpersona;

    private String nombre;
    private String apellido;
    private Date fecha_nacimiento;
    private String nacionalidad;
    private String correo;
    private String ocupacion;
    private String image_background;
    private String image_perfil;
    private String domicilio;
    private String estado_civil;
    private String celular;
    private String ciudad;
    private String nivelIngles;
    private String freelance;
    private int dni;
    private String cuit;

    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Resumenes> resumenes;
}



