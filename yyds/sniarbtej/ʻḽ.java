package yyds.sniarbtej;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class ʻḽ extends Ⴡ {
  private static final Writer ᐨẏ = new ฯ();
  
  private static final ﭘ ᐨẏ = new ﭘ(ˉﻤ$ͺſ.v("ࡄႯ溚糅൝ꖙ囎".toCharArray(), (short)29935, 4, (short)4));
  
  private final List<ᐧｴ> ᴵʖ = new ArrayList<>();
  
  private String יᔭ;
  
  private ᐧｴ ᐨẏ = ڊ.ᐨẏ;
  
  public ʻḽ() {
    super((Writer)ᐨẏ);
  }
  
  public final ᐧｴ ᴵʖ() {
    if (!this.ᴵʖ.isEmpty()) {
      "쎡毓ꜚ㘺틝౽岌꿀狉暂겺衄炒챀䩌㼷廔ᢡ鱎ׄ崐樁현⊂ៅझ䍔ौᷗ⨘⸚".toCharArray()[23] = (char)("쎡毓ꜚ㘺틝౽岌꿀狉暂겺衄炒챀䩌㼷廔ᢡ鱎ׄ崐樁현⊂ៅझ䍔ौᷗ⨘⸚".toCharArray()[23] ^ 0x1D66);
      throw new IllegalStateException(ˉﻤ$ͺſ.v("쎡毓ꜚ㘺틝౽岌꿀狉暂겺衄炒챀䩌㼷廔ᢡ鱎ׄ崐樁현⊂ៅझ䍔ौᷗ⨘⸚".toCharArray(), (short)12595, 5, (short)2) + this.ᴵʖ);
    } 
    return this.ᐨẏ;
  }
  
  private ᐧｴ ﾞл() {
    return this.ᴵʖ.get(this.ᴵʖ.size() - 1);
  }
  
  private void ˊ(ᐧｴ paramᐧｴ) {
    if (this.יᔭ != null) {
      ᐧｴ ᐧｴ2;
      if (!(ᐧｴ2 = paramᐧｴ instanceof ڊ) || ﾞǰ())
        (ᐧｴ2 = ﾞл()).ᐨẏ(this.יᔭ, paramᐧｴ); 
      this.יᔭ = null;
      return;
    } 
    if (this.ᴵʖ.isEmpty()) {
      this.ᐨẏ = paramᐧｴ;
      return;
    } 
    ᐧｴ ᐧｴ1;
    if (ᐧｴ1 = ﾞл() instanceof ˋℷ) {
      ((ˋℷ)ᐧｴ1).ᐨẏ(paramᐧｴ);
      return;
    } 
    throw new IllegalStateException();
  }
  
  public final Ⴡ ᐨẏ() {
    ˋℷ ˋℷ = new ˋℷ();
    ˊ(ˋℷ);
    this.ᴵʖ.add(ˋℷ);
    return this;
  }
  
  public final Ⴡ ˊ() {
    if (this.ᴵʖ.isEmpty() || this.יᔭ != null)
      throw new IllegalStateException(); 
    ᐧｴ ᐧｴ1;
    if (ᐧｴ1 = ﾞл() instanceof ˋℷ) {
      this.ᴵʖ.remove(this.ᴵʖ.size() - 1);
      return this;
    } 
    throw new IllegalStateException();
  }
  
  public final Ⴡ ᴵʖ() {
    ʻṪ ʻṪ = new ʻṪ();
    ˊ(ʻṪ);
    this.ᴵʖ.add(ʻṪ);
    return this;
  }
  
  public final Ⴡ ﾞл() {
    if (this.ᴵʖ.isEmpty() || this.יᔭ != null)
      throw new IllegalStateException(); 
    ᐧｴ ᐧｴ1;
    if (ᐧｴ1 = ﾞл() instanceof ʻṪ) {
      this.ᴵʖ.remove(this.ᴵʖ.size() - 1);
      return this;
    } 
    throw new IllegalStateException();
  }
  
  public final Ⴡ ᐨẏ(String paramString) {
    if (this.ᴵʖ.isEmpty() || this.יᔭ != null)
      throw new IllegalStateException(); 
    ᐧｴ ᐧｴ1;
    if (ᐧｴ1 = ﾞл() instanceof ʻṪ) {
      this.יᔭ = paramString;
      return this;
    } 
    throw new IllegalStateException();
  }
  
  public final Ⴡ ˊ(String paramString) {
    if (paramString == null)
      return ʿᵉ(); 
    ˊ(new ﭘ(paramString));
    return this;
  }
  
  public final Ⴡ ʿᵉ() {
    ˊ(ڊ.ᐨẏ);
    return this;
  }
  
  public final Ⴡ ᐨẏ(boolean paramBoolean) {
    ˊ(new ﭘ(Boolean.valueOf(paramBoolean)));
    return this;
  }
  
  public final Ⴡ ᐨẏ(double paramDouble) {
    if (!ـﭔ() && (Double.isNaN(paramDouble) || Double.isInfinite(paramDouble))) {
      "⌃?痍ꅚ듳奸Ԉｕ䴸ꊻ饦㤰₂⁛￰偠舖偁럊ᣀ烊ᶭጩ袨봐㤗ᴑःኄ挙䯬".toCharArray()[3] = (char)("⌃?痍ꅚ듳奸Ԉｕ䴸ꊻ饦㤰₂⁛￰偠舖偁럊ᣀ烊ᶭጩ袨봐㤗ᴑःኄ挙䯬".toCharArray()[3] ^ 0xA41);
      throw new IllegalArgumentException(ˍɫ$יς.J("⌃?痍ꅚ듳奸Ԉｕ䴸ꊻ饦㤰₂⁛￰偠舖偁럊ᣀ烊ᶭጩ袨봐㤗ᴑःኄ挙䯬".toCharArray(), (short)6274, (short)3, (byte)5) + paramDouble);
    } 
    ˊ(new ﭘ(Double.valueOf(paramDouble)));
    return this;
  }
  
  public final Ⴡ ᐨẏ(long paramLong) {
    ˊ(new ﭘ(Long.valueOf(paramLong)));
    return this;
  }
  
  public final Ⴡ ᐨẏ(Number paramNumber) {
    if (paramNumber == null)
      return ʿᵉ(); 
    double d;
    if (!ـﭔ() && (Double.isNaN(d = paramNumber.doubleValue()) || Double.isInfinite(d))) {
      "Α?淽?皝鿋ᮋ接ἢ璌hج㉠㬫䷚糅桗┓㱵䤒䰜崚놑櫪ᱨፂᏎ傻ℐ扗欂".toCharArray()[14] = (char)("Α?淽?皝鿋ᮋ接ἢ璌hج㉠㬫䷚糅桗┓㱵䤒䰜崚놑櫪ᱨፂᏎ傻ℐ扗欂".toCharArray()[14] ^ 0x6947);
      throw new IllegalArgumentException(ˏȓ$ᴵЃ.E("Α?淽?皝鿋ᮋ接ἢ璌hج㉠㬫䷚糅桗┓㱵䤒䰜崚놑櫪ᱨፂᏎ傻ℐ扗欂".toCharArray(), (short)23819, (short)2, (short)2) + paramNumber);
    } 
    ˊ(new ﭘ(paramNumber));
    return this;
  }
  
  public final void flush() {}
  
  public final void close() {
    if (!this.ᴵʖ.isEmpty()) {
      "ጆ쯈ᛍ४髍Ꞙ縊ﲹᴛ咶諳㍍陋貴厀懏臥⸸".toCharArray()[9] = (char)("ጆ쯈ᛍ४髍Ꞙ縊ﲹᴛ咶諳㍍陋貴厀懏臥⸸".toCharArray()[9] ^ 0x28BB);
      throw new IOException(ˍɫ$יς.J("ጆ쯈ᛍ४髍Ꞙ縊ﲹᴛ咶諳㍍陋貴厀懏臥⸸".toCharArray(), (short)242, (short)0, (byte)5));
    } 
    this.ᴵʖ.add(ᐨẏ);
  }
  
  static {
    "ࡄႯ溚糅൝ꖙ囎".toCharArray()[3] = (char)("ࡄႯ溚糅൝ꖙ囎".toCharArray()[3] ^ 0x25A0);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ʻḽ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */