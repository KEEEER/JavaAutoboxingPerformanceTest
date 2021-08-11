import org.apache.commons.lang3.time.StopWatch;

public class AutoboxingExperiment {

    public long purePrimitiveBoolean(int times) {
        StopWatch watch = new StopWatch();
        watch.start();
        boolean b;
        for(double i=0 ; i<times ; i++) {
            b = true;
        }
        watch.stop();
        return watch.getNanoTime(); 
    }

    public long withAutoboxingBoolean(int times) {
        StopWatch watch = new StopWatch();
        watch.start();
        Boolean b;
        for(double i=0 ; i<times ; i++) {
            b = true;
        }
        watch.stop();
        return watch.getNanoTime();
    }

    public long withoutAutoboxingBoolean(int times) {
        StopWatch watch = new StopWatch();
        watch.start();
        Boolean b;
        for(double i=0 ; i<times ; i++) {
            b = Boolean.TRUE;
        }
        watch.stop();
        return watch.getNanoTime(); 
    }
}