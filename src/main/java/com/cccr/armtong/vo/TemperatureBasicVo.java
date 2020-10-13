package com.cccr.armtong.vo;

public class TemperatureBasicVo {
    
    private int temperature_idx;
    private int member_idx;
    private Float temperature_tem;
    private String temperature_date;
    private String temperature_location;

    public TemperatureBasicVo() {}

    public TemperatureBasicVo(int temperature_idx, int member_idx, Float temperature_tem, String temperature_date, String temperature_location){
        super();
        this.temperature_idx = temperature_idx;
        this.member_idx = member_idx;
        this.temperature_tem = temperature_tem;
        this.temperature_date = temperature_date;
        this.temperature_location = temperature_location;
    }

    public int getTemperature_idx() {
		return this.temperature_idx;
	}

	public void setTemperature_idx(int temperature_idx) {
		this.temperature_idx = temperature_idx;
	}

	public int getMember_idx() {
		return this.member_idx;
	}

	public void setMember_idx(int member_idx) {
		this.member_idx = member_idx;
	}

	public Float getTemperature_tem() {
		return this.temperature_tem;
	}

	public void setTemperature_tem(Float temperature_tem) {
		this.temperature_tem = temperature_tem;
	}

	public String getTemperature_date() {
		return this.temperature_date;
	}

	public void setTemperature_date(String temperature_date) {
		this.temperature_date = temperature_date;
	}

	public String getTemperature_location() {
		return this.temperature_location;
	}

	public void setTemperature_location(String temperature_location) {
		this.temperature_location = temperature_location;
	}


}
