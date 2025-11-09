package yyds.sniarbtej;

import java.util.Map;
import java.util.Set;
import ylt.pmn.zubdqvgt;

public final class ʻṪ extends ᐧｴ {
  public final ᐝʶ<String, ᐧｴ> ᐨẏ = new ᐝʶ<>();
  
  private ʻṪ ˊ() {
    ʻṪ ʻṪ1 = new ʻṪ();
    for (Map.Entry<String, ᐧｴ> entry : this.ᐨẏ.entrySet())
      ʻṪ1.ᐨẏ((String)entry.getKey(), ((ᐧｴ)entry.getValue()).ᐨẏ()); 
    return ʻṪ1;
  }
  
  public final void ᐨẏ(String paramString, ᐧｴ paramᐧｴ) {
    if (paramᐧｴ == null)
      paramᐧｴ = ڊ.ᐨẏ; 
    this.ᐨẏ.put(paramString, paramᐧｴ);
  }
  
  private ᐧｴ ᐨẏ(String paramString) {
    return this.ᐨẏ.remove(paramString);
  }
  
  private void ʿᵉ(String paramString1, String paramString2) {
    ᐨẏ(paramString1, ᴵʖ(paramString2));
  }
  
  private void ᐨẏ(String paramString, Number paramNumber) {
    ᐨẏ(paramString, ᴵʖ(paramNumber));
  }
  
  private void ᐨẏ(String paramString, Boolean paramBoolean) {
    ᐨẏ(paramString, ᴵʖ(paramBoolean));
  }
  
  private void ᐨẏ(String paramString, Character paramCharacter) {
    ᐨẏ(paramString, ᴵʖ(paramCharacter));
  }
  
  private static ᐧｴ ᴵʖ(Object paramObject) {
    return (ᐧｴ)((paramObject == null) ? ڊ.ᐨẏ : new ﭘ(paramObject));
  }
  
  public final Set<Map.Entry<String, ᐧｴ>> entrySet() {
    return this.ᐨẏ.entrySet();
  }
  
  private boolean ˊ(String paramString) {
    return this.ᐨẏ.containsKey(paramString);
  }
  
  private ᐧｴ ˊ(String paramString) {
    return this.ᐨẏ.get(paramString);
  }
  
  private ﭘ ᐨẏ(String paramString) {
    return (ﭘ)this.ᐨẏ.get(paramString);
  }
  
  private ˋℷ ᐨẏ(String paramString) {
    return (ˋℷ)this.ᐨẏ.get(paramString);
  }
  
  private ʻṪ ᐨẏ(String paramString) {
    return (ʻṪ)this.ᐨẏ.get(paramString);
  }
  
  public final boolean equals(Object paramObject) {
    return (zubdqvgt.G(paramObject, this) || (paramObject instanceof ʻṪ && ((ʻṪ)paramObject).ᐨẏ.equals(this.ᐨẏ)));
  }
  
  public final int hashCode() {
    return this.ᐨẏ.hashCode();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ʻṪ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */