

    public static void main(String[] args) {
        // Тесты для Задачи 1
        System.out.println("--- Задача 1 ---");
        checkLeapYear(2020);
        checkLeapYear(2021);

        // Тесты для Задачи 2
        System.out.println("\n--- Задача 2 ---");
        suggestAppVersion(0, 2014); // iOS, старый
        suggestAppVersion(1, 2026); // Android, современный

        // Тесты для Задачи 3
        System.out.println("\n--- Задача 3 ---");
        int distance = 95;
        int days = calculateDeliveryDays(distance);
        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки нет.");
        }

    }
    // Задача 1: Проверка високосного года
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный год.");
        } else {
            System.out.println(year + " год — невисокосный год.");
        }
    }

    // Задача 2: Рекомендация версии приложения
    public static void suggestAppVersion(int osType, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        // Переменная для названия ОС, чтобы избежать дублирования текста
        String osName = (osType == 0) ? "iOS" : "Android";

        if (clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для " + osName + " по ссылке");
        } else {
            System.out.println("Установите обычную версию приложения для " + osName + " по ссылке");
        }
    }

    // Задача 3: Расчет дней доставки
    public static int calculateDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1; // Минимальный срок — 1 день

        if (deliveryDistance <= 20) {
            return deliveryDays;
        } else if (deliveryDistance <= 60) {
            return deliveryDays + 1;
        } else if (deliveryDistance <= 100) {
            return deliveryDays + 2;
        } else {
            return -1; // Сигнализирует о том, что доставки нет
        }
    }
