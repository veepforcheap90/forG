package yyds.sniarbtej;

import java.math.BigInteger;
import ylt.pmn.zubdqvgt;

public final class ڎ extends ͺٳ {
  private static final int 灬 = 6;
  
  private static final int ʹף = 3;
  
  private static final int ˏﺗ = 4;
  
  private static byte[] ʹﮃ = new byte[] { 13, 10 };
  
  private static final byte[] ՙᗮ = new byte[] { 
      65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
      75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
      85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
      101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
      111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
      121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
      56, 57, 43, 47 };
  
  private static final byte[] ˍɫ = new byte[] { 
      65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
      75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
      85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
      101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
      111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
      121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
      56, 57, 45, 95 };
  
  private static final byte[] ʽ = new byte[] { 
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
      -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 
      54, 55, 56, 57, 58, 59, 60, 61, -1, -1, 
      -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 
      5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
      15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
      25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 
      29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
      39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
      49, 50, 51 };
  
  private static final int ʿᒃ = 63;
  
  private final byte[] ʾܪ;
  
  private final byte[] ᐨم = ʽ;
  
  private final byte[] ʾ;
  
  private final int ᐝκ;
  
  private final int ҷ;
  
  public ڎ() {
    this(0);
  }
  
  private ڎ(boolean paramBoolean) {
    this(76, ʹﮃ, paramBoolean);
  }
  
  private ڎ(int paramInt) {
    this(0, ʹﮃ);
  }
  
  private ڎ(int paramInt, byte[] paramArrayOfbyte) {
    this(paramInt, paramArrayOfbyte, false);
  }
  
  private ڎ(int paramInt, byte[] paramArrayOfbyte, boolean paramBoolean) {
    super(3, 4, paramInt, (paramArrayOfbyte == null) ? 0 : paramArrayOfbyte.length);
    if (paramArrayOfbyte != null) {
      String str;
      if (ᴵʖ(paramArrayOfbyte)) {
        byte[] arrayOfByte;
        str = ˈօ.ᐨẏ(arrayOfByte = paramArrayOfbyte, ˑ一.ʹﮃ);
        "욠舜薪⚕趾㭬␩듬밾Ỳ너䙟杯鹾ṕ첶ৱꓮ㱙Ẉ眇棓ꆜ㚕㬲쎏ⱽ衼༛碮⥃玆׻付訢⧈꿌廷繑枍硍뛓軺Ṻ䵁".toCharArray()[13] = (char)("욠舜薪⚕趾㭬␩듬밾Ỳ너䙟杯鹾ṕ첶ৱꓮ㱙Ẉ眇棓ꆜ㚕㬲쎏ⱽ衼༛碮⥃玆׻付訢⧈꿌廷繑枍硍뛓軺Ṻ䵁".toCharArray()[13] ^ 0x560A);
        "ꩳ嵬".toCharArray()[0] = (char)("ꩳ嵬".toCharArray()[0] ^ 0x34D7);
        throw new IllegalArgumentException(ˍɫ$יς.J("욠舜薪⚕趾㭬␩듬밾Ỳ너䙟杯鹾ṕ첶ৱꓮ㱙Ẉ眇棓ꆜ㚕㬲쎏ⱽ衼༛碮⥃玆׻付訢⧈꿌廷繑枍硍뛓軺Ṻ䵁".toCharArray(), (short)2703, (short)4, (byte)5) + str + ˍɫ$יς.J("ꩳ嵬".toCharArray(), (short)24917, (short)0, (byte)3));
      } 
      if (str > null) {
        this.ҷ = 4 + paramArrayOfbyte.length;
        this.ʾ = new byte[paramArrayOfbyte.length];
        System.arraycopy(paramArrayOfbyte, 0, this.ʾ, 0, paramArrayOfbyte.length);
      } else {
        this.ҷ = 4;
        this.ʾ = null;
      } 
    } else {
      this.ҷ = 4;
      this.ʾ = null;
    } 
    this.ᐝκ = this.ҷ - 1;
    this.ʾܪ = paramBoolean ? ˍɫ : ՙᗮ;
  }
  
  private boolean ˊᵃ() {
    return zubdqvgt.G(this.ʾܪ, ˍɫ);
  }
  
  final void ᐨẏ(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, ઽ paramઽ) {
    if (paramઽ.ᵕ)
      return; 
    if (paramInt2 < 0) {
      paramઽ.ᵕ = true;
      if (paramઽ.ˈῖ == 0 && this.ͺʢ == 0)
        return; 
      byte[] arrayOfByte = ᐨẏ(this.ҷ, paramઽ);
      int i = paramઽ.ˑﮌ;
      switch (paramઽ.ˈῖ) {
        case 0:
          break;
        case 1:
          arrayOfByte[paramઽ.ˑﮌ++] = this.ʾܪ[paramઽ.יᴈ >> 2 & 0x3F];
          arrayOfByte[paramઽ.ˑﮌ++] = this.ʾܪ[paramઽ.יᴈ << 4 & 0x3F];
          if (zubdqvgt.G(this.ʾܪ, ՙᗮ)) {
            arrayOfByte[paramઽ.ˑﮌ++] = this.ᴵʖ;
            arrayOfByte[paramઽ.ˑﮌ++] = this.ᴵʖ;
          } 
          break;
        case 2:
          arrayOfByte[paramઽ.ˑﮌ++] = this.ʾܪ[paramઽ.יᴈ >> 10 & 0x3F];
          arrayOfByte[paramઽ.ˑﮌ++] = this.ʾܪ[paramઽ.יᴈ >> 4 & 0x3F];
          arrayOfByte[paramઽ.ˑﮌ++] = this.ʾܪ[paramઽ.יᴈ << 2 & 0x3F];
          if (zubdqvgt.G(this.ʾܪ, ՙᗮ))
            arrayOfByte[paramઽ.ˑﮌ++] = this.ᴵʖ; 
          break;
        default:
          "餃ᇐ븫?헑ꨵ굤찁来樻龿采燈ꐚ吝픾纯".toCharArray()[9] = (char)("餃ᇐ븫?헑ꨵ굤찁来樻龿采燈ꐚ吝픾纯".toCharArray()[9] ^ 0x74DC);
          throw new IllegalStateException(ᐨẏ$ᐝт.W("餃ᇐ븫?헑ꨵ굤찁来樻龿采燈ꐚ吝픾纯".toCharArray(), (short)23356, (byte)4, (short)3) + paramઽ.ˈῖ);
      } 
      paramઽ.ՙī += paramઽ.ˑﮌ - i;
      if (this.ͺʢ > 0 && paramઽ.ՙī > 0) {
        System.arraycopy(this.ʾ, 0, arrayOfByte, paramઽ.ˑﮌ, this.ʾ.length);
        paramઽ.ˑﮌ += this.ʾ.length;
      } 
      return;
    } 
    for (byte b = 0; b < paramInt2; b++) {
      byte[] arrayOfByte = ᐨẏ(this.ҷ, paramઽ);
      paramઽ.ˈῖ = (paramઽ.ˈῖ + 1) % 3;
      byte b1;
      if ((b1 = paramArrayOfbyte[paramInt1++]) < 0)
        b1 += 256; 
      paramઽ.יᴈ = (paramઽ.יᴈ << 8) + b1;
      if (paramઽ.ˈῖ == 0) {
        arrayOfByte[paramઽ.ˑﮌ++] = this.ʾܪ[paramઽ.יᴈ >> 18 & 0x3F];
        arrayOfByte[paramઽ.ˑﮌ++] = this.ʾܪ[paramઽ.יᴈ >> 12 & 0x3F];
        arrayOfByte[paramઽ.ˑﮌ++] = this.ʾܪ[paramઽ.יᴈ >> 6 & 0x3F];
        arrayOfByte[paramઽ.ˑﮌ++] = this.ʾܪ[paramઽ.יᴈ & 0x3F];
        paramઽ.ՙī += 4;
        if (this.ͺʢ > 0 && this.ͺʢ <= paramઽ.ՙī) {
          System.arraycopy(this.ʾ, 0, arrayOfByte, paramઽ.ˑﮌ, this.ʾ.length);
          paramઽ.ˑﮌ += this.ʾ.length;
          paramઽ.ՙī = 0;
        } 
      } 
    } 
  }
  
  final void ˊ(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, ઽ paramઽ) {
    if (paramઽ.ᵕ)
      return; 
    if (paramInt2 < 0)
      paramઽ.ᵕ = true; 
    for (byte b = 0; b < paramInt2; b++) {
      byte[] arrayOfByte = ᐨẏ(this.ᐝκ, paramઽ);
      byte b1;
      if ((b1 = paramArrayOfbyte[paramInt1++]) == this.ᴵʖ) {
        paramઽ.ᵕ = true;
        break;
      } 
      if (b1 >= 0 && b1 < ʽ.length && (b1 = ʽ[b1]) >= 0) {
        paramઽ.ˈῖ = (paramઽ.ˈῖ + 1) % 4;
        paramઽ.יᴈ = (paramઽ.יᴈ << 6) + b1;
        if (paramઽ.ˈῖ == 0) {
          arrayOfByte[paramઽ.ˑﮌ++] = (byte)(paramઽ.יᴈ >> 16);
          arrayOfByte[paramઽ.ˑﮌ++] = (byte)(paramઽ.יᴈ >> 8);
          arrayOfByte[paramઽ.ˑﮌ++] = (byte)paramઽ.יᴈ;
        } 
      } 
    } 
    if (paramઽ.ᵕ && paramઽ.ˈῖ != 0) {
      byte[] arrayOfByte = ᐨẏ(this.ᐝκ, paramઽ);
      switch (paramઽ.ˈῖ) {
        case 1:
          return;
        case 2:
          paramઽ.יᴈ >>= 4;
          arrayOfByte[paramઽ.ˑﮌ++] = (byte)paramઽ.יᴈ;
          return;
        case 3:
          paramઽ.יᴈ >>= 2;
          arrayOfByte[paramઽ.ˑﮌ++] = (byte)(paramઽ.יᴈ >> 8);
          arrayOfByte[paramઽ.ˑﮌ++] = (byte)paramઽ.יᴈ;
          return;
      } 
      "⋤כֿ御⹴?牛뢉八?咛鿢鵗ᙠ옖Ꞑ⎡腩䥭箜".toCharArray()[17] = (char)("⋤כֿ御⹴?牛뢉八?咛鿢鵗ᙠ옖Ꞑ⎡腩䥭箜".toCharArray()[17] ^ 0x3E6F);
      throw new IllegalStateException(ˍɫ$יς.J("⋤כֿ御⹴?牛뢉八?咛鿢鵗ᙠ옖Ꞑ⎡腩䥭箜".toCharArray(), (short)18372, (short)5, (byte)2) + paramઽ.ˈῖ);
    } 
  }
  
  @Deprecated
  private static boolean ᐨẏ(byte[] paramArrayOfbyte) {
    return ˊ(paramArrayOfbyte);
  }
  
  private static boolean ᐨẏ(byte paramByte) {
    return (paramByte == 61 || (paramByte >= 0 && paramByte < ʽ.length && ʽ[paramByte] != -1));
  }
  
  private static boolean ﾞл(String paramString) {
    return ˊ(ˈօ.ᐨẏ(paramString = paramString, ˑ一.ʹﮃ));
  }
  
  private static boolean ˊ(byte[] paramArrayOfbyte) {
    for (byte b = 0; b < paramArrayOfbyte.length; b++) {
      if (!ᐨẏ(paramArrayOfbyte[b]) && !ᴵʖ(paramArrayOfbyte[b]))
        return false; 
    } 
    return true;
  }
  
  private static byte[] ˊ(byte[] paramArrayOfbyte) {
    boolean bool = false;
    return ᐨẏ(paramArrayOfbyte = paramArrayOfbyte, bool, false);
  }
  
  public static String ˊ(byte[] paramArrayOfbyte) {
    boolean bool = false;
    return ˈօ.ᐨẏ(paramArrayOfbyte = ᐨẏ(paramArrayOfbyte = paramArrayOfbyte, bool, false), ˑ一.ˊ);
  }
  
  private static byte[] ᴵʖ(byte[] paramArrayOfbyte) {
    return ᐨẏ(paramArrayOfbyte, false, true);
  }
  
  private static String ᴵʖ(byte[] paramArrayOfbyte) {
    return ˈօ.ᐨẏ(paramArrayOfbyte = ᐨẏ(paramArrayOfbyte, false, true), ˑ一.ˊ);
  }
  
  private static byte[] ﾞл(byte[] paramArrayOfbyte) {
    boolean bool = true;
    return ᐨẏ(paramArrayOfbyte = paramArrayOfbyte, bool, false);
  }
  
  private static byte[] ˊ(byte[] paramArrayOfbyte, boolean paramBoolean) {
    return ᐨẏ(paramArrayOfbyte, paramBoolean, false);
  }
  
  private static byte[] ᐨẏ(byte[] paramArrayOfbyte, boolean paramBoolean1, boolean paramBoolean2) {
    return ᐨẏ(paramArrayOfbyte, paramBoolean1, paramBoolean2, 2147483647);
  }
  
  private static byte[] ᐨẏ(byte[] paramArrayOfbyte, boolean paramBoolean1, boolean paramBoolean2, int paramInt) {
    if (paramArrayOfbyte == null || paramArrayOfbyte.length == 0)
      return paramArrayOfbyte; 
    ڎ ڎ1;
    long l;
    if ((l = (ڎ1 = paramBoolean1 ? new ڎ(paramBoolean2) : new ڎ(0, ʹﮃ, paramBoolean2)).ᐨẏ(paramArrayOfbyte)) > 2147483647L) {
      "犦೐ﳣ㗥揯兩ռ唫䨿欏圧ᇰࣄ㸰㦌旯ᔍ㴐쥯슍핤汣뤥润㘚ᣜ挻펒퉏臼鵥ꮧ䄏국질脯ଂ㹳롤쾪믘?輘ᤶ룒꟎廽業⤸蟽裺䮹糼".toCharArray()[5] = (char)("犦೐ﳣ㗥揯兩ռ唫䨿欏圧ᇰࣄ㸰㦌旯ᔍ㴐쥯슍핤汣뤥润㘚ᣜ挻펒퉏臼鵥ꮧ䄏국질脯ଂ㹳롤쾪믘?輘ᤶ룒꟎廽業⤸蟽裺䮹糼".toCharArray()[5] ^ 0x6283);
      "醡㴵聳⫐팅༡䃵등饁庀䂿ꯢ졸侠ꬡ庶邲栲⛆뱍庱철ᠨ施苨泓嗈禽꒴뿔脾圧㠻ꧤ?鎧娃ﳍ뿡࢝꾅꼒㮱ᄍ듴ᘘ".toCharArray()[28] = (char)("醡㴵聳⫐팅༡䃵등饁庀䂿ꯢ졸侠ꬡ庶邲栲⛆뱍庱철ᠨ施苨泓嗈禽꒴뿔脾圧㠻ꧤ?鎧娃ﳍ뿡࢝꾅꼒㮱ᄍ듴ᘘ".toCharArray()[28] ^ 0x71A2);
      throw new IllegalArgumentException(ᐨẏ$ᐝт.W("犦೐ﳣ㗥揯兩ռ唫䨿欏圧ᇰࣄ㸰㦌旯ᔍ㴐쥯슍핤汣뤥润㘚ᣜ挻펒퉏臼鵥ꮧ䄏국질脯ଂ㹳롤쾪믘?輘ᤶ룒꟎廽業⤸蟽裺䮹糼".toCharArray(), (short)10952, (byte)1, (short)1) + l + ᐨẏ$ᐝт.W("醡㴵聳⫐팅༡䃵등饁庀䂿ꯢ졸侠ꬡ庶邲栲⛆뱍庱철ᠨ施苨泓嗈禽꒴뿔脾圧㠻ꧤ?鎧娃ﳍ뿡࢝꾅꼒㮱ᄍ듴ᘘ".toCharArray(), (short)1344, (byte)5, (short)1));
    } 
    return ڎ1.ՙᗮ(paramArrayOfbyte);
  }
  
  public static byte[] ᐨẏ(String paramString) {
    return (new ڎ()).ˊ(paramString);
  }
  
  private static byte[] ʿᵉ(byte[] paramArrayOfbyte) {
    return (new ڎ()).ʹﮃ(paramArrayOfbyte);
  }
  
  private static BigInteger ᐨẏ(byte[] paramArrayOfbyte) {
    paramArrayOfbyte = paramArrayOfbyte;
    return new BigInteger(1, (new ڎ()).ʹﮃ(paramArrayOfbyte));
  }
  
  private static byte[] ᐨẏ(BigInteger paramBigInteger) {
    if (paramBigInteger == null) {
      "౭녒磐ᦸ蝡䃕ﴊ䭟퓀⮾頛ਖ਼⸂㉕춡ꐋ㻻멿ꁈ䕙୮匊䬢鲟ࢯ뵭극䮱쇫ꄢ㢔䯏鱙ᦿ岿䷅䫈".toCharArray()[31] = (char)("౭녒磐ᦸ蝡䃕ﴊ䭟퓀⮾頛ਖ਼⸂㉕춡ꐋ㻻멿ꁈ䕙୮匊䬢鲟ࢯ뵭극䮱쇫ꄢ㢔䯏鱙ᦿ岿䷅䫈".toCharArray()[31] ^ 0x1D86);
      throw new NullPointerException(ˉﻤ$ͺſ.v("౭녒磐ᦸ蝡䃕ﴊ䭟퓀⮾頛ਖ਼⸂㉕춡ꐋ㻻멿ꁈ䕙୮匊䬢鲟ࢯ뵭극䮱쇫ꄢ㢔䯏鱙ᦿ岿䷅䫈".toCharArray(), (short)19221, 0, (short)0));
    } 
    int j = (j = (paramBigInteger = paramBigInteger).bitLength()) + 7 >> 3 << 3;
    byte[] arrayOfByte3 = paramBigInteger.toByteArray();
    boolean bool2 = false;
    int k = arrayOfByte3.length;
    if (paramBigInteger.bitLength() % 8 == 0) {
      bool2 = true;
      k--;
    } 
    int i = j / 8 - k;
    byte[] arrayOfByte2 = new byte[j / 8];
    System.arraycopy(arrayOfByte3, bool2, arrayOfByte2, i, k);
    boolean bool1 = false;
    byte[] arrayOfByte1;
    return ᐨẏ(arrayOfByte1 = (paramBigInteger.bitLength() % 8 != 0 && paramBigInteger.bitLength() / 8 + 1 == j / 8) ? arrayOfByte3 : arrayOfByte2, bool1, false);
  }
  
  private static byte[] ˊ(BigInteger paramBigInteger) {
    int j = (j = paramBigInteger.bitLength()) + 7 >> 3 << 3;
    byte[] arrayOfByte2 = paramBigInteger.toByteArray();
    if (paramBigInteger.bitLength() % 8 != 0 && paramBigInteger.bitLength() / 8 + 1 == j / 8)
      return arrayOfByte2; 
    boolean bool = false;
    int k = arrayOfByte2.length;
    if (paramBigInteger.bitLength() % 8 == 0) {
      bool = true;
      k--;
    } 
    int i = j / 8 - k;
    byte[] arrayOfByte1 = new byte[j / 8];
    System.arraycopy(arrayOfByte2, bool, arrayOfByte1, i, k);
    return arrayOfByte1;
  }
  
  protected final boolean ˊ(byte paramByte) {
    return (paramByte >= 0 && paramByte < this.ᐨم.length && this.ᐨم[paramByte] != -1);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ڎ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */