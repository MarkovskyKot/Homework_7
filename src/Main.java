public class Main {
    public static void main(String[] args) {
        //Задача 1
        int deposit = 15000;
        int total = 0;
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
        int Deposit = 15000;
        int Month = 0;
        while (Deposit < 12_000_000) {
            Month++;
            Deposit = Deposit + Deposit / 100 * 7;
            System.out.println("Месяц " + Month + ". Сумма накоплений " + Deposit + " рублей");
        }
        System.out.println("12 миллионов накопится за " + Month + " месяцев");
        System.out.println();
        //Задача 5
        //Покуда эта задача - переделка предыдущей, зачем придумывать новые переменные
        //Можно ведь взять старые и присвоить базовые значения
        Deposit = 15000;
        Month = 0;
        while (Deposit < 12_000_000) {
            Month++;
            Deposit = Deposit + Deposit / 100 * 7;
            if (Month % 6 == 0) {
                System.out.println("Месяц " + Month + ". Сумма накоплений " + Deposit + " рублей");
            }
        }
        System.out.println();
        //Задача 6
        //Смотри комментарии к задаче №5
        Deposit = 15000;
        Month = 0;
        for (; Month <= (9 * 12); Month++) {
            Deposit = Deposit + Deposit / 100 * 7;
            if (Month % 6 == 0) {
                System.out.println("Месяц " + Month + ". Сумма накоплений " + Deposit + " рублей");
            }
        }
        System.out.println("За 9 лет Василий накопит " + Deposit + " рублей");
        System.out.println();
        //Задача 7
        int firstFriday = 1;
        for (int dayNumber = firstFriday; dayNumber <= 31; dayNumber++) {
            if ((dayNumber - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + dayNumber + "-е число. Необходимо подготовить отчет");
            }
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