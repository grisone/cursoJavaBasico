package cl.kibernum.clases;

/**
 * Created by Kibernum on 19/05/2016.
 */
public class Sofa implements Silla {


    @Override
    public int material() {
        throw new UnsupportedOperationException("perrro, esto aun no se desarrolla");
    }

    @Override
    public int forro() {
        throw new UnsupportedOperationException("perrro, esto aun no se desarrolla");
    }

    @Override
    public int sumar(int... nums) {
        int total = 0;
        for (int i=0 ; i < nums.length ; i++) {
            total += nums[i];
        }
        return total;
    }
}
