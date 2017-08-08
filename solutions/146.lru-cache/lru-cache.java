public class LRUCache {
 int capacity = 0;
  int count = 0;

  Map<Integer, Nd> map  = new HashMap<>();

  LinkedList<Nd> cacheList = new LinkedList<Nd>();
  

  public LRUCache(int capacity){
    this.capacity = capacity;
    // cacheList.clear();
    //   System.out.println("when starting:" );
    // for (Nd nd :cacheList) System.out.println(nd.key + "," + nd.value);
    // System.out.println("***************1");
  }

  public int get(int key) {
    // System.out.println("when getting key:" + key);
    // for (Nd nd :cacheList) System.out.println(nd.key + "," + nd.value);
    // System.out.println("***************");

    if(map.containsKey(key)){
    //   System.out.println("yes, contains");
      Nd n = map.get(key);
      int val = n.value;
      cacheList.remove(n);
      cacheList.addFirst(n);
      return val;
    }
    else return -1;
  }


  public void put(int key, int value) {
    // System.out.println("when puting key:"+ key);
        // for (Nd nd :cacheList) System.out.println(nd.key + "," + nd.value);
    // System.out.println("***************");

    if(!map.containsKey(key)){
      if(count  == capacity){
        map.remove(cacheList.getLast().key);
        cacheList.removeLast();
        count --;
      }
      Nd nd = new Nd(key, value);
      cacheList.addFirst(nd);
      map.put(key, nd);
      count ++;
    } else {
      Nd nd = map.get(key);
      cacheList.remove(nd);
      nd.value = value;
      cacheList.addFirst(nd);
    }
  }
}

class Nd {
    int key;
    int value;

    Nd(int key, int value){
      this.key = key;
      this.value = value;
    }

    // public boolean equals(Object obj) {
    //   Nd nd = (Nd) obj;
    //   return (this.key == nd.key) && (this.value == nd.value);
    // }
  }

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */