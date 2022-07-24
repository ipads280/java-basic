public class Main {
    public static void main(String[] args) {
        String s1="スッキリjava";
        String s2="Java";
        String s3="java";
        
        if (s2.equals(s3)) {
            System.out.println("s2とs3は等しい");
        }
        if (s2.equalsIgnoreCase(s3)) {
            System.out.println("s2とs3はケースを区別しなければ等しい");
        }
        System.out.pritnln("slの長さは"+sl.length()+"です");
        if (s1.isEmpty()) {
            System.out.println("s1は空文字です");
        }
    }
}