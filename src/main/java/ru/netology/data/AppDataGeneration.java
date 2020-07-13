package ru.netology.data;


import lombok.Data;
import lombok.RequiredArgsConstructor;

public class AppDataGeneration {
    private AppDataGeneration() {
    }

    @Data
    @RequiredArgsConstructor

    public static class AutoData {
        private final String cityName;
        private final String date;
        private final String userName;
        private final String phone;
    }
}

//    public static AutoData getAutoData("CityName") {
//        return new AutoData("парапам");
//    }
//
//    public static AutoData getOtherAutoData("Date") {
//        return new AutoData("");
//
//    }
//
//    public static AutoData getOtherAutoData("UserName") {
//        return new AutoData("");
//
//    }
//
//    public static AutoData getOtherAutoData("Phone") {
//        return new AutoData("");
//
//    }









