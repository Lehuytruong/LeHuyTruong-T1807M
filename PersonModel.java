package Assignment02;


import java.util.ArrayList;


public class PersonModel <E> {
        ArrayList<E> list = new ArrayList<>();

        public void add (E e){
            list.add(e);
        }
        public void input(){
            for (E item:list){
                item.toString();
            }
        }
}
