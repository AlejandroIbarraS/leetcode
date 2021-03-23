class Solution(object):
    def twoSum(self, nums, target):
        dic_pos = {}
        for i in range(len(nums)):
            resta = target - nums[i]
            aux = dic_pos.get(resta,-1)
            if(aux!=-1 and aux!=i):
                return [i, dic_pos.get(resta)]
            if(dic_pos.get(nums[i],-1)==-1):
                dic_pos[nums[i]]=i
        return []