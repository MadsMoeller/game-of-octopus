package mads.edu;

public class Play {
    public static void playGame()throws InterruptedException{
        GameOfOctopus.getRandomOctofact();
        
        GameOfOctopus game = new GameOfOctopus();
        Thread gameThread = new Thread(game);
        gameThread.start();
        gameThread.join();

        PictureDisplay.displayPicture();
        throw new OctopusOverflowException("I've had it with these mothersquidding octopodes in this mothersquidding console!");

    }
}
