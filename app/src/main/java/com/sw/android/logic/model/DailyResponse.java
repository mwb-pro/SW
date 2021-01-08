package com.sw.android.logic.model;


import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;


public class DailyResponse {
    public Result result;
    public String status;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static  class Result {
        public  Daily daily;
    }

    public static  class Temperature {
        public Float max;
        public Float min;

        public Float getMax() {
            return max;
        }

        public void setMax(Float max) {
            this.max = max;
        }

        public Float getMin() {
            return min;
        }

        public void setMin(Float min) {
            this.min = min;
        }
    }

    public static  class Skycon {
        public String value;
        public Date date;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }
    }

    public static  class LifeIndex {
        public List<LifeDescription> coldRisk;
        public List<LifeDescription> carWashing;
        public List<LifeDescription> ultraviolet;
        public List<LifeDescription> dressing;

        public List<LifeDescription> getColdRisk() {
            return coldRisk;
        }

        public void setColdRisk(List<LifeDescription> coldRisk) {
            this.coldRisk = coldRisk;
        }

        public List<LifeDescription> getCarWashing() {
            return carWashing;
        }

        public void setCarWashing(List<LifeDescription> carWashing) {
            this.carWashing = carWashing;
        }

        public List<LifeDescription> getUltraviolet() {
            return ultraviolet;
        }

        public void setUltraviolet(List<LifeDescription> ultraviolet) {
            this.ultraviolet = ultraviolet;
        }

        public List<LifeDescription> getDressing() {
            return dressing;
        }

        public void setDressing(List<LifeDescription> dressing) {
            this.dressing = dressing;
        }
    }

    public static  class LifeDescription {
        public String desc;

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }
    }

    public static class Daily {
        public List<Temperature> temperature;
        public List<Skycon> skycon;
        @SerializedName("life_index")
        public LifeIndex lifeIndex;

        public List<Temperature> getTemperature() {
            return temperature;
        }

        public void setTemperature(List<Temperature> temperature) {
            this.temperature = temperature;
        }

        public List<Skycon> getSkycon() {
            return skycon;
        }

        public void setSkycon(List<Skycon> skycon) {
            this.skycon = skycon;
        }

        public LifeIndex getLifeIndex() {
            return lifeIndex;
        }

        public void setLifeIndex(LifeIndex lifeIndex) {
            this.lifeIndex = lifeIndex;
        }
    }
}




