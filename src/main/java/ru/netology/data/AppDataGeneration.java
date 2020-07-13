package ru.netology.data;


import lombok.Data;
import lombok.RequiredArgsConstructor;

public class AppDataGeneration {
    private AppDataGeneration() {
    }

    @Data
    @RequiredArgsConstructor

    public static class AutoData {
        private final String CityName;
        private final String Date;
        private final String UserName;
        private final String Phone;
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
}








