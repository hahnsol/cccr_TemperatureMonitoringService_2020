package com.cccr.armtong.vo;

public class SessionUserDataVo {
    
    private int manager_idx;
    private String manager_name;

    public SessionUserDataVo(){}

    public SessionUserDataVo(int manager_idx, String manager_name){
        this.manager_idx = manager_idx;
        this.manager_name = manager_name;
    }

    public int getManagerIdx(){
        return manager_idx;
    }

    public void setManagerIdx(int manager_idx){
        this.manager_idx = manager_idx;
    }

    public String getManagerName(){
        return manager_name;
    }

    public void setManagerName(String manager_name){
        this.manager_name = manager_name;
    }


}
