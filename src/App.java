import java.sql.Time;

public class App {
    public static void main(String[] args) throws Exception {
        AutoboxingExperiment autoboxing = new AutoboxingExperiment();
        System.out.println("boolean primitive to primitive: " + autoboxing.purePrimitiveBoolean(Integer.MAX_VALUE));

        System.out.println("boolean primitive to wapper class (with autoboxing): " + autoboxing.withAutoboxingBoolean(Integer.MAX_VALUE));
        System.out.println("boolean without autoboxing by using Boolean.TRUE: " + autoboxing.withoutAutoboxingBoolean(Integer.MAX_VALUE));
    }
    
}
