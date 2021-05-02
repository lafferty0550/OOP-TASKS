package com.company;

import javafx.util.Pair;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(spiderToFly("H3", "E2"));
        System.out.println(spiderToFly("A4", "B2"));
    }

    // TASK 1/6

    //Напишите функцию, которая принимает целое число минут и преобразует его в секунды.
    public static int convert(int minutes) {
        return minutes * 60;
    }

    //Вы подсчитываете очки за баскетбольный матч, учитывая количество забитых 2-х и 3-х очков, находите окончательные очки для команды и возвращаете это значение.
    public static int points(int a, int b) {
        return a * 2 + b * 3;
    }

    //Создайте функцию, которая принимает количество побед, ничьих и поражений и вычисляет количество очков, набранных футбольной командой на данный момент.
    public static int footballPoints(int a, int b, int c) {
        return a * 3 + b;
    }

    //Создайте функцию, которая возвращает true, если целое число равномерно делится на 5, и false в противном случае.
    public static boolean divisibleByFive(int a) {
        return a % 5 == 0;
    }

    //В Java есть логический оператор &&. Оператор && принимает два логических значения и возвращает true, если оба значения истинны.
    public static boolean and(boolean a, boolean b) {
        return a && b;
    }

    //У меня есть ведро с большим количеством темно-синей краски, и я хотел бы покрасить как можно больше стен. Создайте функцию, которая возвращает количество полных стен, которые я могу покрасить, прежде чем мне нужно будет отправиться в магазины, чтобы купить еще.
    //n - это количество квадратных метров, которые я могу нарисовать.
    //w и h-это ширина и высота одной стены в метрах
    public static int howManyWalls(int n, int w, int h) {
        return n / (w * h);
    }

    //Исправьте код, чтобы решить эту задачу (только синтаксические ошибки).
    public static int squared(int a) {
        return a * a;
    }

    //Создайте функцию, которая принимает три аргумента prob, prize, pay и возвращает true,
    //если prob * prize > pay; в противном случае возвращает false.
    public static boolean profitableGamble(int prob, int prize, int pay) {
        return prob * prize > pay;
    }

    //Создайте метод, который возвращает количество кадров, показанных за заданное количество минут для определенного FPS.
    public static int frames(int a, int b) {
        return a * b * 60;
    }

    //Создайте функцию, которая будет работать как оператор модуля % без использования оператора модуля.
    //Оператор модуля-это способ определения остатка операции деления. Вместо того чтобы возвращать результат деления, операция по модулю возвращает остаток целого числа.
    public static int mod(int a, int b) {
        return a - (a / b) * b;
    }

    // TASK 2/6

    //Создайте функцию, которая принимает номер дома и длину улицы n и возвращает номер дома на противоположной стороне.
    public static int oppositeHouse(int a, int n) {
        return (n * 2 + 1) - a;
    }

    //Создайте метод, который принимает строку (имя и фамилию человека) и возвращает строку с заменой имени и фамилии.
    public static String nameShuffle(String name) {
        String[] a = name.split(" ");
        return a[1] + " " + a[0];
    }

    //Создайте функцию, которая принимает два аргумента:
    //исходную цену и процент скидки в виде целых чисел и возвращает конечную цену после скидки.
    public static double discount(double price, double sale) {
        return price - price / 100 * sale;
    }

    //Создайте функцию, которая принимает массив и возвращает разницу между наибольшим и наименьшим числами.
    public static int differenceMaxMin(List<Integer> a) {
        Collections.sort(a);
        return a.get(a.size() - 1) - a.get(0);
    }

    //Создайте функцию, которая принимает три целочисленных аргумента (a, b, c)
    //и возвращает количество целых чисел, имеющих одинаковое значение
    public static int equal(int a, int b, int c) {
        if ((a==b) && (b==c))
            return 3;
        if (((a==b) && (b!=c) ) || ((b==c) && (a!=c)) || ((a==c) && (a!=b)) )
            return 2;
        return 0;
    }
    //Создайте метод, который принимает строку в качестве аргумента и возвращает ее в обратном порядке.
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    //Вы наняли трех программистов и (надеюсь) платите им.
    //Создайте функцию, которая принимает три числа (почасовая заработная плата каждого программиста)
    //и возвращает разницу между самым высокооплачиваемым программистом и самым низкооплачиваемым.
    public static int programmers(int price1, int price2, int price3) {
        int max = Math.max(price1, Math.max(price2, price3));
        int min = Math.min(price1, Math.min(price2, price3));
        return max - min;
    }
    //Создайте функцию, которая принимает строку, проверяет, имеет ли она одинаковое
    //количество x и o и возвращает либо true, либо false.
    public static boolean getXO(String str) {
        int x = 0;
        int o = 0;

        for (char ch : str.toCharArray()) {
            if (ch == 'x') ++x;
            if (ch == 'o') ++o;
        }
        return x == o;
    }
    //Напишите функцию, которая находит слово "бомба" в данной строке.
    //Ответьте "ПРИГНИСЬ!", если найдешь, в противном случае:"Расслабься, бомбы нет".
    public static String bomb(String str) {
        if (str.toLowerCase().contains("bomb"))
            return "DUCK!";
        else
            return "Relax, there is no bomb.";
    }
    //Возвращает true, если сумма значений ASCII первой строки совпадает с суммой значений
    //ASCII второй строки, в противном случае возвращает false.
    public static boolean sameAscii(String a, String b) {
        int asciiSum = 0;
        for (int i = 0; i < a.length(); i++) {
            asciiSum += (int) a.charAt(i);
        }
        int asciiSum2 = 0;
        for (int i = 0; i < b.length(); i++) {
            asciiSum2 += (int) b.charAt(i);
        }
        return asciiSum == asciiSum2;
    }



    // TASK 3/6

    static class CustomPair<K, V> {
        private K key;
        private V value;
        public K getKey() { return key; }
        public V getValue() { return value; }
        public void setKey(K val) { this.key = val; }
        public void setValue(V val) { this.value = val; }

        public CustomPair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public String toString() { return this.key + " " + this.value; }
    }


    //Учитывая массив городов и населения, верните массив, в котором все население округлено до ближайшего миллиона.
    public static List<CustomPair<String, Integer>> millionsRounding(List<CustomPair<String, Integer>> population) {
        population.forEach(p -> {
            p.setValue((int) Math.round((double) p.getValue() / 1000000) * 1000000);
        });
        return population;
    }

    //Учитывая самую короткую сторону треугольника 30° на 60° на 90°, вы должны найти другие 2 стороны (верните самую длинную сторону, сторону средней длины).
    public static List<Double> otherSides(int a) {
        double b = a * 2;
        double squareC = b * b - a * a;
        double c = Math.sqrt(squareC);
        List<Double> list = new ArrayList<>();
        list.add(b);
        list.add(c);
        return list;
    }

    //Создайте функцию, имитирующую игру "камень, ножницы, бумага". Функция принимает входные данные обоих игроков
    // (камень, ножницы или бумага), первый параметр от первого игрока, второй от второго игрока. Функция возвращает результат как таковой:
    public static String rps(String a, String b) {
        if (a.equals(b))
            return "TIE";
        switch (a) {
            case "rock":
                if (b.equals("paper")) {
                    return "Player2 win!";
                } else {
                    return "Player1 win";
                }
            case "paper":
                if (b.equals("scissors")) {
                    return "Player2 win!";
                } else {
                    return "Player1 win";
                }
            case "scissors":
                if (b.equals("rock")) {
                    return "Player2 win!";
                } else {
                    return "Player1 win";
                }
        }
        return null;
    }

    //Идет великая война между четными и нечетными числами. Многие уже погибли в этой войне, и ваша задача-положить этому конец.
    // Вы должны определить, какая группа суммируется больше: четная или нечетная. Выигрывает большая группа.
    public static int warOfNumbers(List<Integer> arr) {
        int evenSum = 0;
        int oddSum = 0;
        for (Integer a : arr) {
            if (a % 2 == 0) evenSum += a;
            else oddSum += a;
        }
        return evenSum - oddSum;
    }

    // Учитывая строку, создайте функцию для обратного обращения. Все буквы в нижнем регистре должны быть прописными, и наоборот.
    public static String reverseCase(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }

    // Создайте функцию, которая принимает строку из одного слова и выполняет следующие действия:
    // Конкатенирует inator до конца, если слово заканчивается согласным, в противном случае вместо него конкатенирует -inator
    //Добавляет длину слова исходного слова в конец, снабженный '000'.
    public static String inatorInator(String str) {
        if (str.matches(".*[aeiou]$")) {
            return str + "-inator " + str.length() + "000";
        } else
            return str + "inator " + str.length() + "000";
    }

    // Напишите функцию, которая принимает три измерения кирпича: высоту(a), ширину(b) и глубину(c) и возвращает true, если этот кирпич может поместиться в отверстие с шириной(w) и высотой(h).
    public static boolean doesBrickFit(int a, int b, int c, int w, int h) {
        return a * b <= w * h || a * c <= w * h || b * c <= w * h;
    }

    // Напишите функцию, которая принимает топливо (литры), расход топлива (литры/100 км), пассажиров, кондиционер (логическое значение) и возвращает максимальное расстояние, которое может проехать автомобиль.
    //
    //топливо-это количество литров топлива в топливном баке.
    //
    //Расход топлива-это базовый расход топлива на 100 км (только с водителем внутри).
    //
    //Каждый дополнительный пассажир увеличивает базовый расход топлива на 5%.
    //
    //Если кондиционер включен, то его общий (не базовый) расход топлива увеличивается на 10%.
    public static double totalDistance(double litres, double price, double passes, boolean cond) {
        double multiple = 1;
        if (cond) multiple *= 1.1;
        double passesMult = 1;
        for (int i = 0; i < passes; i++) {
            passesMult += 0.05;
        }
        return (litres / (price * multiple * passesMult)) * 100;
    }


    // Создайте функцию, которая принимает массив чисел и возвращает среднее значение (average) всех этих чисел.
    public static double mean(List<Integer> arr) {
        double sum = arr.stream().mapToInt(Integer::intValue).sum();
        return sum / arr.size();
    }

    // Создайте функцию, которая принимает число в качестве входных данных и возвращает true, если сумма его цифр имеет ту же четность, что и все число. В противном случае верните false.
    public static boolean parityAnalysis(int num) {
        int sum = 0;
        int num_copy = num;
        while (num_copy != 0) {
            sum += num_copy % 10;
            num_copy /= 10;
        }
        return sum % 2 == num % 2;
    }


    public static boolean sameLetterPattern(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        for (int i = 0; i < s1.length() - 1; i++) {
            if (Math.abs(s1.charAt(i) - s1.charAt(i + 1)) != Math.abs(s2.charAt(i) - s2.charAt(i + 1)))
                return false;
        }
        return true;
    }

    //Создайте функцию, которая будет рекурсивно подсчитывать количество цифр числа.
    //Преобразование числа в строку не допускается, поэтому подход является рекурсивным.
    public static int digitCount(int digit) {
        if (digit < 10)
            return 1;
        else
            return 1 + digitCount(digit / 10);
    }


    //Последовательный прогон-это список соседних последовательных целых чисел.
    // Этот список может быть как увеличивающимся, так и уменьшающимся. Создайте функцию,
    // которая принимает массив чисел и возвращает длину самого длинного последовательного запуска.
    public static int longestRun(int array[]) {
        int maxCount = 1, count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1] - 1) {
                count++;
                if (maxCount < count)
                    maxCount = count;
            } else
                count = 1;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1] + 1) {
                count++;
                if (maxCount < count)
                    maxCount = count;
            } else
                count = 1;
        }

        return maxCount;
    }

    //Какой процент вы можете набрать на тесте, который в одиночку снижает средний балл по классу на 5%?
    // Учитывая массив оценок ваших одноклассников, создайте функцию, которая возвращает ответ.
    // Округлите до ближайшего процента.
    public static String takeDownAverage(String array[]) {
        int percentage = 0, needPercentage = 0;
        for (int i = 0; i < array.length; i++) {
            percentage += Integer.parseInt(array[i].substring(0, array[i].length() - 1));
        }
        needPercentage = (percentage / array.length - 5) * (array.length + 1) - percentage;

        return Integer.toString(needPercentage) + "%";
    }

    //Учитывая предложение с числами, представляющими расположение слова,
    // встроенного в каждое слово, верните отсортированное предложение.
    public static String rearrange(String s) {
        String[] s1 = s.split(" ");
        String[] s2 = s.split(" ");
        String sHelp = "";
        for (int i = 0; i < s1.length; i++) {
            sHelp = s1[i];
            for (int j = 0; j < sHelp.length(); j++) {
                if (sHelp.charAt(j) >= 48 && sHelp.charAt(j) <= 57) {
                    int digit = sHelp.charAt(j) - '0';
                    sHelp = sHelp.substring(0, j) + sHelp.substring(j + 1);
                    s2[digit - 1] = sHelp;
                }
            }
        }
        sHelp = "";
        for (int i = 0; i < s2.length; i++) {
            sHelp += s2[i] + " ";
        }

        return sHelp;
    }

    //В игроки пытаются набрать очки, формируя слова, используя буквы из 6-буквенного скремблированного
    // слова. Они выигрывают раунд, если им удается успешно расшифровать слово из 6 букв.
    //Создайте функцию, которая принимает в массив уже угаданных слов расшифрованное 6-буквенное слово и
    // возвращает общее количество очков, набранных игроком в определенном раунде, используя следующую рубрику:
    //3-буквенные слова-это 1 очко
    //4-буквенные слова-это 2 очка
    //5-буквенные слова-это 3 очка
    //6-буквенные слова-это 4 очка + 50 бонуса (за расшифровку слова)
    public static int totalPoints(String[] array, String word) {
        int mainCount = 0;
        List<Character> checkList = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            checkList.add(word.charAt(i));
        }

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            char character[] = array[i].toCharArray();
            List<Character> copy = new ArrayList<Character>(checkList);

            for (int q = 0; q < character.length; q++) {
                if (copy.contains(character[q])) {
                    count++;
                    copy.remove(copy.indexOf(character[q]));
                } else
                    count = 0;
            }
            copy.removeAll(copy);
            if (count == 3)
                mainCount += 1;
            else if (count == 4)
                mainCount += 2;
            else if (count == 5)
                mainCount += 3;
            else if (count == 6 && copy.isEmpty())
                mainCount += 54;
            else
                mainCount += 0;
        }

        return mainCount;
    }

    //Напишите функцию, которая делает первое число как можно больше, меняя его цифры на цифры во втором числе.
    public static int maxPossible(int a, int b) {
        ArrayList<Integer> digit1 = new ArrayList<>();
        ArrayList<Integer> digit2 = new ArrayList<>();

        while (a > 0) {
            digit1.add(a % 10);
            a /= 10;
        }
        while (b > 0) {
            digit2.add(b % 10);
            b /= 10;
        }
        if (digit1.size() > digit2.size())
            for (int i = 0; i < digit1.size() - digit2.size(); i++) {
                digit2.add(0);
            }
        Collections.reverse(digit1);
        Collections.sort(digit2);
        Collections.reverse(digit2);
        String result = "";
        for (Integer d : digit1) {
            if (d < digit2.get(0)) {
                result += Integer.toString(digit2.get(0));
                digit2.remove(0);
            }
            else
                result += Integer.toString(d);
        }

        return Integer.parseInt(result);
    }


    //В этой задаче цель состоит в том, чтобы вычислить, сколько времени сейчас в двух
    // разных городах. Вам дается строка cityA и связанная с ней строка timestamp (time in cityA) с датой, отформатированной в полной нотации США, как в этом примере
    public static void timeDifferance(String cityA, String today, String cityB) {
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd, yyyy HH:mm", Locale.UK);
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(formatter.parse(today));
            Map<String, Double> map = new HashMap<>();
            map.put("Los Angeles", -8.0);
            map.put("New York",-5.0);
            map.put("Caracas", -4.3);
            map.put("Buenos Aires",-3.0);
            map.put("London",0.0);
            map.put("Rome", 1.0);
            map.put("Moscow",3.0);
            map.put("Tehran", 3.3);
            map.put("New Delhi",5.3);
            map.put("Beijing",8.0);
            map.put("Canberra",10.0);

            Double timeA = 0.0, timeB = 0.0, timeDiff = 0.0;
            for (Map.Entry<String,Double> pair : map.entrySet()) {
                if (pair.getKey() == cityA) {
                    timeA = pair.getValue();
                }
                if (pair.getKey() == cityB) {
                    timeB = pair.getValue();
                }
            }
            System.out.println(" ");
            System.out.println(timeA);
            System.out.println(" ");
            System.out.println(timeB);
            System.out.println(" ");
            if (timeA < 0 && timeB > 0 || timeA > 0 && timeB < 0) {
                timeDiff = Math.abs(timeA) + Math.abs(timeB);
            }
            else if (timeA > 0 && timeB > 0)
                timeDiff = Math.abs(timeA - timeB);
            else
                timeDiff = timeA - timeB;

            System.out.println(timeDiff);
            double d = timeDiff;
            int h = (int)d, m = 0;
            String res = Double.toString(d);
            if (h < 0) {
                m = -Integer.parseInt(res.substring(res.length() - 1));
            }
            else
                m = Integer.parseInt(res.substring(res.length() - 1));
            System.out.println(h);
            System.out.println(m);
            calendar.add(Calendar.HOUR, h);
            calendar.add(Calendar.MINUTE, m);
            System.out.println(formatter.format(calendar.getTime()));

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    //Новое число-это число, которое не является перестановкой любого меньшего числа.
    // 869-это не новое число, потому что это просто перестановка меньших чисел, 689 и 698.
    //509-это новое число, потому что оно не может быть образовано перестановкой любого меньшего числа
    // (ведущие нули не допускаются).
    public static boolean isNew(int a) {
        String str = String.valueOf(a);
        List<Integer> digits = new ArrayList<>();
        for (int i = 0; i < str.length(); ++i) {
            digits.add(Integer.parseInt(String.valueOf(str.charAt(i))));
        }
        int i = 0;
        while (i < digits.size()) {
            Stream<Integer> digitsStream = digits.subList(i, digits.size()).stream();
            int finalI = i;
            if (digitsStream.anyMatch(d -> d < digits.get(finalI) && d > 0))
                return false;
            ++i;
        }
        return true;
    }




    public static String spiderToFly(final String spider, final String fly) {
        String radials = "ABCDEFGH";
        char spiderR = spider.charAt(0), spiderL = spider.charAt(1), flyR = fly.charAt(0), flyL = fly.charAt(1);
        char midRing;
        if (Math.abs(spiderR - flyR) <= 2 || Math.abs(spiderR - flyR) >= 6)
            midRing = (char) Math.min(spiderL, flyL);
        else
            midRing = '0';
        String answer = "" + spiderR + spiderL + "-";
        while (spiderL > midRing) {
            if (--spiderL == '0')
                answer += spiderR + "0-";
            else
                answer += "" + spiderR + spiderL + "-";
        }
        while (spiderL <= flyL && midRing != '0') {
            if (spiderR == flyR)
                break;
            if (Math.abs(spiderR - flyR) >= 6) {
                if (spiderR > flyR) {
                    spiderR++;
                    if (spiderR == 'I') // Если вышли за пределы
                        spiderR = 'A';
                } else {
                    spiderR--;
                    if (spiderR == '@') // Если вышли за пределы
                        spiderR = 'H';
                }
            } else {
                if (spiderR < flyR)
                    spiderR++;
                else
                    spiderR--;
            }
            answer += "" + spiderR + spiderL + "-";
        }
        while (spiderL++ < flyL)
            answer += "" + flyR + spiderL + "-";
        return answer.substring(0, answer.length() - 1);
    }

    public static String hiddenAnagram(String sentence, String key) {
        sentence = sentence.toLowerCase(Locale.ROOT);
        key = key.toLowerCase(Locale.ROOT);
        sentence = sentence.replaceAll(" ", "");
        sentence = sentence.replaceAll("[^A-Za-zА-Яа-я0-9]", ""); // удалится все кроме букв и цифр
        key = key.replaceAll("[^A-Za-zА-Яа-я0-9]", ""); // удалится все кроме букв и цифр
        String keyCopy = new String(key), result = "";

        for (int i = 0; i < sentence.length(); i++) {
            if (result.length() == key.length())
                break;
            if (keyCopy.contains(Character.toString(sentence.charAt(i)))) {
                result += Character.toString(sentence.charAt(i));
                keyCopy.replace(Character.toString(sentence.charAt(i)), "");
            } else {
                keyCopy = new String(key);
                result = "";
            }
        }
        if (result.length() != key.length())
            return "notfound";
        return result;
    }


    public static ArrayList<String> collect(String s, int a) {
        ArrayList<String> list = new ArrayList();
        int count = 0;
        String resultWord = "";
        for (int i = 0; i < s.length(); i++) {
            resultWord += s.charAt(i);
            if (resultWord.length() == a) {
                list.add(resultWord);
                resultWord = "";
                count++;
            } else if (count == s.length() / a)
                break;
        }

        return list;
    }

    public static String nicoCipher(String message, String key) {
        //1Part
        ArrayList<String> list = new ArrayList<>();
        char[] keySort = key.toCharArray();
        String digits = "";
        Arrays.sort(keySort);
        int d = 0;
        for (int i = 0; i < keySort.length; i++) {
            for (int j = 0; j < keySort.length; j++) {
                if (key.charAt(i) == keySort[j]) {
                    digits += Integer.toString(j + 1);
                    keySort[j] = '0';
                    //key = key.substring(i);
                }
            }
        }
        //2Part
        for (int i = 0; i < digits.length(); i++) {
            list.add("");
        }
        for (int i = 0; i < message.length(); i++) {
            String nLine = list.get(i % digits.length());
            nLine += Character.toString(message.charAt(i));
            list.remove(i % digits.length());
            list.add(i % digits.length(), nLine);
        }
        int count = 0;
        for (String line : list) {
            if (line.length() < list.get(0).length())
                for (int i = 0; i < list.get(0).length() - line.length(); i++) {
                    line += " ";
                    String nLine = line;
                    list.remove(count);
                    list.add(count, nLine);
                }
            count++;
        }
        //3Part
        count = 1;
        ArrayList<String> listN = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            for (int j = 0; j < digits.length(); j++) {
                if (count == Integer.parseInt(Character.toString(digits.charAt(j)))) {
                    listN.add(list.get(j));
                    count++;
                }
            }
        }
        //4Part
        String result = "";
        for (int i = 0; i < listN.get(0).length(); i++) {
            for (String line : listN) {
                result += line.charAt(i);
            }
        }
        System.out.println(result);
        return result;
    }

    public static int[] twoProduct(int[] array, int digit) {
        int value_at_lower_index = 0, value_at_higher_index = 0, gap = array.length + 1;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] * array[j] == digit && i - j < gap) {
                    value_at_lower_index = array[j];
                    value_at_higher_index = array[i];
                    gap = i - j;
                }
            }
        }

        System.out.print(value_at_lower_index + " ");
        System.out.println(value_at_higher_index);
        if (gap == array.length + 1)
            return new int[]{};
        else
            return new int[]{value_at_lower_index, value_at_higher_index};
    }

    public static int[] isExact(int digit) {
        int check = digit, value = 0;
        for (int i = 1; i <= check; i++) {
            check /= i;
            value = i;
        }

        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        if (digit != result)
            return new int[]{,};
        return new int[]{digit, value};
    }

    public static void fractions(String value) {
        int index = -1;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == '(') {
                index = i;
                break;
            }
        }
        double digit = Double.parseDouble(value.substring(0, index));
        int period = Integer.parseInt(value.substring(index + 1, value.length() - 1));
        int digitPow = 0, periodPow = 0;
        periodPow = Integer.toString(period).length();
        while (!(digit % 1 == 0)) {
            digitPow++;
            digit *= 10;
        }

        double fullDigit = Double.parseDouble(Integer.toString((int)digit) + '.' + Integer.toString(period));
        fullDigit *= Math.pow(10,periodPow);
        fullDigit -= Double.parseDouble(value.substring(0, index)) * Math.pow(10,digitPow);
        int topPart = (int)fullDigit, downPart = (int)(Math.pow(10,periodPow) - 1) * (int)Math.pow(10,digitPow);

        System.out.println(fullDigit);
        System.out.println(topPart);
        System.out.println(downPart);

        for (int i = topPart; i > 0 ; i--) {
            if (topPart % i == 0 && downPart % i == 0) {
                topPart /= i;
                downPart /= i;
            }
        }
        System.out.println(topPart + "/" + downPart);
    }

    public static void pilish_string(String s) {
        String Pi = "314159265358979";
        String result = "";
        while (!s.equals("") && !Pi.equals("")) {
            if (Integer.parseInt(Character.toString(Pi.charAt(0))) > s.length()) {
                result += s;
                for (int i = 0; i < Integer.parseInt(Character.toString(Pi.charAt(0))) - s.length(); i++) {
                    result += s.charAt(s.length() - 1);
                }
                break;
            } else {
                result += s.substring(0, Integer.parseInt(Character.toString(Pi.charAt(0)))) + " ";
                s = s.substring(Integer.parseInt(Character.toString(Pi.charAt(0))));
                Pi = Pi.substring(1, Pi.length());
            }
        }
        System.out.println(result);
    }

    public static String generateNonconsecutive(int n) {
        return "";
    }

    public static boolean isValid(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 1;
        int zapomnit = 0;
        int max = -1;
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), count);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        count = 0;

        for (Integer digit : map.values()) {
            if (digit == zapomnit)
                count++;
            zapomnit = digit;
            if (digit > max)
                max = digit;
        }
        if (count == map.size() - 1)
            return true;
        else if (map.containsValue(1)) {
            count = 0;
            for (Integer digit : map.values()) {
                if (digit == 1)
                    count++;
            }
            if (count == 1)
                return true;
        } else {
            count = 0;
            max -= 1;
            for (Integer digit : map.values()) {
                if (digit == max)
                    count++;
            }
            if (count == map.size() - 1)
                return true;
        }
        return false;
    }

    public static ArrayList<String> sumsUp(int[] array) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = array.length - 1; i > 1; i--) {
            for (int j = i - 1; j > -1; j--) {
                if (array[i] + array[j] == 8)
                    if (array[i] < array[j])
                        list.add(Integer.toString(array[i]) + " " + Integer.toString(array[j]));
                    else
                        list.add(Integer.toString(array[j]) + " " + Integer.toString(array[i]));
            }
        }
        Collections.reverse(list);
        System.out.println(list);
        return list;
    }
}
