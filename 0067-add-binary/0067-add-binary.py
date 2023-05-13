class Solution(object):
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        counter1=len(a)-1
        counter2=len(b)-1
        offset=0
        output=""
        while(counter1>=0 and counter2>=0):
            total=int(a[counter1])+int(b[counter2])+offset
            offset=total/2
            output=str(total%2)+output
            counter1-=1
            counter2-=1
        while(counter1>=0):
            total=int(a[counter1])+offset
            offset=total/2
            output=str(total%2)+output
            counter1-=1
        while(counter2>=0):
            total=int(b[counter2])+offset
            offset=total/2
            output=str(total%2)+output
            counter2-=1
        if offset!=0:
            output=str(offset)+output

        return output