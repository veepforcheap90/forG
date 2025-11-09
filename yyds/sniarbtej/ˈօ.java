package yyds.sniarbtej;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;

public class ˈօ {
  private String ˏｳ;
  
  private int ᒬ;
  
  private List<String> ʹﮃ;
  
  public ˈօ() {}
  
  private static boolean ᐨẏ(CharSequence paramCharSequence1, CharSequence paramCharSequence2) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokestatic G : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   5: ifeq -> 10
    //   8: iconst_1
    //   9: ireturn
    //   10: aload_0
    //   11: ifnull -> 18
    //   14: aload_1
    //   15: ifnonnull -> 20
    //   18: iconst_0
    //   19: ireturn
    //   20: aload_0
    //   21: instanceof java/lang/String
    //   24: ifeq -> 40
    //   27: aload_1
    //   28: instanceof java/lang/String
    //   31: ifeq -> 40
    //   34: aload_0
    //   35: aload_1
    //   36: invokevirtual equals : (Ljava/lang/Object;)Z
    //   39: ireturn
    //   40: aload_0
    //   41: invokeinterface length : ()I
    //   46: aload_1
    //   47: invokeinterface length : ()I
    //   52: if_icmpne -> 160
    //   55: aload_0
    //   56: iconst_0
    //   57: iconst_0
    //   58: aload_1
    //   59: iconst_0
    //   60: aload_0
    //   61: invokeinterface length : ()I
    //   66: istore_2
    //   67: istore_0
    //   68: astore_1
    //   69: istore_0
    //   70: istore_0
    //   71: dup
    //   72: astore_0
    //   73: instanceof java/lang/String
    //   76: ifeq -> 104
    //   79: aload_1
    //   80: instanceof java/lang/String
    //   83: ifeq -> 104
    //   86: aload_0
    //   87: checkcast java/lang/String
    //   90: iconst_0
    //   91: iconst_0
    //   92: aload_1
    //   93: checkcast java/lang/String
    //   96: iconst_0
    //   97: iload_2
    //   98: invokevirtual regionMatches : (ZILjava/lang/String;II)Z
    //   101: goto -> 155
    //   104: iconst_0
    //   105: istore_3
    //   106: iconst_0
    //   107: istore #4
    //   109: iload_2
    //   110: istore_2
    //   111: iload_2
    //   112: iinc #2, -1
    //   115: ifle -> 154
    //   118: aload_0
    //   119: iload_3
    //   120: iinc #3, 1
    //   123: invokeinterface charAt : (I)C
    //   128: istore #5
    //   130: aload_1
    //   131: iload #4
    //   133: iinc #4, 1
    //   136: invokeinterface charAt : (I)C
    //   141: istore #6
    //   143: iload #5
    //   145: iload #6
    //   147: if_icmpeq -> 111
    //   150: iconst_0
    //   151: goto -> 155
    //   154: iconst_1
    //   155: ifeq -> 160
    //   158: iconst_1
    //   159: ireturn
    //   160: iconst_0
    //   161: ireturn
  }
  
  static byte[] ᐨẏ(String paramString, Charset paramCharset) {
    return (paramString == null) ? null : paramString.getBytes(paramCharset);
  }
  
  private static ByteBuffer ᐨẏ(String paramString, Charset paramCharset) {
    return (paramString == null) ? null : ByteBuffer.wrap(paramString.getBytes(paramCharset));
  }
  
  private static ByteBuffer ᐨẏ(String paramString) {
    Charset charset = ˑ一.ʹﮃ;
    return ((paramString = paramString) == null) ? null : ByteBuffer.wrap(paramString.getBytes(charset));
  }
  
  private static byte[] ᴵʖ(String paramString) {
    return ᐨẏ(paramString, ˑ一.ᐨẏ);
  }
  
  private static byte[] ᐨẏ(String paramString1, String paramString2) {
    if (paramString1 == null)
      return null; 
    try {
      return paramString1.getBytes(paramString2);
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw ᐨẏ(paramString2, unsupportedEncodingException);
    } 
  }
  
  private static byte[] ﾞл(String paramString) {
    return ᐨẏ(paramString, ˑ一.ˊ);
  }
  
  private static byte[] ʿᵉ(String paramString) {
    return ᐨẏ(paramString, ˑ一.ᴵʖ);
  }
  
  private static byte[] ʹﮃ(String paramString) {
    return ᐨẏ(paramString, ˑ一.ﾞл);
  }
  
  private static byte[] ՙᗮ(String paramString) {
    return ᐨẏ(paramString, ˑ一.ʿᵉ);
  }
  
  public static byte[] ˍɫ(String paramString) {
    return ᐨẏ(paramString, ˑ一.ʹﮃ);
  }
  
  private static IllegalStateException ᐨẏ(String paramString, UnsupportedEncodingException paramUnsupportedEncodingException) {
    "勐율ច".toCharArray()[0] = (char)("勐율ច".toCharArray()[0] ^ 0x3A0E);
    return new IllegalStateException(paramString + ˏȓ$ᴵЃ.E("勐율ច".toCharArray(), (short)30028, (short)1, (short)1) + paramUnsupportedEncodingException);
  }
  
  static String ᐨẏ(byte[] paramArrayOfbyte, Charset paramCharset) {
    return (paramArrayOfbyte == null) ? null : new String(paramArrayOfbyte, paramCharset);
  }
  
  private static String ᐨẏ(byte[] paramArrayOfbyte, String paramString) {
    if (paramArrayOfbyte == null)
      return null; 
    try {
      return new String(paramArrayOfbyte, paramString);
    } catch (UnsupportedEncodingException unsupportedEncodingException) {
      throw ᐨẏ(paramString, unsupportedEncodingException);
    } 
  }
  
  private static String ʹﮃ(byte[] paramArrayOfbyte) {
    return ᐨẏ(paramArrayOfbyte, ˑ一.ᐨẏ);
  }
  
  public static String ՙᗮ(byte[] paramArrayOfbyte) {
    return ᐨẏ(paramArrayOfbyte, ˑ一.ˊ);
  }
  
  private static String ˍɫ(byte[] paramArrayOfbyte) {
    return ᐨẏ(paramArrayOfbyte, ˑ一.ᴵʖ);
  }
  
  private static String ʽ(byte[] paramArrayOfbyte) {
    return ᐨẏ(paramArrayOfbyte, ˑ一.ﾞл);
  }
  
  private static String ʾܪ(byte[] paramArrayOfbyte) {
    return ᐨẏ(paramArrayOfbyte, ˑ一.ʿᵉ);
  }
  
  public static String ᐨم(byte[] paramArrayOfbyte) {
    return ᐨẏ(paramArrayOfbyte, ˑ一.ʹﮃ);
  }
  
  public ˈօ(String paramString, int paramInt, List<String> paramList) {
    this.ˏｳ = paramString;
    this.ᒬ = paramInt;
    this.ʹﮃ = paramList;
  }
  
  public void ᐨẏ(ʻล paramʻล) {
    paramʻล.ˊ(this.ˏｳ, this.ᒬ, (this.ʹﮃ == null) ? null : this.ʹﮃ.<String>toArray(new String[0]));
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˈօ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */