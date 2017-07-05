public class LinkedHashEntry {
	
	private int value;
	private int key;
	private LinkedHashEntry next;
	
	
	public LinkedHashEntry(int key, int value) {
		this.key=key;
		this.value=value;
		this.next=null;
	}
	
	public int getKey(){
		return this.key;
	}
	
	
	public int getValue(){
		return this.value;
	}
	
	public void setValue(int value){
		this.value=value;
	}
	
	public LinkedHashEntry getNext(){
		return this.next;
	}
	
	public void setNext(LinkedHashEntry entry){
		this.next=entry;
	}
}