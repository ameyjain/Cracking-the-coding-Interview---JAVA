/**
* Returns the node at the start of a loop in the given circular linked
* list. A circular list is one in which a node's next pointer points
* to an earlier node, so as to make a loop in the linked list. For
* instance:
*
* input: A -> B -> C -> D -> E -> C [the same C as earlier]
* output: C
*
* (CCI_0205)
*
* When S takes n/2 steps, it will be at node n/2. During the same time,
* F will have taken 2(n/2) = n steps, and it will be at node (k+n). Since the we are inside a loop, F will be effectively back at node k.
* In order for the two pointers to meet at node (n-x), S needs to take a further (n-x-n/2)=(n/2-x) steps and it will end up at node n-x.
* During the same time, F will have taken 2*(n/2-x)=(n-2x) steps and will be at node k+(n-2x).
* Given our assumption that both S and F meet at the same node:
* n-x = k+n-2x
* =>    x = k
* @param linkedList
*            list to be tested
* @return the node at the start of the loop if there is a loop, null
* otherwise
*/

public class MyClass {
    public static void main(String args[]) {
        System.out.println("Start of the loop = " + findLoopStart(n).data);
    }

public static Node findLoopStart(Node linkedList) {
  if (linkedList == null || linkedList.getHead() == null) {
      return null;
  }

  Node loopStartNode = null;
  Node slow = linkedList.getHead();
  Node fast = linkedList.getHead();

  while (slow != null && fast != null) {
      slow = slow.getNext();
      if (fast.getNext() == null) {
          loopStartNode = null;
          break;
      }
      fast = fast.getNext().getNext();

      // If slow and fast point to the same node, it means that the
      // linkedList contains a loop.
      if (slow == fast) {

          slow = linkedList.getHead();

          while (slow != fast) {
              // Keep incrementing the two pointers until they both
              // meet again. When this happens, both the pointers will
              // point to the beginning of the loop
              slow = slow.getNext(); // Can't be null, as we have a loop
              fast = fast.getNext(); // Can't be null, as we have a loop
          }

          loopStartNode = slow;
          break;
      }
  }

  return loopStartNode;
}

}
