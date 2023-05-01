package com.brutus.abio.persistance.product;

import eu.europa.esig.dss.enumerations.UriBasedEnum;

import java.util.HashMap;
import java.util.Map;

public enum ColorEnum implements UriBasedEnum {

    WhiteTransparent("White / Transparent", "Белый / Прозрачный", "Սպիտակ / Թափանցիկ"),
    Black("Black", "Черный", "Սև"),
    Blue("Blue", "Синий", "Կապույտ"),
    Red("Red", "Красный", "Կարմիր"),
    Green("Green", "Зеленый", "Կանաչ"),
    Yellow("Yellow", "Желтый", "Դեղին"),
    Brown("Brown", "Коричневый", "Շագանակագույն"),
    Gray("Gray", "Серый", "Մոխրագույն"),
    Beige("Beige", "Бежевый", "Կաթնագույն"),
    Purple("Purple / Lilac", "Фиолетовый / Сиреневый", "Մանուշակագույն"),
    Multi_colored("Multi-coloured / Patterned", "Цветной / С рисунком",
            "Գունավոր / նկարներով");

    private final String name_en;
    private final String name_ru;
    private final String name_am;

    ColorEnum(String name_en, String name_ru, String name_am) {
        this.name_en = name_en;
        this.name_ru = name_ru;
        this.name_am = name_am;
    }

    public static ColorEnum forRussian(String readable) {
        return readable != null && !readable.isEmpty() ? (ColorEnum)
                Registry.QUALIFS_BY_READABLE_RU.get(readable) : null;
    }

    public static ColorEnum forEnglish(String readable) {
        return readable != null && !readable.isEmpty() ? (ColorEnum)
                Registry.QUALIFS_BY_READABLE_EN.get(readable) : null;
    }

    public static ColorEnum forArmenian(String readable) {
        return readable != null && !readable.isEmpty() ? (ColorEnum)
                Registry.QUALIFS_BY_READABLE_AM.get(readable) : null;
    }


    private static class Registry {
        private static final Map<String, ColorEnum> QUALIFS_BY_READABLE_RU = registerByReadableRU();
        private static final Map<String, ColorEnum> QUALIFS_BY_READABLE_EN = registerByReadableEN();
        private static final Map<String, ColorEnum> QUALIFS_BY_READABLE_AM = registerByReadableAM();

        private Registry() {
        }

        private static Map<String, ColorEnum> registerByReadableRU() {
            Map<String, ColorEnum> map = new HashMap();
            ColorEnum[] var1 = ColorEnum.values();
            int var2 = var1.length;

            for (int var3 = 0; var3 < var2; ++var3) {
                ColorEnum qualification = var1[var3];
                map.put(qualification.name_ru, qualification);
            }

            return map;
        }

        private static Map<String, ColorEnum> registerByReadableEN() {
            Map<String, ColorEnum> map = new HashMap();
            ColorEnum[] var1 = ColorEnum.values();
            int var2 = var1.length;

            for (int var3 = 0; var3 < var2; ++var3) {
                ColorEnum qualification = var1[var3];
                map.put(qualification.name_en, qualification);
            }

            return map;
        }

        private static Map<String, ColorEnum> registerByReadableAM() {
            Map<String, ColorEnum> map = new HashMap();
            ColorEnum[] var1 = ColorEnum.values();
            int var2 = var1.length;

            for (int var3 = 0; var3 < var2; ++var3) {
                ColorEnum qualification = var1[var3];
                map.put(qualification.name_am, qualification);
            }

            return map;
        }

    }


    public String getName_ru() {
        return this.name_ru;
    }

    public String getName_en() {
        return this.name_en;
    }

    public String getName_am() {
        return this.name_am;
    }

    public String getUri() {
        return this.name_en;
    }

}
