package org.example.FacturacionClinica.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.DescriptionsList;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Factura extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paciente_id",referencedColumnName = "id")
    @DescriptionsList(
            descriptionProperties = "primerNombre,primerApellido"
    )
    private Paciente paciente;

    private LocalDate fechaFactura;
    private double monto;

}
