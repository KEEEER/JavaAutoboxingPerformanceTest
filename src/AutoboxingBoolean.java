
import org.apache.commons.lang3.time.StopWatch;

public class AutoboxingBoolean {
    private StopWatch watch;

    public AutoboxingBoolean(){
        watch = new StopWatch();
    }
    
    public long loopWithAutoboxing(int times) {
        this.watch.reset();
        this.watch.start();
        Boolean b;
        for(double i=0 ; i<times ; i++) {
            b = true;
        }
        this.watch.stop();
        return watch.getNanoTime();
    }

    public long loopWithoutAutoboxing(int times) {
        this.watch.reset();
        this.watch.start();
        Boolean b;
        for(double i=0 ; i<times ; i++) {
            b = Boolean.TRUE;
        }
        this.watch.stop();
        return watch.getNanoTime(); 
    }

    public long loopUseNewObject(int times) {
        this.watch.reset();
        this.watch.start();
        Boolean b;
        for(double i=0 ; i<times ; i++) {
            b = new Boolean(true);
        }
        this.watch.stop();
        return watch.getNanoTime(); 
    }
    
    public void withAutoboxing() {
        Boolean b;
        b = true;
    }

    public void withoutAutoboxing() {
        Boolean b;
        b = Boolean.TRUE;
    }

    public void useNewObject() {
        Boolean b;
        b = new Boolean(true);
    }
}