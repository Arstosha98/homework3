public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        byte apple = 100;
        System.out.println("Значение переменной " + "apple " + "с типом byte " + "равно " + apple );
        short orange = 200;
        System.out.println("Значение переменной " + "orange " + "с типом short " + "равно " + orange);
        int paper = 45000;
        System.out.println("Значение переменной " + "paper " + "с типом int " + "равно " + paper);
        long toothPicks = 3000000000L;
        System.out.println("Значение переменной " + "toothPicks " + "с типом long " + "равно " + toothPicks);
        float fishWeight = 4.5f;
        System.out.println("Значение переменной " + "fishWeight " + "с типом float " + "равно " + fishWeight + " кг");
        double whaleWeight = 149.999999;
        System.out.println("Значение переменной " + "whaleWeight " + "с типом double " + "равно " + whaleWeight + " тонн");
    }
    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        System.out.println("Тип float, значение " + a);
        long b = 987678965549L;
        System.out.println("Тип long, значение " + b);
        double c = 2.786;
        System.out.println("Тип double, значение " + c);
        short d = 569;
        System.out.println("Тип short, значение " + d);
        short e = -159;
        System.out.println("Тип short, значение " + e);
        short f = 27897;
        System.out.println("Тип short, значение " + f);
        byte g = 67;
        System.out.println("Тип byte, значение " + g);
    }
    public static void task3() {
        System.out.println("Задача 3");
        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        short paperAll = 480;
        int paperForEachStudent = paperAll / (LP + AS + EA);
        System.out.println("На каждого ученика рассчитано " + paperForEachStudent + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte twoMinute = 16;
        int twentyMinute = twoMinute * 10;
        System.out.println("За 20 минут " + "машина произвела " + twentyMinute + " штук бутылок");
        int oneDay = twentyMinute * 3 * 24;
        System.out.println("За сутки " + "машина произвела " + oneDay + " штук бутылок");
        int threeDay = oneDay * 3;
        System.out.println("За три дня " + "машина произвела " + threeDay + " штук бутылок");
        int oneMonth = threeDay * 10;
        System.out.println("За месяц " + "машина произвела " + oneMonth + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte oneClassWhitePaint = 2;
        byte oneClassBrownPaint = 4;
        byte allClassesPaint = 120;
        int numberOfClasses = allClassesPaint / (oneClassBrownPaint + oneClassWhitePaint);
        int whitePaint = oneClassWhitePaint * numberOfClasses;
        int brownPaint = oneClassBrownPaint * numberOfClasses;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        byte bananaWeight = 80;
        int bananasWeight = 5 * bananaWeight;
        byte milkWeight = 105;
        int milksWeight = 2 * milkWeight;
        byte oneBriquetteIceCream = 100;
        int twoBriquetteIceCream = oneBriquetteIceCream * 2;
        byte egg = 70;
        int eggs = 4 * egg;
        int breakfast = bananasWeight + milksWeight + twoBriquetteIceCream + eggs;
        System.out.println("Вес спортзавтрака " + breakfast + " гр");
        float thousandGrams = 1000f;
        float breakfastValue = breakfast / thousandGrams;
        System.out.println("Вес спортзавтрака " + breakfastValue + " кг");
    }
    public static void task7() {
        System.out.println("Задача 7");
        short minWeight = 250;
        short maxWeight = 500;
        byte loseWeight = 7;
        int loseWeightInGrams = loseWeight * 1000;
        System.out.println("Нужно скинуть " + loseWeightInGrams + " гр");
        int loseMinWeight = loseWeightInGrams / minWeight;
        System.out.println(loseMinWeight + " дней понадобится на похудение, если спортсмен будет терять по " + minWeight + " гр каждый день");
        int loseMaxWeight = loseWeightInGrams / maxWeight;
        System.out.println(loseMaxWeight + " дней понадобится на похудение, если спортсмен будет терять по " + maxWeight + " гр каждый день");
        int averageValueWeight = (minWeight + maxWeight) / 2;
        System.out.println(averageValueWeight + " гр теряет спортсмен в среднем за один день");
        int averageDays = loseWeightInGrams / averageValueWeight;
        System.out.println("Потребуется в среднем " + averageDays + " дней, чтобы добиться результата");

    }
    public static void task8() {
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int cris = 76230;
        float moreMasha = masha * 1.1f;
        System.out.println(moreMasha + " зарплата Маши в месяц с 10% повышением");
        float moreDenis = denis * 1.1f;
        System.out.println(moreDenis + " зарплата Дениса в месяц с 10% повышением");
        float moreCris = cris * 1.1f;
        System.out.println(moreCris + " зарплата Кристины в месяц с 10% повышением");
        int mashaYear = masha * 12;
        int denisYear = denis * 12;
        int crisYear = cris * 12;
        float moreMashaYear = moreMasha * 12f;
        float moreDenisYear = moreDenis * 12f;
        float moreCrisYear = moreCris * 12f;
        double differenceMashaYear = moreMashaYear - mashaYear;
        System.out.println("Маша теперь получает " + moreMasha + " рублей. Годовой доход вырос на " + differenceMashaYear + " рублей");
        double differenceDenisYear = moreDenisYear - denisYear;
        System.out.println("Денис теперь получает " + moreDenis + " рублей. Годовой доход вырос на " + differenceDenisYear + " рублей");
        double differenceCrisYear = moreCrisYear - crisYear;
        System.out.println("Кристина теперь получает " + moreCris + " рублей. Годовой доход вырос на " + differenceCrisYear + " рублей");
    }
}