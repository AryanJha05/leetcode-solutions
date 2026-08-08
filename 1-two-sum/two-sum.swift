class Solution {
    func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
        
        var map = [Int: Int]()
        
        for i in 0..<nums.count {
            let need = target - nums[i]
            
            if let idx = map[need] {
                return [idx, i]
            }
            
            map[nums[i]] = i
        }
        
        return []
    }
}