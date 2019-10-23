
package acme.entities.gamezbulletin;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Gamezbulletin extends DomainEntity {

	//Serialisation identifier---------------------------------

	private static final long	serialVersionUID	= 1L;

	//Atributes------------------------------------------------

	@NotBlank
	private String				food;

	@NotBlank
	private String				directions;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date				moment;

	@Digits(integer = 10, fraction = 2)
	private double				kcalories;

}
