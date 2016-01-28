Binary Numbers Project

Purpose: introduce students to one-dimensional array concepts and binary numbers and their operations. 

Goals: students will write the program using an array of integers.  All methods that access the array will do
so using accessor and mutator methods (this is done so that the implementation can be switched to ArrayList 
or String with little effort.)  A global constant will define the number of bits.  Students should be aware, 
when writing their program, that reasonable changes to this constant should not require any rewriting of code.

Students will also write to Binary by implementing the Bin interface.  Java docs are included for Bin.

Common Binary Operations

not()  			- returns the bitwise not of a Binary
add( Binary rhs )	- returns the sum of this and rhs (the sum may overflow the sign bit - a concept) 
twoscomplement()	- returns the negative of this (easily implemented with not and add and int2bin )
rotateLeft()		- returns a Binary whose bits are rotated to the left with a 0 bit in the rightmost position
rotateRight()		- returns a Binary whose bits are rotated to the right and the leftmost bit stays as it was (preserves the sign)
bin2int()			- returns an integer representation of this
int2bin(int value)		- returns a Binary equivalent to value