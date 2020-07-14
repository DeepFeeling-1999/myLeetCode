package 链表相关.Q19_删除链表的倒数第N个节点;

import A节点及相关依赖.ListNode;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode  temp=new ListNode(0);
        temp.next=head;
        ListNode front=temp;
        ListNode rear=temp;


        for(int i=1;front.next!=null;){
            if(i!=n+1){
                front=front.next;
                i++;
            }else{
                front=front.next;
                rear=rear.next;
            }
        }
        rear.next=rear.next.next;
        return head;
    }

    public static void main(String[]args){
        ListNode head=new ListNode(1);
        head.next=null;
        System.out.println((new Solution()).removeNthFromEnd(head,1));
    }
}
