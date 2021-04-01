package com.cvtech.entities.dao;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Table(name = "StatusCv")
@Entity
public class StatusDAO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long idStatus;
	
	
	private String nomStatus;
	
	@OneToMany(mappedBy = "status")
    Set<DepotCv> statusCv;

}
