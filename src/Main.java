import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Game game = new Game();
        SaveFile csv = new SaveFile();
        List<Toy> toys = game.creatToys();
        csv.writeResult(toys.get(0), false);
        toys.remove(0);
        for (Toy item : toys) {
            csv.writeResult(item, true);
        }
        View us = new View();
        us.menu();
    }
}