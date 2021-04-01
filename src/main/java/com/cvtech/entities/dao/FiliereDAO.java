package com.cvtech.entities.dao;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Table(name = "Filière")
@Entity
public class FiliereDAO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long idFiliere;
	
	
	private String nomFiliere;
	
	
	@ManyToMany
	@JoinTable(name = "sectionParFiliere", 
			  joinColumns = {@JoinColumn(name = "Filiere_id", referencedColumnName = "idFiliere")}, 
			  inverseJoinColumns = {@JoinColumn(name = "Section_id",referencedColumnName = "idSection")})
    Set<SectionDAO> sectionParFiliere;
}
