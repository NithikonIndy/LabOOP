import java.util.Comparator;

public class Lab08 {
    public static void main(String[] args) {
        set data1 = new set();
        data1.add("Joy");
        data1.add("Noey");
        data1.add("Fah");
        data1.add("Fah");
        set data2 =new set();
        data2.add("Book");
        data2.add("Toa");
        data2.add("Drive");
        System.out.println("Equal is "+ data1.equal(2,3));
        data1.toarray();
        data1.hashcode(0);
        data1.hashcode(1);
        data1.hashcode(2);
        set data3 = new set();
        data1.add("Joy");
        data1.add("Noey");


        Comparator<String> setComparator = (op1, op2)->{
            if(op1.length() != op2.length()){
                return op1.compareTo(op2);
            }
            return op1.compareTo(op2);
        };

        System.out.println(setComparator.compare(data2.toString(),data1.toString()));
        System.out.println(setComparator.compare(data3.toString(),data2.toString()));

    }
}