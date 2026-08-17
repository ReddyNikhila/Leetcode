#include <vector>
#include <list>
#include <utility>

class MyHashMap {
private:
    static const int size = 1009; // A prime number to minimize collisions
    std::vector<std::list<std::pair<int, int>>> table;

    int hash(int key) {
        return key % size;
    }

public:
    MyHashMap() {
        table.resize(size);
    }
    
    void put(int key, int value) {
        int idx = hash(key);
        for (auto& pair : table[idx]) {
            if (pair.first == key) {
                pair.second = value; // Update value if key exists
                return;
            }
        }
        table[idx].push_back({key, value}); // Insert new key-value pair
    }
    
    int get(int key) {
        int idx = hash(key);
        for (const auto& pair : table[idx]) {
            if (pair.first == key) {
                return pair.second; // Return value if key is found
            }
        }
        return -1; // Return -1 if key does not exist
    }
    
    void remove(int key) {
        int idx = hash(key);
        auto& bucket = table[idx];
        for (auto it = bucket.begin(); it != bucket.end(); ++it) {
            if (it->first == key) {
                bucket.erase(it); // Remove key-value pair
                return;
            }
        }
    }
};