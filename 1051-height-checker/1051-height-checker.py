class Solution:
    def heightChecker(self, heights):
		    """
		    :type heights: List[int]
		    :rtype: int
		    """
		    return "".join([str(x==y) for x,y in zip(heights,sorted(heights))]).count("F")
        