package yyds.sniarbtej;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import ylt.pmn.zubdqvgt;

public final class ᐝʶ<K, V> extends AbstractMap<K, V> implements Serializable {
  private static final Comparator<Comparable> ᐨẏ;
  
  private Comparator<? super K> ˊ;
  
  private ˎǰ<K, V> ᐨẏ;
  
  int ʿᵉ = 0;
  
  int יๆ = 0;
  
  final ˎǰ<K, V> ˊ = new ˎǰ<>();
  
  private yyds/sniarbtej/ʿא ᐨẏ;
  
  private yyds/sniarbtej/冫 ᐨẏ;
  
  public ᐝʶ() {
    this((Comparator<? super K>)ᐨẏ);
  }
  
  private ᐝʶ(Comparator<? super K> paramComparator) {
    this.ˊ = (paramComparator != null) ? (ˎǰ)paramComparator : (ˎǰ<K, V>)ᐨẏ;
  }
  
  public final int size() {
    return this.ʿᵉ;
  }
  
  public final V get(Object<K, V> paramObject) {
    return ((paramObject = (Object<K, V>)ᐨẏ(paramObject)) != null) ? ((ˎǰ)paramObject).ﾞл : null;
  }
  
  public final boolean containsKey(Object paramObject) {
    return (ᐨẏ(paramObject) != null);
  }
  
  public final V put(K paramK, V paramV) {
    if (paramK == null) {
      "?씶綽ꖊ蒒?贉츽㊢㪱".toCharArray()[2] = (char)("?씶綽ꖊ蒒?贉츽㊢㪱".toCharArray()[2] ^ 0x5514);
      throw new NullPointerException(ᐝᵣ$ﾞﾇ.j("?씶綽ꖊ蒒?贉츽㊢㪱".toCharArray(), (short)23713, 0, (short)2));
    } 
    ˎǰ<K, V> ˎǰ1;
    V v = (ˎǰ1 = ᐨẏ(paramK, true)).ﾞл;
    ˎǰ1.ﾞл = paramV;
    return v;
  }
  
  public final void clear() {
    this.ᐨẏ = null;
    this.ʿᵉ = 0;
    this.יๆ++;
    ˎǰ<K, V> ˎǰ1;
    (ˎǰ1 = this.ˊ).ᴵʖ = ˎǰ1.ˍɫ = ˎǰ1;
  }
  
  public final V remove(Object<K, V> paramObject) {
    return ((paramObject = (Object<K, V>)ˊ(paramObject)) != null) ? ((ˎǰ)paramObject).ﾞл : null;
  }
  
  private ˎǰ<K, V> ᐨẏ(K paramK, boolean paramBoolean) {
    ˎǰ<K, V> ˎǰ2;
    ˎǰ<K, V> ˎǰ4;
    ˎǰ<K, V> ˎǰ1 = this.ˊ;
    yyds/sniarbtej/冫 yyds/sniarbtej/冫 = this.ᐨẏ;
    int i = 0;
    if (yyds/sniarbtej/冫 != null) {
      Comparable<K> comparable = zubdqvgt.G(ˎǰ1, ᐨẏ) ? (Comparable)paramK : null;
      while (true) {
        if ((i = (comparable != null) ? comparable.compareTo(((ˎǰ)yyds/sniarbtej/冫).ʾ) : ˎǰ1.compare(paramK, ((ˎǰ)yyds/sniarbtej/冫).ʾ)) == 0)
          return (ˎǰ<K, V>)yyds/sniarbtej/冫; 
        if ((ˎǰ4 = (ˎǰ<K, V>)((i < 0) ? ((ˎǰ)yyds/sniarbtej/冫).ʹﮃ : ((ˎǰ)yyds/sniarbtej/冫).ՙᗮ)) != null) {
          ˎǰ2 = ˎǰ4;
          continue;
        } 
        break;
      } 
    } 
    if (!paramBoolean)
      return null; 
    ˎǰ<K, V> ˎǰ3 = this.ˊ;
    if (ˎǰ2 == null) {
      if (zubdqvgt.G(ˎǰ1, ᐨẏ) && !(paramK instanceof Comparable)) {
        "⤥蝁?㤥콀雓ꅺꈄﱋ鵍돧덶䨵霛泧ਝΗ".toCharArray()[13] = (char)("⤥蝁?㤥콀雓ꅺꈄﱋ鵍돧덶䨵霛泧ਝΗ".toCharArray()[13] ^ 0x36FF);
        throw new ClassCastException(paramK.getClass().getName() + ˉﻤ$ͺſ.v("⤥蝁?㤥콀雓ꅺꈄﱋ鵍돧덶䨵霛泧ਝΗ".toCharArray(), (short)9938, 2, (short)1));
      } 
      ˎǰ4 = new ˎǰ<>(ˎǰ2, paramK, ˎǰ3, ˎǰ3.ˍɫ);
      this.ᐨẏ = (yyds/sniarbtej/冫)ˎǰ4;
    } else {
      ˎǰ4 = new ˎǰ<>(ˎǰ2, paramK, ˎǰ3, ˎǰ3.ˍɫ);
      if (i < 0) {
        ˎǰ2.ʹﮃ = ˎǰ4;
      } else {
        ˎǰ2.ՙᗮ = ˎǰ4;
      } 
      ˊ(ˎǰ2, true);
    } 
    this.ʿᵉ++;
    this.יๆ++;
    return ˎǰ4;
  }
  
  private ˎǰ<K, V> ᐨẏ(Object paramObject) {
    try {
      return (paramObject != null) ? ᐨẏ((K)paramObject, false) : null;
    } catch (ClassCastException classCastException) {
      return null;
    } 
  }
  
  final ˎǰ<K, V> ᐨẏ(Map.Entry<?, ?> paramEntry) {
    Object object = paramEntry.getValue();
    boolean bool;
    V v;
    ˎǰ<K, V> ˎǰ1;
    return (bool = ((ˎǰ1 = ᐨẏ(paramEntry.getKey())) != null && ((zubdqvgt.G(v = ˎǰ1.ﾞл, object) || (v != null && v.equals(object))))) ? true : false) ? ˎǰ1 : null;
  }
  
  private static boolean ᐨẏ(Object paramObject1, Object paramObject2) {
    return (zubdqvgt.G(paramObject1, paramObject2) || (paramObject1 != null && paramObject1.equals(paramObject2)));
  }
  
  final void ᐨẏ(ˎǰ<K, V> paramˎǰ, boolean paramBoolean) {
    int i;
    if (paramBoolean) {
      paramˎǰ.ˍɫ.ᴵʖ = paramˎǰ.ᴵʖ;
      paramˎǰ.ᴵʖ.ˍɫ = paramˎǰ.ˍɫ;
    } 
    ˎǰ<K, V> ˎǰ1 = paramˎǰ.ʹﮃ;
    ˎǰ<K, V> ˎǰ2 = paramˎǰ.ՙᗮ;
    ˎǰ<K, V> ˎǰ3 = paramˎǰ.ʿᵉ;
    if (ˎǰ1 != null && ˎǰ2 != null) {
      for (ˎǰ2 = (ˎǰ1 = ˎǰ1 = ˎǰ1).ՙᗮ; ˎǰ2 != null; ˎǰ2 = (ˎǰ1 = ˎǰ2).ՙᗮ);
      for (ˎǰ2 = (ˎǰ1 = ˎǰ1 = ˎǰ2).ʹﮃ; ˎǰ2 != null; ˎǰ2 = (ˎǰ1 = ˎǰ2).ʹﮃ);
      ˎǰ3 = (ˎǰ1.ʿｪ > ˎǰ2.ʿｪ) ? ˎǰ1 : ˎǰ1;
      ᐨẏ(ˎǰ3, false);
      int j = 0;
      if ((ˎǰ1 = paramˎǰ.ʹﮃ) != null) {
        j = ˎǰ1.ʿｪ;
        ˎǰ3.ʹﮃ = ˎǰ1;
        ˎǰ1.ʿᵉ = ˎǰ3;
        paramˎǰ.ʹﮃ = null;
      } 
      i = 0;
      if ((ˎǰ2 = paramˎǰ.ՙᗮ) != null) {
        i = ˎǰ2.ʿｪ;
        ˎǰ3.ՙᗮ = ˎǰ2;
        ˎǰ2.ʿᵉ = ˎǰ3;
        paramˎǰ.ՙᗮ = null;
      } 
      ˎǰ3.ʿｪ = Math.max(j, i) + 1;
      ᐨẏ(paramˎǰ, ˎǰ3);
      return;
    } 
    if (i != null) {
      ᐨẏ(paramˎǰ, i);
      paramˎǰ.ʹﮃ = null;
    } else if (ˎǰ2 != null) {
      ᐨẏ(paramˎǰ, ˎǰ2);
      paramˎǰ.ՙᗮ = null;
    } else {
      ᐨẏ(paramˎǰ, (ˎǰ<K, V>)null);
    } 
    ˊ(ˎǰ3, false);
    this.ʿᵉ--;
    this.יๆ++;
  }
  
  final ˎǰ<K, V> ˊ(Object<K, V> paramObject) {
    if ((paramObject = (Object<K, V>)ᐨẏ(paramObject)) != null)
      ᐨẏ((ˎǰ<K, V>)paramObject, true); 
    return (ˎǰ<K, V>)paramObject;
  }
  
  private void ᐨẏ(ˎǰ<K, V> paramˎǰ1, ˎǰ<K, V> paramˎǰ2) {
    ˎǰ<K, V> ˎǰ1 = paramˎǰ1.ʿᵉ;
    paramˎǰ1.ʿᵉ = null;
    if (paramˎǰ2 != null)
      paramˎǰ2.ʿᵉ = ˎǰ1; 
    if (ˎǰ1 != null) {
      if (zubdqvgt.G(ˎǰ1.ʹﮃ, paramˎǰ1)) {
        ˎǰ1.ʹﮃ = paramˎǰ2;
        return;
      } 
      if (!ـไ && !zubdqvgt.G(ˎǰ1.ՙᗮ, paramˎǰ1))
        throw new AssertionError(); 
      ˎǰ1.ՙᗮ = paramˎǰ2;
      return;
    } 
    this.ᐨẏ = (yyds/sniarbtej/冫)paramˎǰ2;
  }
  
  private void ˊ(ˎǰ<K, V> paramˎǰ, boolean paramBoolean) {
    for (paramˎǰ = paramˎǰ; paramˎǰ != null; paramˎǰ = paramˎǰ.ʿᵉ) {
      ˎǰ<K, V> ˎǰ1 = paramˎǰ.ʹﮃ;
      ˎǰ<K, V> ˎǰ2 = paramˎǰ.ՙᗮ;
      int i = (ˎǰ1 != null) ? ˎǰ1.ʿｪ : 0;
      byte b = (ˎǰ2 != null) ? ˎǰ2.ʿｪ : 0;
      int j;
      if ((j = i - b) == -2) {
        ˎǰ<K, V> ˎǰ3 = ˎǰ2.ʹﮃ;
        ˎǰ<K, V> ˎǰ4;
        byte b1 = ((ˎǰ4 = ˎǰ2.ՙᗮ) != null) ? ˎǰ4.ʿｪ : 0;
        int k;
        if ((k = (k = (ˎǰ3 != null) ? ˎǰ3.ʿｪ : 0) - b1) == -1 || (k == 0 && !paramBoolean)) {
          ᐨẏ(paramˎǰ);
        } else {
          if (!ـไ && k != 1)
            throw new AssertionError(); 
          ˊ(ˎǰ2);
          ᐨẏ(paramˎǰ);
        } 
        if (!paramBoolean)
          continue; 
        break;
      } 
      if (j == 2) {
        ˎǰ<K, V> ˎǰ3 = ˎǰ1.ʹﮃ;
        ˎǰ<K, V> ˎǰ4;
        b = ((ˎǰ4 = ˎǰ1.ՙᗮ) != null) ? ˎǰ4.ʿｪ : 0;
        if ((i = (i = (ˎǰ3 != null) ? ˎǰ3.ʿｪ : 0) - b) == 1 || (i == 0 && !paramBoolean)) {
          ˊ(paramˎǰ);
        } else {
          if (!ـไ && i != -1)
            throw new AssertionError(); 
          ᐨẏ(ˎǰ1);
          ˊ(paramˎǰ);
        } 
        if (!paramBoolean)
          continue; 
        break;
      } 
      if (j == 0) {
        paramˎǰ.ʿｪ = i + 1;
        if (paramBoolean)
          return; 
        continue;
      } 
      if (!ـไ && j != -1 && j != 1)
        throw new AssertionError(); 
      paramˎǰ.ʿｪ = Math.max(i, b) + 1;
      if (paramBoolean)
        continue; 
    } 
  }
  
  private void ᐨẏ(ˎǰ<K, V> paramˎǰ) {
    ˎǰ<K, V> ˎǰ1 = paramˎǰ.ʹﮃ;
    ˎǰ<K, V> ˎǰ2;
    ˎǰ<K, V> ˎǰ3 = (ˎǰ2 = paramˎǰ.ՙᗮ).ʹﮃ;
    ˎǰ<K, V> ˎǰ4 = ˎǰ2.ՙᗮ;
    paramˎǰ.ՙᗮ = ˎǰ3;
    if (ˎǰ3 != null)
      ˎǰ3.ʿᵉ = paramˎǰ; 
    ᐨẏ(paramˎǰ, ˎǰ2);
    ˎǰ2.ʹﮃ = paramˎǰ;
    paramˎǰ.ʿᵉ = ˎǰ2;
    paramˎǰ.ʿｪ = Math.max((ˎǰ1 != null) ? ˎǰ1.ʿｪ : 0, (ˎǰ3 != null) ? ˎǰ3.ʿｪ : 0) + 1;
    ˎǰ2.ʿｪ = Math.max(paramˎǰ.ʿｪ, (ˎǰ4 != null) ? ˎǰ4.ʿｪ : 0) + 1;
  }
  
  private void ˊ(ˎǰ<K, V> paramˎǰ) {
    ˎǰ<K, V> ˎǰ1 = paramˎǰ.ʹﮃ;
    ˎǰ<K, V> ˎǰ2 = paramˎǰ.ՙᗮ;
    ˎǰ<K, V> ˎǰ3 = ˎǰ1.ʹﮃ;
    ˎǰ<K, V> ˎǰ4 = ˎǰ1.ՙᗮ;
    paramˎǰ.ʹﮃ = ˎǰ4;
    if (ˎǰ4 != null)
      ˎǰ4.ʿᵉ = paramˎǰ; 
    ᐨẏ(paramˎǰ, ˎǰ1);
    ˎǰ1.ՙᗮ = paramˎǰ;
    paramˎǰ.ʿᵉ = ˎǰ1;
    paramˎǰ.ʿｪ = Math.max((ˎǰ2 != null) ? ˎǰ2.ʿｪ : 0, (ˎǰ4 != null) ? ˎǰ4.ʿｪ : 0) + 1;
    ˎǰ1.ʿｪ = Math.max(paramˎǰ.ʿｪ, (ˎǰ3 != null) ? ˎǰ3.ʿｪ : 0) + 1;
  }
  
  public final Set<Map.Entry<K, V>> entrySet() {
    yyds/sniarbtej/冫 yyds/sniarbtej/冫;
    return (Set<Map.Entry<K, V>>)(((yyds/sniarbtej/冫 = this.ᐨẏ) != null) ? yyds/sniarbtej/冫 : (this.ᐨẏ = (yyds/sniarbtej/冫)new ʿא(this)));
  }
  
  public final Set<K> keySet() {
    yyds/sniarbtej/冫 yyds/sniarbtej/冫;
    return (Set<K>)(((yyds/sniarbtej/冫 = this.ᐨẏ) != null) ? yyds/sniarbtej/冫 : (this.ᐨẏ = (yyds/sniarbtej/冫)new 冫(this)));
  }
  
  private Object ʹﮃ() {
    return new LinkedHashMap<>(this);
  }
  
  static {
    ᐨẏ = (yyds/sniarbtej/冫)new ʾᖾ();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ᐝʶ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */