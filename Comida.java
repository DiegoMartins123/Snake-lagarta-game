import java.util.Random;

public class Comida {

    private final int posX;
    private final int posY;

    public Comida() {
        posX = generatePos(Graphics.WIDTH);
        posY = generatePos(Graphics.HEIGHT);
    }

    private int generatePos(int size) {
        Random random = new Random();
        return random.nextInt(size / Graphics.TICK_SIZE) * Graphics.TICK_SIZE;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
}