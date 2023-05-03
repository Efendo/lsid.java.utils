package lsid.utils;

import java.util.Random;
import java.util.HashSet;
import java.lang.Math;

public class JCBase{
    public HashSet<String> GenList(int bit,int base){
        HashSet<String> LON = new HashSet<String>();
        while(LON.size() < (int) Math.pow(base, bit)) {
            LON.add(GenNum(bit, base));
        }
        return LON;
    }

    public String GenNum(int bits, int base) {
        Random bit = new Random();
        int i;
        String Num = "";
        for(i=0;i<bits;i++) {
            Num += bit.nextInt(base) + "";
        }
        return Num;
    }
}