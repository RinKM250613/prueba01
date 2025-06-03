package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "tbl_solicitud")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Solicitud {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "nro_solicitud")
	private Integer nroSoli;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_actividad", nullable = false)
	private Actividad idAct;
	
	@Column(name = "estado", nullable = false)
	private String estado;
	
	@Column(name = "archivo_adjunto", nullable = false)
	private String archivo;
	
	@Column(name = "fecha_reg", columnDefinition = "INT NOT NULL DEFAULT CURRENT_TIMESTAMP")
	private LocalDate fechaReg;


}
