package org.dzhou.interview.linkedlist;

/**
 * 
 * Write code to partition a linked list around a value x, such that all nodes
 * less than x come before all nodes greater than or equal to x. If x is
 * contained within the list, the value of x may only need to be after the
 * elements less than x. The partition element x can appear anywhere in the
 * "right partition", it does not need to appear between the left and right
 * partitions.
 * 
 * @author DONG ZHOU
 *
 */
public class Partition {

	public static Node partition(Node head, int x) {
		Node beforeStart = null;
		Node beforeEnd = null;
		Node afterStart = null;
		Node afterEnd = null;
		while (head != null) {
			if (head.data < x) {
				if (beforeStart == null) {
					beforeStart = head;
					beforeEnd = beforeStart;
				} else {
					beforeEnd.next = head;
					beforeEnd = head;
				}
			} else {
				if (afterStart == null) {
					afterStart = head;
					afterEnd = afterStart;
				} else {
					afterEnd.next = head;
					afterEnd = head;
				}
			}
			head = head.next;
		}
		if (beforeStart == null)
			return afterStart;
		beforeEnd.next = afterStart;
		return beforeStart;
	}

}
