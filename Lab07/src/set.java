import java.util.HashMap;
import java.util.Iterator;


interface iterator <Type>{
    void iterator();
    Iterator it = new Iterator() {
        /**
         * Returns {@code true} if the iteration has more elements.
         * (In other words, returns {@code true} if {@link #next} would
         * return an element rather than throwing an exception.)
         *
         * @return {@code true} if the iteration has more elements
         */
        public boolean hasNext() {

            return true;
        }

        /**
         * Returns the next element in the iteration.
         *
         * @return the next element in the iteration
         * @thorw No SuchElementException if the iteration has no more elements
         */
        public Object next() {
            return null;
        }
    };

}
public  class set <Type> implements iterator{

    static int index ;

    private boolean check;
    HashMap<Integer, Type> hashmap = new HashMap<Integer, Type>();

    public set(){
        // create Object
    }
    public int size() { //chcek range of size
        return index;
    }
    public boolean isEmpty() { //check empty set
        if(hashmap.isEmpty()!=true){
            return check;
        }else {
            check=true;
        }

        return check;
    }
    public boolean add(Type text){ // add text to set
        hashmap.put(index,text);
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
    public void clear(){ //delete all in set
        hashmap.clear();
        index=0;
    }

    public void show(){  //show set
        System.out.println(hashmap);
    }


    @Override
    public void iterator() {

    }

}



