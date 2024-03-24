public class Main {
    public static void main(String[] args) {
        //Задача 1
        double deposit = 15000;
        double total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            month++;
            total = total + deposit;
            total = total + total / 100;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Чтобы накопить 2459000 рублей понадобится " + month + " месяцев");
        System.out.println();
        //Задача 2
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; ) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();
        //Задача 3
        int population = 12_000_000;
        float birthRate = 0.017f;
        float deathRate = 0.008f;
        for (int year = 1; year <= 10; year++) {
            System.out.println("Год " + year + ", родилось - " + (int) (population * birthRate) + " человек; умерло - "
                    + (int) (population * deathRate) + " человек");
            System.out.println("Прирост населения - " + (int) (population * birthRate - population * deathRate));
            population = (int) (population + population * (birthRate - deathRate));
            //Следующая команда выводит цель задачи, а то, что выше - как будто бы официальная статистика
            System.out.println("Численность населения составляет " + population);
        }
        System.out.println();
        //Задача 4
        double bankDeposit = 15000;
        double monthCounter = 0;
        while (bankDeposit < 12_000_000) {
            monthCounter++;
            bankDeposit = bankDeposit + bankDeposit / 100 * 7;
            System.out.println("Месяц " + monthCounter + ". Сумма накоплений ~ " + (int) (bankDeposit) + " рублей");
        }
        System.out.println("12 миллионов накопится за " + monthCounter + " месяцев");
        System.out.println();
        //Задача 5
        //Покуда эта задача - переделка предыдущей, зачем придумывать новые переменные
        //Можно ведь взять старые и присвоить базовые значения
        bankDeposit = 15000;
        monthCounter = 0;
        while (bankDeposit < 12_000_000) {
            monthCounter++;
            bankDeposit = bankDeposit + bankDeposit / 100 * 7;
            if (monthCounter % 6 == 0) {
                System.out.println("Месяц " + monthCounter + ". Сумма накоплений " + bankDeposit + " рублей");
            }
        }
        System.out.println();
        //Задача 6
        //Смотри комментарии к задаче №5
        bankDeposit = 15000;
        monthCounter = 0;
        for (; monthCounter <= (9 * 12); monthCounter++) {
            bankDeposit = bankDeposit + bankDeposit / 100 * 7;
            if (monthCounter % 6 == 0) {
                System.out.println("Месяц " + monthCounter + ". Сумма накоплений ~ " + (int) (bankDeposit) + " рублей");
            }
        }
        System.out.println("За 9 лет Василий накопит ~ " + (int) (bankDeposit) + " рублей");
        System.out.println();
        //Задача 7
        //Так лучше?
        int fridayNumber = 2;
        while (fridayNumber <= 31) {
            System.out.println("Сегодня пятница, " + fridayNumber + "-е число. Необходимо подготовить отчет");
            fridayNumber = fridayNumber + 7;
        }
        System.out.println();
        //Задача 8
        int year = 2024;
        for (int y = year - 200; y <= year + 100; y++) {
            if (y % 79 == 0) {
                System.out.println(y);
            }
        }
    }
}