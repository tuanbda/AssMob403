package com.example.boylc.assmob403.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class LastestResponse {

    @SerializedName("HD_WALLPAPER")
    @Expose
    private List<HDWALLPAPER> hDWALLPAPER = null;

    public List<HDWALLPAPER> getHDWALLPAPER() {
        return hDWALLPAPER;
    }

    public void setHDWALLPAPER(List<HDWALLPAPER> hDWALLPAPER) {
        this.hDWALLPAPER = hDWALLPAPER;
    }

}
