
/**
 * Write a description of class tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tester
{
    static void test() {
        for(int i = 0; i < 512; i++) {
            System.out.println(new Binary(i) + " " + i);
        }
        System.out.println("NEW TEST");
        Binary onBin = new Binary("00000000");
        for(onBin = new Binary("10000000"); onBin.bin2int() <= 126; onBin = onBin.add(new Binary("00000001"))) {
            System.out.println(onBin + " " + onBin.bin2int());
        }
        System.out.println(onBin + " " + onBin.bin2int());
        System.out.println("NEW TEST");
        for(onBin = new Binary("10000000"); onBin.bin2int() <= 125; onBin = onBin.add(new Binary("00000010"))) {
            System.out.println(onBin + " " + onBin.bin2int());
        }
        System.out.println(onBin + " " + onBin.bin2int());
         System.out.println("NEW TEST");
        for(onBin = new Binary("10000000"); onBin.bin2int() <= 117; onBin = onBin.add(new Binary("00000111"))) {
            System.out.println(onBin + " " + onBin.bin2int());
        }
        System.out.println(onBin + " " + onBin.bin2int());
    }
}
