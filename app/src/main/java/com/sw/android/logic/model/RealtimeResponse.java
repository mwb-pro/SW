package com.sw.android.logic.model;

import com.google.gson.annotations.SerializedName;


public class RealtimeResponse {
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
        public  Realtime realtime;

        public Realtime getRealtime() {
            return realtime;
        }

        public void setRealtime(Realtime realtime) {
            this.realtime = realtime;
        }
    }

    public static  class AirQuality {
        public AQI aqi;

        public AQI getAqi() {
            return aqi;
        }

        public void setAqi(AQI aqi) {
            this.aqi = aqi;
        }
    }

    public static  class AQI {
        public Float chn;

        public Float getChn() {
            return chn;
        }

        public void setChn(Float chn) {
            this.chn = chn;
        }
    }

    public static class Realtime {
        public String skycon;
        public Float temperature;
        @SerializedName("air_quality")
        public AirQuality airQuality;

        public String getSkycon() {
            return skycon;
        }

        public void setSkycon(String skycon) {
            this.skycon = skycon;
        }

        public Float getTemperature() {
            return temperature;
        }

        public void setTemperature(Float temperature) {
            this.temperature = temperature;
        }

        public AirQuality getAirQuality() {
            return airQuality;
        }

        public void setAirQuality(AirQuality airQuality) {
            this.airQuality = airQuality;
        }
    }
}
