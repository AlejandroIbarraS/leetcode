class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        i=0
        j=0
        cont = 1
        lon1 = len(nums1)
        lon2 = len(nums2)
        median = (lon1 + lon2)/2
        isOdd = (lon1+lon2)%2
        if(isOdd==1):
            median=median+1
        while(i<lon1 and j<lon2 and cont<=median):
            if(nums1[i]<nums2[j]):
                if(cont==median):
                    res = nums1[i]
                i=i+1
            else:
                if(cont==median):
                    res = nums2[j]
                j=j+1
            cont=cont+1
        while(i<lon1 and cont<=median):
            if(cont==median):
                res = nums1[i]
            i=i+1
            cont = cont+1
        while(j<lon2 and cont<=median):
            if(cont==median):
                res = nums2[j]
            j=j+1
            cont=cont+1 
    
        if(isOdd==0):
            if(i<lon1 and j<lon2):
                if(nums1[i]<nums2[j]):
                    res=(res + nums1[i])/float(2)
                else:
                    res=(res + nums2[j])/float(2)
            else:
                if(i<lon1 and j>=lon2):
                    res=(res + nums1[i])/float(2)
                else:
                    res=(res + nums2[j])/float(2)
        return res