package dz;

import java.util.Random;

public interface MainRandom {
    static int random(){
        return new Random().nextInt();
    }
}
