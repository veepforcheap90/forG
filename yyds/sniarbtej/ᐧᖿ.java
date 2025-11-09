package yyds.sniarbtej;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ylt.pmn.zubdqvgt;

public final class ᐧᖿ implements ˌ々 {
  private final ˍʶ ᐨẏ;
  
  private final ˌэ ᐨẏ;
  
  private final ˎე ᐨẏ;
  
  public ᐧᖿ(ˍʶ paramˍʶ, ˌэ paramˌэ, ˎე paramˎე) {
    this.ᐨẏ = (ˎე)paramˍʶ;
    this.ᐨẏ = (ˎე)paramˌэ;
    this.ᐨẏ = paramˎე;
  }
  
  private boolean ᐨẏ(Field paramField, boolean paramBoolean) {
    // Byte code:
    //   0: aload_1
    //   1: iload_2
    //   2: aload_0
    //   3: getfield ᐨẏ : Lyyds/sniarbtej/ˎე;
    //   6: astore_3
    //   7: istore_2
    //   8: astore_1
    //   9: aload_3
    //   10: aload_1
    //   11: invokevirtual getType : ()Ljava/lang/Class;
    //   14: iload_2
    //   15: invokevirtual ᐨẏ : (Ljava/lang/Class;Z)Z
    //   18: ifne -> 265
    //   21: aload_3
    //   22: aload_1
    //   23: iload_2
    //   24: istore_3
    //   25: astore_2
    //   26: dup
    //   27: astore_1
    //   28: getfield ˋᴒ : I
    //   31: aload_2
    //   32: invokevirtual getModifiers : ()I
    //   35: iand
    //   36: ifeq -> 43
    //   39: iconst_1
    //   40: goto -> 260
    //   43: aload_1
    //   44: getfield ˊ : D
    //   47: ldc2_w -1.0
    //   50: dcmpl
    //   51: ifeq -> 83
    //   54: aload_1
    //   55: aload_2
    //   56: ldc yyds/sniarbtej/ˌদ
    //   58: invokevirtual getAnnotation : (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    //   61: checkcast yyds/sniarbtej/ˌদ
    //   64: aload_2
    //   65: ldc yyds/sniarbtej/ʻⅬ
    //   67: invokevirtual getAnnotation : (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    //   70: checkcast yyds/sniarbtej/ʻⅬ
    //   73: invokevirtual ᐨẏ : (Lyyds/sniarbtej/ˌদ;Lyyds/sniarbtej/ʻⅬ;)Z
    //   76: ifne -> 83
    //   79: iconst_1
    //   80: goto -> 260
    //   83: aload_2
    //   84: invokevirtual isSynthetic : ()Z
    //   87: ifeq -> 94
    //   90: iconst_1
    //   91: goto -> 260
    //   94: aload_1
    //   95: getfield ٴᖟ : Z
    //   98: ifeq -> 147
    //   101: aload_2
    //   102: ldc yyds/sniarbtej/ʻṿ
    //   104: invokevirtual getAnnotation : (Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
    //   107: checkcast yyds/sniarbtej/ʻṿ
    //   110: dup
    //   111: astore #4
    //   113: ifnull -> 143
    //   116: iload_3
    //   117: ifeq -> 133
    //   120: aload #4
    //   122: invokeinterface ʿপ : ()Z
    //   127: ifne -> 147
    //   130: goto -> 143
    //   133: aload #4
    //   135: invokeinterface ʻล : ()Z
    //   140: ifne -> 147
    //   143: iconst_1
    //   144: goto -> 260
    //   147: aload_1
    //   148: getfield ʹл : Z
    //   151: ifne -> 169
    //   154: aload_1
    //   155: aload_2
    //   156: invokevirtual getType : ()Ljava/lang/Class;
    //   159: invokevirtual ˊ : (Ljava/lang/Class;)Z
    //   162: ifeq -> 169
    //   165: iconst_1
    //   166: goto -> 260
    //   169: aload_2
    //   170: invokevirtual getType : ()Ljava/lang/Class;
    //   173: invokestatic ᐨẏ : (Ljava/lang/Class;)Z
    //   176: ifeq -> 183
    //   179: iconst_1
    //   180: goto -> 260
    //   183: iload_3
    //   184: ifeq -> 194
    //   187: aload_1
    //   188: getfield ﹳܕ : Ljava/util/List;
    //   191: goto -> 198
    //   194: aload_1
    //   195: getfield ˎאּ : Ljava/util/List;
    //   198: dup
    //   199: astore #4
    //   201: invokeinterface isEmpty : ()Z
    //   206: ifne -> 259
    //   209: new yyds/sniarbtej/ʻɬ
    //   212: aload_2
    //   213: invokespecial <init> : (Ljava/lang/reflect/Field;)V
    //   216: aload #4
    //   218: invokeinterface iterator : ()Ljava/util/Iterator;
    //   223: astore_1
    //   224: aload_1
    //   225: invokeinterface hasNext : ()Z
    //   230: ifeq -> 259
    //   233: aload_1
    //   234: invokeinterface next : ()Ljava/lang/Object;
    //   239: checkcast yyds/sniarbtej/ᴶ
    //   242: dup
    //   243: astore_2
    //   244: invokeinterface ՙᗮ : ()Z
    //   249: ifeq -> 256
    //   252: iconst_1
    //   253: goto -> 260
    //   256: goto -> 224
    //   259: iconst_0
    //   260: ifne -> 265
    //   263: iconst_1
    //   264: ireturn
    //   265: iconst_0
    //   266: ireturn
  }
  
  private static boolean ᐨẏ(Field paramField, boolean paramBoolean, ˎე paramˎე) {
    return (!paramˎე.ᐨẏ(paramField.getType(), paramBoolean) && !paramˎე.ᐨẏ(paramField, paramBoolean));
  }
  
  private List<String> ᐨẏ(Field paramField) {
    Field field = paramField;
    ˎე ˎე1 = this.ᐨẏ;
    ˍᔨ ˍᔨ = field.<ˍᔨ>getAnnotation(ˍᔨ.class);
    LinkedList<String> linkedList = new LinkedList();
    if (ˍᔨ == null) {
      linkedList.add(ˎე1.ᐨẏ(field));
    } else {
      linkedList.add(ˍᔨ.ʾ());
      String[] arrayOfString;
      int i = (arrayOfString = ˍᔨ.ˊ()).length;
      for (byte b = 0; b < i; b++) {
        String str = arrayOfString[b];
        linkedList.add(str);
      } 
    } 
    return linkedList;
  }
  
  private static List<String> ᐨẏ(ˌэ paramˌэ, Field paramField) {
    ˍᔨ ˍᔨ = paramField.<ˍᔨ>getAnnotation(ˍᔨ.class);
    LinkedList<String> linkedList = new LinkedList();
    if (ˍᔨ == null) {
      linkedList.add(paramˌэ.ᐨẏ(paramField));
    } else {
      linkedList.add(ˍᔨ.ʾ());
      String[] arrayOfString;
      int i = (arrayOfString = ˍᔨ.ˊ()).length;
      for (byte b = 0; b < i; b++) {
        String str = arrayOfString[b];
        linkedList.add(str);
      } 
    } 
    return linkedList;
  }
  
  public final <T> ٴۉ<T> ᐨẏ(ˑĴ paramˑĴ, ʸ<T> paramʸ) {
    ʸ<T> ʸ1;
    Class<? super T> clazz = (ʸ1 = paramʸ).ᐨم;
    if (!Object.class.isAssignableFrom(clazz))
      return null; 
    ʿн<T> ʿн = this.ᐨẏ.ᐨẏ(paramʸ);
    return new ـᓶ<>(ʿн, ᐨẏ(paramˑĴ, paramʸ, clazz), (byte)0);
  }
  
  private ᖦ ᐨẏ(ˑĴ paramˑĴ, Field paramField, String paramString, ʸ<?> paramʸ, boolean paramBoolean1, boolean paramBoolean2) {
    ʸ<?> ʸ1;
    boolean bool = ˏﮞ.ᐨẏ((ʸ1 = paramʸ).ᐨم);
    return new ˏᵃ(this, paramString, paramBoolean1, paramBoolean2, paramˑĴ, paramField, paramʸ, bool);
  }
  
  private ٴۉ<?> ᐨẏ(ˑĴ paramˑĴ, Field paramField, ʸ<?> paramʸ) {
    ﹳﺫ ﹳﺫ;
    ٴۉ<?> ٴۉ;
    return ((ﹳﺫ = paramField.<Annotation>getAnnotation(ﹳﺫ.class)) != null && (ٴۉ = ʼᔦ.ᐨẏ((ˍʶ)this.ᐨẏ, paramˑĴ, paramʸ, ﹳﺫ)) != null) ? ٴۉ : paramˑĴ.ᐨẏ(paramʸ);
  }
  
  private Map<String, ᖦ> ᐨẏ(ˑĴ paramˑĴ, ʸ<?> paramʸ, Class<?> paramClass) {
    LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
    if (paramClass.isInterface())
      return (Map)linkedHashMap; 
    ʸ<?> ʸ1;
    Type type = (ʸ1 = paramʸ).ՙᗮ;
    while (!zubdqvgt.G(paramClass, Object.class)) {
      Field[] arrayOfField;
      int i = (arrayOfField = arrayOfField = paramClass.getDeclaredFields()).length;
      for (byte b = 0; b < i; b++) {
        Field field = arrayOfField[b];
        boolean bool1 = ᐨẏ(field, true);
        boolean bool2 = ᐨẏ(field, false);
        if (bool1 || bool2) {
          field.setAccessible(true);
          Type type1 = ˑỲ.ᐨẏ((ʸ1 = paramʸ).ՙᗮ, paramClass, field.getGenericType());
          List<String> list = ᐨẏ(field);
          ᖦ ᖦ = null;
          for (byte b1 = 0; b1 < list.size(); b1++) {
            String str1 = list.get(b1);
            if (b1 != 0)
              bool1 = false; 
            boolean bool4 = bool2;
            boolean bool3 = bool1;
            ʸ<?> ʸ2 = ʸ.ᐨẏ(type1);
            String str2 = str1;
            Field field1 = field;
            ˑĴ ˑĴ1 = paramˑĴ;
            ᐧᖿ ᐧᖿ1 = this;
            boolean bool5 = ˏﮞ.ᐨẏ((ʸ1 = ʸ2).ᐨم);
            ˏᵃ ˏᵃ = new ˏᵃ(ᐧᖿ1, str2, bool3, bool4, ˑĴ1, field1, ʸ2, bool5);
            ᖦ ᖦ1 = (ᖦ)linkedHashMap.put(str1, ˏᵃ);
            if (ᖦ == null)
              ᖦ = ᖦ1; 
          } 
          if (ᖦ != null) {
            "탛롫㤻틛쾝⥞쳖긒ｺ祉㖈䚨ų흽䤥㼥酽ㆢ芳羲䳿佩窸꼥墳뀱ᔬ㈈긵嶟㰂睎㘋릝셷傎".toCharArray()[25] = (char)("탛롫㤻틛쾝⥞쳖긒ｺ祉㖈䚨ų흽䤥㼥酽ㆢ芳羲䳿佩窸꼥墳뀱ᔬ㈈긵嶟㰂睎㘋릝셷傎".toCharArray()[25] ^ 0x5F93);
            throw new IllegalArgumentException(type + ˏȓ$ᴵЃ.E("탛롫㤻틛쾝⥞쳖긒ｺ祉㖈䚨ų흽䤥㼥酽ㆢ芳羲䳿佩窸꼥墳뀱ᔬ㈈긵嶟㰂睎㘋릝셷傎".toCharArray(), (short)12939, (short)1, (short)5) + ᖦ.name);
          } 
        } 
      } 
      paramClass = (ʸ1 = paramʸ = ʸ.ᐨẏ(ˑỲ.ᐨẏ((ʸ1 = paramʸ).ՙᗮ, paramClass, paramClass.getGenericSuperclass()))).ᐨم;
    } 
    return (Map)linkedHashMap;
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ᐧᖿ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */