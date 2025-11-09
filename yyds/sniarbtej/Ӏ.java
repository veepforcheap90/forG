package yyds.sniarbtej;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Ӏ {
  private static int ʽˍ = 0;
  
  private static int ͺΎ = 1;
  
  private static int ʽʵ = 2;
  
  private static int Ľ = 3;
  
  private static int ˈﯩ = 4;
  
  private static int ٴᒩ = 5;
  
  private static int ـᒯ = 6;
  
  private static int ـᴾ = 7;
  
  private static int ᴵʭ = 8;
  
  private static int ɬ = 9;
  
  private static int ᐝڗ = 10;
  
  private static int ο = 11;
  
  private static int ـƳ = 12;
  
  private static int ˊӱ = 13;
  
  private static int יﺋ = 14;
  
  private static int יﻩ = 15;
  
  protected int ՙঘ;
  
  public List<ʽ冫> ˍɫ;
  
  public List<ʽ冫> ʽ;
  
  public Ӏ ᐨẏ;
  
  public Ӏ ˊ;
  
  int ͺᴲ;
  
  protected Ӏ(int paramInt) {
    this.ՙঘ = paramInt;
    this.ͺᴲ = -1;
  }
  
  public final int ˈהּ() {
    return this.ՙঘ;
  }
  
  public abstract int ﹳיִ();
  
  public final Ӏ ᐨẏ() {
    return this.ᐨẏ;
  }
  
  public final Ӏ ˊ() {
    return this.ˊ;
  }
  
  public abstract void ᐨẏ(ˉｓ paramˉｓ);
  
  protected final void ˊ(ˉｓ paramˉｓ) {
    if (this.ˍɫ != null) {
      byte b = 0;
      int i = this.ˍɫ.size();
      while (b < i) {
        ʽ冫 ʽ冫;
        (ʽ冫 = this.ˍɫ.get(b)).ᐨẏ(paramˉｓ.ˊ(ʽ冫.ٱ, ʽ冫.ˊ, ʽ冫.ˎᴗ, true));
        b++;
      } 
    } 
    if (this.ʽ != null) {
      byte b = 0;
      int i = this.ʽ.size();
      while (b < i) {
        ʽ冫 ʽ冫;
        (ʽ冫 = this.ʽ.get(b)).ᐨẏ(paramˉｓ.ˊ(ʽ冫.ٱ, ʽ冫.ˊ, ʽ冫.ˎᴗ, false));
        b++;
      } 
    } 
  }
  
  public abstract Ӏ ᐨẏ(Map<λ, λ> paramMap);
  
  static λ ᐨẏ(λ paramλ, Map<λ, λ> paramMap) {
    return paramMap.get(paramλ);
  }
  
  static λ[] ᐨẏ(List<λ> paramList, Map<λ, λ> paramMap) {
    λ[] arrayOfΛ = new λ[paramList.size()];
    byte b = 0;
    int i = arrayOfΛ.length;
    while (b < i) {
      arrayOfΛ[b] = paramMap.get(paramList.get(b));
      b++;
    } 
    return arrayOfΛ;
  }
  
  protected final Ӏ ᐨẏ(Ӏ paramӀ) {
    if (paramӀ.ˍɫ != null) {
      this.ˍɫ = new ArrayList<>();
      byte b = 0;
      int i = paramӀ.ˍɫ.size();
      while (b < i) {
        ʽ冫 ʽ冫1 = paramӀ.ˍɫ.get(b);
        ʽ冫 ʽ冫2 = new ʽ冫(ʽ冫1.ٱ, ʽ冫1.ˊ, ʽ冫1.ˎᴗ);
        ʽ冫1.ᐨẏ(ʽ冫2);
        this.ˍɫ.add(ʽ冫2);
        b++;
      } 
    } 
    if (paramӀ.ʽ != null) {
      this.ʽ = new ArrayList<>();
      byte b = 0;
      int i = paramӀ.ʽ.size();
      while (b < i) {
        ʽ冫 ʽ冫1 = paramӀ.ʽ.get(b);
        ʽ冫 ʽ冫2 = new ʽ冫(ʽ冫1.ٱ, ʽ冫1.ˊ, ʽ冫1.ˎᴗ);
        ʽ冫1.ᐨẏ(ʽ冫2);
        this.ʽ.add(ʽ冫2);
        b++;
      } 
    } 
    return this;
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\Ӏ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */