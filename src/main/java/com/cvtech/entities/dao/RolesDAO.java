package com.cvtech.entities.dao;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Table(name = "Roles")
@Entity
public class RolesDAO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long idRole;
	
	
	private String nomRole;
	
	@OneToMany(mappedBy = "role")
	private Set<UserDAO>user;
}
