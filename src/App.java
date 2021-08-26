import org.apache.commons.lang3.time.StopWatch;

public class App {
    public static void main(String[] args) throws Exception {
        int times = 100000000;
        // AutoboxingExperiment autoboxing = new AutoboxingExperiment();
        AutoboxingBoolean autoboxingBoolean = new AutoboxingBoolean();
        AutoboxingInteger autoboxingInteger = new AutoboxingInteger();
        AutoboxingLong autoboxingLong = new AutoboxingLong();
        System.out.println("boolean with autoboxing:                        " + autoboxingBoolean.loopWithAutoboxing(times));
        System.out.println("boolean without autoboxing:                     " + autoboxingBoolean.loopWithoutAutoboxing(times));
        System.out.println("boolean use new object:                         " + autoboxingBoolean.loopUseNewObject(times));
    
        StopWatch watch = new StopWatch();
        watch.start();
        for(double i=0 ; i<times ; i++){
            autoboxingBoolean.withAutoboxing();
        }
        watch.stop();
        System.out.println("boolean with autoboxing    (call function ver): " + watch.getNanoTime());

        watch.reset();
        watch.start();
        for(double i=0 ; i<times ; i++){
            autoboxingBoolean.withAutoboxing();
        }
        watch.stop();
        System.out.println("boolean without autoboxing (call function ver): " + watch.getNanoTime());

        watch.reset();
        watch.start();
        for(double i=0 ; i<times ; i++){
            autoboxingBoolean.useNewObject();
        }
        watch.stop();
        System.out.println("boolean use new object     (call function ver): " + watch.getNanoTime());
        

        System.out.println("Integer with autoboxing:                        " + autoboxingInteger.loopWithAutoboxing(times));
        System.out.println("Integer without autoboxing:                     " + autoboxingInteger.loopWithoutAutoboxing(times));
        System.out.println("Long with autoboxing:                           " + autoboxingLong.loopWithAutoboxing(times));
        System.out.println("Long without autoboxing:                        " + autoboxingLong.loopWithoutAutoboxing(times));
        
    }
    
    
}
