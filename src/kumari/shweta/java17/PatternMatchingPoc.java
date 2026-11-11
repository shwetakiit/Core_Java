package kumari.shweta.java17;

public class PatternMatchingPoc {

    public static void process(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("Integer" + (i * 2));
            case String s -> System.out.println("String " + s);
            case Double d -> System.out.println("Double" + (d + 10.5));
            case null -> System.out.println("Null value provided");
            default -> System.out.println("Unknow type");
        }
    }

    public static void main(String[] args) {
        process(10);
        process(10.5);
        process(null);
        process("Shweta");
    }
}
