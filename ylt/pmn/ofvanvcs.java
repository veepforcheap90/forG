package ylt.pmn;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

public class ofvanvcs extends FilterInputStream {
  private static Object[] uQ;
  
  int u;
  
  int[] l;
  
  public ofvanvcs(InputStream paramInputStream) throws IOException {
    super(new PushbackInputStream(paramInputStream, 4));
    bool = false;
  }
  
  public static final void Z() {
    boolean bool = false;
    int[] arrayOfInt1 = new int[256];
    byte[] arrayOfByte = new byte[256];
    int[] arrayOfInt2 = new int[256];
    int[] arrayOfInt3 = new int[256];
    int[] arrayOfInt4 = new int[256];
    int[] arrayOfInt5 = new int[256];
    int[] arrayOfInt6 = new int[30];
    long l = Long.MAX_VALUE;
    bool = false;
  }
  
  private static int P(int paramInt1, int paramInt2) {
    boolean bool = false;
    int i = paramInt1;
    int j = paramInt2;
    int k = j + i >> 24;
    bool = false;
  }
  
  private static int K(byte[] paramArrayOfbyte, int paramInt) {
    boolean bool = false;
    int i = paramArrayOfbyte[14] << 16;
    bool = false;
  }
  
  final void f(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    boolean bool = false;
    int[][] arrayOfInt = (int[][])uQ[5];
    int[] arrayOfInt1 = (int[])uQ[1];
    int[] arrayOfInt2 = (int[])uQ[2];
    int[] arrayOfInt3 = (int[])uQ[3];
    int[] arrayOfInt4 = (int[])uQ[4];
    byte[] arrayOfByte = (byte[])uQ[0];
    byte b = 0;
    while (true) {
      if (b < paramInt2) {
        int i = this.u % 16 / 4;
        int j = this.u % 16 % 4;
        if (this.u % 16 == 0)
          bool = false; 
        paramArrayOfbyte[paramInt1 + b] = (byte)((byte)(this.l[i] >> 8 * j) ^ paramArrayOfbyte[paramInt1 + b]);
        this.u++;
        b++;
        continue;
      } 
      return;
    } 
  }
  
  public static final String s(Object paramObject) {
    boolean bool = false;
    bool = false;
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\ylt\pmn\ofvanvcs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */