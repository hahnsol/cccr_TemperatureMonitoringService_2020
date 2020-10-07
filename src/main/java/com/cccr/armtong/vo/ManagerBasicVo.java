package com.cccr.armtong.vo;

public class ManagerBasicVo {
    
    private int manager_idx;
    private String manager_id;
    private String manager_pw;
    private String manager_name;

    public ManagerBasicVo(){}

    public ManagerBasicVo(int manager_idx, String manager_id, String manager_pw, String manager_name){
        this.manager_idx = manager_idx;
        this.manager_id = manager_id;
        this.manager_pw = manager_pw;
        this.manager_name = manager_name;
    }

    public int getManagerIdx(){
        return manager_idx;
    }

    public void setManagerIdx(int manager_idx){
        this.manager_idx = manager_idx;
    }

    public String getManagerId(){
        return manager_id;
    }

    public void setManagerId(String manager_id){
        this.manager_id = manager_id;
    }

    public String getManagerPw(){
        return manager_pw;
    }

    public void setManagerPw(String manager_pw){
        this.manager_pw = manager_pw;
    }

    public String getManagerName(){
        return manager_name;
    }

    public void setManagerName(String manager_name){
        this.manager_name = manager_name;
    }



}
