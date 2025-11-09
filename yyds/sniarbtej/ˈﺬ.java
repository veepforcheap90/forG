package yyds.sniarbtej;

import java.util.ArrayList;

public final class ˈﺬ extends ٴۉ<Object> {
  public static final ˌ々 ˊ = new ˉϜ();
  
  private final ˑĴ ˊ;
  
  private ˈﺬ(ˑĴ paramˑĴ) {
    this.ˊ = paramˑĴ;
  }
  
  public final Object ᐨẏ(יּ paramיּ) {
    ArrayList<Object> arrayList;
    ᐝʶ<Object, Object> ᐝʶ;
    כ כ = paramיּ.ᐨẏ();
    switch (ιԴ.ʹō[כ.ordinal()]) {
      case 1:
        arrayList = new ArrayList();
        paramיּ.ᵘ();
        while (paramיּ.hasNext())
          arrayList.add(ᐨẏ(paramיּ)); 
        paramיּ.ˑܥ();
        return arrayList;
      case 2:
        ᐝʶ = new ᐝʶ<>();
        paramיּ.ᐨ();
        while (paramיּ.hasNext())
          ᐝʶ.put(paramיּ.ͺо(), ᐨẏ(paramיּ)); 
        paramיּ.ﾞঽ();
        return ᐝʶ;
      case 3:
        return paramיּ.ٴӵ();
      case 4:
        return Double.valueOf(paramיּ.ᴵʖ());
      case 5:
        return Boolean.valueOf(paramיּ.ˈے());
      case 6:
        paramיּ.ۦ();
        return null;
    } 
    throw new IllegalStateException();
  }
  
  public final void ᐨẏ(Ⴡ paramჁ, Object paramObject) {
    if (paramObject == null) {
      paramჁ.ʿᵉ();
      return;
    } 
    Class<?> clazz = paramObject.getClass();
    ˑĴ ˑĴ1;
    ٴۉ<?> ٴۉ1;
    if (ٴۉ1 = (ˑĴ1 = this.ˊ).ᐨẏ(ʸ.ᐨẏ(clazz)) instanceof ˈﺬ) {
      paramჁ.ᴵʖ();
      paramჁ.ﾞл();
      return;
    } 
    ٴۉ1.ᐨẏ(paramჁ, paramObject);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˈﺬ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */