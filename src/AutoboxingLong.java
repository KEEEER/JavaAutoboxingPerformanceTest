import org.apache.commons.lang3.time.StopWatch;

public class AutoboxingLong {
    private StopWatch watch;

    public AutoboxingLong(){
        watch = new StopWatch();
    }
    
    public long loopWithAutoboxing(int times) {
        this.watch.reset();
        this.watch.start();
        Long b;
        for(double i=0 ; i<times ; i++) {      
            b = (long)i+1;
            b = (long)i+2;
            b = (long)i+3;
            b = (long)i+4;
            b = (long)i+5;
            b = (long)i+6;
            b = (long)i+7;
            b = (long)i+8;
            b = (long)i+9;
            b = (long)i+10;  
        }
        this.watch.stop();
        return watch.getNanoTime();
    }

    public long loopWithoutAutoboxing(int times) {
        this.watch.reset();
        this.watch.start();
        Long b;
        for(double i=0 ; i<times ; i++) {
            b = Long.valueOf((long)i+1);
            b = Long.valueOf((long)i+2);
            b = Long.valueOf((long)i+3);
            b = Long.valueOf((long)i+4);
            b = Long.valueOf((long)i+5);
            b = Long.valueOf((long)i+6);
            b = Long.valueOf((long)i+7);
            b = Long.valueOf((long)i+8);
            b = Long.valueOf((long)i+9);
            b = Long.valueOf((long)i+10);
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
