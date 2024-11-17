class Solution(object):
    def reverseVowels(self, s):
        """
        :type s: str
        :rtype: str
        """
        vowels=["a","i","o","e","u","A","E","O","I","U"]
        new=[]
        for i in s:
            if i in vowels:
                new.append(i)
        n=len(new)
        s=list(s)
        for i in range(len(s)):
            if s[i] in vowels:
                n-=1
                s[i]=new[n]
        return ''.join(s)
                

                
        