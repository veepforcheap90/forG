package yyds.sniarbtej;

public class ᴵʖ {
  public final String ᐨẏ;
  
  private byte[] ᐨẏ;
  
  ᴵʖ ᐨẏ;
  
  public ᴵʖ(String paramString) {
    this.ᐨẏ = (ᴵʖ)paramString;
  }
  
  private static boolean ᐨẏ() {
    return true;
  }
  
  public static boolean ˊ() {
    return false;
  }
  
  private static ᔪ[] ᐨẏ() {
    return new ᔪ[0];
  }
  
  protected ᴵʖ ᐨẏ(ᐨم paramᐨم, int paramInt1, int paramInt2, char[] paramArrayOfchar) {
    ᴵʖ ᴵʖ1;
    (ᴵʖ1 = new ᴵʖ((String)this.ᐨẏ)).ᐨẏ = (ᴵʖ)new byte[paramInt2];
    System.arraycopy(paramᐨم.ﾞл, paramInt1, ᴵʖ1.ᐨẏ, 0, paramInt2);
    return ᴵʖ1;
  }
  
  protected ʿᵉ ᐨẏ(ʽ paramʽ) {
    return new ʿᵉ((byte[])this.ᐨẏ);
  }
  
  final int ᐨẏ() {
    byte b = 0;
    for (ᴵʖ ᴵʖ1 = this; ᴵʖ1 != null; ᴵʖ1 = ᴵʖ1.ᐨẏ)
      b++; 
    return b;
  }
  
  final int ᐨẏ(ˌх paramˌх) {
    byte[] arrayOfByte = null;
    return ᐨẏ(paramˌх, arrayOfByte, 0, -1, -1);
  }
  
  final int ᐨẏ(ˌх paramˌх, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    ʻւ[] arrayOfʻւ = paramˌх.ᐨẏ;
    paramInt1 = 0;
    for (ᴵʖ ᴵʖ1 = this; ᴵʖ1 != null; ᴵʖ1 = ᴵʖ1.ᐨẏ) {
      paramˌх.ՙᗮ((String)ᴵʖ1.ᐨẏ);
      paramInt1 += 6 + (ᴵʖ1.ᐨẏ((ʽ)arrayOfʻւ)).ʹﮃ;
    } 
    return paramInt1;
  }
  
  static int ᐨẏ(ˌх paramˌх, int paramInt1, int paramInt2) {
    boolean bool = false;
    ˌх ˌх1;
    if ((paramInt1 & 0x1000) != 0 && (ˌх1 = paramˌх).Ԇ < 49) {
      "嗣ꗰ佯♻䰭玻됾熩㨺".toCharArray()[8] = (char)("嗣ꗰ佯♻䰭玻됾熩㨺".toCharArray()[8] ^ 0x7CB2);
      paramˌх.ՙᗮ(ᐝᵣ$ﾞﾇ.j("嗣ꗰ佯♻䰭玻됾熩㨺".toCharArray(), (short)608, 5, (short)4));
      bool += true;
    } 
    if (paramInt2 != 0) {
      "筘鄭磠䲢엄べ붵簡筐㨢".toCharArray()[2] = (char)("筘鄭磠䲢엄べ붵簡筐㨢".toCharArray()[2] ^ 0x5787);
      paramˌх.ՙᗮ(ᐝᵣ$ﾞﾇ.j("筘鄭磠䲢엄べ붵簡筐㨢".toCharArray(), (short)7117, 4, (short)0));
      bool += true;
    } 
    if ((paramInt1 & 0x20000) != 0) {
      "睏廽ᓉ餜ꊓ갦數嶵놽꽴Ԭ".toCharArray()[1] = (char)("睏廽ᓉ餜ꊓ갦數嶵놽꽴Ԭ".toCharArray()[1] ^ 0x195A);
      paramˌх.ՙᗮ(ᐝᵣ$ﾞﾇ.j("睏廽ᓉ餜ꊓ갦數嶵놽꽴Ԭ".toCharArray(), (short)32253, 4, (short)5));
      bool += true;
    } 
    return bool;
  }
  
  final void ᐨẏ(ˌх paramˌх, ʿᵉ paramʿᵉ) {
    byte[] arrayOfByte = null;
    ᐨẏ(paramˌх, arrayOfByte, 0, -1, -1, paramʿᵉ);
  }
  
  final void ᐨẏ(ˌх paramˌх, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, ʿᵉ paramʿᵉ) {
    ʻւ[] arrayOfʻւ = paramˌх.ᐨẏ;
    for (ᴵʖ ᴵʖ1 = this; ᴵʖ1 != null; ᴵʖ1 = ᴵʖ1.ᐨẏ) {
      ʿᵉ ʿᵉ1 = ᴵʖ1.ᐨẏ((ʽ)arrayOfʻւ);
      paramʿᵉ.ˊ(paramˌх.ՙᗮ((String)ᴵʖ1.ᐨẏ)).ᴵʖ(ʿᵉ1.ʹﮃ);
      paramʿᵉ.ᐨẏ(ʿᵉ1.ˊ, 0, ʿᵉ1.ʹﮃ);
    } 
  }
  
  static void ᐨẏ(ˌх paramˌх, int paramInt1, int paramInt2, ʿᵉ paramʿᵉ) {
    ˌх ˌх1;
    if ((paramInt1 & 0x1000) != 0 && (ˌх1 = paramˌх).Ԇ < 49) {
      "ﯚ?弑䬔뤨벯౪儠೵".toCharArray()[0] = (char)("ﯚ?弑䬔뤨벯౪儠೵".toCharArray()[0] ^ 0x1A7C);
      paramʿᵉ.ˊ(paramˌх.ՙᗮ(ˍɫ$יς.J("ﯚ?弑䬔뤨벯౪儠೵".toCharArray(), (short)30433, (short)4, (byte)4))).ᴵʖ(0);
    } 
    if (paramInt2 != 0) {
      "発ㅿ妐䉓꾯㷆㤣升".toCharArray()[7] = (char)("発ㅿ妐䉓꾯㷆㤣升".toCharArray()[7] ^ 0x4F21);
      paramʿᵉ.ˊ(paramˌх.ՙᗮ(ˍɫ$יς.J("発ㅿ妐䉓꾯㷆㤣升".toCharArray(), (short)20918, (short)3, (byte)4))).ᴵʖ(2).ˊ(paramInt2);
    } 
    if ((paramInt1 & 0x20000) != 0) {
      "ᕴ㼕퇌蘡琧췮녺並袞탳ѕ".toCharArray()[0] = (char)("ᕴ㼕퇌蘡琧췮녺並袞탳ѕ".toCharArray()[0] ^ 0x1A6F);
      paramʿᵉ.ˊ(paramˌх.ՙᗮ(ˍɫ$יς.J("ᕴ㼕퇌蘡琧췮녺並袞탳ѕ".toCharArray(), (short)19558, (short)2, (byte)2))).ᴵʖ(0);
    } 
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ᴵʖ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */