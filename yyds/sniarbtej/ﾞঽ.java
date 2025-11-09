package yyds.sniarbtej;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class ﾞঽ extends Ӏ {
  public int ᓱ;
  
  public List<Object> ʿλ;
  
  public List<Object> ᴵʖ;
  
  private ﾞঽ() {
    super(-1);
  }
  
  public ﾞঽ(int paramInt1, int paramInt2, Object[] paramArrayOfObject1, int paramInt3, Object[] paramArrayOfObject2) {
    super(-1);
    ArrayList<Object> arrayList;
    byte b;
    this.ᓱ = paramInt1;
    switch (paramInt1) {
      case -1:
      case 0:
        this.ʿλ = ٴᐤ.ᐨẏ(paramInt2, paramArrayOfObject1);
        this.ᴵʖ = ٴᐤ.ᐨẏ(paramInt3, paramArrayOfObject2);
        return;
      case 1:
        this.ʿλ = ٴᐤ.ᐨẏ(paramInt2, paramArrayOfObject1);
        return;
      case 2:
        paramInt1 = paramInt2;
        arrayList = new ArrayList(paramInt1);
        for (b = 0; b < paramInt1; b++)
          arrayList.add(null); 
        this.ʿλ = arrayList;
        return;
      case 3:
        return;
      case 4:
        this.ᴵʖ = ٴᐤ.ᐨẏ(1, paramArrayOfObject2);
        return;
    } 
    throw new IllegalArgumentException();
  }
  
  public final int ﹳיִ() {
    return 14;
  }
  
  public final void ᐨẏ(ˉｓ paramˉｓ) {
    switch (this.ᓱ) {
      case -1:
      case 0:
        paramˉｓ.ᐨẏ(this.ᓱ, this.ʿλ.size(), ᐨẏ(this.ʿλ), this.ᴵʖ.size(), ᐨẏ(this.ᴵʖ));
        return;
      case 1:
        paramˉｓ.ᐨẏ(this.ᓱ, this.ʿλ.size(), ᐨẏ(this.ʿλ), 0, (Object[])null);
        return;
      case 2:
        paramˉｓ.ᐨẏ(this.ᓱ, this.ʿλ.size(), (Object[])null, 0, (Object[])null);
        return;
      case 3:
        paramˉｓ.ᐨẏ(this.ᓱ, 0, (Object[])null, 0, (Object[])null);
        return;
      case 4:
        paramˉｓ.ᐨẏ(this.ᓱ, 0, (Object[])null, 1, ᐨẏ(this.ᴵʖ));
        return;
    } 
    throw new IllegalArgumentException();
  }
  
  public final Ӏ ᐨẏ(Map<λ, λ> paramMap) {
    ﾞঽ ﾞঽ1;
    (ﾞঽ1 = new ﾞঽ()).ᓱ = this.ᓱ;
    if (this.ʿλ != null) {
      ﾞঽ1.ʿλ = new ArrayList();
      byte b = 0;
      int i = this.ʿλ.size();
      while (b < i) {
        Object object;
        if (object = this.ʿλ.get(b) instanceof λ)
          object = paramMap.get(object); 
        ﾞঽ1.ʿλ.add(object);
        b++;
      } 
    } 
    if (this.ᴵʖ != null) {
      ﾞঽ1.ᴵʖ = new ArrayList();
      byte b = 0;
      int i = this.ᴵʖ.size();
      while (b < i) {
        Object object;
        if (object = this.ᴵʖ.get(b) instanceof λ)
          object = paramMap.get(object); 
        ﾞঽ1.ᴵʖ.add(object);
        b++;
      } 
    } 
    return ﾞঽ1;
  }
  
  private static Object[] ᐨẏ(List<Object> paramList) {
    Object[] arrayOfObject = new Object[paramList.size()];
    byte b = 0;
    int i = arrayOfObject.length;
    while (b < i) {
      Object object;
      if (object = paramList.get(b) instanceof λ)
        object = ((λ)object).ﾞл(); 
      arrayOfObject[b] = object;
      b++;
    } 
    return arrayOfObject;
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ﾞঽ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */