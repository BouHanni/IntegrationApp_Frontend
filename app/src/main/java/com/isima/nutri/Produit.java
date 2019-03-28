package com.isima.nutri;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


    public class Produit {

        public Produit(Integer id) {
            this.id = id;
        }

        @SerializedName("id")
        @Expose
        private Integer id;

        public Produit(Integer id, String barCode, List<String> qualities, List<Object> defaults, String classe, String color, Object order, Double score) {
            this.id = id;
            this.barCode = barCode;
            this.qualities = qualities;
            this.defaults = defaults;
            this.classe = classe;
            this.color = color;
            this.order = order;
            this.score = score;
        }

        @SerializedName("barCode")
        @Expose
        private String barCode;
        @SerializedName("qualities")
        @Expose
        private List<String> qualities = null;
        @SerializedName("defaults")
        @Expose
        private List<Object> defaults = null;
        @SerializedName("classe")
        @Expose
        private String classe;
        @SerializedName("color")
        @Expose
        private String color;
        @SerializedName("order")
        @Expose
        private Object order;
        @SerializedName("score")
        @Expose
        private Double score;

        public Produit() {

        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getBarCode() {
            return barCode;
        }

        public void setBarCode(String barCode) {
            this.barCode = barCode;
        }

        public List<String> getQualities() {
            return qualities;
        }

        public void setQualities(List<String> qualities) {
            this.qualities = qualities;
        }

        public List<Object> getDefaults() {
            return defaults;
        }

        public void setDefaults(List<Object> defaults) {
            this.defaults = defaults;
        }

        public String getClasse() {
            return classe;
        }

        public void setClasse(String classe) {
            this.classe = classe;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public Object getOrder() {
            return order;
        }

        public void setOrder(Object order) {
            this.order = order;
        }

        public Double getScore() {
            return score;
        }

        public void setScore(Double score) {
            this.score = score;
        }

    }

