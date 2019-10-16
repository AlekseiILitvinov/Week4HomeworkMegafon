package ru.itpark;

import ru.itpark.model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BulletPoint megafonTv = new BulletPoint("https://TV_Url...", "Кино и сериалы в МегаФон ТВ");
        BulletPoint cashback = new BulletPoint("https://cashback...", "Кэшбэк до 30%");
        ArrayList<BulletPoint> bulletPoints = new ArrayList<>();
        bulletPoints.add(megafonTv);
        bulletPoints.add(cashback);

        ArrayList<String> highlights = new ArrayList<>();
        highlights.add("1200 минут");
        highlights.add("Безлимитный интернет");
        highlights.add("300 SMS");

        TurnOnTariff turnOnFirst = new TurnOnTariff("Смотри", highlights, 650, 30, "за 30 дней", bulletPoints);
        System.out.println(turnOnFirst);
        System.out.println("_______________________________________________________________");

        ArrayList<String> modemHighlights = new ArrayList<>();
        modemHighlights.add("Безлимитный интернет");
        ModemTariff modemTariffFirst = new ModemTariff(modemHighlights, 3100, 6,
                "Трафик без ограничений для использования дома и в поездках по России\n");
        System.out.println(modemTariffFirst);
        System.out.println("_______________________________________________________________");

        ArrayList<String> modemHighlights2 = new ArrayList<>();
        modemHighlights2.add("Оплата трафика по факту использования");
        ModemTariff modemTariffThird = new ModemTariff("МегаФон — Онлайн", modemHighlights2, 0, "в месяц",
                "Базовый тариф для подключения интернет-опций и использования на устройствах\n");
        System.out.println(modemTariffThird);
        System.out.println("_______________________________________________________________");

        ArrayList<String> highlightsBySecond = new ArrayList<>();
        highlightsBySecond.add("Посекундная тарификация");
        OtherTariffRestricted bySecondTariff = new OtherTariffRestricted("Посекундный", highlightsBySecond, 0, -1,
                "Тариф без абонентской платы\n");
        System.out.println(bySecondTariff);
        System.out.println("_______________________________________________________________");

        ArrayList<String> smartGadgetsHighlights = new ArrayList<>();
        smartGadgetsHighlights.add("Безлимитный интернет");
        smartGadgetsHighlights.add("Звонки и SMS на номера России");
        OtherTariffCommon smartGadgets = new OtherTariffCommon("Умные вещи", smartGadgetsHighlights, 20,
                "Тариф для умных устройств\n", "в неделю");
        System.out.println(smartGadgets);
        System.out.println("_______________________________________________________________");


    }
}
