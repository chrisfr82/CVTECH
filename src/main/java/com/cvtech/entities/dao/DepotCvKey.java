package com.cvtech.entities.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;


@Data
@Embeddable
public class DepotCvKey implements Serializable{

	@Column(name = "user_id")
    Long idUser;

    @Column(name = "cv_id")
    Long idCv;
    
    @Column(name = "status_id")
    Long idStatus;
}
