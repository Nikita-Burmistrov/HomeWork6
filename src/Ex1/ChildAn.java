package Ex1;

public class ChildAn extends Animal{
ChildAn (){
    name = "Зебра";
    age = 23;
    weight = 50;
    sex = Sex.female;
}
    void CheckWeight(){
        if (sweight > weight){
            System.out.println(name + " ниже среднего веса");
        }else if (sweight < weight){
            System.out.println(name + " выше среднего веса");
        }else System.out.println("Ровно 50кг");
    }
    void PrintInfo(){
        String info = "Назвиние животного " + name + ". Вес:" +weight+"кг "+". Пол:"+sex+". Возрост:"+age;
        System.out.println(info);
    }
}
