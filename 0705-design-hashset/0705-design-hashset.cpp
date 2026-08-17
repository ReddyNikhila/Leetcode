#include <vector>
#include <list>
#include <algorithm>

class MyHashSet {
private:
    int numBuckets;
    std::vector<std::list<int>> buckets;

    int hash(int key) {
        return key % numBuckets;
    }

public:
    MyHashSet() : numBuckets(769), buckets(769) {}
    
    void add(int key) {
        int i = hash(key);
        for (int element : buckets[i]) {
            if (element == key) return; // Key already exists
        }
        buckets[i].push_back(key);
    }
    
    void remove(int key) {
        int i = hash(key);
        buckets[i].remove(key); // Removes key if present
    }
    
    bool contains(int key) {
        int i = hash(key);
        for (int element : buckets[i]) {
            if (element == key) return true;
        }
        return false;
    }
};