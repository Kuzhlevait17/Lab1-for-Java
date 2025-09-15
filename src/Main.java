import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Assignments assignment = new Assignments();
        boolean run = true;
        while (run) {
            System.out.println("""
                
                Добро пожаловать!
                
                Всего доступно 20 задач,
                они разбиты на отделы по 5 задач в каждом.
                Вы можете выбрать любой отдел и посмотреть задачи.
                
                Отдел 1. Методы
                Отдел 2. Условия
                Отдел 3. Циклы
                Отдел 4. Массивы
                Отдел 5. Выход из программы.
                """);
            int department;
            while (true) {
                System.out.print("Выберите номер отдела: ");
                String line = keyboard.next().trim();
                try {
                    department = Integer.parseInt(line);
                    System.out.println();
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка. Введено неверное исло.");
                }
            }
            switch (department) {
                case 1: {
                    boolean firstDepartment = true;
                    while (firstDepartment) {
                        System.out.println("""
                                Доступные задачи на выбор:
                                1. Сумма знаков
                                2. Есть ли позитив
                                3. Большая буква
                                4. Делитель
                                5. Многократный вызов
                                6. Выход из отдела
                                """);
                        int taskNumber;
                        while (true) {
                            System.out.print("Выберите номер задачи(1,2,3,4,5,6): ");
                            String line = keyboard.next().trim();
                            try {
                                taskNumber = Integer.parseInt(line);
                                System.out.println();
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Ошибка. Введено неверное число.");
                            }
                        }
                        switch (taskNumber) {
                            case 1: {
                                System.out.println("""
                                           Сумма знаков.
                                            Дана сигнатура метода: public int sumLastNums (int x);
                                            Необходимо реализовать метод таким образом, чтобы он возвращал результат
                                            сложения двух последних знаков числах, предполагая, что знаков в числе не
                                            менее двух. Подсказки:
                                            int x=123%10; // х будет иметь значение 3
                                            int у=123/10; // у будет иметь значение 12
                                            Пример:
                                            x=4568
                                            результат: 14
                                           """);
                                int userNumber;
                                while (true) {
                                    System.out.print("Выберите целое число: ");
                                    String line = keyboard.next().trim();
                                    try {
                                        userNumber = Integer.parseInt(line);
                                        System.out.println();
                                        int digitCount = (int) (Math.log10(Math.abs(userNumber)) + 1);
                                        if (digitCount <= 1) {
                                            System.out.println("Разрядность числа должна быть больше двух.");
                                            continue;
                                        }
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Ошибка. Введено неверное число.");
                                    }
                                }

                                int result = assignment.sumLastNums(userNumber);
                                System.out.println("Результат: " + result);
                                System.out.println();
                                System.out.println();
                                break;
                            }
                            case 2: {
                                    System.out.println("""
                                            Есть ли позитив.
                                            Дана сигнатура метода: public bool isPositive (int x);
                                            Необходимо реализовать метод таким образом, чтобы он принимал число x и
                                            возвращал true, если оно положительное.
                                            Пример 1:
                                            x=3
                                            результат: true
                                            Пример 2:
                                            x=-5
                                            результат: false
                                            """);
                                    System.out.print("Введите целое число: ");
                                    int userNumber;
                                    while (true) {
                                        System.out.print("Выберите целое число: ");
                                        String line = keyboard.next().trim();
                                        try {
                                            userNumber = Integer.parseInt(line);
                                            System.out.println();
                                            break;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Ошибка. Введено неверное число.");
                                        }
                                    }
                                    if (userNumber == 0) {
                                        System.out.println("Число 0 не является ни положительным, ни отрицательным.");
                                    } else {
                                        boolean result = assignment.isPositive(userNumber);
                                        System.out.println("Результат: " + result);
                                    }
                                    System.out.println();
                                    System.out.println();
                                    break;
                            }
                            case 3: {
                                System.out.println("""
                                        Большая буква.
                                        Дана сигнатура метода: public bool isUpperCase (char x);
                                        Необходимо реализовать метод таким образом, чтобы он принимал символ x и
                                        возвращал true, если это большая буква в диапазоне от ‘A’ до ‘Z’.
                                        Пример 1:
                                        x=’D’
                                        результат: true
                                        Пример 2:
                                        x=’q’
                                        результат: false
                                        """);
                                char userLetter;
                                while (true) {
                                    String input;
                                    System.out.print("Введите букву латинского алфавита: ");
                                    input = keyboard.next().trim();
                                    if (input.length() != 1) {
                                        System.out.println("Ошибка! Введен неверный символ");
                                        continue;
                                    }
                                    userLetter = input.charAt(0);
                                    if ((userLetter >= 'A' && userLetter <= 'Z') || (userLetter >= 'a' && userLetter <= 'z')) {
                                        break;
                                    } else {
                                        System.out.println("Введён неверный символ.");
                                    }


                                }
                                boolean result = assignment.isUpperCase(userLetter);
                                System.out.println("Результат: " + result);
                                System.out.println();
                                System.out.println();
                                break;
                            }
                            case 4: {
                                    System.out.println("""
                                            Делитель.
                                            Дана сигнатура метода: public bool isDivisor (int a, int b);
                                            Необходимо реализовать метод таким образом, чтобы он возвращал true, если
                                            любое из принятых чисел делит другое нацело.
                                            Пример 1:
                                            a=3 b=6
                                            результат: true
                                            Пример 2:
                                            a=2 b=15
                                            результат: false
                                            """);
                                    int firstNumber;
                                    while (true) {
                                        System.out.print("Введите значение первого числа: ");
                                        String line = keyboard.next().trim();
                                        try {
                                            firstNumber = Integer.parseInt(line);
                                            System.out.println();
                                            break;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Ошибка. Введено неверное число.");
                                        }
                                    }
                                    int secondNumber;
                                    while (true) {
                                        System.out.print("Введите значение второго числа: ");
                                        String line = keyboard.next().trim();
                                        try {
                                            secondNumber = Integer.parseInt(line);
                                            System.out.println();
                                            break;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Ошибка. Введено неверное число.");
                                        }
                                    }
                                    boolean result = assignment.isDivisor(firstNumber, secondNumber);
                                    System.out.println("Результат: " + result);
                                    System.out.println();
                                    System.out.println();
                                    break;
                            }
                            case 5: {
                                    System.out.println("""
                                            Многократный вызов.
                                            Дана сигнатура метода: public int lastNumSum(int a, int b)
                                            Необходимо реализовать метод таким образом, чтобы он считал сумму цифр
                                            двух чисел из разряда единиц. Выполните с его помощью последовательное
                                            сложение пяти чисел и результат выведите на экран. Постарайтесь выполнить
                                            задачу, используя минимально возможное количество вспомогательных
                                            переменных.
                                            Пример:
                                            5+11 это 6
                                            6+123 это 9
                                            9+14 это 13
                                            13+1 это 4
                                            Итого 4
                                            """);
                                    System.out.println("Вам необходимо ввестии пять целых чисел.");
                                    int firstNumber, secondNumber, result;
                                    while (true) {
                                        System.out.print("Введите значение первого числа: ");
                                        String line = keyboard.next().trim();
                                        try {
                                            firstNumber = Integer.parseInt(line);
                                            System.out.println();
                                            break;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Ошибка. Введено неверное число.");
                                        }
                                    }
                                    while (true) {
                                        System.out.print("Введите значение второго числа: ");
                                        String line = keyboard.next().trim();
                                        try {
                                            secondNumber = Integer.parseInt(line);
                                            System.out.println();
                                            break;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Ошибка. Введено неверное число.");
                                        }
                                    }
                                    result = assignment.lastNumSum(firstNumber, secondNumber);
                                    while (true) {
                                        System.out.print("Введите значение третьего числа: ");
                                        String line = keyboard.next().trim();
                                        try {
                                            firstNumber = Integer.parseInt(line);
                                            System.out.println();
                                            break;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Ошибка. Введено неверное число.");
                                        }
                                    }
                                    secondNumber = result;
                                    result = assignment.lastNumSum(firstNumber, secondNumber);
                                    while (true) {
                                        System.out.print("Введите значение четвертого числа: ");
                                        String line = keyboard.next().trim();
                                        try {
                                            firstNumber = Integer.parseInt(line);
                                            System.out.println();
                                            break;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Ошибка. Введено неверное число.");
                                        }
                                    }
                                    secondNumber = result;
                                    result = assignment.lastNumSum(firstNumber, secondNumber);
                                    while (true) {
                                        System.out.print("Введите значение пятого числа: ");
                                        String line = keyboard.next().trim();
                                        try {
                                            firstNumber = Integer.parseInt(line);
                                            System.out.println();
                                            break;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Ошибка. Введено неверное число.");
                                        }
                                    }
                                    secondNumber = result;
                                    result = assignment.lastNumSum(firstNumber, secondNumber);
                                    System.out.print("Результат: " + result);
                                    System.out.println();
                                    System.out.println();
                                    break;
                            }
                            case 6: {
                                    firstDepartment = false;
                                    break;
                            }
                            default: {
                                    System.out.println("Извините, вы ввели неверное значение.");
                                    break;
                                }
                        }
                    }
                    break;
                }
                case 2: {
                    boolean secondDepartment = true;
                    while (secondDepartment) {
                        System.out.println("""
                                Доступные задачи на выбор:
                                1. Безопасное деление
                                2. Строка сравнения
                                3. Тройная сумма
                                4. Возраст
                                5. Вывод дней недели
                                6. Выход из отдела
                                """);
                        int taskNumber;
                        while (true) {
                            System.out.print("Выберите номер задачи(1,2,3,4,5,6): ");
                            String line = keyboard.next().trim();
                            try {
                                taskNumber = Integer.parseInt(line);
                                System.out.println();
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Ошибка. Введено неверное число.");
                            }
                        }
                        switch (taskNumber) {
                            case 1: {
                                System.out.println("""
                                        Безопасное деление.
                                        Дана сигнатура метода: public double safeDiv (int x, int y);
                                        Необходимо реализовать метод таким образом, чтобы он возвращал деление x
                                        на y, и при этом гарантировал, что не будет выкинута ошибка деления на 0. При
                                        делении на 0 следует вернуть из метода число 0. Подсказка: смотри
                                        ограничения на операции типов данных.
                                        Пример 1:
                                        x=5 y=0
                                        результат: 0
                                        Пример 2:
                                        x=8 y=2
                                        результат: 4
                                        """);
                                int firstNumber;
                                while (true) {
                                    System.out.print("Введите значение первого числа: ");
                                    String line = keyboard.next().trim();
                                    try {
                                        firstNumber = Integer.parseInt(line);
                                        System.out.println();
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Ошибка. Введено неверное число.");
                                    }
                                }
                                int secondNumber;
                                while (true) {
                                    System.out.print("Введите значение второго числа: ");
                                    String line = keyboard.next().trim();
                                    try {
                                        secondNumber = Integer.parseInt(line);
                                        System.out.println();
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Ошибка. Введено неверное число.");
                                    }
                                }
                                double result = assignment.safeDiv(firstNumber, secondNumber);
                                System.out.println("Результат: " + result);
                                System.out.println();
                                System.out.println();
                                break;
                            }
                            case 2: {
                                System.out.println("""
                                        Строка сравнения.
                                        Дана сигнатура метода: public String makeDecision (int x, int y);
                                        Необходимо реализовать метод таким образом, чтобы он возвращал строку,
                                        которая включает два принятых методом числа и корректно выставленный
                                        знак операции сравнения (больше, меньше, или равно).
                                        Пример 1:
                                        x=5 y=7
                                        результат: “5< 7”
                                        Пример 2:
                                        x=8 y=-1
                                        результат: “8 >-1”
                                        Пример 3:
                                        x=4 y=4
                                        результат: “4==4”
                                        """);
                                int firstNumber;
                                while (true) {
                                    System.out.print("Введите значение первого числа: ");
                                    String line = keyboard.next().trim();
                                    try {
                                        firstNumber = Integer.parseInt(line);
                                        System.out.println();
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Ошибка. Введено неверное число.");
                                    }
                                }
                                int secondNumber;
                                while (true) {
                                    System.out.print("Введите значение второго числа: ");
                                    String line = keyboard.next().trim();
                                    try {
                                        secondNumber = Integer.parseInt(line);
                                        System.out.println();
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Ошибка. Введено неверное число.");
                                    }
                                }
                                String result = assignment.makeDecision(firstNumber, secondNumber);
                                System.out.println("Результат: " + firstNumber + " " + result + " " + secondNumber);
                                System.out.println();
                                System.out.println();
                                break;
                            }
                            case 3: {
                                System.out.println("""
                                        Тройная сумма.
                                        Дана сигнатура метода: public bool sum3 (int x, int y, int z);
                                        Необходимо реализовать метод таким образом, чтобы он возвращал true, если
                                        два любых числа (из трех принятых) можно сложить так, чтобы получить
                                        третье.
                                        Пример 1:
                                        x=5 y=7 z=2
                                        результат: true
                                        Пример 2:
                                        x=8 y=-1 z=4
                                        результат: false
                                        """);
                                System.out.println("Вам необходимо будет ввести три числа.");
                                int firstNumber;
                                while (true) {
                                    System.out.print("Введите значение первого числа: ");
                                    String line = keyboard.next().trim();
                                    try {
                                        firstNumber = Integer.parseInt(line);
                                        System.out.println();
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Ошибка. Введено неверное число.");
                                    }
                                }

                                int secondNumber;
                                while (true) {
                                    System.out.print("Введите значение второго числа: ");
                                    String line = keyboard.next().trim();
                                    try {
                                        secondNumber = Integer.parseInt(line);
                                        System.out.println();
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Ошибка. Введено неверное число.");
                                    }
                                }
                                int thirdNumber;
                                while (true) {
                                    System.out.print("Введите третье целое число: ");
                                    String line = keyboard.next().trim();
                                    try {
                                        thirdNumber = Integer.parseInt(line);
                                        System.out.println();
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Ошибка. Введено неверное число.");
                                    }
                                }
                                boolean result = assignment.sum3(firstNumber, secondNumber, thirdNumber);
                                System.out.println("Результат: " + result);
                                System.out.println();
                                System.out.println();
                                break;
                            }
                            case 4: {
                                System.out.println("""
                                        Возраст.
                                        Дана сигнатура метода: public String age (int x);
                                        Необходимо реализовать метод таким образом, чтобы он возвращал строку, в
                                        которой сначала будет число х, а затем одно из слов:
                                        год
                                        года
                                        лет
                                        Слово “год” добавляется, если число х заканчивается на 1, кроме числа 11.
                                        Слово “года” добавляется, если число х заканчивается на 2, 3 или 4, кроме чисел
                                        12, 13, 14.
                                        Слово “лет”добавляется во всех остальных случаях.
                                        Подсказка: оператор % позволяет получить остаток от деления.
                                        Пример 1:
                                        x=5
                                        результат: “5 лет”
                                        Пример 2:
                                        x=31
                                        результат: “31 год”
                                        Пример 3:
                                        x=44
                                        результат: “44 года”
                                        """);
                                int userAge;
                                while (true) {
                                    System.out.print("Введите возраст человека: ");
                                    String line = keyboard.next().trim();
                                    try {
                                        userAge = Integer.parseInt(line);
                                        System.out.println();
                                        if (userAge <= 0 || (userAge >= 130)) {
                                            System.out.println("Извините, вы ввели неверное значение.");
                                            continue;
                                        }

                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Ошибка. Введено неверное число.");
                                    }
                                }

                                String result = assignment.age(userAge);
                                System.out.println("Результат: " + userAge + " " + result);
                                System.out.println();
                                System.out.println();
                                break;
                            }
                            case 5: {
                                System.out.println("""
                                        Вывод дней недели.
                                        Дана сигнатура метода: public void printDays (String x);
                                        В качестве параметра метод принимает строку, в которой записано название
                                        дня недели. Необходимо реализовать метод таким образом, чтобы он выводил
                                        на экран название переданного в него дня и всех последующих до конца недели
                                        дней. Если в качестве строки передан не день, то выводится текст “это не день
                                        недели”. Первый день понедельник, последний – воскресенье. Вместо if в данной
                                        задаче используйте switch.
                                        Пример 1:
                                        x=”четверг”
                                        результат:
                                        четверг
                                        пятница
                                        суббота
                                        воскресенье
                                        Пример 2:
                                        x=”чг”
                                        результат:
                                        это не день недели
                                        """);
                                System.out.print("Введите день недели: ");
                                String userDay = keyboard.next().toLowerCase();
                                assignment.printDays(userDay);
                                System.out.println();
                                System.out.println();
                                break;
                            }
                            case 6: {
                                secondDepartment = false;
                                break;
                            }
                            default: {
                                System.out.println("Извините, вы ввели неверное значение.");
                                break;
                            }
                        }
                    }
                    break;
                }
                case 3: {
                    boolean thirdDepartment = true;
                    while (thirdDepartment) {
                        System.out.println("""
                                Доступные задачи на выбор
                                1. Число наоборот
                                2. Степень числа
                                3. Одинаковость
                                4. Левый треугольник
                                5. Угадайка
                                6. Выход из отдела
                                """);
                        int taskNumber;
                        while (true) {
                            System.out.print("Выберите номер задачи(1,2,3,4,5,6): ");
                            String line = keyboard.next().trim();
                            try {
                                taskNumber = Integer.parseInt(line);
                                System.out.println();
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Ошибка. Введено неверное число.");
                            }
                        }
                        switch (taskNumber) {
                            case 1: {
                                System.out.println("""
                                        Числа наоборот.
                                        Дана сигнатура метода: public String reverseListNums (int x);
                                        Необходимо реализовать метод таким образом, чтобы он возвращал строку, в
                                        которой будут записаны все числа от x до 0 (включительно).
                                        Пример:
                                        x=5
                                        результат: “5 4 3 2 1 0”
                                        """);
                                int userNumber;
                                while (true) {
                                    System.out.print("Выберите целое число: ");
                                    String line = keyboard.next().trim();
                                    try {
                                        userNumber = Integer.parseInt(line);
                                        System.out.println();
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Ошибка. Введено неверное число.");
                                    }
                                }
                                String result = assignment.reserveListNums(userNumber);
                                System.out.println("Результат: " + result);
                                System.out.println();
                                System.out.println();
                                break;
                            }
                            case 2: {
                                System.out.println("""
                                        Степень числа.
                                        Дана сигнатура метода: public int pow (int x, int y);
                                        Необходимо реализовать метод таким образом, чтобы он возвращал результат
                                        возведения x в степень y.
                                        Подсказка: для получения степени необходимо умножить единицу на число x, и
                                        сделать это y раз, т.е. два в третьей степени это 1*2*2*2
                                        Пример:
                                        x=2
                                        y=5
                                        результат: 32
                                        """);
                                int firstNumber;
                                while (true) {
                                    System.out.print("Введите значение первого числа: ");
                                    String line = keyboard.next().trim();
                                    try {
                                        firstNumber = Integer.parseInt(line);
                                        System.out.println();
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Ошибка. Введено неверное число.");
                                    }
                                }

                                int secondNumber;
                                while (true) {
                                    System.out.print("Введите значение второго числа: ");
                                    String line = keyboard.next().trim();
                                    try {
                                        secondNumber = Integer.parseInt(line);
                                        System.out.println();
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Ошибка. Введено неверное число.");
                                    }
                                }
                                if (secondNumber < 0) {
                                    System.out.println("Значение, которое будет получено дальше неточно из-за типа данных.");
                                }
                                int result = assignment.pow(firstNumber, secondNumber);
                                System.out.println("Результат: " + result);
                                System.out.println();
                                System.out.println();
                                break;
                            }
                            case 3: {
                                System.out.println("""
                                        Одинаковость.
                                        Дана сигнатура метода: public bool equalNum (int x);
                                        Необходимо реализовать метод таким образом, чтобы он возвращал true, если
                                        все знаки числа одинаковы, и false в ином случае.
                                        Подсказки:
                                        int x=123%10; // х будет иметь значение 3
                                        int у=123/10; // у будет иметь значение 12
                                        Пример 1:
                                        x=1111
                                        результат: true
                                        Пример 2:
                                        x=1211
                                        результат: false
                                        """);
                                int userNumber;
                                while (true) {
                                    System.out.print("Выберите целое число: ");
                                    String line = keyboard.next().trim();
                                    try {
                                        userNumber = Integer.parseInt(line);
                                        System.out.println();
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Ошибка. Введено неверное число.");
                                    }
                                }
                                boolean result = assignment.equalNum(userNumber);
                                System.out.println("Результат: " + result);
                                System.out.println();
                                System.out.println();
                                break;
                            }
                            case 4: {
                                System.out.println("""
                                        Левый треугольник.
                                        Дана сигнатура метода: public void leftTriangle (int x);
                                        Необходимо реализовать метод таким образом, чтобы он выводил на экран
                                        треугольник из символов ‘*’ у которого х символов в высоту, а количество
                                        символов в ряду совпадает с номером строки.
                                        Пример 1:
                                        x=2
                                        результат:
                                        *
                                        **
                                        Пример 2:
                                        x=4
                                        результат:
                                        *
                                        **
                                        ***
                                        ****
                                        """);
                                int userHeight;
                                while (true) {
                                    System.out.print("Выберите целое число: ");
                                    String line = keyboard.next().trim();
                                    try {
                                        userHeight = Integer.parseInt(line);
                                        System.out.println();
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Ошибка. Введено неверное число.");
                                    }
                                }
                                assignment.leftTriangle(userHeight);
                                System.out.println();
                                System.out.println();
                                break;
                            }
                            case 5: {
                                System.out.println("""
                                        Угадайка.
                                        Дана сигнатура метода: public void guessGame()
                                        Необходимо реализовать метод таким образом, чтобы он генерировал
                                        случайное число от 0 до 9, далее считывал с консоли введенное пользователем
                                        число и выводил, угадал ли пользователь то, что было загадано, или нет. Метод
                                        запускается до тех пор, пока пользователь не угадает число. После этого
                                        выведите на экран количество попыток, которое потребовалось пользователю,
                                        чтобы угадать число.
                                        Пример:
                                        Введите число от 0 до 9:
                                        5
                                        Вы не угадали, введите число от 0 до 9:
                                        9
                                        Вы угадали!
                                        Вы отгадали число за 2 попытки
                                        """);
                                System.out.print("""
                                        Загадано число от 0 до 9.
                                        Попробуйте его угадать.
                                        """);
                                assignment.guessGame();
                                System.out.println();
                                System.out.println();
                                break;
                            }
                            case 6: {
                                thirdDepartment = false;
                                break;
                            }
                            default: {
                                System.out.println("Извините, вы ввели неверное значение.");
                                break;
                            }
                        }
                    }
                    break;
                }
                case 4: {
                    boolean fourthDepartment = true;
                    while (fourthDepartment) {
                        System.out.println("""
                                Доступные задачи на выбор
                                1. Поиск последнего значения
                                2. Добавление в массив
                                3. Реверс
                                4. Объединение
                                5. Удалить отрицательные элементы
                                6. Выход из отдела
                                """);
                        int taskNumber;
                        while (true) {
                            System.out.print("Выберите номер задачи(1,2,3,4,5,6): ");
                            String line = keyboard.next().trim();
                            try {
                                taskNumber = Integer.parseInt(line);
                                System.out.println();
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Ошибка. Введено неверное число.");
                            }
                        }
                        switch (taskNumber) {
                            case 1: {
                                System.out.println("""
                                        Поиск последнего значения.
                                        Дана сигнатура метода: public int findLast (int[] arr, int x);
                                        Необходимо реализовать метод таким образом, чтобы он возвращал индекс
                                        последнего вхождения числа x в массив arr. Если число не входит в массив –
                                        возвращается -1.
                                        Пример:
                                        arr=[1,2,3,4,2,2,5]
                                        x=2
                                        результат: 5
                                        """);
                                int capacity;
                                while (true) {
                                    System.out.print("Введите число - количество элементов в массиве: ");
                                    String line = keyboard.next().trim();
                                    try {
                                        capacity = Integer.parseInt(line);
                                        System.out.println();
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Ошибка. Введено неверное число.");
                                    }
                                }
                                if (capacity < 0) {
                                    System.out.print("Количество элементов не может быть отрицательным.");
                                } else {
                                    int[] arr = new int[capacity];
                                    System.out.println("Сейчас вам будет необходимо заполнить массив.");
                                    for (int i = 0; i < arr.length; i++) {
                                        int toUser = i + 1;
                                        int element;
                                        while (true) {
                                            System.out.print("Введите значение " + toUser + "-ого элемента: ");
                                            String line = keyboard.next().trim();
                                            try {
                                                element = Integer.parseInt(line);
                                                System.out.println();
                                                break;
                                            } catch (NumberFormatException e) {
                                                System.out.println("Ошибка. Введено неверное число.");
                                            }
                                        }
                                        arr[i] = element;
                                    }
                                    int toFind;
                                    while (true) {
                                        System.out.print("Введите значение элемента, которого надо найти: ");
                                        String line = keyboard.next().trim();
                                        try {
                                            toFind = Integer.parseInt(line);
                                            System.out.println();
                                            break;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Ошибка. Введено неверное число.");
                                        }
                                    }
                                    int result = assignment.findLast(arr, toFind);
                                    System.out.print("Индекс последнего вхождения " + toFind + ": " + result);
                                }
                                System.out.println();
                                System.out.println();
                                break;
                            }
                            case 2: {
                                System.out.println("""
                                        Добавление в массив.
                                        Дана сигнатура метода: public int[]add (int[] arr, int x, int pos);
                                        Необходимо реализовать метод таким образом, чтобы он возвращал новый
                                        массив, который будет содержать все элементы массива arr, однако в позицию
                                        pos будет вставлено значение x.
                                        Пример:
                                        arr=[1,2,3,4,5]
                                        x=9
                                        pos=3
                                        результат: [1,2,3,9,4,5]
                                        """);
                                int capacity;
                                while (true) {
                                    System.out.print("Введите число - количество элементов в массиве: ");
                                    String line = keyboard.next().trim();
                                    try {
                                        capacity = Integer.parseInt(line);
                                        System.out.println();
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Ошибка. Введено неверное число.");
                                    }
                                }
                                if (capacity < 0) {
                                    System.out.print("Количество элементов не может быть отрицательным.");
                                } else {
                                    int[] arr = new int[capacity];
                                    System.out.println("Сейчас вам будет необходимо заполнить массив.");
                                    for (int i = 0; i < arr.length; i++) {
                                        int toUser = i + 1;
                                        int element;
                                        while (true) {
                                            System.out.print("Введите значение " + toUser + "-ого элемента: ");
                                            String line = keyboard.next().trim();
                                            try {
                                                element = Integer.parseInt(line);
                                                System.out.println();
                                                break;
                                            } catch (NumberFormatException e) {
                                                System.out.println("Ошибка. Введено неверное число.");
                                            }
                                        }
                                        arr[i] = element;
                                    }
                                    int userNumber;
                                    while (true) {
                                        System.out.print("Введите значение элемента, который вы хотите вставить: ");
                                        String line = keyboard.next().trim();
                                        try {
                                            userNumber = Integer.parseInt(line);
                                            System.out.println();
                                            break;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Ошибка. Введено неверное число.");
                                        }
                                    }
                                    int userPosition;
                                    while (true) {
                                        System.out.print("Введите позицию от 0 до " + capacity + " куда вставить новый элемент: ");
                                        String line = keyboard.next().trim();
                                        try {
                                            userPosition = Integer.parseInt(line);
                                            System.out.println();
                                            break;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Ошибка. Введено неверное число.");
                                        }
                                    }
                                    if (userPosition < 0 || userPosition > capacity) {
                                        System.out.println("Введено неверное значение.");
                                        break;
                                    } else {
                                        int[] result = assignment.add(arr, userNumber, userPosition);
                                        for (int j : result) {
                                            System.out.print(j + " ");
                                        }
                                    }
                                }
                                System.out.println();
                                System.out.println();
                                break;
                            }
                            case 3: {
                                System.out.println("""
                                        Реверс.
                                        Дана сигнатура метода: public void reverse (int[] arr);
                                        Необходимо реализовать метод таким образом, чтобы он изменял массив arr.
                                        После проведенных изменений массив должен быть записан задом-наперед.
                                        Пример:
                                        arr=[1,2,3,4,5]
                                        результат: arr=[5,4,3,2,1]
                                        """);
                                int capacity;
                                while (true) {
                                    System.out.print("Введите число - количество элементов в массиве: ");
                                    String line = keyboard.next().trim();
                                    try {
                                        capacity = Integer.parseInt(line);
                                        System.out.println();
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Ошибка. Введено неверное число.");
                                    }
                                }
                                if (capacity < 0) {
                                    System.out.println("Количество элементов не может быть отрицательным");
                                } else {
                                    int[] arr = new int[capacity];
                                    System.out.println("Сейчас вам будет необходимо заполнить массив.");
                                    for (int i = 0; i < arr.length; i++) {
                                        int toUser = i + 1;
                                        int element;
                                        while (true) {
                                            System.out.print("Введите значение " + toUser + "-ого элемента: ");
                                            String line = keyboard.next().trim();
                                            try {
                                                element = Integer.parseInt(line);
                                                System.out.println();
                                                break;
                                            } catch (NumberFormatException e) {
                                                System.out.println("Ошибка. Введено неверное число.");
                                            }
                                        }
                                        arr[i] = element;
                                    }
                                    assignment.reverse(arr);
                                }
                                System.out.println();
                                System.out.println();
                                break;
                            }
                            case 4: {
                                System.out.println("""
                                        Объединение.
                                        Дана сигнатура метода: public int[] concat (int[] arr1,int[] arr2);
                                        Необходимо реализовать метод таким образом, чтобы он возвращал новый
                                        массив, в котором сначала идут элементы первого массива (arr1), а затем
                                        второго (arr2).
                                        Пример:
                                        arr1=[1,2,3]
                                        arr2=[7,8,9]
                                        результат: [1,2,3,7,8,9]
                                        """);
                                int capacity;
                                while (true) {
                                    System.out.print("Введите число - количество элементов в первом массиве: ");
                                    String line = keyboard.next().trim();
                                    try {
                                        capacity = Integer.parseInt(line);
                                        System.out.println();
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Ошибка. Введено неверное число.");
                                    }
                                }
                                if (capacity < 0) {
                                    System.out.println("Количество элементов не может быть отрицательным.");
                                } else {
                                    int[] arr = new int[capacity];
                                    System.out.println("Сейчас вам будет необходимо заполнить массив.");
                                    for (int i = 0; i < arr.length; i++) {
                                        int toUser = i + 1;
                                        int element;
                                        while (true) {
                                            System.out.print("Введите значение " + toUser + "-ого элемента: ");
                                            String line = keyboard.next().trim();
                                            try {
                                                element = Integer.parseInt(line);
                                                System.out.println();
                                                break;
                                            } catch (NumberFormatException e) {
                                                System.out.println("Ошибка. Введено неверное число.");
                                            }
                                        }
                                        arr[i] = element;
                                    }
                                    int secondCapacity;
                                    while (true) {
                                        System.out.print("Введите число - количество элементов во втором массиве: ");
                                        String line = keyboard.next().trim();
                                        try {
                                            secondCapacity = Integer.parseInt(line);
                                            System.out.println();
                                            break;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Ошибка. Введено неверное число.");
                                        }
                                    }
                                    if (secondCapacity < 0) {
                                        System.out.print("Количество элементов не может быть отрицательным.");
                                    } else {
                                        int[] arr2 = new int[secondCapacity];
                                        for (int i = 0; i < arr2.length; i++) {
                                            int toUser = i + 1;
                                            int element;
                                            while (true) {
                                                System.out.print("Введите значение " + toUser + "-ого элемента: ");
                                                String line = keyboard.next().trim();
                                                try {
                                                    element = Integer.parseInt(line);
                                                    System.out.println();
                                                    break;
                                                } catch (NumberFormatException e) {
                                                    System.out.println("Ошибка. Введено неверное число.");
                                                }
                                            }
                                            arr2[i] = element;
                                        }
                                        int[] result = assignment.concat(arr, arr2);
                                        for (int j : result) {
                                            System.out.print(j + " ");
                                        }
                                    }
                                }
                                System.out.println();
                                System.out.println();
                                break;
                            }
                            case 5: {
                                System.out.println("""
                                        Удалить негатив.
                                        Дана сигнатура метода: public int[] deleteNegative (int[] arr);
                                        Необходимо реализовать метод таким образом, чтобы он возвращал новый
                                        массив, в котором записаны все элементы массива arr кроме отрицательных.
                                        Пример:
                                        arr=[1,2,-3,4,-2,2,-5]
                                        результат: [1,2,4,2]
                                        """);
                                int capacity;
                                while (true) {
                                    System.out.print("Введите число - количество элементов в массиве: ");
                                    String line = keyboard.next().trim();
                                    try {
                                        capacity = Integer.parseInt(line);
                                        System.out.println();
                                        break;
                                    } catch (NumberFormatException e) {
                                        System.out.println("Ошибка. Введено неверное число.");
                                    }
                                }
                                if (capacity < 0) {
                                    System.out.print("Количество элементов не может быть отрицательным.");
                                } else {
                                    int[] arr = new int[capacity];
                                    System.out.println("Сейчас вам будет необходимо заполнить массив.");
                                    for (int i = 0; i < arr.length; i++) {
                                        int toUser = i + 1;

                                        int element;
                                        while (true) {
                                            System.out.print("Введите значение " + toUser + "-ого элемента: ");
                                            String line = keyboard.next().trim();
                                            try {
                                                element = Integer.parseInt(line);
                                                System.out.println();
                                                break;
                                            } catch (NumberFormatException e) {
                                                System.out.println("Ошибка. Введено неверное число.");
                                            }
                                        }
                                        arr[i] = element;
                                    }
                                    int[] result = assignment.deleteNegative(arr);
                                    System.out.print("Результат: ");
                                    for (int j : result) {
                                        System.out.print(j + " ");
                                    }
                                }
                                System.out.println();
                                System.out.println();
                                break;
                            }
                            case 6: {
                                fourthDepartment = false;
                                break;
                            }
                            default: {
                                System.out.println("Извините, вы ввели неверное значение.");
                                break;
                            }
                        }
                    }
                    break;
                }
                case 5: {
                    System.out.println("Выход из программы....");
                    run = false;
                    break;
                }
                default: {
                    System.out.println();
                    System.out.println("Извините, вы ввели неверное значение");
                    break;
                }
            }
        }
        System.out.println("Программа завершена.");
        keyboard.close();
    }
}
