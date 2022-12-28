/*
Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
Return the linked list sorted as well.
*/

function deleteDuplicates(head: ListNode | null): ListNode | null {
    //Compare the current list node with the next one.
    //If the current and next are same, then move the pointer to further one.
    let current = head;
    while(current && current.next){
        if(current.val === current.next.val){
            current.next = current.next.next;
        }else{
            current = current.next;
        }
    }
    return head;
};
