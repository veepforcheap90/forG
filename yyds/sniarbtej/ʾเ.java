package yyds.sniarbtej;

public class ʾเ {
  private static int ˉﾓ = 1;
  
  private static int ᴵᓲ = 2;
  
  private static int ˍﬤ = 3;
  
  private static int Ÿ = 4;
  
  private static int ˍｎ = 5;
  
  private static int ՙօ = 6;
  
  private static int Ϛ = 7;
  
  private static int ʿᴝ = 8;
  
  private static int ʾᓑ = 0;
  
  private static int ιᵓ = 1;
  
  private static int ᐨｨ = 16;
  
  private static int ˌװ = 17;
  
  private static int ใ = 18;
  
  private static int ʽṛ = 19;
  
  private static int ˉˈ = 20;
  
  private static int ˊร = 21;
  
  private static int ʾⅱ = 22;
  
  private static int ˊᔆ = 23;
  
  private static int ᓶ = 64;
  
  private static int ｹ = 65;
  
  private static int ـᵝ = 66;
  
  private static int ۊ = 67;
  
  private static int ˌﭔ = 68;
  
  private static int ᐝচ = 69;
  
  private static int ιἷ = 70;
  
  private static int ˌາ = 71;
  
  private static int יɔ = 72;
  
  private static int ʾᵒ = 73;
  
  private static int ՙכֿ = 74;
  
  private static int ʿぃ = 75;
  
  private final int ʹᴏ;
  
  ʾเ() {}
  
  public ʾเ(int paramInt) {
    this.ʹᴏ = paramInt;
  }
  
  private static ʾเ ᐨẏ(int paramInt) {
    return new ʾเ(paramInt << 24);
  }
  
  private static ʾเ ᐨẏ(int paramInt1, int paramInt2) {
    return new ʾเ(paramInt1 << 24 | paramInt2 << 16);
  }
  
  private static ʾเ ᐨẏ(int paramInt1, int paramInt2, int paramInt3) {
    return new ʾเ(paramInt1 << 24 | paramInt2 << 16 | paramInt3 << 8);
  }
  
  private static ʾเ ˊ(int paramInt) {
    return new ʾเ(0x10000000 | (paramInt & 0xFFFF) << 8);
  }
  
  private static ʾเ ᴵʖ(int paramInt) {
    return new ʾเ(0x16000000 | paramInt << 16);
  }
  
  private static ʾเ ﾞл(int paramInt) {
    return new ʾเ(0x17000000 | paramInt << 8);
  }
  
  private static ʾเ ʿᵉ(int paramInt) {
    return new ʾเ(0x42000000 | paramInt << 8);
  }
  
  private static ʾเ ˊ(int paramInt1, int paramInt2) {
    return new ʾเ(paramInt1 << 24 | paramInt2);
  }
  
  public int ˉｓ() {
    return this.ʹᴏ >>> 24;
  }
  
  public int ـﭔ() {
    return this.ʹᴏ >> 16 & 0xFF;
  }
  
  public int ʼᵖ() {
    return this.ʹᴏ >> 8 & 0xFF;
  }
  
  public int ﾞǰ() {
    return (short)((this.ʹᴏ & 0xFFFF00) >> 8);
  }
  
  public int ˊᵃ() {
    return this.ʹᴏ >> 16 & 0xFF;
  }
  
  public int ˌх() {
    return (this.ʹᴏ & 0xFFFF00) >> 8;
  }
  
  public int ιﾌ() {
    return (this.ʹᴏ & 0xFFFF00) >> 8;
  }
  
  public int ʻւ() {
    return this.ʹᴏ & 0xFF;
  }
  
  public int ˑܘ() {
    return this.ʹᴏ;
  }
  
  public static void ˊ(int paramInt, ʿᵉ paramʿᵉ) {
    switch (paramInt >>> 24) {
      case 0:
      case 1:
      case 22:
        paramʿᵉ.ˊ(paramInt >>> 16);
        return;
      case 19:
      case 20:
      case 21:
        paramʿᵉ.ᐨẏ(paramInt >>> 24);
        return;
      case 71:
      case 72:
      case 73:
      case 74:
      case 75:
        paramʿᵉ.ᴵʖ(paramInt);
        return;
      case 16:
      case 17:
      case 18:
      case 23:
      case 66:
      case 67:
      case 68:
      case 69:
      case 70:
        paramʿᵉ.ˊ(paramInt >>> 24, (paramInt & 0xFFFF00) >> 8);
        return;
    } 
    throw new IllegalArgumentException();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ʾเ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */