package proyecto.Monitoreo.modelo;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="alertas")
@Data
public class ModeloAlerta {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idConductor;
  private String tipoAlerta;
  private String descripcion;
  private String estado;
  private LocalDateTime fechaAlerta;

  public ModeloAlerta(){
      this.fechaAlerta=LocalDateTime.now();
  }


}
