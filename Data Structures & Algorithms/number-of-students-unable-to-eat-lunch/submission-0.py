class Solution:
    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        zeros = 0
        ones = 0
        for stud in students:
            if stud == 1:
                ones += 1
            else: zeros += 1

        for sandwich in sandwiches:
            if sandwich == 1:
                if ones == 0: break
                ones -= 1
            else:
                if zeros == 0: break
                zeros -= 1
        return zeros + ones