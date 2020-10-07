package com.cccr.armtong.vo;

public class MemberBasicVo {
    
    private int member_idx;
    private String member_name;
    private String member_birth;
    private String member_gender;

    public MemberBasicVo() {}

    public MemberBasicVo(int member_idx, String member_name, String member_birth, String member_gender){
        super();
        this.member_idx = member_idx;
        this.member_name = member_name;
        this.member_birth = member_birth;
        this.member_gender = member_gender;
    }

    public int getMember_idx(){
        return member_idx;
    }

    public void setMember_idx(int member_idx){
        this.member_idx = member_idx;
    }

    public String getMember_name(){
        return member_name;
    }

    public void setMeber_name(String member_name){
        this.member_name = member_name;
    }

    public String getMember_birth(){
        return member_birth;
    }

    public void setMeber_birth(String member_birth){
        this.member_birth = member_birth;
    }

    public String getMember_gender(){
        return member_gender;
    }

    public void setMeber_gender(String member_gender){
        this.member_gender = member_gender;
    }


}
