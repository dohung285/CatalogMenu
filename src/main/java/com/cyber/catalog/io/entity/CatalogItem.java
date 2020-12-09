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
	
	@Column(nullable = false, length = 100, name = "name_item")
	private String nameItem;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_group", referencedColumnName = "id")
	private CatalogGroup idGroup;

	@Column(nullable = false, name = "item")
	private int item;

	@Column(nullable = false, name = "id_parent")
	private int idParent;
	
	@Column(nullable = true, length = 255, name = "note")
	private String note;


	@Column(nullable = true, name = "created_date")
	private Date createdDate;

	@Column(nullable = true, name = "updated_date")
	private Date updatedDate;

	public CatalogItem() {
		super();
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

	public String getNameItem() {
		return nameItem;
	}

	public void setNameItem(String nameItem) {
		this.nameItem = nameItem;
	}

	public CatalogGroup getIdGroup() {
		return idGroup;
	}

	public void setIdGroup(CatalogGroup idGroup) {
		this.idGroup = idGroup;
	}

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}

	public int getIdParent() {
		return idParent;
	}

	public void setIdParent(int idParent) {
		this.idParent = idParent;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
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
		return "CatalogItem [id=" + id + ", idCatalog=" + idCatalog + ", nameItem=" + nameItem + ", idGroup=" + idGroup
				+ ", item=" + item + ", idParent=" + idParent + ", note=" + note + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + "]";
	}
	
	
	

	
	
	
	

}
