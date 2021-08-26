
import org.apache.commons.lang3.time.StopWatch;

public class AutoboxingInteger {

    private StopWatch watch;

    public AutoboxingInteger(){
        watch = new StopWatch();
    }
    
    public long loopWithAutoboxing(int times) {
        this.watch.reset();
        this.watch.start();
        Integer b;
        for(double i=0 ; i<times ; i++) {
            b = (int)i;
        }
        this.watch.stop();
        return watch.getNanoTime();
    }

    public long loopWithoutAutoboxing(int times) {
        this.watch.reset();
        this.watch.start();
        Integer b;
        for(double i=0 ; i<times ; i++) {
            b = Integer.valueOf((int)i);
        }
        this.watch.stop();
        return watch.getNanoTime(); 
    }

    public void withAutoboxing(int i) {
        Integer b;
        b = i;
    }

    public void withoutAutoboxing(int i) {
        Integer b;
        b = Integer.valueOf(i);
    }
}
