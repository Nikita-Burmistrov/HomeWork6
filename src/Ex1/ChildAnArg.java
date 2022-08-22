package Ex1;

public class ChildAnArg extends AnimalWithArgument{
    ChildAnArg(){
        name = "Собака";
        age = 7;
        weight = 12;
        sex = Sex.male;
    }
    public static void main(String[] args) {
        AnimalWithArgument animal= new AnimalWithArgument();
        animal.PrintInfo();
        animal.CheckWeight();
        System.out.println("");

        AnimalWithArgument animal2 = new AnimalWithArgument("Корова",23,50, Sex.female);
        animal2.PrintInfo();
        animal2.CheckWeight();
        System.out.println("");

        Animal animal1= new Animal();
        animal1.PrintInfo();
        animal1.CheckWeight();
        System.out.println("");

        Animal animal3= new Animal("Кошка",8,8, Animal.Sex.female);
        animal3.PrintInfo();
        animal3.CheckWeight();
        System.out.println("");

        ChildAn animals = new ChildAn();
        animals.PrintInfo();
        animals.CheckWeight();
        System.out.println("");

        ChildAnArg ahoi = new ChildAnArg();
        ahoi.PrintInfo();
        ahoi.CheckWeight();
    }
    }


