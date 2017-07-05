// Hash table class
public class MyHashTable {
	private static final int TableSize = 100;
	MyHashEntry[] table;
	
	public MyHashTable(){
		table = new MyHashEntry[TableSize];
		
		//initialize hash table
		for(int i = 0; i < TableSize; i++){
			table[i].setKey(-1);
			table[i].setValue(-1);
		}
	}
	
	public MyHashEntry get(int key){
		int hash = key % TableSize;
		while(table[hash].getKey() != -1 && table[hash].getKey() != key)
			hash = (hash + 1) % TableSize;
		
		if(table[hash].getKey() == key) return table[hash];
		return null;
	}
	
	public void add(int key, int value) {
		MyHashEntry entry = new MyHashEntry(key, value);
		int hash = key % TableSize;
		
		//find an empty space to store data
		while(table[hash].getKey() != -1 && table[hash].getKey() != key)
			hash = (hash + 1) % TableSize;
		
		//if the key already exists, update the value
		if(table[hash].getKey() == key)
			table[hash].setValue(value);
		else
			table[hash] = entry;
	}
}