/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode aux = new ListNode();
        ListNode resultado = aux;
        int suma, carry=0, auxVal;
        for(int i=0;i<100;i++){
            suma = l1.val+l2.val+carry;
            if(suma>9){
                carry = 1;
                aux.val = suma - 10; 
            }else{
                carry=0;
                aux.val=suma;
            }
            
            if(l1.next == null && l2.next==null){
                if(carry>0){
                    aux.next = new ListNode();
                    aux = aux.next;
                    aux.val=carry;
                }
                break;
            }
            
            aux.next = new ListNode();
            aux = aux.next;
            if(l1.next==null) l1.next = new ListNode(0);
            l1 = l1.next;
            if(l2.next==null) l2.next = new ListNode(0);
            l2 = l2.next;
        }
        return resultado;
    }
}