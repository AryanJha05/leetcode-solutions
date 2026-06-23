class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        nums.sort()

        #if 0 is present , remove it
        if 0 in nums:
            nums.remove(0)

        # if 1 is not in the list, answer is 1 
        if 1 not in nums:
            return 1

        
        for i in range(len(nums) - 1):
            if nums[i] > 0 and nums[i+1] - nums[i] > 1:
                return nums[i] + 1

        # if no gap found
        if nums and nums[-1] > 0:
            return nums[-1] + 1
        else:
            return 1

#O(n log n)