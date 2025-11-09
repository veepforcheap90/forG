package yyds.sniarbtej;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

final class ﹳ宀 implements Runnable {
  private static final int ˉǃ = 1024;
  
  private final InputStream ᐨẏ;
  
  private final OutputStream ᐨẏ;
  
  ﹳ宀(InputStream paramInputStream, OutputStream paramOutputStream) {
    this.ᐨẏ = (OutputStream)paramInputStream;
    this.ᐨẏ = paramOutputStream;
  }
  
  public final void run() {
    byte[] arrayOfByte = new byte[1024];
    try {
      int i;
      while ((i = this.ᐨẏ.read(arrayOfByte)) != -1)
        this.ᐨẏ.write(arrayOfByte, 0, i); 
      return;
    } catch (IOException iOException) {
      "ዞ綰ᕪꄓߙ㋄꒹䬩蘐됡לּ珎Ꮿ烲䞵⥖䗸ퟠ࿯裪獯㯍诩无囮糊㮟羇".toCharArray()[18] = (char)("ዞ綰ᕪꄓߙ㋄꒹䬩蘐됡לּ珎Ꮿ烲䞵⥖䗸ퟠ࿯裪獯㯍诩无囮糊㮟羇".toCharArray()[18] ^ 0x5969);
      throw new RuntimeException(ˍɫ$יς.J("ዞ綰ᕪꄓߙ㋄꒹䬩蘐됡לּ珎Ꮿ烲䞵⥖䗸ퟠ࿯裪獯㯍诩无囮糊㮟羇".toCharArray(), (short)32503, (short)3, (byte)3), iOException);
    } 
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ﹳ宀.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */