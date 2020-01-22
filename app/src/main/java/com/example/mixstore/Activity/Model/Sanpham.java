package com.example.mixstore.Activity.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sanpham {

    @SerializedName("ID")
    @Expose
    private String iD;
    @SerializedName("Idloaimathang")
    @Expose
    private String idloaimathang;
    @SerializedName("Tenmathang")
    @Expose
    private String tenmathang;
    @SerializedName("Giamathang")
    @Expose
    private String giamathang;
    @SerializedName("Hinhanhmathang")
    @Expose
    private String hinhanhmathang;
    @SerializedName("Motamathang")
    @Expose
    private String motamathang;

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public String getIdloaimathang() {
        return idloaimathang;
    }

    public void setIdloaimathang(String idloaimathang) {
        this.idloaimathang = idloaimathang;
    }

    public String getTenmathang() {
        return tenmathang;
    }

    public void setTenmathang(String tenmathang) {
        this.tenmathang = tenmathang;
    }

    public String getGiamathang() {
        return giamathang;
    }

    public void setGiamathang(String giamathang) {
        this.giamathang = giamathang;
    }

    public String getHinhanhmathang() {
        return hinhanhmathang;
    }

    public void setHinhanhmathang(String hinhanhmathang) {
        this.hinhanhmathang = hinhanhmathang;
    }

    public String getMotamathang() {
        return motamathang;
    }

    public void setMotamathang(String motamathang) {
        this.motamathang = motamathang;
    }
}
