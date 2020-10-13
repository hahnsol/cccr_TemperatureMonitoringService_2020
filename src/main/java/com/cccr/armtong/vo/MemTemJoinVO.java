package com.cccr.armtong.vo;

public class MemTemJoinVO {
    private MemberBasicVo memberBasicVo;
    private TemperatureBasicVo temperatureBasicVo;


    public MemTemJoinVO(){}

    public MemTemJoinVO(MemberBasicVo memberBasicVo, TemperatureBasicVo temperatureBasicVo){
        super();
        this.memberBasicVo = memberBasicVo;
        this.temperatureBasicVo = temperatureBasicVo;
    }

    public MemberBasicVo getMemberBasicVo() {
        return this.memberBasicVo;
    }

    public void setMemberBasicVo(MemberBasicVo memberBasicVo) {
        this.memberBasicVo = memberBasicVo;
    }

    public TemperatureBasicVo getTemperatureBasicVo() {
        return this.temperatureBasicVo;
    }

    public void setTemperatureBasicVo(TemperatureBasicVo temperatureBasicVo) {
        this.temperatureBasicVo = temperatureBasicVo;
    }




}
