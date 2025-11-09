package yyds.sniarbtej;

import java.util.Arrays;
import ylt.pmn.zubdqvgt;

public final class ʾܪ {
  public final String name;
  
  public final String ᴵʖ;
  
  public final ʹō ᐨẏ;
  
  public final Object[] ᐨẏ;
  
  public ʾܪ(String paramString1, String paramString2, ʹō paramʹō, Object... paramVarArgs) {
    this.name = paramString1;
    this.ᴵʖ = paramString2;
    this.ᐨẏ = (Object[])paramʹō;
    this.ᐨẏ = paramVarArgs;
  }
  
  public final String getName() {
    return this.name;
  }
  
  public final String ᴵʖ() {
    return this.ᴵʖ;
  }
  
  public final ʹō ᐨẏ() {
    return (ʹō)this.ᐨẏ;
  }
  
  public final int ՙᗮ() {
    return this.ᐨẏ.length;
  }
  
  public final Object ᐨẏ(int paramInt) {
    return this.ᐨẏ[paramInt];
  }
  
  final Object[] ᐨẏ() {
    return this.ᐨẏ;
  }
  
  public final int ˍɫ() {
    char c;
    return ((c = this.ᴵʖ.charAt(0)) == 'J' || c == 'D') ? 2 : 1;
  }
  
  public final boolean equals(Object paramObject) {
    if (zubdqvgt.G(paramObject, this))
      return true; 
    if (!(paramObject instanceof ʾܪ))
      return false; 
    paramObject = paramObject;
    return (this.name.equals(((ʾܪ)paramObject).name) && this.ᴵʖ.equals(((ʾܪ)paramObject).ᴵʖ) && this.ᐨẏ.equals(((ʾܪ)paramObject).ᐨẏ) && Arrays.equals(this.ᐨẏ, ((ʾܪ)paramObject).ᐨẏ));
  }
  
  public final int hashCode() {
    return this.name.hashCode() ^ Integer.rotateLeft(this.ᴵʖ.hashCode(), 8) ^ Integer.rotateLeft(this.ᐨẏ.hashCode(), 16) ^ Integer.rotateLeft(Arrays.hashCode(this.ᐨẏ), 24);
  }
  
  public final String toString() {
    "Ộ⬹惸".toCharArray()[1] = (char)("Ộ⬹惸".toCharArray()[1] ^ 0xA75);
    return this.name + ˉﻤ$ͺſ.v("Ộ⬹惸".toCharArray(), (short)18421, 2, (short)4) + this.ᴵʖ + ' ' + this.ᐨẏ + ' ' + Arrays.toString(this.ᐨẏ);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ʾܪ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */