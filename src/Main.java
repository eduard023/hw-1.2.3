public class Main {
    public static void main(String[] args) {
        // Задание 6
        System.out.println("Задание 6");
        var oneBoxer = 78.2;
        var twoBoxer = 82.7;
        System.out.println("Общий вес двух бойцов " + (oneBoxer + twoBoxer));
        System.out.println("Разница между весами бойцов " + (twoBoxer - oneBoxer));

        // Задание 7
        System.out.println("Задание 7");
        System.out.println("Разница между весами бойцов (1 способ) " + (twoBoxer - oneBoxer));
        System.out.println("Разница между весами бойцов (2 способ) " +(twoBoxer % oneBoxer));

        // Задание 8
        System.out.println("Задание 8");
        var totalHours = 640;
        var oneHours = 8;
        var totalWorker = totalHours / oneHours;
        System.out.println("Всего работников в компании - " + totalWorker  + " человек. ");
        totalWorker += 94;
        System.out.println("Если в компании работает " + totalWorker +" человека, то всего "+ oneHours * totalWorker +" часа работы может быть поделено между сотрудниками.");




    }
}