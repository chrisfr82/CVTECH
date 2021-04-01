package com.cvtech.entities.dao;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "DepotCv")
@Entity
public class DepotCv {
	
	@EmbeddedId
    DepotCvKey id;
	
	@ManyToOne
    @MapsId("idUser")
    @JoinColumn(name = "user_id")
    UserDAO user;

    @ManyToOne
    @MapsId("idCv")
    @JoinColumn(name = "cv_id")
    CurriculumDAO cv;
    
    @ManyToOne
    @MapsId("idStatus")
    @JoinColumn(name = "status_id")
    StatusDAO status;
    
    Date date;
    

}
