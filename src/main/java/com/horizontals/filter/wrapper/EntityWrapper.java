package com.horizontals.filter.wrapper;


public class EntityWrapper {

	public EntityWrapper() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EntityWrapper(Integer id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	public EntityWrapper( Long longId,String title) {
		super();
		this.title = title;
		this.longId = longId;
	}
	private Integer id;
	private String title;
	private Long longId;
	private Double minValue;
	private Double maxValue;
	private Double selectedMin;
	private Double selectedMax;
	private Boolean selected=false;
	
	public Double getMinValue() {
		return minValue;
	}
	public void setMinValue(Double minValue) {
		this.minValue = minValue;
	}
	public Double getMaxValue() {
		return maxValue;
	}
	public void setMaxValue(Double maxValue) {
		this.maxValue = maxValue;
	}
	public Double getSelectedMin() {
		return selectedMin;
	}
	public void setSelectedMin(Double selectedMin) {
		this.selectedMin = selectedMin;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Long getLongId() {
		return longId;
	}
	public void setLongId(Long longId) {
		this.longId = longId;
	}
	public Boolean getSelected() {
		return selected;
	}
	public void setSelected(Boolean selected) {
		this.selected = selected;
	}
	public Double getSelectedMax() {
		return selectedMax;
	}
	public void setSelectedMax(Double selectedMax) {
		this.selectedMax = selectedMax;
	}

}
