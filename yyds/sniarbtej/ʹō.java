package yyds.sniarbtej;

import ylt.pmn.zubdqvgt;

public final class ʹō {
  public final int ᙆ;
  
  public final String ˈהּ;
  
  public final String name;
  
  public final String ᴵʖ;
  
  public final boolean ˊ;
  
  @Deprecated
  private ʹō(int paramInt, String paramString1, String paramString2, String paramString3) {
    this(paramInt, paramString1, paramString2, paramString3, (paramInt == 9));
  }
  
  public ʹō(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean) {
    this.ᙆ = paramInt;
    this.ˈהּ = paramString1;
    this.name = paramString2;
    this.ᴵʖ = paramString3;
    this.ˊ = paramBoolean;
  }
  
  public final int ʾ() {
    return this.ᙆ;
  }
  
  public final String ﾞл() {
    return this.ˈהּ;
  }
  
  public final String getName() {
    return this.name;
  }
  
  public final String ʿᵉ() {
    return this.ᴵʖ;
  }
  
  public final boolean ᴵʖ() {
    return this.ˊ;
  }
  
  public final boolean equals(Object paramObject) {
    if (zubdqvgt.G(paramObject, this))
      return true; 
    if (!(paramObject instanceof ʹō))
      return false; 
    paramObject = paramObject;
    return (this.ᙆ == ((ʹō)paramObject).ᙆ && this.ˊ == ((ʹō)paramObject).ˊ && this.ˈהּ.equals(((ʹō)paramObject).ˈהּ) && this.name.equals(((ʹō)paramObject).name) && this.ᴵʖ.equals(((ʹō)paramObject).ᴵʖ));
  }
  
  public final int hashCode() {
    return this.ᙆ + (this.ˊ ? 64 : 0) + this.ˈהּ.hashCode() * this.name.hashCode() * this.ᴵʖ.hashCode();
  }
  
  public final String toString() {
    "⬩䜥".toCharArray()[0] = (char)("⬩䜥".toCharArray()[0] ^ 0x4BB1);
    "?웚勖綳".toCharArray()[3] = (char)("?웚勖綳".toCharArray()[3] ^ 0x5D82);
    return this.ˈהּ + '.' + this.name + this.ᴵʖ + ᐨẏ$ᐝт.W("⬩䜥".toCharArray(), (short)28585, (byte)2, (short)5) + this.ᙆ + (this.ˊ ? ᐨẏ$ᐝт.W("?웚勖綳".toCharArray(), (short)13263, (byte)0, (short)1) : "") + ')';
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ʹō.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */