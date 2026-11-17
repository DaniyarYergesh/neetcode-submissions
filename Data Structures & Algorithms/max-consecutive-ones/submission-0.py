class Solution:
    def findMaxConsecutiveOnes(self, nums: list[int]) -> int:
        count = 0
        maxInt = 0

        for i in range(len(nums)):
            if nums[i] == 1:
                count += 1
            else:
                count = 0

            maxInt = max(count, maxInt)

        return maxInt
        