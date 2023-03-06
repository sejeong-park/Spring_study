public class WhyMethod {
    public static void printTwoTimes(String text, String delimiter){
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
    }
    public static String twoTimes(String text, String delimiter){
        String out = "";
        out = out + delimiter + "\n";
        out = out + text + "\n";
        out = out + text + "\n";
        return out;
    }
    public static void main(String[] args) {
        // 1000000~~ 1억번
        printTwoTimes("A", "-");
        printTwoTimes("B", "*");
        printTwoTimes("C", "&");

        System.out.println(twoTimes("Hi ", "*"));
    }

}