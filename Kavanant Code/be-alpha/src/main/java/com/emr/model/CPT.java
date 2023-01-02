package com.emr.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "cpt")
public class CPT {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "code")
	private String code;

	@Column(name = "short_name")
	private String shortName;

	@Column(name = "description")
	private String description;

	@Column(name = "ishcpcs")
	private Boolean ishcpcs;

	//@Column(name = "status")
	//private Character status = 'Y';

	@Column(name = "last_modified_by")
	private String lastModifiedBy;

	@Column(name = "last_modified_date")
	private Date lastModifiedDate;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_date")
	private Date createdDate;

	@Column(name = "retired")
	private Character retired ='N';

	@Column(name = "RefId")
	private Integer refId;

	@Column(name="OriginalRefId")
	private int originalRefId ;
	
	@Column(name="VersionState")
	private String versionState ="Valid";
	
	@Column(name="RetiredDate")
	private Date retireddate;
	
	@Column(name="RetiredReason")
	private String retiredReason;
		
}
