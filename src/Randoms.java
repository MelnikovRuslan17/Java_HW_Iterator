import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private int min;
    private int max;

    public Randoms(int min, int max) {
        random = new Random();
        this.max = max;
        this.min = min;
    }

    public int genInt() {
        return (int) (Math.random() * (max - min) +2 ) + min; //подходит и +1
    }

    @Override
    public Iterator iterator() {
        return new Iterator();
    }

    class Iterator implements java.util.Iterator<Integer> {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
           return Randoms.this.genInt();

        }
    }
}
