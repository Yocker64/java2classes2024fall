package task17;

class Eto {
    static int year;
    static String[] ETOS = { "申", "酉", "戌", "亥", "子", "丑", "寅", "卯", "辰", "巳", "午", "未" };

    static String calc(int year) {
        return ETOS[year % 12];
    }
}
