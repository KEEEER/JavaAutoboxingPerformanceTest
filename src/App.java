import java.sql.Time;

public class App {
    public static void main(String[] args) throws Exception {
        int times = 1000;
        AutoboxingExperiment autoboxing = new AutoboxingExperiment();
        System.out.println("boolean primitive to primitive: " + autoboxing.purePrimitiveBoolean(times));

        System.out.println("boolean primitive to wapper class (with autoboxing): " + autoboxing.withAutoboxingBoolean(times));
        System.out.println("boolean without autoboxing by using Boolean.TRUE: " + autoboxing.withoutAutoboxingBoolean(times));
    }
    
}
