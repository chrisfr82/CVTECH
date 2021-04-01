package com.cvtech.entities.dao;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Table(name = "Module")
@Entity
public class ModuleDAO {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long idModule;
	
	private String nomModule;
	
	@ManyToMany(mappedBy = "moduleParExpert")
	Set<UserDAO> expert;
	
	@ManyToMany(mappedBy = "moduleParSection")
	Set<SectionDAO> section;

}
