package com.cyber.catalog.io.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "catalog_item")
public class CatalogItem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long id;

	@Column(nullable = false, length = 100, name = "id_catalog")
	private String idCatalog;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_group", referencedColumnName = "id")
	private CatalogGroup id_group;

	@Column(nullable = false, name = "item")
	private int item;

	@Column(nullable = false, name = "id_parent")
	private int id_parent;

	@Column(nullable = false, name = "created_date")
	private Date createdDate;

	@Column(nullable = false, name = "updated_date")
	private Date updatedDate;

	public CatalogItem() {
		super();
	}

	public CatalogItem(long id, String idCatalog, CatalogGroup id_group, int item, int id_parent, Date createdDate,
			Date updatedDate) {
		super();
		this.id = id;
		this.idCatalog = idCatalog;
		this.id_group = id_group;
		this.item = item;
		this.id_parent = id_parent;
		this.createdDate = createdDate;
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

	public CatalogGroup getId_group() {
		return id_group;
	}

	public void setId_group(CatalogGroup id_group) {
		this.id_group = id_group;
	}

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}

	public int getId_parent() {
		return id_parent;
	}

	public void setId_parent(int id_parent) {
		this.id_parent = id_parent;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
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
		return "CatalogItem [id=" + id + ", idCatalog=" + idCatalog + ", id_group=" + id_group + ", item=" + item
				+ ", id_parent=" + id_parent + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}
	
	

}
