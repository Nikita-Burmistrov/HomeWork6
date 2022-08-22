package Ex1;

public class Animal {
    String name;
    int sweight =50;
    int sage = 30;
    int age;
    int weight;
    Sex  sex;
    public enum Sex {male,female}

    Animal(){
        name = "Обезьяна";
        age = 15;
        weight = 21;
        sex= Sex.male;
    }
    Animal(String name,int age,int weight,Sex sex){
        this.sex= sex;
        this.name = name;
        this.weight = weight;
        this.age = age;
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


