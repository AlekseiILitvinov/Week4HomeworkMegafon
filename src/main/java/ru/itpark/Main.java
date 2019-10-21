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

        TurnOnTariff turnOnWatch = new TurnOnTariff(
                "Смотри",
                highlights,
                true,
                false,
                650,
                bulletPoints,
                false,
                1200,
                -1,
                300);
        System.out.println(turnOnWatch);
        System.out.println("_______________________________________________________________");

        ArrayList<String> highlights2 = new ArrayList<>();
        highlights2.add("600 минут");
        highlights2.add("Безлимитный интернет");

        BulletPoint alwaysOnline = new BulletPoint("https://alwaysOnline_Url...", "Всегда оставайтесь на связи");
        ArrayList<BulletPoint> bulletPoints2 = new ArrayList<>();
        bulletPoints2.add(alwaysOnline);
        bulletPoints2.add(cashback);

        TurnOnTariff turnOnTalk = new TurnOnTariff(
                "Общайся",
                highlights2,
                true,
                false,
                350,
                bulletPoints2,
                true,
                600,
                -1,
                0);
        System.out.println(turnOnTalk);
        System.out.println("_______________________________________________________________");

        ArrayList<String> highlights3 = new ArrayList<>();
        highlights3.add("100 минут");
        highlights3.add("10 ГБ");

        BulletPoint popularServices = new BulletPoint("https://alwaysOnline_Url...", "Безлимитный интернет на популярные сервисы");
        ArrayList<BulletPoint> bulletPoints3 = new ArrayList<>();
        bulletPoints3.add(popularServices);
        bulletPoints3.add(cashback);

        TurnOnTariff turnOnEntertain = new TurnOnTariff(
                "Развлекайся",
                highlights3,
                true,
                false,
                300,
                bulletPoints3,
                false,
                100,
                10,
                0);
        System.out.println(turnOnEntertain);
        System.out.println("_______________________________________________________________");


        ArrayList<String> modemHighlights = new ArrayList<>();
        modemHighlights.add("Безлимитный интернет");
        ModemTariff modemTariffFirst = new ModemTariff("Твой безлимит",
                modemHighlights,
                true,
                false,
                3100,
                6,
                "месяцев",
                "Трафик без ограничений для использования дома и в поездках по России\n");
        System.out.println(modemTariffFirst);
        System.out.println("_______________________________________________________________");

        ModemTariff modemTariffSecond = new ModemTariff("Твой безлимит",
                modemHighlights,
                true,
                false,
                5100,
                12,
                "месяцев",
                "Трафик без ограничений для использования дома и в поездках по России\n");
        System.out.println(modemTariffSecond);
        System.out.println("_______________________________________________________________");

        ArrayList<String> modemHighlights2 = new ArrayList<>();
        modemHighlights2.add("Оплата трафика по факту использования");
        ModemTariff modemTariffThird = new ModemTariff("МегаФон — Онлайн",
                modemHighlights2,
                false,
                false,
                0,
                1,
                "месяц",
                "Оплата трафика по факту использования\n");
        System.out.println(modemTariffThird);
        System.out.println("_______________________________________________________________");

        ArrayList<String> highlightsBySecond = new ArrayList<>();
        highlightsBySecond.add("Посекундная тарификация");
        OtherTariffRestricted bySecondTariff = new OtherTariffRestricted(
                "Посекундный",
                highlightsBySecond,
                false,
                false,
                0,
                1,
                "",
                "Тариф без абонентской платы\n",
                false,
                0);
        System.out.println(bySecondTariff);
        System.out.println("_______________________________________________________________");

        ArrayList<String> highlightsHello = new ArrayList<>();
        highlightsHello.add("Посекундная тарификация");
        OtherTariffRestricted HelloTariff = new OtherTariffRestricted(
                "#Hello",
                highlightsHello,
                false,
                false,
                750,
                14,
                "дней",
                "Тариф для иностранных туристов\n",
                true,
                30);
        System.out.println(HelloTariff);
        System.out.println("_______________________________________________________________");

        ArrayList<String> smartGadgetsHighlights = new ArrayList<>();
        smartGadgetsHighlights.add("Безлимитный интернет");
        smartGadgetsHighlights.add("Звонки и SMS на номера России");
        OtherTariff smartGadgets = new OtherTariff(
                "Умные вещи",
                smartGadgetsHighlights,
                true,
                false,
                20,
                1,
                "в неделю",
                "Тариф для умных устройств\n");
        System.out.println(smartGadgets);
        System.out.println("_______________________________________________________________");


    }
}
