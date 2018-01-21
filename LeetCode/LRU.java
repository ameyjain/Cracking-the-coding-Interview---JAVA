package com.example.Practice;

import java.util.HashMap;

class DNode{
    int key;
    int value;
    DNode pre;
    DNode next;
 
    public DNode(int key, int value){
        this.key = key;
        this.value = value;
    }
}

public class LRU {
	
	 int capacity;
	    HashMap<Integer, DNode> map = new HashMap<Integer, DNode>();
	    DNode head=null;
	    DNode end=null;
	 
	    public LRU(int capacity) {
	        this.capacity = capacity;
	    }
	 
	    public int get(int key) {
	        if(map.containsKey(key)){
	            DNode n = map.get(key);
	            remove(n);
	            setHead(n);
	            return n.value;
	        }
	 
	        return -1;
	    }
	 
	    public void remove(DNode n){
	        if(n.pre!=null){
	            n.pre.next = n.next;
	        }else{
	            head = n.next;
	        }
	 
	        if(n.next!=null){
	            n.next.pre = n.pre;
	        }else{
	            end = n.pre;
	        }
	 
	    }
	 
	    public void setHead(DNode n){
	        n.next = head;
	        n.pre = null;
	 
	        if(head!=null)
	            head.pre = n;
	 
	        head = n;
	 
	        if(end ==null)
	            end = head;
	    }
	 
	    public void set(int key, int value) {
	        if(map.containsKey(key)){
	            DNode old = map.get(key);
	            old.value = value;
	            remove(old);
	            setHead(old);
	        }else{
	            DNode created = new DNode(key, value);
	            if(map.size()>=capacity){
	                map.remove(end.key);
	                remove(end);
	                setHead(created);
	 
	            }else{
	                setHead(created);
	            }    
	 
	            map.put(key, created);
	        }
	    }

	public static void main(String[] args) {

	}

}
