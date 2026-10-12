/**
 * testSinglyLinkedList
 */
public class testDoublyLinkedList {

    public static void main(String[] args) {
      //   DoublyLinkedList linkedList = new DoublyLinkedList();
      // linkedList.addFirst(1);
      //   linkedList.addFirst(2);
      //   linkedList.addFirst(3);
      //   linkedList.addFirst(4);
      //   linkedList.addFirst(5);
      //   linkedList.addFirst(6);
      //   System.out.println(linkedList.get(2)); // menghasilkan nilai 3
      //   System.out.println(linkedList.get(12)); //Terjadi exception error
      //   System.out.println(linkedList.indexOf(4));// menghasilkan 5
      //   System.out.println(linkedList.indexOf(10));// menghasilkan -1
      //   linkedList.printReverse(); // Menghasilkan 6,5,4,3,2,1
      //   System.out.println(linkedList.remove(3)); // Menghasilkan True
      //   System.out.println(linkedList.remove(8)); // Menghasilkan False
      //   System.out.println(linkedList.toArray()); //Menghasilkan [6,5,4,3,2,1]

        DoublyLinkedList linkedList = new DoublyLinkedList();
      linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.addFirst(5);
        linkedList.addFirst(6);
        System.out.println(linkedList.get(2)); // menghasilkan nilai 3 
        //hasil percobaan: nilai 4, karena proses penambahan data menggunakan addFirst, jadi urutan node adalah 6,5,4,3,2,1. 
        // Jadi index ke-2 adalah 4.
        System.out.println(linkedList.get(12)); //Terjadi exception error
        //Hasil percobaan: nilai null, karena diberi kondisi if(isEmpty() || index > size || index < 0)
        //agar kita bisa tahu hasil program hingga akhir. **Hasil tanpa ditambahkan seleksi kondisi juga terjadi exception error.**
        System.out.println(linkedList.indexOf(4));// menghasilkan 5
        //hasil percobaan: nilai 2, karena proses penambahan data menggunakan addFirst.
        //jadi urutan node adalah 6,5,4,3,2,1 dan urutan ke-4 itu nilai 2.
        System.out.println(linkedList.indexOf(10));// menghasilkan -1
        //hasil percobaan: nilai -1, karena data lebih dari size.
        linkedList.printReverse(); // Menghasilkan 6,5,4,3,2,1
        //hasil percobaan: nilai 1,2,3,4,5,6 karena menggunakan printReverse().
        //Proses penambahan data menggunakan addFirst, jadi urutan awalnya 6,5,4,3,2,1.
        System.out.println(linkedList.remove(3)); // Menghasilkan True
        System.out.println(linkedList.remove(8)); // Menghasilkan False
        System.out.println(linkedList.toArray()); //Menghasilkan [6,5,4,3,2,1]
        //hasil percobaan: menghasilkan alamat object array, karena tipe return adalah Object[].
        //isi array tidak memiliki nilai 3 karena sudah dihapus.
       
        //untuk menampilkan isi array.
        Object[] arr = linkedList.toArray();
        System.out.print("isi array : [");
        for(Object each  : arr){
            System.out.print(each);
            if(each != arr[arr.length-1]){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
