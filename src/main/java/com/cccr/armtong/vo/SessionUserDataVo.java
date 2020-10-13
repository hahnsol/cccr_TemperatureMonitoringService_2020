package com.cccr.armtong.vo;

public class SessionUserDataVo {
    
    private int manager_idx;
    private String manager_name;

   

    public SessionUserDataVo(){}

    public SessionUserDataVo(int manager_idx, String manager_name){
        this.manager_idx = manager_idx;
        this.manager_name = manager_name;
    }

    public int getManager_idx() {
        return this.manager_idx;
    }

    public void setManager_idx(int manager_idx) {
        this.manager_idx = manager_idx;
    }

    public String getManager_name() {
        return this.manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }


}
