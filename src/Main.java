import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        //Работа c классами
        Engine eng = new Engine("12.05.2019","Germany",80,1,"Kia", "Rio", 1, "T345EC");
        System.out.println(eng);
        //Глубокое и поверхностное копирование
        Auto car = new Auto("Renault","Logan",1,"Y634TX");
        Auto t = (Auto) car.clone();; //пример глубокого копирования
        car.setTypeTrans(2);
        System.out.println(car);
        System.out.println(t);
        t = car; //пример поверхностного копирования
        car.setGosNumber("X721EC");
        System.out.println(car);
        System.out.println(t);
        //Шаблоны
        String tt = "Больше тренировок на дроме";
        Client cl= new Client();
        Instructor inst = new Instructor();
        var lesson = new Lesson<String >(cl, inst,"20.02.2024","13.00",1, tt);//Комментарии об уроке
        System.out.println(lesson);
        System.out.println("Доп. Информация: "+lesson.getDopInfo()+"\n");
        var lesson2 = new Lesson<Integer >(cl, inst,"20.02.2024","13.00",1, 17);//Кол-во часов практики
        System.out.println(lesson2);
        System.out.println("Доп. Информация: "+lesson2.getDopInfo()+"\n");
    }
}