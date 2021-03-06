package com.ysyt.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.constants.CommonConstants;

@Entity
@Table(name = "amenities_mapping", schema = CommonConstants.SCHEMA)
public class AmenitiesMapping implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	
	@Column(name="attribute_id")
	private Long attributeId;
	
	@Column(name="parent_amenitiy_id")
	private Long parentAmenitiyId;
	
	@Column(name="source_id")
	private Long  sourceId;
	
	@Column(name="source_type")
	private String sourceType;
	
	@Column(name="parent_id")
	private Long parentId;
	
	@Column(name="orderid")
	private Integer orderId;
	
	@Column(name="is_deleted",nullable = false ,insertable=false, columnDefinition = "boolean default false")
	private Boolean isDeleted;
	
	@OneToOne(fetch = FetchType.EAGER,targetEntity = AttributesMaster.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "attribute_id", referencedColumnName = "id",insertable=false ,updatable=false)
	private AttributesMaster attributeBean;
	
	@OneToOne(fetch = FetchType.EAGER,targetEntity = AttributesMaster.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "parent_amenitiy_id", referencedColumnName = "id",insertable=false ,updatable=false)
	private AttributesMaster  parentBean;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAttributeId() {
		return attributeId;
	}

	public void setAttributeId(Long attributeId) {
		this.attributeId = attributeId;
	}

	

	public Long getParentAmenitiyId() {
		return parentAmenitiyId;
	}

	public void setParentAmenitiyId(Long parentAmenitiyId) {
		this.parentAmenitiyId = parentAmenitiyId;
	}

	public Long getSourceId() {
		return sourceId;
	}

	public void setSourceId(Long sourceId) {
		this.sourceId = sourceId;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public AttributesMaster getAttributeBean() {
		return attributeBean;
	}

	public void setAttributeBean(AttributesMaster attributeBean) {
		this.attributeBean = attributeBean;
	}

	public AttributesMaster getParentBean() {
		return parentBean;
	}

	public void setParentBean(AttributesMaster parentBean) {
		this.parentBean = parentBean;
	}

	
	
}