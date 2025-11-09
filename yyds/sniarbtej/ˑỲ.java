package yyds.sniarbtej;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import ylt.pmn.zubdqvgt;

public final class ˑỲ {
  static final Type[] ᐨẏ = new Type[0];
  
  private ˑỲ() {
    throw new UnsupportedOperationException();
  }
  
  private static ParameterizedType ᐨẏ(Type paramType1, Type paramType2, Type... paramVarArgs) {
    return new ﾞﮢ(paramType1, paramType2, paramVarArgs);
  }
  
  private static GenericArrayType ᐨẏ(Type paramType) {
    return new ˌپ(paramType);
  }
  
  private static WildcardType ᐨẏ(Type paramType) {
    return new ﾞﾇ(new Type[] { paramType }, ᐨẏ);
  }
  
  private static WildcardType ˊ(Type paramType) {
    return new ﾞﾇ(new Type[] { Object.class }, new Type[] { paramType });
  }
  
  public static Type ᐨẏ(Type paramType) {
    if (paramType instanceof Class)
      return (paramType = paramType).isArray() ? new ˌپ(ᐨẏ(paramType.getComponentType())) : paramType; 
    if (paramType instanceof ParameterizedType) {
      paramType = paramType;
      return new ﾞﮢ(paramType.getOwnerType(), paramType.getRawType(), paramType.getActualTypeArguments());
    } 
    if (paramType instanceof GenericArrayType) {
      paramType = paramType;
      return new ˌپ(paramType.getGenericComponentType());
    } 
    if (paramType instanceof WildcardType) {
      paramType = paramType;
      return new ﾞﾇ(paramType.getUpperBounds(), paramType.getLowerBounds());
    } 
    return paramType;
  }
  
  public static Class<?> ᐨẏ(Type paramType) {
    while (true) {
      if (paramType instanceof Class)
        return (Class)paramType; 
      if (paramType instanceof ParameterizedType) {
        ParameterizedType parameterizedType;
        ˌᑦ.ﾞл(paramType = (parameterizedType = (ParameterizedType)paramType).getRawType() instanceof Class);
        return (Class)paramType;
      } 
      if (paramType instanceof GenericArrayType) {
        Type type;
        return Array.newInstance(ᐨẏ(type = ((GenericArrayType)paramType).getGenericComponentType()), 0).getClass();
      } 
      if (paramType instanceof TypeVariable)
        return Object.class; 
      if (paramType instanceof WildcardType) {
        paramType = ((WildcardType)paramType).getUpperBounds()[0];
        continue;
      } 
      "䗟轳펜釧⽊".toCharArray()[3] = (char)("䗟轳펜釧⽊".toCharArray()[3] ^ 0x12B0);
      String str = (paramType == null) ? ᐨẏ$ᐝт.W("䗟轳펜釧⽊".toCharArray(), (short)15179, (byte)3, (short)2) : paramType.getClass().getName();
      "톰괻幖彐앒餋ⵛᗜ缬埛伆໤석ណ㮄ፓꩭ镣㔙瞮?굾揮ᝠ빵潠猣쯓짴鹭꾆臷e푔⵾뉯墰ﲖ⣅뵣\t綐王픟裳成웼༏諪欮贙㡞䟔迍櫭".toCharArray()[38] = (char)("톰괻幖彐앒餋ⵛᗜ缬埛伆໤석ណ㮄ፓꩭ镣㔙瞮?굾揮ᝠ빵潠猣쯓짴鹭꾆臷e푔⵾뉯墰ﲖ⣅뵣\t綐王픟裳成웼༏諪欮贙㡞䟔迍櫭".toCharArray()[38] ^ 0xC9F);
      "朘襈핷焝娤⥂Ṽ邒痶绵䡀ɓᣔᐉ".toCharArray()[10] = (char)("朘襈핷焝娤⥂Ṽ邒痶绵䡀ɓᣔᐉ".toCharArray()[10] ^ 0x7A69);
      throw new IllegalArgumentException(ᐨẏ$ᐝт.W("톰괻幖彐앒餋ⵛᗜ缬埛伆໤석ណ㮄ፓꩭ镣㔙瞮?굾揮ᝠ빵潠猣쯓짴鹭꾆臷e푔⵾뉯墰ﲖ⣅뵣\t綐王픟裳成웼༏諪欮贙㡞䟔迍櫭".toCharArray(), (short)15786, (byte)5, (short)3) + paramType + ᐨẏ$ᐝт.W("朘襈핷焝娤⥂Ṽ邒痶绵䡀ɓᣔᐉ".toCharArray(), (short)16340, (byte)3, (short)1) + str);
    } 
  }
  
  private static boolean ᐨẏ(Object paramObject1, Object paramObject2) {
    return (zubdqvgt.G(paramObject1, paramObject2) || (paramObject1 != null && paramObject1.equals(paramObject2)));
  }
  
  public static boolean ᐨẏ(Type paramType1, Type paramType2) {
    while (true) {
      if (zubdqvgt.G(paramType1, paramType2))
        return true; 
      if (paramType1 instanceof Class)
        return paramType1.equals(paramType2); 
      if (paramType1 instanceof ParameterizedType) {
        if (!(paramType2 instanceof ParameterizedType))
          return false; 
        paramType1 = paramType1;
        paramType2 = paramType2;
        Type type2 = paramType2.getOwnerType();
        Type type1;
        return (((zubdqvgt.G(type1 = paramType1.getOwnerType(), type2) || (type1 != null && type1.equals(type2)))) && paramType1.getRawType().equals(paramType2.getRawType()) && Arrays.equals((Object[])paramType1.getActualTypeArguments(), (Object[])paramType2.getActualTypeArguments()));
      } 
      if (paramType1 instanceof GenericArrayType) {
        if (!(paramType2 instanceof GenericArrayType))
          return false; 
        paramType1 = paramType1;
        paramType2 = paramType2;
        paramType2 = paramType2.getGenericComponentType();
        paramType1 = paramType1.getGenericComponentType();
        continue;
      } 
      if (paramType1 instanceof WildcardType) {
        if (!(paramType2 instanceof WildcardType))
          return false; 
        paramType1 = paramType1;
        paramType2 = paramType2;
        return (Arrays.equals((Object[])paramType1.getUpperBounds(), (Object[])paramType2.getUpperBounds()) && Arrays.equals((Object[])paramType1.getLowerBounds(), (Object[])paramType2.getLowerBounds()));
      } 
      if (paramType1 instanceof TypeVariable) {
        if (!(paramType2 instanceof TypeVariable))
          return false; 
        paramType1 = paramType1;
        paramType2 = paramType2;
        return (zubdqvgt.G(paramType1.getGenericDeclaration(), paramType2.getGenericDeclaration()) && paramType1.getName().equals(paramType2.getName()));
      } 
      return false;
    } 
  }
  
  private static int ˊ(Object paramObject) {
    return (paramObject != null) ? paramObject.hashCode() : 0;
  }
  
  public static String ᐨẏ(Type paramType) {
    return (paramType instanceof Class) ? ((Class)paramType).getName() : paramType.toString();
  }
  
  private static Type ᐨẏ(Type<?> paramType, Class<?> paramClass1, Class<?> paramClass2) {
    label28: while (true) {
      if (zubdqvgt.G(paramClass2, paramClass1))
        return paramType; 
      if (paramClass2.isInterface()) {
        Class[] arrayOfClass = paramClass1.getInterfaces();
        byte b = 0;
        int i = arrayOfClass.length;
        while (b < i) {
          if (zubdqvgt.G(arrayOfClass[b], paramClass2))
            return paramClass1.getGenericInterfaces()[b]; 
          if (paramClass2.isAssignableFrom(arrayOfClass[b])) {
            paramClass1 = arrayOfClass[b];
            Type type = paramClass1.getGenericInterfaces()[b];
            continue label28;
          } 
          b++;
        } 
      } 
      if (!paramClass1.isInterface())
        while (!zubdqvgt.G(paramClass1, Object.class)) {
          if (zubdqvgt.G(paramType = paramClass1.getSuperclass(), paramClass2))
            return paramClass1.getGenericSuperclass(); 
          if (paramClass2.isAssignableFrom((Class<?>)paramType)) {
            Type<?> type1 = paramType;
            paramType = paramClass1.getGenericSuperclass();
            continue label28;
          } 
          Type<?> type = paramType;
        }  
      break;
    } 
    return paramClass2;
  }
  
  private static Type ˊ(Type paramType, Class<?> paramClass1, Class<?> paramClass2) {
    ˌᑦ.ﾞл(paramClass2.isAssignableFrom(paramClass1));
    return ᐨẏ(paramType, paramClass1, ᐨẏ(paramType, paramClass1, paramClass2));
  }
  
  public static Type ˊ(Type paramType) {
    return (paramType instanceof GenericArrayType) ? ((GenericArrayType)paramType).getGenericComponentType() : ((Class)paramType).getComponentType();
  }
  
  public static Type ᐨẏ(Type paramType, Class<?> paramClass) {
    if (paramType = ˊ(paramType, paramClass, Collection.class) instanceof WildcardType)
      paramType = ((WildcardType)paramType).getUpperBounds()[0]; 
    return (paramType instanceof ParameterizedType) ? ((ParameterizedType)paramType).getActualTypeArguments()[0] : Object.class;
  }
  
  public static Type[] ᐨẏ(Type paramType, Class<?> paramClass) {
    return zubdqvgt.G(paramType, Properties.class) ? new Type[] { String.class, String.class } : ((paramType = ˊ(paramType, paramClass, Map.class) instanceof ParameterizedType) ? (paramType = paramType).getActualTypeArguments() : new Type[] { Object.class, Object.class });
  }
  
  public static Type ᐨẏ(Type paramType1, Class<?> paramClass, Type<?> paramType2) {
    Type[] arrayOfType;
    while (paramType2 instanceof TypeVariable) {
      TypeVariable<?> typeVariable = (TypeVariable)paramType2;
      if (zubdqvgt.G(paramType2 = ᐨẏ(paramType1, paramClass, typeVariable), typeVariable))
        return paramType2; 
    } 
    if (paramType2 instanceof Class && ((Class)paramType2).isArray()) {
      Class<?> clazz;
      paramType2 = (clazz = (Class)paramType2).getComponentType();
      Type type = ᐨẏ(paramType1, paramClass, paramType2);
      return (Type)(zubdqvgt.G(paramType2, type) ? clazz : ᐨẏ(type));
    } 
    if (paramType2 instanceof GenericArrayType) {
      GenericArrayType genericArrayType;
      paramType2 = (genericArrayType = (GenericArrayType)paramType2).getGenericComponentType();
      Type type = ᐨẏ(paramType1, paramClass, paramType2);
      return zubdqvgt.G(paramType2, type) ? genericArrayType : ᐨẏ(type);
    } 
    if (paramType2 instanceof ParameterizedType) {
      ParameterizedType parameterizedType;
      paramType2 = (parameterizedType = (ParameterizedType)paramType2).getOwnerType();
      Type type;
      boolean bool = !zubdqvgt.G(type = ᐨẏ(paramType1, paramClass, paramType2), paramType2) ? true : false;
      arrayOfType = parameterizedType.getActualTypeArguments();
      byte b = 0;
      int i = arrayOfType.length;
      while (b < i) {
        Type type1;
        if (!zubdqvgt.G(type1 = ᐨẏ(paramType1, paramClass, arrayOfType[b]), arrayOfType[b])) {
          if (!bool) {
            arrayOfType = (Type[])arrayOfType.clone();
            bool = true;
          } 
          arrayOfType[b] = type1;
        } 
        b++;
      } 
      return bool ? ᐨẏ(type, parameterizedType.getRawType(), arrayOfType) : parameterizedType;
    } 
    if (arrayOfType instanceof WildcardType) {
      WildcardType wildcardType;
      arrayOfType = (wildcardType = (WildcardType)arrayOfType).getLowerBounds();
      Type[] arrayOfType1 = wildcardType.getUpperBounds();
      if (arrayOfType.length == 1) {
        Type type;
        if (!zubdqvgt.G(type = ᐨẏ(paramType1, paramClass, arrayOfType[0]), arrayOfType[0]))
          return ˊ(type); 
      } else {
        Type type;
        if (arrayOfType1.length == 1 && !zubdqvgt.G(type = ᐨẏ(paramType1, paramClass, arrayOfType1[0]), arrayOfType1[0]))
          return ᐨẏ(type); 
      } 
      return wildcardType;
    } 
    return (Type)arrayOfType;
  }
  
  private static Type ᐨẏ(Type paramType, Class<?> paramClass, TypeVariable<?> paramTypeVariable) {
    Class<?> clazz;
    if ((clazz = ᐨẏ(paramTypeVariable)) == null)
      return paramTypeVariable; 
    if (paramType = ᐨẏ(paramType, paramClass, clazz) instanceof ParameterizedType) {
      int i = ᐨẏ((Object[])clazz.getTypeParameters(), paramTypeVariable);
      return ((ParameterizedType)paramType).getActualTypeArguments()[i];
    } 
    return paramTypeVariable;
  }
  
  private static int ᐨẏ(Object[] paramArrayOfObject, Object paramObject) {
    for (byte b = 0; b < paramArrayOfObject.length; b++) {
      if (paramObject.equals(paramArrayOfObject[b]))
        return b; 
    } 
    throw new NoSuchElementException();
  }
  
  private static Class<?> ᐨẏ(TypeVariable<?> paramTypeVariable) {
    return (paramTypeVariable = (TypeVariable<?>)paramTypeVariable.getGenericDeclaration() instanceof Class) ? (Class)paramTypeVariable : null;
  }
  
  private static void ᐨẏ(Type paramType) {
    ˌᑦ.ﾞл((!(paramType instanceof Class) || !((Class)paramType).isPrimitive()));
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˑỲ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */