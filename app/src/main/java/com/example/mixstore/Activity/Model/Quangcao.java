package com.example.mixstore.Activity.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Quangcao implements Serializable {

        @SerializedName("Idquangcao")
        @Expose
        private String idquangcao;

        @SerializedName("Hinhquangcao")
        @Expose
        private String hinhquangcao;

        @SerializedName("Idloaimathang")
        @Expose
        private String idloaimathang;

        public String getIdquangcao() {
            return idquangcao;
        }

        public void setIdquangcao(String idquangcao) {
            this.idquangcao = idquangcao;
        }

        public String getHinhquangcao() {
            return hinhquangcao;
        }

        public void setHinhquangcao(String hinhquangcao) {
            this.hinhquangcao = hinhquangcao;
        }

        public String getIdloaimathang() {
            return idloaimathang;
        }

        public void setIdloaimathang(String idloaimathang) {
            this.idloaimathang = idloaimathang;
        }
}
