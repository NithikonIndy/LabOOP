public class Lab07 {
    public static void main(String[] args) {
        set s = new set();
        s.remove(0);
        s.add("tea");
        System.out.println( s.isEmpty());
        s.add("neab");
        s.add("top");
        s.add("GG");
        s.show();
        s.remove(3);
        s.show();
        s.add("tt");
        s.show();
        s.show();
        set s2 =new set();
        s2.add("tea");
        s2.add("neab");
        set s3 =new set();
        s3.add("tttt");
        System.out.println(s.containsall(s2));
        System.out.println(s2.containsall(s3));
        s.addAll(s3);
        s.show();
        s.removeAll(s3);
        s.show();
        System.out.println( s.contains("neab"));
    }
}