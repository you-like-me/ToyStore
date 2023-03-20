import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Game {
    public List<Toy> elementWeight(List<Toy> toyList){
        PrintFile pf = new PrintFile();
        if (toyList.size() > 0){
            ArrayList<Double> weights = new ArrayList<>();
            double sumWeight = 1;
            double count_freaq = 0;
            for (Toy item: toyList) {
                weights.add(item.getFreaquecy());
                sumWeight += item.getFreaquecy();
            }
            Random rnd = new Random();
            int rndNumber = rnd.nextInt(1, (int) sumWeight);

            for (Toy item: toyList) {
                count_freaq += item.getFreaquecy();
                if (count_freaq >= rndNumber){
                    if (item.getQuantity() > 0){
                        System.out.printf("Игрушка: %s, %d\n", item.getName(), item.getQuantity());
                        item.setQuantity(item.getQuantity() - 1);
                        break;
                    }else{
                        System.out.printf("Игрушка: %s, %d\n", item.getName(), item.getQuantity());
                        toyList.remove(item);
                        break;
                    }
                }
            }
        }else{
            System.out.println("Игрушки отсуствуют");
        }

        return toyList;
    }

    public List<Toy> addToy(List<Toy> toys, Toy toy){
        for (Toy item: toys) {
            if (item.getName().equals(toy.getName())){
                item.setQuantity(item.getQuantity() + toy.getQuantity());
                System.out.println("Такая игрушка уже есть");
                return toys;
            }
        }
        toys.add(toy);

        return toys;
    }

    public List<Toy> creatToys(){
        Toy toy1 = new Toy(1, "Bunny", 10, 10);
        Toy toy2 = new Toy(2, "Doll", 10, 20);
        Toy toy3 = new Toy(3, "Car", 10, 30);
        Toy toy4 = new Toy(4, "Fox", 10, 40);
        Toy toy5 = new Toy(5, "Cat", 10, 50);
        Toy toy6 = new Toy(6, "Dog", 10, 60);
        Toy toy7 = new Toy(7, "Hedgehog", 10, 70);
        Toy toy8 = new Toy(8, "Ball", 10, 80);
        Toy toy9 = new Toy(9, "Bear", 10, 90);
        Toy toy10 = new Toy(10, "Squirrel", 10, 99);
        List<Toy> toys = new ArrayList<>();
        toys.add(toy1);
        toys.add(toy2);
        toys.add(toy3);
        toys.add(toy4);
        toys.add(toy5);
        toys.add(toy6);
        toys.add(toy7);
        toys.add(toy8);
        toys.add(toy9);
        toys.add(toy10);
        return toys;
    }
}