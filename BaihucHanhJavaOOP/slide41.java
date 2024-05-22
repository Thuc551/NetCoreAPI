import java.util.Scanner;
import java.util.LinkedList;

public class slide41 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Thang 1");
        linkedList.add("Thang 2");
        linkedList.add("Thang 3");
        linkedList.add("Thang 4");
        linkedList.add("Thang 5");
        linkedList.add("Thang 6");
        linkedList.add("Thang 7");
        linkedList.add("Thang 8");
        linkedList.add("Thang 9");
        linkedList.add("Thang 10");
        linkedList.add("Thang 11");
        linkedList.add("Thang 12");


        System.out.println("nhap vao chi so phan tu can lay: ");
        int index = scanner.nextInt();
        if ((index < 0 ) || (index > (linkedList.size() - 1))) {
            System.out.println(" chi so can lay phai lon hon 0 va be hon " + (linkedList.size() - 1));

        }else{
            String node = linkedList.get(index);
            System.out.println("Phan tu co chi so = " + index + " trong linkedList la " + node );
        }
        String firstNode = linkedList.getFirst();
        String lastNode = linkedList.getLast();

        System.out.println("\n phan tu dau tien trong danh sach la" + firstNode + " ; Phan tu cuoi trong danh sach la " + lastNode);
    }
}