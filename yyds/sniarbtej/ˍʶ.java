package yyds.sniarbtej;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

public final class ˍʶ {
  private final Map<Type, ᐝэ<?>> ʾ;
  
  public ˍʶ(Map<Type, ᐝэ<?>> paramMap) {
    this.ʾ = paramMap;
  }
  
  public final <T> ʿн<T> ᐨẏ(ʸ<T> paramʸ) {
    ʸ<T> ʸ2;
    Type type1 = (ʸ2 = paramʸ).ՙᗮ;
    Class<? super T> clazz1 = (ʸ2 = paramʸ).ᐨم;
    ᐝэ ᐝэ;
    if ((ᐝэ = this.ʾ.get(type1)) != null)
      return new ᓑ(this, ᐝэ, type1); 
    if ((ᐝэ = this.ʾ.get(clazz1)) != null)
      return new ᴾ(this, ᐝэ, type1); 
    ʿн<T> ʿн;
    if ((ʿн = ᐨẏ(clazz1)) != null)
      return ʿн; 
    Class<? super T> clazz2 = clazz1;
    Type type3 = type1;
    ˍʶ ˍʶ1 = this;
    ʸ<?> ʸ1;
    if ((ˍʶ1 = (ˍʶ)(Collection.class.isAssignableFrom(clazz2) ? (SortedSet.class.isAssignableFrom(clazz2) ? new ᐝᵛ(ˍʶ1) : (EnumSet.class.isAssignableFrom(clazz2) ? new ՙぃ(ˍʶ1, type3) : (Set.class.isAssignableFrom(clazz2) ? new ᴵ氵(ˍʶ1) : (Queue.class.isAssignableFrom(clazz2) ? new ᵊ(ˍʶ1) : new ʿʹ(ˍʶ1))))) : (Map.class.isAssignableFrom(clazz2) ? (ConcurrentNavigableMap.class.isAssignableFrom(clazz2) ? new ᵪ(ˍʶ1) : (ConcurrentMap.class.isAssignableFrom(clazz2) ? new ٴῪ(ˍʶ1) : (SortedMap.class.isAssignableFrom(clazz2) ? new শ(ˍʶ1) : ((type3 instanceof ParameterizedType && !String.class.isAssignableFrom((ʸ1 = ʸ.ᐨẏ(((ParameterizedType)type3).getActualTypeArguments()[0])).ᐨم)) ? new ˋᴷ(ˍʶ1) : new ﹼ(ˍʶ1))))) : null))) != null)
      return (ʿн<T>)ˍʶ1; 
    clazz2 = clazz1;
    Type type2 = type1;
    ˍʶ1 = this;
    return new ˑײַ(ˍʶ1, clazz2, type2);
  }
  
  private <T> ʿн<T> ᐨẏ(Class<? super T> paramClass) {
    try {
      Constructor<? super T> constructor;
      if (!(constructor = paramClass.getDeclaredConstructor(new Class[0])).isAccessible())
        constructor.setAccessible(true); 
      return new ʼᓓ(this, constructor);
    } catch (NoSuchMethodException noSuchMethodException) {
      return null;
    } 
  }
  
  private <T> ʿн<T> ᐨẏ(Type paramType, Class<? super T> paramClass) {
    return (ʿн<T>)(Collection.class.isAssignableFrom(paramClass) ? (SortedSet.class.isAssignableFrom(paramClass) ? new ᐝᵛ(this) : (EnumSet.class.isAssignableFrom(paramClass) ? new ՙぃ(this, paramType) : (Set.class.isAssignableFrom(paramClass) ? new ᴵ氵(this) : (Queue.class.isAssignableFrom(paramClass) ? new ᵊ(this) : new ʿʹ(this))))) : (Map.class.isAssignableFrom(paramClass) ? (ConcurrentNavigableMap.class.isAssignableFrom(paramClass) ? new ᵪ(this) : (ConcurrentMap.class.isAssignableFrom(paramClass) ? new ٴῪ(this) : (SortedMap.class.isAssignableFrom(paramClass) ? new শ(this) : ((paramType instanceof ParameterizedType && !String.class.isAssignableFrom((ʸ = ʸ.ᐨẏ(((ParameterizedType)paramType).getActualTypeArguments()[0])).ᐨم)) ? new ˋᴷ(this) : new ﹼ(this))))) : null));
  }
  
  private <T> ʿн<T> ˊ(Type paramType, Class<? super T> paramClass) {
    return new ˑײַ(this, paramClass, paramType);
  }
  
  public final String toString() {
    return this.ʾ.toString();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˍʶ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */