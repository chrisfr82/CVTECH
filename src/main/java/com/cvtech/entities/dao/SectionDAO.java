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
@Table(name = "Section")
@Entity
public class SectionDAO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long idSection;
	private String nomSection;
	

	
	@ManyToMany
	@JoinTable(name = "moduleParSection", 
			  joinColumns = {@JoinColumn(name = "Section_id", referencedColumnName = "idSection")}, 
			  inverseJoinColumns = {@JoinColumn(name = "module_id",referencedColumnName = "idModule")})
    Set<ModuleDAO> moduleParSection;
	
	@ManyToMany(mappedBy = "sectionParFiliere")
	Set<FiliereDAO> filiere;

}
