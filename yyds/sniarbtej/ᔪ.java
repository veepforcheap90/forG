package yyds.sniarbtej;

import ylt.pmn.zubdqvgt;

public final class ᔪ {
  private static int ʻṪ = 1;
  
  private static int ˑʖ = 2;
  
  private static int ՙ⁔ = 4;
  
  private static int ﭘ = 8;
  
  private static int ˑﮊ = 16;
  
  private static int יỉ = 32;
  
  private static int ˌᓚ = 64;
  
  private static int ՙĩ = 128;
  
  private static int ｨ = 4;
  
  private static int יﺜ = 6;
  
  private static int ᐝｪ = -268435456;
  
  private static int ιﹽ = 268435456;
  
  private static int ᴵใ = 536870912;
  
  private static int ˏҫ = 805306368;
  
  private static int ٴۉ = 268435455;
  
  static final ᔪ ʹﮃ = new ᔪ();
  
  public Object ᐨẏ;
  
  public short ᴵʖ;
  
  short ﾞл;
  
  int[] ʾܪ;
  
  public int ʻบ;
  
  private int[] ᐨم;
  
  short ʿᵉ;
  
  short ʹﮃ;
  
  public short ՙᗮ;
  
  short ˍɫ;
  
  ՙ⁔ ᐨẏ;
  
  ᔪ ՙᗮ;
  
  ٴᐤ ᐨẏ;
  
  ᔪ ˍɫ;
  
  private int ͺо() {
    if ((this.ᴵʖ & 0x4) == 0) {
      "置僧콝ᴬ뎥륷왗㯝営塾휍썩?魤ॢ）䎋?敖뱛津尷뒷꣧㓖폘믚愺㠎泰쫊쀛聄쏬玲颚騮갫쐭遬Დ罽".toCharArray()[36] = (char)("置僧콝ᴬ뎥륷왗㯝営塾휍썩?魤ॢ）䎋?敖뱛津尷뒷꣧㓖폘믚愺㠎泰쫊쀛聄쏬玲颚騮갫쐭遬Დ罽".toCharArray()[36] ^ 0x3682);
      throw new IllegalStateException(ᐨẏ$ᐝт.W("置僧콝ᴬ뎥륷왗㯝営塾휍썩?魤ॢ）䎋?敖뱛津尷뒷꣧㓖폘믚愺㠎泰쫊쀛聄쏬玲颚騮갫쐭遬Დ罽".toCharArray(), (short)18099, (byte)5, (short)2));
    } 
    return this.ʻบ;
  }
  
  final ᔪ ᐨẏ() {
    return (ᔪ)((this.ᐨẏ == null) ? this : ((ՙ⁔)this.ᐨẏ).ˊ);
  }
  
  final void ʿᵉ(int paramInt) {
    if ((this.ᴵʖ & 0x80) == 0) {
      this.ᴵʖ = (short)(this.ᴵʖ | 0x80);
      this.ﾞл = (short)paramInt;
      return;
    } 
    if (this.ʾܪ == null)
      this.ʾܪ = new int[4]; 
    this.ʾܪ[0] = this.ʾܪ[0] + 1;
    int i;
    if ((i = this.ʾܪ[0] + 1) >= this.ʾܪ.length) {
      int[] arrayOfInt = new int[this.ʾܪ.length + 4];
      System.arraycopy(this.ʾܪ, 0, arrayOfInt, 0, this.ʾܪ.length);
      this.ʾܪ = arrayOfInt;
    } 
    this.ʾܪ[i] = paramInt;
  }
  
  final void ᐨẏ(ˉｓ paramˉｓ, boolean paramBoolean) {
    paramˉｓ.ˊ(this);
    if (paramBoolean && (this.ᴵʖ & 0x80) != 0) {
      paramˉｓ.ˊ(this.ﾞл & 0xFFFF, this);
      if (this.ʾܪ != null)
        for (paramBoolean = true; paramBoolean <= this.ʾܪ[0]; paramBoolean++)
          paramˉｓ.ˊ(this.ʾܪ[paramBoolean], this);  
    } 
  }
  
  final void ᐨẏ(ʿᵉ paramʿᵉ, int paramInt, boolean paramBoolean) {
    if ((this.ᴵʖ & 0x4) == 0) {
      if (paramBoolean) {
        ᐨẏ(paramInt, 536870912, paramʿᵉ.ʹﮃ);
        paramʿᵉ.ᴵʖ(-1);
        return;
      } 
      ᐨẏ(paramInt, 268435456, paramʿᵉ.ʹﮃ);
      paramʿᵉ.ˊ(-1);
      return;
    } 
    if (paramBoolean) {
      paramʿᵉ.ᴵʖ(this.ʻบ - paramInt);
      return;
    } 
    paramʿᵉ.ˊ(this.ʻบ - paramInt);
  }
  
  public final void ˊ(ʿᵉ paramʿᵉ) {
    if ((this.ᴵʖ & 0x4) == 0)
      ᐨẏ(0, 805306368, paramʿᵉ.ʹﮃ); 
    paramʿᵉ.ˊ(this.ʻบ);
  }
  
  private void ᐨẏ(int paramInt1, int paramInt2, int paramInt3) {
    if (this.ᐨم == null)
      this.ᐨم = new int[6]; 
    int i;
    if ((i = this.ᐨم[0]) + 2 >= this.ᐨم.length) {
      int[] arrayOfInt = new int[this.ᐨم.length + 6];
      System.arraycopy(this.ᐨم, 0, arrayOfInt, 0, this.ᐨم.length);
      this.ᐨم = arrayOfInt;
    } 
    this.ᐨم[++i] = paramInt1;
    this.ᐨم[++i] = paramInt2 | paramInt3;
    this.ᐨم[0] = i;
  }
  
  final boolean ᐨẏ(byte[] paramArrayOfbyte, ʿᵉ paramʿᵉ, int paramInt) {
    this.ᴵʖ = (short)(this.ᴵʖ | 0x4);
    this.ʻบ = paramInt;
    if (this.ᐨم == null)
      return false; 
    int i = 0;
    for (int j = this.ᐨم[0]; j > 0; j -= 2) {
      int k = this.ᐨم[j - 1];
      int m = this.ᐨم[j];
      int n = paramInt - k;
      int i1 = m & 0xFFFFFFF;
      if ((m & 0xF0000000) == 268435456) {
        if (n < -32768 || n > 32767) {
          if ((i = paramArrayOfbyte[k] & 0xFF) < 198) {
            paramArrayOfbyte[k] = (byte)(i + 49);
          } else {
            paramArrayOfbyte[k] = (byte)(i + 20);
          } 
          i = 1;
        } 
        paramArrayOfbyte[i1++] = (byte)(n >>> 8);
        paramArrayOfbyte[i1] = (byte)n;
      } else if ((m & 0xF0000000) == 536870912) {
        paramArrayOfbyte[i1++] = (byte)(n >>> 24);
        paramArrayOfbyte[i1++] = (byte)(n >>> 16);
        paramArrayOfbyte[i1++] = (byte)(n >>> 8);
        paramArrayOfbyte[i1] = (byte)n;
      } else {
        paramʿᵉ.ˊ[i1++] = (byte)(paramInt >>> 8);
        paramʿᵉ.ˊ[i1] = (byte)paramInt;
      } 
    } 
    return i;
  }
  
  final void ᐨẏ(short paramShort) {
    ᔪ ᔪ1;
    (ᔪ1 = this).ˍɫ = ʹﮃ;
    while (!zubdqvgt.G(ᔪ1, ʹﮃ)) {
      ᔪ ᔪ2 = ᔪ1;
      ᔪ1 = ᔪ1.ˍɫ;
      ᔪ2.ˍɫ = null;
      if (ᔪ2.ˍɫ == null) {
        ᔪ2.ˍɫ = paramShort;
        ᔪ1 = ᔪ2.ᐨẏ(ᔪ1);
      } 
    } 
  }
  
  final void ᐨẏ(ᔪ paramᔪ) {
    ᔪ ᔪ1;
    short s = ʹﮃ;
    ᔪ ᔪ2;
    (ᔪ2 = this).ˍɫ = ʹﮃ;
    while (!zubdqvgt.G(ᔪ2, ʹﮃ)) {
      ᔪ ᔪ3;
      ᔪ2 = (ᔪ3 = ᔪ2).ˍɫ;
      ᔪ3.ˍɫ = s;
      ᔪ1 = ᔪ3;
      if ((ᔪ3.ᴵʖ & 0x40) != 0 && ᔪ3.ˍɫ != paramᔪ.ˍɫ)
        ᔪ3.ᐨẏ = new ٴᐤ(ᔪ3.ʹﮃ, paramᔪ.ᐨẏ.ᐨẏ, ᔪ3.ᐨẏ); 
      ᔪ2 = ᔪ3.ᐨẏ(ᔪ2);
    } 
    while (!zubdqvgt.G(ᔪ1, ʹﮃ)) {
      ᔪ ᔪ3 = ᔪ1.ˍɫ;
      ᔪ1.ˍɫ = null;
      ᔪ1 = ᔪ3;
    } 
  }
  
  ᔪ ᐨẏ(ᔪ paramᔪ) {
    paramᔪ = paramᔪ;
    for (ٴᐤ ٴᐤ1 = this.ᐨẏ; ٴᐤ1 != null; ٴᐤ1 = ٴᐤ1.ˊ) {
      boolean bool;
      if (!(bool = ((this.ᴵʖ & 0x10) != 0 && zubdqvgt.G(ٴᐤ1, this.ᐨẏ.ˊ)) ? true : false) && ٴᐤ1.ᐨẏ.ˍɫ == null) {
        ٴᐤ1.ᐨẏ.ˍɫ = paramᔪ;
        paramᔪ = ٴᐤ1.ᐨẏ;
      } 
    } 
    return paramᔪ;
  }
  
  public final String toString() {
    "⸩ᴶ".toCharArray()[0] = (char)("⸩ᴶ".toCharArray()[0] ^ 0x7C0);
    return ˍɫ$יς.J("⸩ᴶ".toCharArray(), (short)22020, (short)4, (byte)2) + System.identityHashCode(this);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ᔪ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */