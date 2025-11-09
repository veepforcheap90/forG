package yyds.sniarbtej;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import ylt.pmn.zubdqvgt;

public final class ᐝᎫ<K, V> extends AbstractMap<K, V> implements Serializable {
  private static final Comparator<Comparable> ᐨẏ;
  
  private Comparator<? super K> ˊ;
  
  private ـᔭ<K, V>[] ᐨẏ;
  
  final ـᔭ<K, V> ᐨẏ;
  
  int ʿᵉ = 0;
  
  int יๆ = 0;
  
  private int ˌゥ;
  
  private yyds/sniarbtej/ᴵܚ ᐨẏ;
  
  private yyds/sniarbtej/ιะ ᐨẏ;
  
  public ᐝᎫ() {
    this((Comparator<? super K>)ᐨẏ);
  }
  
  private ᐝᎫ(Comparator<? super K> paramComparator) {
    this.ˊ = (paramComparator != null) ? paramComparator : (Comparator<? super K>)ᐨẏ;
    this.ᐨẏ = (yyds/sniarbtej/ιะ)new ـᔭ<>();
    this.ᐨẏ = (yyds/sniarbtej/ιะ)new ـᔭ[16];
    this.ˌゥ = this.ᐨẏ.length / 2 + this.ᐨẏ.length / 4;
  }
  
  public final int size() {
    return this.ʿᵉ;
  }
  
  public final V get(Object<K, V> paramObject) {
    return ((paramObject = (Object<K, V>)ᐨẏ(paramObject)) != null) ? ((ـᔭ)paramObject).ﾞл : null;
  }
  
  public final boolean containsKey(Object paramObject) {
    return (ᐨẏ(paramObject) != null);
  }
  
  public final V put(K paramK, V paramV) {
    if (paramK == null) {
      "苰칈塖ˢ쿵蒹㎂⚋ب眗".toCharArray()[2] = (char)("苰칈塖ˢ쿵蒹㎂⚋ب眗".toCharArray()[2] ^ 0x7458);
      throw new NullPointerException(ᐝᵣ$ﾞﾇ.j("苰칈塖ˢ쿵蒹㎂⚋ب眗".toCharArray(), (short)12009, 5, (short)5));
    } 
    ـᔭ<K, V> ـᔭ1;
    V v = (ـᔭ1 = ᐨẏ(paramK, true)).ﾞл;
    ـᔭ1.ﾞл = paramV;
    return v;
  }
  
  public final void clear() {
    Arrays.fill((Object[])this.ᐨẏ, (Object)null);
    this.ʿᵉ = 0;
    this.יๆ++;
    yyds/sniarbtej/ιะ yyds/sniarbtej/ιะ;
    for (V v = ((ـᔭ)(yyds/sniarbtej/ιะ = this.ᐨẏ)).ﾞл; !zubdqvgt.G(v, yyds/sniarbtej/ιะ); v = v1) {
      V v1 = ((ـᔭ)v).ﾞл;
      ((ـᔭ)v).ﾞл = (V)(((ـᔭ)v).ʽ = null);
    } 
    ((ـᔭ)yyds/sniarbtej/ιะ).ﾞл = (V)(((ـᔭ)yyds/sniarbtej/ιะ).ʽ = (ـᔭ<K, V>)yyds/sniarbtej/ιะ);
  }
  
  public final V remove(Object<K, V> paramObject) {
    return ((paramObject = (Object<K, V>)ˊ(paramObject)) != null) ? ((ـᔭ)paramObject).ﾞл : null;
  }
  
  private ـᔭ<K, V> ᐨẏ(K paramK, boolean paramBoolean) {
    ـᔭ<K, V> ـᔭ1;
    ـᔭ<K, V> ـᔭ2;
    Comparator<? super K> comparator = this.ˊ;
    yyds/sniarbtej/ιะ yyds/sniarbtej/ιะ1 = this.ᐨẏ;
    int i;
    int j = (i = (i = (i = paramK.hashCode()) ^ i >>> 20 ^ i >>> 12) ^ i >>> 7 ^ i >>> 4) & yyds/sniarbtej/ιะ1.length - 1;
    yyds/sniarbtej/ιะ yyds/sniarbtej/ιะ2 = yyds/sniarbtej/ιะ1[j];
    int k = 0;
    if (yyds/sniarbtej/ιะ2 != null) {
      Comparable<K> comparable = zubdqvgt.G(comparator, ᐨẏ) ? (Comparable)paramK : null;
      while (true) {
        if ((k = (comparable != null) ? comparable.compareTo(((ـᔭ)yyds/sniarbtej/ιะ2).ʾ) : comparator.compare(paramK, ((ـᔭ)yyds/sniarbtej/ιะ2).ʾ)) == 0)
          return (ـᔭ<K, V>)yyds/sniarbtej/ιะ2; 
        if ((ـᔭ2 = (ـᔭ<K, V>)((k < 0) ? ((ـᔭ)yyds/sniarbtej/ιะ2).ՙᗮ : ((ـᔭ)yyds/sniarbtej/ιะ2).ˍɫ)) != null) {
          ـᔭ1 = ـᔭ2;
          continue;
        } 
        break;
      } 
    } 
    if (!paramBoolean)
      return null; 
    yyds/sniarbtej/ιะ yyds/sniarbtej/ιะ3 = this.ᐨẏ;
    if (ـᔭ1 == null) {
      if (zubdqvgt.G(comparator, ᐨẏ) && !(paramK instanceof Comparable)) {
        "橽䪟ᝌ隉２෇鹢诔鉰篳樓铪疹續?긪進㋬".toCharArray()[11] = (char)("橽䪟ᝌ隉２෇鹢诔鉰篳樓铪疹續?긪進㋬".toCharArray()[11] ^ 0x493E);
        throw new ClassCastException(paramK.getClass().getName() + ˏȓ$ᴵЃ.E("橽䪟ᝌ隉２෇鹢诔鉰篳樓铪疹續?긪進㋬".toCharArray(), (short)29242, (short)0, (short)1));
      } 
      ـᔭ2 = new ـᔭ<>(ـᔭ1, paramK, i, (ـᔭ<K, V>)yyds/sniarbtej/ιะ3, ((ـᔭ)yyds/sniarbtej/ιะ3).ʽ);
      yyds/sniarbtej/ιะ1[j] = (yyds/sniarbtej/ιะ)ـᔭ2;
    } else {
      ـᔭ2 = new ـᔭ<>(ـᔭ1, paramK, i, (ـᔭ<K, V>)yyds/sniarbtej/ιะ3, ((ـᔭ)yyds/sniarbtej/ιะ3).ʽ);
      if (k < 0) {
        ـᔭ1.ՙᗮ = ـᔭ2;
      } else {
        ـᔭ1.ˍɫ = ـᔭ2;
      } 
      ˊ(ـᔭ1, true);
    } 
    if (this.ʿᵉ++ > this.ˌゥ) {
      ᐝᎫ ᐝᎫ1;
      (ᐝᎫ1 = this).ᐨẏ = ᐨẏ((ـᔭ<?, ?>[])ᐝᎫ1.ᐨẏ);
      ᐝᎫ1.ˌゥ = ᐝᎫ1.ᐨẏ.length / 2 + ᐝᎫ1.ᐨẏ.length / 4;
    } 
    this.יๆ++;
    return ـᔭ2;
  }
  
  private ـᔭ<K, V> ᐨẏ(Object paramObject) {
    try {
      return (paramObject != null) ? ᐨẏ((K)paramObject, false) : null;
    } catch (ClassCastException classCastException) {
      return null;
    } 
  }
  
  final ـᔭ<K, V> ᐨẏ(Map.Entry<?, ?> paramEntry) {
    Object object = paramEntry.getValue();
    V v;
    boolean bool;
    ـᔭ<K, V> ـᔭ1;
    return (bool = ((ـᔭ1 = ᐨẏ(paramEntry.getKey())) != null && ((zubdqvgt.G(v = ـᔭ1.ﾞл, object) || (v != null && v.equals(object))))) ? true : false) ? ـᔭ1 : null;
  }
  
  private static boolean ᐨẏ(Object paramObject1, Object paramObject2) {
    return (zubdqvgt.G(paramObject1, paramObject2) || (paramObject1 != null && paramObject1.equals(paramObject2)));
  }
  
  private static int ʾܪ(int paramInt) {
    return (paramInt ^= paramInt >>> 20 ^ paramInt >>> 12) ^ paramInt >>> 7 ^ paramInt >>> 4;
  }
  
  final void ᐨẏ(ـᔭ<K, V> paramـᔭ, boolean paramBoolean) {
    int i;
    if (paramBoolean) {
      paramـᔭ.ʽ.ﾞл = paramـᔭ.ﾞл;
      ((ـᔭ)paramـᔭ.ﾞл).ʽ = paramـᔭ.ʽ;
      paramـᔭ.ﾞл = (V)(paramـᔭ.ʽ = null);
    } 
    ـᔭ<K, V> ـᔭ1 = paramـᔭ.ՙᗮ;
    ـᔭ<K, V> ـᔭ2 = paramـᔭ.ˍɫ;
    ـᔭ<K, V> ـᔭ3 = paramـᔭ.ʹﮃ;
    if (ـᔭ1 != null && ـᔭ2 != null) {
      for (ـᔭ2 = (ـᔭ1 = ـᔭ1 = ـᔭ1).ˍɫ; ـᔭ2 != null; ـᔭ2 = (ـᔭ1 = ـᔭ2).ˍɫ);
      for (ـᔭ2 = (ـᔭ1 = ـᔭ1 = ـᔭ2).ՙᗮ; ـᔭ2 != null; ـᔭ2 = (ـᔭ1 = ـᔭ2).ՙᗮ);
      ـᔭ3 = (ـᔭ1.ʿｪ > ـᔭ2.ʿｪ) ? ـᔭ1 : ـᔭ1;
      ᐨẏ(ـᔭ3, false);
      int j = 0;
      if ((ـᔭ1 = paramـᔭ.ՙᗮ) != null) {
        j = ـᔭ1.ʿｪ;
        ـᔭ3.ՙᗮ = ـᔭ1;
        ـᔭ1.ʹﮃ = ـᔭ3;
        paramـᔭ.ՙᗮ = null;
      } 
      i = 0;
      if ((ـᔭ2 = paramـᔭ.ˍɫ) != null) {
        i = ـᔭ2.ʿｪ;
        ـᔭ3.ˍɫ = ـᔭ2;
        ـᔭ2.ʹﮃ = ـᔭ3;
        paramـᔭ.ˍɫ = null;
      } 
      ـᔭ3.ʿｪ = Math.max(j, i) + 1;
      ᐨẏ(paramـᔭ, ـᔭ3);
      return;
    } 
    if (i != null) {
      ᐨẏ(paramـᔭ, i);
      paramـᔭ.ՙᗮ = null;
    } else if (ـᔭ2 != null) {
      ᐨẏ(paramـᔭ, ـᔭ2);
      paramـᔭ.ˍɫ = null;
    } else {
      ᐨẏ(paramـᔭ, (ـᔭ<K, V>)null);
    } 
    ˊ(ـᔭ3, false);
    this.ʿᵉ--;
    this.יๆ++;
  }
  
  final ـᔭ<K, V> ˊ(Object<K, V> paramObject) {
    if ((paramObject = (Object<K, V>)ᐨẏ(paramObject)) != null)
      ᐨẏ((ـᔭ<K, V>)paramObject, true); 
    return (ـᔭ<K, V>)paramObject;
  }
  
  private void ᐨẏ(ـᔭ<K, V> paramـᔭ1, ـᔭ<K, V> paramـᔭ2) {
    ـᔭ<K, V> ـᔭ1 = paramـᔭ1.ʹﮃ;
    paramـᔭ1.ʹﮃ = null;
    if (paramـᔭ2 != null)
      paramـᔭ2.ʹﮃ = ـᔭ1; 
    if (ـᔭ1 != null) {
      if (zubdqvgt.G(ـᔭ1.ՙᗮ, paramـᔭ1)) {
        ـᔭ1.ՙᗮ = paramـᔭ2;
        return;
      } 
      if (!ـไ && !zubdqvgt.G(ـᔭ1.ˍɫ, paramـᔭ1))
        throw new AssertionError(); 
      ـᔭ1.ˍɫ = paramـᔭ2;
      return;
    } 
    int i = paramـᔭ1.ᒯ & this.ᐨẏ.length - 1;
    this.ᐨẏ[i] = (yyds/sniarbtej/ιะ)paramـᔭ2;
  }
  
  private void ˊ(ـᔭ<K, V> paramـᔭ, boolean paramBoolean) {
    for (paramـᔭ = paramـᔭ; paramـᔭ != null; paramـᔭ = paramـᔭ.ʹﮃ) {
      ـᔭ<K, V> ـᔭ1 = paramـᔭ.ՙᗮ;
      ـᔭ<K, V> ـᔭ2 = paramـᔭ.ˍɫ;
      int i = (ـᔭ1 != null) ? ـᔭ1.ʿｪ : 0;
      byte b = (ـᔭ2 != null) ? ـᔭ2.ʿｪ : 0;
      int j;
      if ((j = i - b) == -2) {
        ـᔭ<K, V> ـᔭ3 = ـᔭ2.ՙᗮ;
        ـᔭ<K, V> ـᔭ4;
        byte b1 = ((ـᔭ4 = ـᔭ2.ˍɫ) != null) ? ـᔭ4.ʿｪ : 0;
        int k;
        if ((k = (k = (ـᔭ3 != null) ? ـᔭ3.ʿｪ : 0) - b1) == -1 || (k == 0 && !paramBoolean)) {
          ᐨẏ(paramـᔭ);
        } else {
          if (!ـไ && k != 1)
            throw new AssertionError(); 
          ˊ(ـᔭ2);
          ᐨẏ(paramـᔭ);
        } 
        if (!paramBoolean)
          continue; 
        break;
      } 
      if (j == 2) {
        ـᔭ<K, V> ـᔭ3 = ـᔭ1.ՙᗮ;
        ـᔭ<K, V> ـᔭ4;
        b = ((ـᔭ4 = ـᔭ1.ˍɫ) != null) ? ـᔭ4.ʿｪ : 0;
        if ((i = (i = (ـᔭ3 != null) ? ـᔭ3.ʿｪ : 0) - b) == 1 || (i == 0 && !paramBoolean)) {
          ˊ(paramـᔭ);
        } else {
          if (!ـไ && i != -1)
            throw new AssertionError(); 
          ᐨẏ(ـᔭ1);
          ˊ(paramـᔭ);
        } 
        if (!paramBoolean)
          continue; 
        break;
      } 
      if (j == 0) {
        paramـᔭ.ʿｪ = i + 1;
        if (paramBoolean)
          return; 
        continue;
      } 
      if (!ـไ && j != -1 && j != 1)
        throw new AssertionError(); 
      paramـᔭ.ʿｪ = Math.max(i, b) + 1;
      if (paramBoolean)
        continue; 
    } 
  }
  
  private void ᐨẏ(ـᔭ<K, V> paramـᔭ) {
    ـᔭ<K, V> ـᔭ1 = paramـᔭ.ՙᗮ;
    ـᔭ<K, V> ـᔭ2;
    ـᔭ<K, V> ـᔭ3 = (ـᔭ2 = paramـᔭ.ˍɫ).ՙᗮ;
    ـᔭ<K, V> ـᔭ4 = ـᔭ2.ˍɫ;
    paramـᔭ.ˍɫ = ـᔭ3;
    if (ـᔭ3 != null)
      ـᔭ3.ʹﮃ = paramـᔭ; 
    ᐨẏ(paramـᔭ, ـᔭ2);
    ـᔭ2.ՙᗮ = paramـᔭ;
    paramـᔭ.ʹﮃ = ـᔭ2;
    paramـᔭ.ʿｪ = Math.max((ـᔭ1 != null) ? ـᔭ1.ʿｪ : 0, (ـᔭ3 != null) ? ـᔭ3.ʿｪ : 0) + 1;
    ـᔭ2.ʿｪ = Math.max(paramـᔭ.ʿｪ, (ـᔭ4 != null) ? ـᔭ4.ʿｪ : 0) + 1;
  }
  
  private void ˊ(ـᔭ<K, V> paramـᔭ) {
    ـᔭ<K, V> ـᔭ1 = paramـᔭ.ՙᗮ;
    ـᔭ<K, V> ـᔭ2 = paramـᔭ.ˍɫ;
    ـᔭ<K, V> ـᔭ3 = ـᔭ1.ՙᗮ;
    ـᔭ<K, V> ـᔭ4 = ـᔭ1.ˍɫ;
    paramـᔭ.ՙᗮ = ـᔭ4;
    if (ـᔭ4 != null)
      ـᔭ4.ʹﮃ = paramـᔭ; 
    ᐨẏ(paramـᔭ, ـᔭ1);
    ـᔭ1.ˍɫ = paramـᔭ;
    paramـᔭ.ʹﮃ = ـᔭ1;
    paramـᔭ.ʿｪ = Math.max((ـᔭ2 != null) ? ـᔭ2.ʿｪ : 0, (ـᔭ4 != null) ? ـᔭ4.ʿｪ : 0) + 1;
    ـᔭ1.ʿｪ = Math.max(paramـᔭ.ʿｪ, (ـᔭ3 != null) ? ـᔭ3.ʿｪ : 0) + 1;
  }
  
  public final Set<Map.Entry<K, V>> entrySet() {
    yyds/sniarbtej/ιะ yyds/sniarbtej/ιะ;
    return (Set<Map.Entry<K, V>>)(((yyds/sniarbtej/ιะ = this.ᐨẏ) != null) ? yyds/sniarbtej/ιะ : (this.ᐨẏ = (yyds/sniarbtej/ιะ)new ᴵܚ(this)));
  }
  
  public final Set<K> keySet() {
    yyds/sniarbtej/ιะ yyds/sniarbtej/ιะ;
    return (Set<K>)(((yyds/sniarbtej/ιะ = this.ᐨẏ) != null) ? yyds/sniarbtej/ιะ : (this.ᐨẏ = (yyds/sniarbtej/ιะ)new ιะ(this)));
  }
  
  private void ʾא() {
    this.ᐨẏ = ᐨẏ((ـᔭ<?, ?>[])this.ᐨẏ);
    this.ˌゥ = this.ᐨẏ.length / 2 + this.ᐨẏ.length / 4;
  }
  
  private static <K, V> ـᔭ<K, V>[] ᐨẏ(ـᔭ<K, V>[] paramArrayOfـᔭ) {
    int i;
    ـᔭ[] arrayOfـᔭ = new ـᔭ[(i = paramArrayOfـᔭ.length) << 1];
    ـō<Object, Object> ـō = new ـō<>();
    ˎᒩ<Object, Object> ˎᒩ1 = new ˎᒩ<>();
    ˎᒩ<Object, Object> ˎᒩ2 = new ˎᒩ<>();
    for (byte b = 0; b < i; b++) {
      ـᔭ<K, V> ـᔭ1;
      if ((ـᔭ1 = paramArrayOfـᔭ[b]) != null) {
        ـō.ﾞл((ـᔭ)ـᔭ1);
        byte b1 = 0;
        byte b2;
        ـᔭ<Object, Object> ـᔭ2;
        for (b2 = 0; (ـᔭ2 = ـō.ˊ()) != null; b2++) {
          if ((ـᔭ2.ᒯ & i) == 0) {
            b1++;
            continue;
          } 
        } 
        ˎᒩ1.ˈے(b1);
        ˎᒩ2.ˈے(b2);
        ـō.ﾞл((ـᔭ)ـᔭ1);
        while ((ـᔭ2 = ـō.ˊ()) != null) {
          if ((ـᔭ2.ᒯ & i) == 0) {
            ˎᒩ1.ᴵʖ(ـᔭ2);
            continue;
          } 
          ˎᒩ2.ᴵʖ(ـᔭ2);
        } 
        arrayOfـᔭ[b] = (b1 > 0) ? ˎᒩ1.ᐨẏ() : null;
        arrayOfـᔭ[b + i] = (b2 > 0) ? ˎᒩ2.ᐨẏ() : null;
      } 
    } 
    return (ـᔭ<K, V>[])arrayOfـᔭ;
  }
  
  private Object ʹﮃ() {
    return new LinkedHashMap<>(this);
  }
  
  static {
    ᐨẏ = (yyds/sniarbtej/ιะ)new ͺᴘ();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ᐝᎫ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */