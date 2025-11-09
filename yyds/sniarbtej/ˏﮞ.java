package yyds.sniarbtej;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class ˏﮞ {
  private static final Map<Class<?>, Class<?>> ͺо;
  
  private static final Map<Class<?>, Class<?>> ٴӵ;
  
  private ˏﮞ() {
    throw new UnsupportedOperationException();
  }
  
  private static void ᐨẏ(Map<Class<?>, Class<?>> paramMap1, Map<Class<?>, Class<?>> paramMap2, Class<?> paramClass1, Class<?> paramClass2) {
    paramMap1.put(paramClass1, paramClass2);
    paramMap2.put(paramClass2, paramClass1);
  }
  
  public static boolean ᐨẏ(Type paramType) {
    return ͺо.containsKey(paramType);
  }
  
  private static boolean ˊ(Type paramType) {
    return ٴӵ.containsKey(ˌᑦ.ˊ(paramType));
  }
  
  public static <T> Class<T> ᐨẏ(Class<T> paramClass) {
    Class<T> clazz;
    return ((clazz = (Class)ͺо.get(ˌᑦ.ˊ(paramClass))) == null) ? paramClass : clazz;
  }
  
  private static <T> Class<T> ˊ(Class<T> paramClass) {
    Class<T> clazz;
    return ((clazz = (Class)ٴӵ.get(ˌᑦ.ˊ(paramClass))) == null) ? paramClass : clazz;
  }
  
  static {
    HashMap<Object, Object> hashMap1 = new HashMap<>(16);
    HashMap<Object, Object> hashMap2 = new HashMap<>(16);
    ᐨẏ((Map)hashMap1, (Map)hashMap2, boolean.class, Boolean.class);
    ᐨẏ((Map)hashMap1, (Map)hashMap2, byte.class, Byte.class);
    ᐨẏ((Map)hashMap1, (Map)hashMap2, char.class, Character.class);
    ᐨẏ((Map)hashMap1, (Map)hashMap2, double.class, Double.class);
    ᐨẏ((Map)hashMap1, (Map)hashMap2, float.class, Float.class);
    ᐨẏ((Map)hashMap1, (Map)hashMap2, int.class, Integer.class);
    ᐨẏ((Map)hashMap1, (Map)hashMap2, long.class, Long.class);
    ᐨẏ((Map)hashMap1, (Map)hashMap2, short.class, Short.class);
    ᐨẏ((Map)hashMap1, (Map)hashMap2, void.class, Void.class);
    ͺо = Collections.unmodifiableMap(hashMap1);
    ٴӵ = Collections.unmodifiableMap(hashMap2);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˏﮞ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */