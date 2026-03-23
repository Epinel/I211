import java.io.*;
public class Exercise22_8 {
    final static int Array_Size = 100000;

    public static void main(String[] args) throws Exception {
        final long N = 100000000;
        long[] primeNums = new long[Array_Size];

        long num;
        RandomAccessFile inout = new RandomAccessFile("PrimeNumbers.dat","rw");
        if (inout.length()==0){
            num = 1;
        } else {
            inout.seek(inout.length()-8);
            num = inout.readLong();
        }

        int sqrt = 1;

        newNum:while(num<=N){
            num++;
            inout.seek(0);

            if(sqrt*sqrt<num){
                sqrt++;
            }

            while (inout.getFilePointer()<inout.length()){
                int size = readNextBatch(primeNums, inout);

                for (int k=0; k <size && primeNums[k]<=sqrt; k++){
                    if (num%primeNums[k]==0){
                        continue newNum;
                    }
                }
            }

            inout.seek(inout.length());
            inout.writeLong(num);
        }
        inout.close();
    }
    public static int readNextBatch(long[] primeNums, RandomAccessFile inout){
        int size = 0;
        try{
            while (inout.getFilePointer()<inout.length()&&size<Array_Size){
                primeNums[size++] = inout.readLong();
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return size;
    }
}
