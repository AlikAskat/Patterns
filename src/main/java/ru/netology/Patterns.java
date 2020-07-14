package ru.netology;

import lombok.Data;
import lombok.RequiredArgsConstructor;

public class Patterns {



    public static String getUserName(String s) {
        return null;
    }

    public static class AppDataGeneration {
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

        public static String getUserName() {
            return "Вася Вася";
        }
    }
}