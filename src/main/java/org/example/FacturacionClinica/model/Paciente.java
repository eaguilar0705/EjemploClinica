package org.example.FacturacionClinica.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Paciente extends BaseEntity {

    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String cedula;
    private LocalDate fechaNacimiento;
    @Enumerated(EnumType.STRING)
    private Sexo sexo;


}
