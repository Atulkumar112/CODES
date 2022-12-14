// Add two number without using any arithmatic oparator
package com.cg.java;

public class GroupDis {

	public static void main(String[] args) {
		int a=10;
		int b=43;
		
		//iterative approach
		while(b!=0) {
			int carry = (a & b) ; //CARRY is AND of two bits
	          
            a = a ^b; //SUM of two bits is A XOR B
          
            b = carry << 1; //shifts carry to 1 bit to calculate sum	
		}
		System.out.println(a);
		
		System.out.println(add(a, b));
	}
	
	//recursively approach
	private static int add(int a, int b) {
		if(b==0) {
			return a;
		}
		int carry = a & b;
		a = a^b;
		b = carry << 1;
		return add(a, b);
	}
}

/////-------------------------------------------------------------------3rd way and easy way------------------------------
package com.cg.java;

public class GroupDis {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		
		for(int  i=1; i<=a; i++) {
			if(b>0) {
				a++;      // i am not using here any + or - oparator ... these ++ and -- are the increment and decrement things
				b--;
			}
		}
		System.out.println(a);
	}
}
