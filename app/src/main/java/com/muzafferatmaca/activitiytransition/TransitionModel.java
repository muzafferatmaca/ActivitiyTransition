package com.muzafferatmaca.activitiytransition;

public class TransitionModel {

    private String isim,telNo,soyIsim;

    public TransitionModel(String isim, String telNo, String soyIsim) {
        this.isim = isim;
        this.telNo = telNo;
        this.soyIsim = soyIsim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }
}
