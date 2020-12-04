package com.cyber.catalog.io.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "catalog_group")
public class CatalogGroup implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long id;

	@Column(nullable = false, length = 100, name = "id_catalog")
	private String idCatalog;

	@Column(nullable = false, length = 100, name = "name_catalog")
	private String name_catalog;

	@Column(nullable = false, length = 255, name = "descript")
	private String descript;

	@Column(nullable = false, name = "created_date")
	private Date created_date;

	@Column(nullable = false, name = "updated_date")
	private Date updatedDate;

	public CatalogGroup() {
		super();
	}

	public CatalogGroup(long id, String idCatalog, String name_catalog, String descript, Date created_date,
			Date updatedDate) {
		super();
		this.id = id;
		this.idCatalog = idCatalog;
		this.name_catalog = name_catalog;
		this.descript = descript;
		this.created_date = created_date;
		this.updatedDate = updatedDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIdCatalog() {
		return idCatalog;
	}

	public void setIdCatalog(String idCatalog) {
		this.idCatalog = idCatalog;
	}

	public String getName_catalog() {
		return name_catalog;
	}

	public void setName_catalog(String name_catalog) {
		this.name_catalog = name_catalog;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CatalogGroup [id=" + id + ", idCatalog=" + idCatalog + ", name_catalog=" + name_catalog + ", descript="
				+ descript + ", created_date=" + created_date + ", updatedDate=" + updatedDate + "]";
	}
	
	

}
