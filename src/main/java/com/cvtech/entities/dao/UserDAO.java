package com.cvtech.entities.dao;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Table(name = "Utilisateur",uniqueConstraints = @UniqueConstraint(columnNames = "mail"))
@Entity
public class UserDAO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long idUser;
	
	@NotBlank
	private String mail;
	
	@NotBlank
	private String password;
	
	@NotBlank
	private String nom;
	
	@NotBlank
	private String prenom;
	
	@NotBlank
	@Size(max = 10)
	@Pattern(regexp = "(0|\\\\+33|0033)[1-9][0-9]{8}",message = "Veuillez entrer un numéro de téléphone français !")
	private String telephone;
	
	private boolean actif;
	
	@OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
	private RolesDAO role;

	
	@OneToMany(mappedBy = "user")
    Set<DepotCv> user;
	
	
	@ManyToMany
	@JoinTable(name = "moduleParExpert", 
			  joinColumns = {@JoinColumn(name = "User_id", referencedColumnName = "idUser")}, 
			  inverseJoinColumns = {@JoinColumn(name = "module_id",referencedColumnName = "idModule")})
    Set<ModuleDAO> moduleParExpert;
	
	
	
	
	

}
