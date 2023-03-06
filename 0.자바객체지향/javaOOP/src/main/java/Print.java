public class Print {
    public String delimiter = "";
    public Print(String _delimiter){
       this.delimiter = _delimiter;
    }
    public void A() {
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
    public void B() {
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}
