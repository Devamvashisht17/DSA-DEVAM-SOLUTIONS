class MyHashMap {
int [] values;
    public MyHashMap() {
        values= new int[1000001];

        for(int i=0;i<values.length;i++){
            values[i] =-1;
        }

    }
    
    public void put(int key, int value) {
        values[key]=value;
    }
    
    public int get(int key) {
        return values[key];
    }
    
    public void remove(int key) {
        values[key] =-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */