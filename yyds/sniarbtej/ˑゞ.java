package yyds.sniarbtej;

import java.util.List;
import ylt.pmn.zubdqvgt;

public class ˑゞ extends ʼᵖ {
  public String name;
  
  public String ᴵʖ;
  
  public String ˊﮈ;
  
  public List<ʾא> ʾ;
  
  public List<ʾא> ͺо;
  
  public List<ʽ冫> ˍɫ;
  
  public List<ʽ冫> ʽ;
  
  public List<ᴵʖ> ٴӵ;
  
  public ˑゞ(String paramString1, String paramString2, String paramString3) {
    this(589824, paramString1, paramString2, paramString3);
    if (!zubdqvgt.G(getClass(), ˑゞ.class))
      throw new IllegalStateException(); 
  }
  
  private ˑゞ(int paramInt, String paramString1, String paramString2, String paramString3) {
    super(589824);
    this.name = paramString1;
    this.ᴵʖ = paramString2;
    this.ˊﮈ = paramString3;
  }
  
  public final ᐨẏ ᐨẏ(String paramString, boolean paramBoolean) {
    ʾא ʾא = new ʾא(paramString);
    if (paramBoolean) {
      this.ʾ = ٴᐤ.ᐨẏ(this.ʾ, ʾא);
    } else {
      this.ͺо = ٴᐤ.ᐨẏ(this.ͺо, ʾא);
    } 
    return ʾא;
  }
  
  public final ᐨẏ ᐨẏ(int paramInt, ˏɪ paramˏɪ, String paramString, boolean paramBoolean) {
    ʽ冫 ʽ冫 = new ʽ冫(paramInt, paramˏɪ, paramString);
    if (paramBoolean) {
      this.ˍɫ = ٴᐤ.ᐨẏ(this.ˍɫ, ʽ冫);
    } else {
      this.ʽ = ٴᐤ.ᐨẏ(this.ʽ, ʽ冫);
    } 
    return ʽ冫;
  }
  
  public final void ᴵʖ(ᴵʖ paramᴵʖ) {
    this.ٴӵ = ٴᐤ.ᐨẏ(this.ٴӵ, paramᴵʖ);
  }
  
  public final void ᐨẏ() {}
  
  public static void ͺо(int paramInt) {
    if (paramInt < 524288)
      throw new ˈח(); 
  }
  
  public final void ᐨẏ(ˍɫ paramˍɫ) {
    ʼᵖ ʼᵖ1;
    if ((ʼᵖ1 = paramˍɫ.ᐨẏ(this.name, this.ᴵʖ, this.ˊﮈ)) == null)
      return; 
    if (this.ʾ != null) {
      byte b = 0;
      int i = this.ʾ.size();
      while (b < i) {
        ʾא ʾא;
        (ʾא = this.ʾ.get(b)).ᐨẏ(ʼᵖ1.ᐨẏ(ʾא.ˎᴗ, true));
        b++;
      } 
    } 
    if (this.ͺо != null) {
      byte b = 0;
      int i = this.ͺо.size();
      while (b < i) {
        ʾא ʾא;
        (ʾא = this.ͺо.get(b)).ᐨẏ(ʼᵖ1.ᐨẏ(ʾא.ˎᴗ, false));
        b++;
      } 
    } 
    if (this.ˍɫ != null) {
      byte b = 0;
      int i = this.ˍɫ.size();
      while (b < i) {
        ʽ冫 ʽ冫;
        (ʽ冫 = this.ˍɫ.get(b)).ᐨẏ(ʼᵖ1.ᐨẏ(ʽ冫.ٱ, ʽ冫.ˊ, ʽ冫.ˎᴗ, true));
        b++;
      } 
    } 
    if (this.ʽ != null) {
      byte b = 0;
      int i = this.ʽ.size();
      while (b < i) {
        ʽ冫 ʽ冫;
        (ʽ冫 = this.ʽ.get(b)).ᐨẏ(ʼᵖ1.ᐨẏ(ʽ冫.ٱ, ʽ冫.ˊ, ʽ冫.ˎᴗ, false));
        b++;
      } 
    } 
    if (this.ٴӵ != null) {
      byte b = 0;
      int i = this.ٴӵ.size();
      while (b < i) {
        ʼᵖ1.ᴵʖ(this.ٴӵ.get(b));
        b++;
      } 
    } 
    ʼᵖ1.ᐨẏ();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˑゞ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */