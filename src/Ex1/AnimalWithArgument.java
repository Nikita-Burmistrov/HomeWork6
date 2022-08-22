package Ex1;

public class AnimalWithArgument {
    String name;
    int age;
    int weight;
    int sweight =50;
    int sage = 20;
    AnimalWithArgument.Sex sex;
    public enum Sex {male,female}
    AnimalWithArgument(){
        this.name = "Акула";
        this.age = 23;
        this.weight = 60;
        sex= Sex.female;
    }
    AnimalWithArgument(String name,int age,int weight,Sex sex){
        this.weight = weight;
        this.name = name;
        this.sex = sex;
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
