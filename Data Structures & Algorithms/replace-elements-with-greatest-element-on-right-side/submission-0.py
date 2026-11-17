class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        new_arr = [0] * len(arr)
        new_arr[-1] = -1
        for i in range(len(arr) - 2, -1, -1):
            new_arr[i] = max(arr[i + 1], new_arr[i + 1])
        return new_arr