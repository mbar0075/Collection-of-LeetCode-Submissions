class KthLargest {
private:
    int k;
    std::priority_queue<int, std::vector<int>, std::greater<int>> pq;

public:
    KthLargest(int k, std::vector<int>& nums) {
        this->k = k;
        
        // Initialize the priority queue with initial elements from nums
        for (int num : nums) {
            add(num);
        }
    }
    
    int add(int val) {
        // Add the new element to the priority queue
        pq.push(val);
        
        // If the size of the priority queue exceeds k, remove the smallest element
        if (pq.size() > k) {
            pq.pop();
        }
        
        // Return the current kth largest element
        return pq.top();
    }
};

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest* obj = new KthLargest(k, nums);
 * int param_1 = obj->add(val);
 */