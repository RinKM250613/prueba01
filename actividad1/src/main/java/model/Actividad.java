package model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "tbl_actividad")
@Getter
@Setter
public class Actividad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_actividad", nullable = false)
	private int idAct;
	
	@Column(name = "descripcion", nullable = false)
	private String descripcion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_categoria")
	private Categoria idCategoria;
	
	@Column(name = "fecha_inicio", nullable = false)
	private LocalDateTime fechaIni;
	
	@Column(name = "nro_vacantes", nullable = false)
	private int nroVacantes;
	
	@Override
	public String toString() {
		return descripcion;
	}
}
