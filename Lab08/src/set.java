import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;


public class set <Type> {

    private int index;

    private boolean check;

    HashMap<Integer, Type> hashmap = new HashMap<>();
    
    
    public set(){
        // create Object
    }
    public int size() { //chcek range of size
        return index;
    }
    public boolean add(Type text){ // add text to set
        hashmap.put(index, text);
        index++;
        return true;

    }
    public boolean remove(Type index){  //remove text in set
        int checkindex=this.index-1;
        if(hashmap.isEmpty()==true){
            // n't remove
            System.out.println("Set Empty");
            return false;
        }
        else{
            hashmap.remove(index);
            this.index--;
            return true;
        }
    }
    public boolean isEmpty() { //check empty set
        if(hashmap.isEmpty()!=true){
            return check;
        }else {
            check=true;
        }

        return check;
    }
    public  boolean contains(Type txt){   //find text in set
        boolean checktext=hashmap.containsValue(txt);
        if(checktext==true){
            return  true;

        }else {
            return false;
        }
    }
    public  boolean containsall(set input){   //find text in set
        for (int i = 0; i < input.hashmap.size(); i++) {
            if (!this.hashmap.containsValue(input.hashmap.get(i))) {
                return false;
            }
        }
        return true;
    }
    public boolean addAll(set input){
        if(!this.containsall(input)){
            for (int i = 0; i < input.hashmap.size(); i++) {
                if(!this.hashmap.containsValue(input.hashmap.get(i))){
                    this.hashmap.put(index, (Type) input.hashmap.get(i));
                    index++;
                    return true;
                }
            }
        }

        return false;
    }
    public boolean removeAll(set input){
        for(int i=0;i<this.index;i++){
            //Each input1's value,it's repeat
            if(input.hashmap.containsValue(this.hashmap.get(i))){
                this.hashmap.remove(i);
                return true;
            }
        }
        return false;
    }
    public boolean retainAll(set input){
        for(int i=0;i<this.index;i++){
            //Each input1's value,it's not repeat
            if(!input.hashmap.containsValue(this.hashmap.get(i))){
                this.hashmap.remove(i);
                return true;
            }
        }
        return false;
    }

    public String[] spilt() {    // split txt int set and show
        String text = String.valueOf(hashmap);
        String split1[] = text.split(",");
        String savetext[] = new String[index];
        for (int i = 0; i < split1.length; i++) {
            String temp = split1[i];
            String split2[] = (temp.split("\\="));
            int index = split1.length - 1;
            if (i == index) {
                String del = split2[1];
                String split3[] = del.split("}");
                savetext[i] = split3[0];
            } else {
                savetext[i] = split2[1];
            }
        }

        return savetext;
    }
    public boolean equal(int key1,int key2){
        if(hashmap.get(key1)==hashmap.get(key2)){
            return true;
        }
        return false;
    }
    // refeerence by https://www.baeldung.com/java-hashcode
    public int hashcode(int index){

        System.out.print("HashCode : ");
        final int prime = 31;
        int result = 1;

        result = prime * result + index;
        System.out.println(" Index " + index + " : " + result);

        return result;

    }

    public void toarray(){
        printArray(sortLexicographically(spilt())) ;

    }

    //reference by https://www.geeksforgeeks.org/java-program-to-sort-elements-in-lexicographical-order-dictionary-order/
    public String[] sortLexicographically(String strArr[]) {
        for (int i = 0; i < strArr.length; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (strArr[i].compareToIgnoreCase(strArr[j]) > 0) {
                    String temp = strArr[i];
                    strArr[i] = strArr[j];
                    strArr[j] = temp;
                }
            }
        }
        return strArr;
    }
    public void printArray(String strArr[])
    {
        for (String string : strArr)
            System.out.print(string + " ");
        System.out.println();
    }

    public void clear(){ //delete all in set
        hashmap.clear();
    }


    public void show(){  //show set
        System.out.println(hashmap);
    }


    //reference br neab parinya mungrod 630612104
    public static <Type> Comparator<set<Type>> setComparator(Comparator<Type> cmp){
        Comparator<set<Type>> comparator = (data1,data2) ->{
            if(data1.hashmap.size() != data2.hashmap.size()){
                return data1.hashmap.size() - data2.hashmap.size();
            }
            Iterator<Type> Obj1 = (Iterator<Type>)data1.hashmap.values().iterator();
            Iterator<Type> Obj2 = (Iterator<Type>) data2.hashmap.values().iterator();
            while(Obj1.hasNext() && Obj2.hasNext()){
                Type Obj1Next = Obj1.next();
                Type Obj2Next = Obj2.next();
                if(cmp.compare(Obj1Next,Obj2Next) != 0){
                    return cmp.compare(Obj1Next,Obj2Next);
                }else{
                    continue;
                }
            }
            return 0;
        };
        return comparator;
    }


}

