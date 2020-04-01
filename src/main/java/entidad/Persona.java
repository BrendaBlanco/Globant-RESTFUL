package entidad;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PERSONA")
public class Persona {
	
	@Id
	@GeneratedValue
	private int id;
	private int dni;
	private String nombre;
	private String apellido;
	private int edad;
	private Date fechaNacimiento;
	public Persona orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
