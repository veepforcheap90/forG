package yyds.sniarbtej;

import java.util.List;

public final class ˉḽ extends ʽ冫 {
  private List<λ> ˉｓ;
  
  private List<λ> ʿপ;
  
  private List<Integer> ʻล;
  
  public ˉḽ(int paramInt, ˏɪ paramˏɪ, λ[] paramArrayOfλ1, λ[] paramArrayOfλ2, int[] paramArrayOfint, String paramString) {
    this(589824, paramInt, paramˏɪ, paramArrayOfλ1, paramArrayOfλ2, paramArrayOfint, paramString);
  }
  
  private ˉḽ(int paramInt1, int paramInt2, ˏɪ paramˏɪ, λ[] paramArrayOfλ1, λ[] paramArrayOfλ2, int[] paramArrayOfint, String paramString) {
    super(589824, paramInt2, paramˏɪ, paramString);
    this.ˉｓ = ٴᐤ.ᐨẏ(paramArrayOfλ1);
    this.ʿপ = ٴᐤ.ᐨẏ(paramArrayOfλ2);
    this.ʻล = ٴᐤ.ᐨẏ(paramArrayOfint);
  }
  
  public final void ᐨẏ(ˉｓ paramˉｓ, boolean paramBoolean) {
    ᔪ[] arrayOfᔪ1 = new ᔪ[this.ˉｓ.size()];
    ᔪ[] arrayOfᔪ2 = new ᔪ[this.ʿপ.size()];
    int[] arrayOfInt = new int[this.ʻล.size()];
    byte b = 0;
    int i = arrayOfᔪ1.length;
    while (b < i) {
      arrayOfᔪ1[b] = ((λ)this.ˉｓ.get(b)).ﾞл();
      arrayOfᔪ2[b] = ((λ)this.ʿপ.get(b)).ﾞл();
      arrayOfInt[b] = ((Integer)this.ʻล.get(b)).intValue();
      b++;
    } 
    ᐨẏ(paramˉｓ.ᐨẏ(this.ٱ, this.ˊ, arrayOfᔪ1, arrayOfᔪ2, arrayOfInt, this.ˎᴗ, paramBoolean));
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˉḽ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */