package yyds.sniarbtej;

import java.util.ArrayList;
import java.util.List;
import ylt.pmn.zubdqvgt;

public class ʾא extends ᐨẏ {
  public String ˎᴗ;
  
  private List<Object> ʾܪ;
  
  public ʾא(String paramString) {
    this(589824, paramString);
    if (!zubdqvgt.G(getClass(), ʾא.class))
      throw new IllegalStateException(); 
  }
  
  public ʾא(int paramInt, String paramString) {
    super(paramInt);
    this.ˎᴗ = paramString;
  }
  
  ʾא(List<Object> paramList) {
    super(589824);
    this.ʾܪ = paramList;
  }
  
  public final void ᐨẏ(String paramString, Object paramObject) {
    if (this.ʾܪ == null)
      this.ʾܪ = new ArrayList((this.ˎᴗ != null) ? 2 : 1); 
    if (this.ˎᴗ != null)
      this.ʾܪ.add(paramString); 
    if (paramObject instanceof byte[]) {
      this.ʾܪ.add(ٴᐤ.ᐨẏ((byte[])paramObject));
      return;
    } 
    if (paramObject instanceof boolean[]) {
      this.ʾܪ.add(ٴᐤ.ᐨẏ((boolean[])paramObject));
      return;
    } 
    if (paramObject instanceof short[]) {
      this.ʾܪ.add(ٴᐤ.ᐨẏ((short[])paramObject));
      return;
    } 
    if (paramObject instanceof char[]) {
      this.ʾܪ.add(ٴᐤ.ᐨẏ((char[])paramObject));
      return;
    } 
    if (paramObject instanceof int[]) {
      this.ʾܪ.add(ٴᐤ.ᐨẏ((int[])paramObject));
      return;
    } 
    if (paramObject instanceof long[]) {
      this.ʾܪ.add(ٴᐤ.ᐨẏ((long[])paramObject));
      return;
    } 
    if (paramObject instanceof float[]) {
      this.ʾܪ.add(ٴᐤ.ᐨẏ((float[])paramObject));
      return;
    } 
    if (paramObject instanceof double[]) {
      this.ʾܪ.add(ٴᐤ.ᐨẏ((double[])paramObject));
      return;
    } 
    this.ʾܪ.add(paramObject);
  }
  
  public final void ᐨẏ(String paramString1, String paramString2, String paramString3) {
    if (this.ʾܪ == null)
      this.ʾܪ = new ArrayList((this.ˎᴗ != null) ? 2 : 1); 
    if (this.ˎᴗ != null)
      this.ʾܪ.add(paramString1); 
    this.ʾܪ.add(new String[] { paramString2, paramString3 });
  }
  
  public final ᐨẏ ᐨẏ(String paramString1, String paramString2) {
    if (this.ʾܪ == null)
      this.ʾܪ = new ArrayList((this.ˎᴗ != null) ? 2 : 1); 
    if (this.ˎᴗ != null)
      this.ʾܪ.add(paramString1); 
    ʾא ʾא1 = new ʾא(paramString2);
    this.ʾܪ.add(ʾא1);
    return ʾא1;
  }
  
  public final ᐨẏ ᐨẏ(String paramString) {
    if (this.ʾܪ == null)
      this.ʾܪ = new ArrayList((this.ˎᴗ != null) ? 2 : 1); 
    if (this.ˎᴗ != null)
      this.ʾܪ.add(paramString); 
    ArrayList<Object> arrayList = new ArrayList();
    this.ʾܪ.add(arrayList);
    return new ʾא(arrayList);
  }
  
  public final void ᐨẏ() {}
  
  public static void ˊᴬ() {}
  
  public final void ᐨẏ(ᐨẏ paramᐨẏ) {
    if (paramᐨẏ != null) {
      if (this.ʾܪ != null) {
        byte b = 0;
        int i = this.ʾܪ.size();
        while (b < i) {
          String str = (String)this.ʾܪ.get(b);
          Object object = this.ʾܪ.get(b + 1);
          ᐨẏ(paramᐨẏ, str, object);
          b += 2;
        } 
      } 
      paramᐨẏ.ᐨẏ();
    } 
  }
  
  static void ᐨẏ(ᐨẏ paramᐨẏ, String paramString, Object paramObject) {
    if (paramᐨẏ != null) {
      List list;
      byte b;
      int i;
      if (paramObject instanceof String[]) {
        String[] arrayOfString = (String[])paramObject;
        paramᐨẏ.ᐨẏ(paramString, arrayOfString[0], arrayOfString[1]);
        return;
      } 
      if (paramObject instanceof ʾא) {
        ʾא ʾא1;
        (ʾא1 = (ʾא)paramObject).ᐨẏ(paramᐨẏ.ᐨẏ(paramString, ʾא1.ˎᴗ));
        return;
      } 
      if (paramObject instanceof List) {
        ᐨẏ ᐨẏ1;
        if ((ᐨẏ1 = paramᐨẏ.ᐨẏ(paramString)) != null) {
          list = (List)paramObject;
          b = 0;
          i = list.size();
          while (b < i) {
            ᐨẏ(ᐨẏ1, (String)null, list.get(b));
            b++;
          } 
          ᐨẏ1.ᐨẏ();
        } 
        return;
      } 
      list.ᐨẏ(b, i);
    } 
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ʾא.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */