package mads.edu;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class GameOfOctopus implements Runnable{

    private static ArrayList<String> names;

    static {
        try {
            names = FileReader.readFile("res/names.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<String> facts;

    static {
        try {
            facts = FileReader.readFile("res/octofacts.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static Random rand = new Random();

    @Override
    public void run() {
        String name = generateName();
        Octopus otto = new Octopus(name);
        otto.makeDoActivity();
    }

    private String generateName(){
        return names.get(rand.nextInt(names.size()));
    }

    public static void getRandomOctofact(){
        System.out.println("Random octofact:\n");
        System.out.println(facts.get(rand.nextInt(facts.size())));
        System.out.println("\nSource: https://www.smithsonianmag.com/science-nature/ten-curious-facts-about-octopuses-7625828/\n");
    }
}
