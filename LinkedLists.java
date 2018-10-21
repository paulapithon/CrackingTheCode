public class LinkedLists {
    public static void main(String[] args) {

        /**2.1**/
        ListNode node = ListNodeHelper.stringToListNode("[1, 2, 3, 2, 3]");
        ListNodeHelper.prettyPrintLinkedList(RemoveDups.run(node)); //1->2->3
    }
}