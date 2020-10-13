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

    
    public int getManager_idx() {
        return this.manager_idx;
    }

    public void setManager_idx(int manager_idx) {
        this.manager_idx = manager_idx;
    }

    public String getManager_id() {
        return this.manager_id;
    }

    public void setManager_id(String manager_id) {
        this.manager_id = manager_id;
    }

    public String getManager_pw() {
        return this.manager_pw;
    }

    public void setManager_pw(String manager_pw) {
        this.manager_pw = manager_pw;
    }

    public String getManager_name() {
        return this.manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }
    
}
