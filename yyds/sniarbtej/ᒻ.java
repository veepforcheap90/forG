package yyds.sniarbtej;

import java.util.List;

public final class ᒻ {
  private λ ᴵʖ;
  
  private λ ﾞл;
  
  private λ ʹﮃ;
  
  private String ᐨẏ;
  
  private List<ʽ冫> ˍɫ;
  
  private List<ʽ冫> ʽ;
  
  public ᒻ(λ paramλ1, λ paramλ2, λ paramλ3, String paramString) {
    this.ᴵʖ = paramλ1;
    this.ﾞл = paramλ2;
    this.ʹﮃ = paramλ3;
    this.ᐨẏ = paramString;
  }
  
  public final void ᴵƚ(int paramInt) {
    paramInt = 0x42000000 | paramInt << 8;
    if (this.ˍɫ != null) {
      byte b = 0;
      int i = this.ˍɫ.size();
      while (b < i) {
        ((ʽ冫)this.ˍɫ.get(b)).ٱ = paramInt;
        b++;
      } 
    } 
    if (this.ʽ != null) {
      byte b = 0;
      int i = this.ʽ.size();
      while (b < i) {
        ((ʽ冫)this.ʽ.get(b)).ٱ = paramInt;
        b++;
      } 
    } 
  }
  
  public final void ᐨẏ(ˉｓ paramˉｓ) {
    paramˉｓ.ᐨẏ(this.ᴵʖ.ﾞл(), this.ﾞл.ﾞл(), (this.ʹﮃ == null) ? null : this.ʹﮃ.ﾞл(), this.ᐨẏ);
    if (this.ˍɫ != null) {
      byte b = 0;
      int i = this.ˍɫ.size();
      while (b < i) {
        ʽ冫 ʽ冫;
        (ʽ冫 = this.ˍɫ.get(b)).ᐨẏ(paramˉｓ.ᴵʖ(ʽ冫.ٱ, ʽ冫.ˊ, ʽ冫.ˎᴗ, true));
        b++;
      } 
    } 
    if (this.ʽ != null) {
      byte b = 0;
      int i = this.ʽ.size();
      while (b < i) {
        ʽ冫 ʽ冫;
        (ʽ冫 = this.ʽ.get(b)).ᐨẏ(paramˉｓ.ᴵʖ(ʽ冫.ٱ, ʽ冫.ˊ, ʽ冫.ˎᴗ, false));
        b++;
      } 
    } 
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ᒻ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */