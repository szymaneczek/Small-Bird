import javax.swing.*;


public class GameApp {
    public static void main(String[] args) throws Exception {
        int boardWidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("Small Bird - try not to collide");
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BirdGame birdGame = new BirdGame();
        frame.add(birdGame);
        frame.pack();
        birdGame.requestFocus();
        frame.setVisible(true);
    }
}

