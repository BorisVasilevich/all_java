// Разработать программу, имитирующую поведение коллекции HashSet. 
//В программе содать метод add добавляющий элемент, 
//метод toString возвращающий строку с элементами множества t
//*и метод позволяющий читать элементы по индексу.
// *Реализовать все методы из семинара.
// Формат данных Integer.
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;

public class home_6 {
    public static void main(String [] args){
        Set<Integer> set_1 = new Set();
        System.out.println(set_1.add(555));
        System.out.println(set_1.add(123));
        System.out.println(set_1.add(456));
        System.out.println(set_1.size());
        System.out.println(set_1.isEmpty());
        Iterator<Integer> it = set_1.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }
        
    }    

}
    class Set<E> {
        private HashMap<E, Object> set = new HashMap<>();
        private static final Object VALL = new Object();
        public boolean add(E tel){
            return set.put(tel, VALL) == null;
        }
        public boolean remove(E tel){
            return set.remove(tel) == VALL;
        }
        public int size(){
            return set.size();
        }
        public boolean isEmpty(){
            return set.isEmpty();
        }
        public Iterator<E>iterator(){
            return set.keySet().iterator();
        }
    }

