package yyds.sniarbtej;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

public final class ʸ<T> {
  public final Class<? super T> ᐨم;
  
  public final Type ՙᗮ;
  
  private int ʹｨ;
  
  protected ʸ() {
    Class<?> clazz;
    Type type;
    if (type = (clazz = getClass()).getGenericSuperclass() instanceof Class) {
      "ᾗ輗蕸컫㮒ꚥ싄⌄敞牆斶ᔲ䩞⃘須ꆼぇ䴱塠븛?刪䗸栣".toCharArray()[9] = (char)("ᾗ輗蕸컫㮒ꚥ싄⌄敞牆斶ᔲ䩞⃘須ꆼぇ䴱塠븛?刪䗸栣".toCharArray()[9] ^ 0x6C98);
      throw new RuntimeException(ˏȓ$ᴵЃ.E("ᾗ輗蕸컫㮒ꚥ싄⌄敞牆斶ᔲ䩞⃘須ꆼぇ䴱塠븛?刪䗸栣".toCharArray(), (short)19676, (short)1, (short)4));
    } 
    this.ՙᗮ = ˑỲ.ᐨẏ((type = type).getActualTypeArguments()[0]);
    this.ᐨم = (Class)ˑỲ.ᐨẏ(this.ՙᗮ);
    this.ʹｨ = this.ՙᗮ.hashCode();
  }
  
  private ʸ(Type paramType) {
    this.ՙᗮ = ˑỲ.ᐨẏ(ˌᑦ.<Type>ˊ(paramType));
    this.ᐨم = (Class)ˑỲ.ᐨẏ(this.ՙᗮ);
    this.ʹｨ = this.ՙᗮ.hashCode();
  }
  
  private static Type ᐨẏ(Class<?> paramClass) {
    Type type;
    if (type = paramClass.getGenericSuperclass() instanceof Class) {
      "?쐺嗑⎏㠀춛횝蓞ྨꌽﴒ䜢呥쐣쪚鑁겂븉㧇枂ৼ趉ᴂ抻".toCharArray()[9] = (char)("?쐺嗑⎏㠀춛횝蓞ྨꌽﴒ䜢呥쐣쪚鑁겂븉㧇枂ৼ趉ᴂ抻".toCharArray()[9] ^ 0x105D);
      throw new RuntimeException(ˉﻤ$ͺſ.v("?쐺嗑⎏㠀춛횝蓞ྨꌽﴒ䜢呥쐣쪚鑁겂븉㧇枂ৼ趉ᴂ抻".toCharArray(), (short)14636, 5, (short)5));
    } 
    return ˑỲ.ᐨẏ((type = type).getActualTypeArguments()[0]);
  }
  
  public final Class<? super T> ﾞл() {
    return this.ᐨم;
  }
  
  public final Type ˊ() {
    return this.ՙᗮ;
  }
  
  @Deprecated
  private boolean ﾞл(Class<?> paramClass) {
    return ᴵʖ(paramClass);
  }
  
  @Deprecated
  private boolean ᴵʖ(Type paramType) {
    if (paramType == null)
      return false; 
    if (this.ՙᗮ.equals(paramType))
      return true; 
    if (this.ՙᗮ instanceof Class)
      return this.ᐨم.isAssignableFrom(ˑỲ.ᐨẏ(paramType)); 
    if (this.ՙᗮ instanceof ParameterizedType)
      return ᐨẏ(paramType, (ParameterizedType)this.ՙᗮ, new HashMap<>()); 
    if (this.ՙᗮ instanceof GenericArrayType)
      return (this.ᐨم.isAssignableFrom(ˑỲ.ᐨẏ(paramType)) && ᐨẏ(paramType, (GenericArrayType)this.ՙᗮ)); 
    throw ᐨẏ(this.ՙᗮ, new Class[] { Class.class, ParameterizedType.class, GenericArrayType.class });
  }
  
  @Deprecated
  private boolean ᐨẏ(ʸ<?> paramʸ) {
    return ᴵʖ((paramʸ = paramʸ).ՙᗮ);
  }
  
  private static boolean ᐨẏ(Type<?> paramType, GenericArrayType paramGenericArrayType) {
    Type type;
    if (type = paramGenericArrayType.getGenericComponentType() instanceof ParameterizedType) {
      Type<?> type1 = paramType;
      if (paramType instanceof GenericArrayType) {
        type1 = ((GenericArrayType)paramType).getGenericComponentType();
      } else if (paramType instanceof Class) {
        for (paramType = paramType; paramType.isArray(); paramType = paramType.getComponentType());
        type1 = paramType;
      } 
      return ᐨẏ(type1, (ParameterizedType)type, new HashMap<>());
    } 
    return true;
  }
  
  private static boolean ᐨẏ(Type paramType, ParameterizedType paramParameterizedType, Map<String, Type> paramMap) {
    label48: while (true) {
      if (paramType == null)
        return false; 
      if (paramParameterizedType.equals(paramType))
        return true; 
      Class<?> clazz = ˑỲ.ᐨẏ(paramType);
      ParameterizedType parameterizedType = null;
      if (paramType instanceof ParameterizedType)
        parameterizedType = (ParameterizedType)paramType; 
      if (parameterizedType != null) {
        Type[] arrayOfType2 = parameterizedType.getActualTypeArguments();
        TypeVariable[] arrayOfTypeVariable = (TypeVariable[])clazz.getTypeParameters();
        byte b1;
        for (b1 = 0; b1 < arrayOfType2.length; b1++) {
          Type type1 = arrayOfType2[b1];
          TypeVariable typeVariable = arrayOfTypeVariable[b1];
          while (type1 instanceof TypeVariable) {
            type1 = type1;
            type1 = paramMap.get(type1.getName());
          } 
          paramMap.put(typeVariable.getName(), type1);
        } 
        Map<String, Type> map = paramMap;
        parameterizedType = paramParameterizedType;
        Type[] arrayOfType1 = parameterizedType1.getActualTypeArguments();
        Type[] arrayOfType3 = parameterizedType.getActualTypeArguments();
        b1 = 0;
        while (b1 < arrayOfType1.length) {
          Map<String, Type> map1 = map;
          Type type2 = arrayOfType3[b1];
          Type type1 = arrayOfType1[b1];
          if ((type2.equals(type1) || (type1 instanceof TypeVariable && type2.equals(map1.get(((TypeVariable)type1).getName()))))) {
            b1++;
            continue;
          } 
          continue label48;
        } 
        ParameterizedType parameterizedType1;
        if ((parameterizedType1 = parameterizedType).getRawType().equals(parameterizedType.getRawType()))
          return true; 
      } 
      Type[] arrayOfType;
      int i = (arrayOfType = clazz.getGenericInterfaces()).length;
      for (byte b = 0; b < i; b++) {
        Type type1;
        if (ᐨẏ(type1 = arrayOfType[b], paramParameterizedType, new HashMap<>(paramMap)))
          return true; 
      } 
      paramMap = new HashMap<>(paramMap);
      paramParameterizedType = paramParameterizedType;
      Type type = clazz.getGenericSuperclass();
      Type type = type;
    } 
  }
  
  private static boolean ᐨẏ(ParameterizedType paramParameterizedType1, ParameterizedType paramParameterizedType2, Map<String, Type> paramMap) {
    if (paramParameterizedType1.getRawType().equals(paramParameterizedType2.getRawType())) {
      Type[] arrayOfType1 = paramParameterizedType1.getActualTypeArguments();
      Type[] arrayOfType2 = paramParameterizedType2.getActualTypeArguments();
      for (byte b = 0; b < arrayOfType1.length; b++) {
        if (!ᐨẏ(arrayOfType1[b], arrayOfType2[b], paramMap))
          return false; 
      } 
      return true;
    } 
    return false;
  }
  
  private static AssertionError ᐨẏ(Type paramType, Class<?>... paramVarArgs) {
    "ވ俒一▃婎볨浛᝷㙖ﬦ䮭韊䵾迤騧䒭cꟗ莭뉮ﻵ萺嬜벇榒ᴻẐ﵎檒愳붬풕阮B".toCharArray()[10] = (char)("ވ俒一▃婎볨浛᝷㙖ﬦ䮭韊䵾迤騧䒭cꟗ莭뉮ﻵ萺嬜벇榒ᴻẐ﵎檒愳붬풕阮B".toCharArray()[10] ^ 0xE93);
    StringBuilder stringBuilder = new StringBuilder(ˏȓ$ᴵЃ.E("ވ俒一▃婎볨浛᝷㙖ﬦ䮭韊䵾迤騧䒭cꟗ莭뉮ﻵ萺嬜벇榒ᴻẐ﵎檒愳붬풕阮B".toCharArray(), (short)19447, (short)0, (short)1));
    paramVarArgs = paramVarArgs;
    for (byte b = 0; b < 3; b++) {
      Class<?> clazz = paramVarArgs[b];
      "ࡃ빪ᶯ".toCharArray()[0] = (char)("ࡃ빪ᶯ".toCharArray()[0] ^ 0x686B);
      stringBuilder.append(clazz.getName()).append(ˏȓ$ᴵЃ.E("ࡃ빪ᶯ".toCharArray(), (short)16229, (short)0, (short)3));
    } 
    "騘衊ꨟ鍻᱾৷쩮䁨ḽ塪".toCharArray()[8] = (char)("騘衊ꨟ鍻᱾৷쩮䁨ḽ塪".toCharArray()[8] ^ 0x6029);
    "⩰Ƅ㲔Ꙝ䲤瓤윽娆ᒡ²囌삦ۀퟪ／᷁".toCharArray()[12] = (char)("⩰Ƅ㲔Ꙝ䲤瓤윽娆ᒡ²囌삦ۀퟪ／᷁".toCharArray()[12] ^ 0x12A8);
    stringBuilder.append(ˏȓ$ᴵЃ.E("騘衊ꨟ鍻᱾৷쩮䁨ḽ塪".toCharArray(), (short)5669, (short)3, (short)5)).append(paramType.getClass().getName()).append(ˏȓ$ᴵЃ.E("⩰Ƅ㲔Ꙝ䲤瓤윽娆ᒡ²囌삦ۀퟪ／᷁".toCharArray(), (short)27240, (short)1, (short)1)).append(paramType.toString()).append('.');
    return new AssertionError(stringBuilder.toString());
  }
  
  private static boolean ᐨẏ(Type paramType1, Type paramType2, Map<String, Type> paramMap) {
    return (paramType2.equals(paramType1) || (paramType1 instanceof TypeVariable && paramType2.equals(paramMap.get(((TypeVariable)paramType1).getName()))));
  }
  
  public final int hashCode() {
    return this.ʹｨ;
  }
  
  public final boolean equals(Object paramObject) {
    return (paramObject instanceof ʸ && ˑỲ.ᐨẏ(this.ՙᗮ, ((ʸ)paramObject).ՙᗮ));
  }
  
  public final String toString() {
    return ˑỲ.ᐨẏ(this.ՙᗮ);
  }
  
  public static ʸ<?> ᐨẏ(Type paramType) {
    return new ʸ(paramType);
  }
  
  public static <T> ʸ<T> ᐨẏ(Class<T> paramClass) {
    return new ʸ<>(paramClass);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ʸ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */