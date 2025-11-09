package yyds.sniarbtej;

import java.util.List;
import java.util.Map;

public final class ﹳڐ extends Ӏ {
  public λ ʿᵉ;
  
  private List<Integer> ˈے;
  
  public List<λ> ﾞл;
  
  public ﹳڐ(λ paramλ, int[] paramArrayOfint, λ[] paramArrayOfλ) {
    super(171);
    this.ʿᵉ = paramλ;
    this.ˈے = ٴᐤ.ᐨẏ(paramArrayOfint);
    this.ﾞл = ٴᐤ.ᐨẏ(paramArrayOfλ);
  }
  
  public final int ﹳיִ() {
    return 12;
  }
  
  public final void ᐨẏ(ˉｓ paramˉｓ) {
    int[] arrayOfInt = new int[this.ˈے.size()];
    byte b = 0;
    int i = arrayOfInt.length;
    while (b < i) {
      arrayOfInt[b] = ((Integer)this.ˈے.get(b)).intValue();
      b++;
    } 
    ᔪ[] arrayOfᔪ = new ᔪ[this.ﾞл.size()];
    i = 0;
    int j = arrayOfᔪ.length;
    while (i < j) {
      arrayOfᔪ[i] = ((λ)this.ﾞл.get(i)).ﾞл();
      i++;
    } 
    paramˉｓ.ᐨẏ(this.ʿᵉ.ﾞл(), arrayOfInt, arrayOfᔪ);
    ˊ(paramˉｓ);
  }
  
  public final Ӏ ᐨẏ(Map<λ, λ> paramMap) {
    ﹳڐ ﹳڐ1;
    (ﹳڐ1 = new ﹳڐ(ᐨẏ(this.ʿᵉ, paramMap), null, ᐨẏ(this.ﾞл, paramMap))).ˈے.addAll(this.ˈے);
    return ﹳڐ1.ᐨẏ(this);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ﹳڐ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */