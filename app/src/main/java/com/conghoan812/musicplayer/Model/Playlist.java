package com.conghoan812.musicplayer.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Playlist implements Serializable {

    @SerializedName("IdPlayList")
    @Expose
    private String idPlayList;
    @SerializedName("Ten")
    @Expose
    private String ten;
    @SerializedName("Hinhnen")
    @Expose
    private String hinhnen;
    @SerializedName("Hinhicon")
    @Expose
    private String hinhicon;

    public String getIdPlayList() {
        return idPlayList;
    }

    public void setIdPlayList(String idPlayList) {
        this.idPlayList = idPlayList;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHinhnen() {
        return hinhnen;
    }

    public void setHinhnen(String hinhnen) {
        this.hinhnen = hinhnen;
    }

    public String getHinhicon() {
        return hinhicon;
    }

    public void setHinhicon(String hinhicon) {
        this.hinhicon = hinhicon;
    }

}