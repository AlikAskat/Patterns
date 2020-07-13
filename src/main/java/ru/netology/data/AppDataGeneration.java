package ru.netology.data;


import com.github.javafaker.Faker;
import sun.util.resources.LocaleData;

import java.util.Locale;

public class AppDataGeneration {
    private AppDataGeneration() {
    }

    public static class AutoData {
        private static String locale;
        private static Object userName;
        private static Object phoneNumber;
        private static Object cityName;

        private AutoData() {
        }

        public static AutoDataByInfo generateByInfo(Object userName, Object phoneNumber, Object cityName) {
            return generateByInfo(AutoData.userName, AutoData.phoneNumber, AutoData.cityName);
        }

        public static AutoDataByInfo generateByInfo(String locale, Object UserName, Object PhoneNumber, Object CityName) {
            AutoData.locale = locale;
            cityName = CityName;
            userName = UserName;
            phoneNumber = PhoneNumber;

            Faker faker = new Faker(new Locale("CityName"));
            Faker faker = new Faker(new Locale("UserName"));
            Faker faker = new Faker(new Locale("PhoneNumber"));
            return new AutoDataByInfo(
                    faker.address().cityName(CityName),
                    faker.name().fullName(UserName),
                    faker.number().digit(PhoneNumber),
                    LocaleData.getBundle().getObject()
            );
        }

        public static String getLocale() {
            return locale;
        }
    }
}



//    @Data
//    @Generated
//    @Value
//
//public static class AutoData {
//
//        private String CityName;
//        //private String Date;
//        private String Name;
//        private int PhoneNumber;
//
//
//        public AutoData(String cityName) {
//
//        }
//
//        public AutoData(String name) {
//
//        }
//
//        public AutoData(Object phoneNumber) {
//
//        }
//    }
//
//
//    public static AutoData getAutoData() {
//        return new AutoData("CityName");
//    }
//
//    public static AutoData getOtherAutoData(AutoData original) {
//        return new AutoData("name");
//    }
//
//
//    public int AutoData getOtherAutoData(AutoData original) {
//        return new AutoData ("PhoneNumber");
//    }
//}

