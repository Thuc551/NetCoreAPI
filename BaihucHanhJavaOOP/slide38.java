import java.util.LinkedList;

public class slide38 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        
        linkedList.add("Java");
        linkedList.add("C++");
        linkedList.add("PHP");


        System.out.println("LinkedList ban dau: " + linkedList);

 
        linkedList.addFirst("ListA");
        System.out.println("LinkedList sau khi them vao dau: " + linkedList);


        linkedList.addLast("ListB");
        System.out.println("LinkedList sau khi them vao cuoi: " + linkedList);


        String firstElement = linkedList.getFirst();
        System.out.println("Phan tu dau tien: " + firstElement);

        String lastElement = linkedList.getLast();
        System.out.println("Phan tu cuoi cung: " + lastElement);

        linkedList.removeFirst();
        System.out.println("LinkedList sau khi xoa phan tu dau: " + linkedList);

        linkedList.removeLast();
        System.out.println("LinkedList sau khi xoa phan tu cuoi: " + linkedList);

        
        boolean contains = linkedList.contains("Banana");
        System.out.println("LinkedList co chua 'C++'? " + contains);

       
        int size = linkedList.size();
        System.out.println("So luong phan tu trong LinkedList: " + size);

        linkedList.clear();
        System.out.println("LinkedList sau khi xoa tat ca phan tu: " + linkedList);

        boolean isEmpty = linkedList.isEmpty();
        System.out.println("LinkedList co rong khong? " + isEmpty);
    }
}