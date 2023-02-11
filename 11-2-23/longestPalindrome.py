class Solution:
    def Palindrome(self,s:str):
        temp = ""
        j = len(s)-1
        for i in range(0,len(s)):
            temp += s[j - i]
        if temp == s :
            return 1
        else :
            return 0
    
    def longestPalindrome(self, s: str) -> str:
        longest : str = ""
        sizeOfSubstring : int
        k : int = len(s) 
        
        for i in range(0,len(s)-1):
            sizeOfSubstring = k - i 
            for j in range(0,len(s)-sizeOfSubstring + 1):
                substring = s[j:j + sizeOfSubstring ]
                if self.Palindrome(substring) == 1:
                    longest = substring
                    break
            if longest != "":
                break
        if k == 1:
            longest = s
        if k == 2:
            if s[0] != s[1]:
                longest = s[0]
            else :
                longest = s
        


        return longest        

