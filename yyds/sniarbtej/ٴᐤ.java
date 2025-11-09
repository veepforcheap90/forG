package yyds.sniarbtej;

import java.util.ArrayList;
import java.util.List;

public class ٴᐤ {
  private static int ﻥ = 0;
  
  private static int ˊᕝ = 2147483647;
  
  public final int ᐨḶ;
  
  public final ᔪ ᐨẏ;
  
  public ٴᐤ ˊ;
  
  private ٴᐤ() {}
  
  static <T> List<T> ᐨẏ(List<T> paramList, T paramT) {
    (paramList = (paramList == null) ? new ArrayList<>(1) : paramList).add(paramT);
    return paramList;
  }
  
  static <T> List<T> ᐨẏ(int paramInt) {
    ArrayList<T> arrayList = new ArrayList(paramInt);
    for (byte b = 0; b < paramInt; b++)
      arrayList.add(null); 
    return arrayList;
  }
  
  static <T> List<T> ᐨẏ(T[] paramArrayOfT) {
    if (paramArrayOfT == null)
      return new ArrayList<>(); 
    ArrayList<T> arrayList = new ArrayList(paramArrayOfT.length);
    int i = (paramArrayOfT = paramArrayOfT).length;
    for (byte b = 0; b < i; b++) {
      T t = paramArrayOfT[b];
      arrayList.add(t);
    } 
    return arrayList;
  }
  
  static List<Byte> ᐨẏ(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte == null)
      return new ArrayList<>(); 
    ArrayList<Byte> arrayList = new ArrayList(paramArrayOfbyte.length);
    int i = (paramArrayOfbyte = paramArrayOfbyte).length;
    for (byte b = 0; b < i; b++) {
      byte b1 = paramArrayOfbyte[b];
      arrayList.add(Byte.valueOf(b1));
    } 
    return arrayList;
  }
  
  static List<Boolean> ᐨẏ(boolean[] paramArrayOfboolean) {
    if (paramArrayOfboolean == null)
      return new ArrayList<>(); 
    ArrayList<Boolean> arrayList = new ArrayList(paramArrayOfboolean.length);
    int i = (paramArrayOfboolean = paramArrayOfboolean).length;
    for (byte b = 0; b < i; b++) {
      boolean bool = paramArrayOfboolean[b];
      arrayList.add(Boolean.valueOf(bool));
    } 
    return arrayList;
  }
  
  static List<Short> ᐨẏ(short[] paramArrayOfshort) {
    if (paramArrayOfshort == null)
      return new ArrayList<>(); 
    ArrayList<Short> arrayList = new ArrayList(paramArrayOfshort.length);
    int i = (paramArrayOfshort = paramArrayOfshort).length;
    for (byte b = 0; b < i; b++) {
      short s = paramArrayOfshort[b];
      arrayList.add(Short.valueOf(s));
    } 
    return arrayList;
  }
  
  static List<Character> ᐨẏ(char[] paramArrayOfchar) {
    if (paramArrayOfchar == null)
      return new ArrayList<>(); 
    ArrayList<Character> arrayList = new ArrayList(paramArrayOfchar.length);
    int i = (paramArrayOfchar = paramArrayOfchar).length;
    for (byte b = 0; b < i; b++) {
      char c = paramArrayOfchar[b];
      arrayList.add(Character.valueOf(c));
    } 
    return arrayList;
  }
  
  static List<Integer> ᐨẏ(int[] paramArrayOfint) {
    if (paramArrayOfint == null)
      return new ArrayList<>(); 
    ArrayList<Integer> arrayList = new ArrayList(paramArrayOfint.length);
    int i = (paramArrayOfint = paramArrayOfint).length;
    for (byte b = 0; b < i; b++) {
      int j = paramArrayOfint[b];
      arrayList.add(Integer.valueOf(j));
    } 
    return arrayList;
  }
  
  static List<Float> ᐨẏ(float[] paramArrayOffloat) {
    if (paramArrayOffloat == null)
      return new ArrayList<>(); 
    ArrayList<Float> arrayList = new ArrayList(paramArrayOffloat.length);
    int i = (paramArrayOffloat = paramArrayOffloat).length;
    for (byte b = 0; b < i; b++) {
      float f = paramArrayOffloat[b];
      arrayList.add(Float.valueOf(f));
    } 
    return arrayList;
  }
  
  static List<Long> ᐨẏ(long[] paramArrayOflong) {
    if (paramArrayOflong == null)
      return new ArrayList<>(); 
    ArrayList<Long> arrayList = new ArrayList(paramArrayOflong.length);
    int i = (paramArrayOflong = paramArrayOflong).length;
    for (byte b = 0; b < i; b++) {
      long l = paramArrayOflong[b];
      arrayList.add(Long.valueOf(l));
    } 
    return arrayList;
  }
  
  static List<Double> ᐨẏ(double[] paramArrayOfdouble) {
    if (paramArrayOfdouble == null)
      return new ArrayList<>(); 
    ArrayList<Double> arrayList = new ArrayList(paramArrayOfdouble.length);
    int i = (paramArrayOfdouble = paramArrayOfdouble).length;
    for (byte b = 0; b < i; b++) {
      double d = paramArrayOfdouble[b];
      arrayList.add(Double.valueOf(d));
    } 
    return arrayList;
  }
  
  static <T> List<T> ᐨẏ(int paramInt, T[] paramArrayOfT) {
    ArrayList<T> arrayList = new ArrayList(paramInt);
    for (byte b = 0; b < paramInt; b++)
      arrayList.add(paramArrayOfT[b]); 
    return arrayList;
  }
  
  public ٴᐤ(int paramInt, ᔪ paramᔪ, ٴᐤ paramٴᐤ) {
    this.ᐨḶ = paramInt;
    this.ᐨẏ = paramᔪ;
    this.ˊ = paramٴᐤ;
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ٴᐤ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */