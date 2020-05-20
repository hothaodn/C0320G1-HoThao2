import java.util.*;

public class TestArraysListLinkedList {
    public static void main(String[] args) {
        // khai báo một List Interface có tên là listWord
        // listWord có kiểu là String
        List<String> listWord = new ArrayList<String>();
        listWord.add("Apple");
        listWord.add("Banana");
        listWord.add("Orange");
        System.out.println(listWord.contains("Apple"));
        System.out.println("-->"+listWord.get(1));
        listWord.set(2,"CARROT");
        listWord.remove(1);
        System.out.println(listWord.indexOf("Banana"));

        // khai báo List Interface có tên là listString
        // kiểu dữ liệu là String
        List<String> listString = new ArrayList<String>();
        listString.add("Lemon");
        listString.add("Grape");

        // thêm các phần tử của listWord
        // vào cuối của listString
        listString.addAll(listWord);

        System.out.println("Các phần tử có trong listString là: ");
        for (String str : listString) {
            System.out.println(str);
        }

        List<Integer> hehe = new LinkedList<Integer>();
        hehe.add(66);
        hehe.add(9999);
        hehe.add(898989);
        hehe.add(3,1111111);
        //hehe.add(1111);
        List<Integer> hihi = new LinkedList<Integer>();
        hehe.add(1);
        hehe.add(3);
        hehe.add(6);

        hehe.addAll(hihi);
        //for(Integer print : hehe){
        //    System.out.println(print);
        //}

        //// khai báo một Iterator
        Iterator<Integer> iter = null;
        // Lấy ra đối tượng iterator để truy cập vào các phần tử của tập hợp.
        // Đối tượng iterator này chỉ chứa các integer.
        // Lúc này iterator sẽ trỏ vào
        // chỉ số trước chỉ số của phần tử đầu tiên trong listString
        // Kiểm tra xem Iterator còn phần tử tiếp theo hay không?
        // Nếu có thì sẽ di chuyển vị trí mà iterator
        // đang trỏ vào sang vị trí của phần tử kế tiếp
        // và hiển thị phần tử đó ra
        iter = hehe.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        List<String> alphabet = new LinkedList<String>();
        alphabet.add("C");
        alphabet.add("A");
        alphabet.add("G");
        alphabet.add("H");
        Collections.sort(alphabet);
        System.out.println(alphabet);

        List<String> alphabetNew = new LinkedList<String>();
        alphabetNew.add("s");
        alphabetNew.add("s");
        alphabetNew.add("s");
        alphabetNew.add("s");
        alphabetNew.add("s");
        Collections.copy(alphabetNew,alphabet);
        System.out.println(alphabetNew);
    }
}

