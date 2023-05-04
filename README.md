# LSID.Java.Utils

a list of java utils

# JCBase
JCBase is a tool to generate base2 - 10 numbers.

## Genlist(int bit, int base);
GenList generates a list of numbers with the specified bits and base.
for example: 
`````
JCBase demo = new JCBase();
System.out.println(demo.GenList(4, 2)); // output would be: [0000,0001,0010,0011,0100,0110,0101,0111,1000,1100,1010,1001,1110,1011,1111,1101]
`````

## GenNum(int bits, int base)
GenNum generates a number with the bits with the base (it is also used by the GenList() method)
heres an example:
````
JCBase demo = new JCBase();
System.out.println(demo.GenNum(4, 2)); // output could be 1011 or 1010
````
