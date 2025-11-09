package yyds.sniarbtej;

import java.math.BigInteger;

public final class ᐴ {
  private final BigInteger ᐨẏ;
  
  private final BigInteger ˊ;
  
  private final int ʻˎ;
  
  private final int ʼｆ;
  
  private int ˈږ = 0;
  
  private final BigInteger ᴵʖ;
  
  private final boolean ʴ;
  
  private ᐴ(BigInteger paramBigInteger1, BigInteger paramBigInteger2, int paramInt, boolean paramBoolean) {
    this.ᐨẏ = paramBigInteger1;
    this.ˊ = paramBigInteger2;
    this.ʴ = paramBoolean;
    int i = paramBigInteger1.bitLength();
    this.ᴵʖ = new BigInteger(String.valueOf(paramInt));
    int j;
    if ((j = (int)Math.ceil(i / Math.log(paramInt) * Math.log(2.0D))) % 5 != 0)
      j = (j / 5 + 1) * 5; 
    this.ʼｆ = j;
    this.ʻˎ = i / 8 - 1;
  }
  
  public final String ᐨẏ(byte[] paramArrayOfbyte) {
    int i;
    byte[] arrayOfByte = new byte[((i = paramArrayOfbyte.length % this.ʻˎ) == 0) ? paramArrayOfbyte.length : (paramArrayOfbyte.length + this.ʻˎ - i)];
    System.arraycopy(paramArrayOfbyte, 0, arrayOfByte, this.ʻˎ - i, paramArrayOfbyte.length);
    StringBuffer stringBuffer = new StringBuffer();
    for (i = 0; i < arrayOfByte.length; i += this.ʻˎ) {
      int k = this.ʻˎ;
      int j = i;
      StringBuffer stringBuffer1 = stringBuffer;
      byte[] arrayOfByte1 = arrayOfByte;
      ᐴ ᐴ1 = this;
      if (k != 0) {
        byte[] arrayOfByte2 = new byte[ᐴ1.ʻˎ];
        System.arraycopy(arrayOfByte1, j, arrayOfByte2, 0, k);
        BigInteger bigInteger;
        if ((bigInteger = new BigInteger(1, arrayOfByte2)).compareTo(ᐴ1.ˊ) >= 0) {
          "ⅽ㲆沫ࣰ㾈?ሜ⾶ۉཛྷ凂歭⪸ڏ〢힎帔㮎".toCharArray()[3] = (char)("ⅽ㲆沫ࣰ㾈?ሜ⾶ۉཛྷ凂歭⪸ڏ〢힎帔㮎".toCharArray()[3] ^ 0x4326);
          throw new IllegalArgumentException(ˍɫ$יς.J("ⅽ㲆沫ࣰ㾈?ሜ⾶ۉཛྷ凂歭⪸ڏ〢힎帔㮎".toCharArray(), (short)2206, (short)1, (byte)5));
        } 
        bigInteger = bigInteger.modPow(ᐴ1.ᐨẏ, ᐴ1.ˊ);
        stringBuffer1.append(ᐴ1.ͺо(ᐴ1.ᐨẏ(bigInteger)));
      } 
    } 
    return stringBuffer.toString();
  }
  
  private void ᐨẏ(byte[] paramArrayOfbyte, StringBuffer paramStringBuffer, int paramInt1, int paramInt2) {
    if (paramInt2 == 0)
      return; 
    byte[] arrayOfByte = new byte[this.ʻˎ];
    System.arraycopy(paramArrayOfbyte, paramInt1, arrayOfByte, 0, paramInt2);
    BigInteger bigInteger;
    if ((bigInteger = new BigInteger(1, arrayOfByte)).compareTo(this.ˊ) >= 0) {
      "㎚ꈩ撚廭幬蛄?ꪗ撠ꜞ鬓?ኆ鍟굦덭Წ⑃".toCharArray()[11] = (char)("㎚ꈩ撚廭幬蛄?ꪗ撠ꜞ鬓?ኆ鍟굦덭Წ⑃".toCharArray()[11] ^ 0x377F);
      throw new IllegalArgumentException(ᐨẏ$ᐝт.W("㎚ꈩ撚廭幬蛄?ꪗ撠ꜞ鬓?ኆ鍟굦덭Წ⑃".toCharArray(), (short)1299, (byte)1, (short)4));
    } 
    bigInteger = bigInteger.modPow(this.ᐨẏ, this.ˊ);
    paramStringBuffer.append(ͺо(ᐨẏ(bigInteger)));
  }
  
  private String ͺо(String paramString) {
    StringBuffer stringBuffer = new StringBuffer();
    for (byte b = 0; b < paramString.length(); b++) {
      StringBuffer stringBuffer1 = stringBuffer;
      ᐴ ᐴ1;
      if ((ᐴ1 = this).ˈږ > 0 && ᐴ1.ˈږ % 5 == 0)
        if (ᐴ1.ˈږ % 30 == 0) {
          stringBuffer1.append('\n');
        } else if (ᐴ1.ʴ) {
          stringBuffer1.append('-');
        }  
      ᐴ1.ˈږ++;
      stringBuffer.append(paramString.charAt(b));
    } 
    return stringBuffer.toString();
  }
  
  private String ᐨẏ(BigInteger paramBigInteger) {
    StringBuffer stringBuffer = new StringBuffer();
    for (byte b = 0; b < this.ʼｆ; b++) {
      BigInteger bigInteger;
      int i;
      if ((i = (bigInteger = paramBigInteger.mod(this.ᴵʖ)).intValue()) < 10) {
        i = (char)(i + 48);
      } else if (i < 36) {
        i = (char)(i + 65 - 10);
      } else if (i < 62) {
        i = (char)(i + 97 - 36);
      } else {
        i = (char)(i + 33 - 62);
      } 
      stringBuffer.insert(0, i);
      paramBigInteger = paramBigInteger.divide(this.ᴵʖ);
    } 
    return stringBuffer.toString();
  }
  
  private void ᐨẏ(StringBuffer paramStringBuffer) {
    if (this.ˈږ > 0 && this.ˈږ % 5 == 0)
      if (this.ˈږ % 30 == 0) {
        paramStringBuffer.append('\n');
      } else if (this.ʴ) {
        paramStringBuffer.append('-');
      }  
    this.ˈږ++;
  }
  
  private static char ᐨẏ(BigInteger paramBigInteger) {
    int i;
    if ((i = paramBigInteger.intValue()) < 10) {
      i = (char)(i + 48);
    } else if (i < 36) {
      i = (char)(i + 65 - 10);
    } else if (i < 62) {
      i = (char)(i + 97 - 36);
    } else {
      i = (char)(i + 33 - 62);
    } 
    return i;
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ᐴ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */