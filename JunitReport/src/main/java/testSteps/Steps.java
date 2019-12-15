package testSteps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Steps {
    private static final Logger LOG = LoggerFactory.getLogger(Steps.class.getName());

    public boolean getTrue() {
        LOG.info("Returning element: true");
        return true;
    }

    public boolean getFalse() {
        LOG.info("Returning element: false");
        return false;
    }

    public boolean getRandomBoolean() {
        int trues = 0;
        int falses = 0;
        boolean rand = false;
        for (int i = 0; i < 100; i++) {
            rand = new Random().nextBoolean();
            if (rand) {
                trues++;
            } else {
                falses++;
            }
        }
        LOG.info("Trues: " + trues);
        LOG.info("Falses: " + falses);
        LOG.info("Random is " + rand);
        return rand;
    }

    public Object getNull() {
        LOG.info("Returning element: null");
        return null;
    }

    public Object getNotNull() {
        LOG.info("Returning element: not null");
        return 1;
    }

    public Integer getNumber(int i) {
        LOG.info("Returning Integer: " + i);
        return i;
    }

    public int[] getArray(int... values) {
        LOG.info("Returning int Array of: " + printArray((Object) values));
        return values;
    }

    public Iterable<?> getIterable(Integer... values) {
        LOG.info("Returning Iterable of: " + printArray((Object) values));
        return new ArrayList<>(Arrays.asList(values));
    }

    public List<String> getList(String...words) {
        LOG.info("Returning List of: " + printArray((Object) words));
        return new ArrayList<>(Arrays.asList(words));
    }

    public void throwIllegalArgumentException(String msg) {
        throw new IllegalArgumentException(msg);
    }

    private String printArray(Object... values) {
        StringBuilder msg = new StringBuilder();
        for (int i = 0; i < values.length - 1; i++) {
            msg.append(values[i]).append(", ");
        }
        msg.append(values[values.length - 1]);
        return msg.toString();
    }
}
