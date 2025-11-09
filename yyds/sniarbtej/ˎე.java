package yyds.sniarbtej;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class ˎე implements Cloneable, ˌ々 {
  private static final double ᐨẏ = -1.0D;
  
  public static final ˎე ˊ = new ˎე();
  
  public double ˊ = -1.0D;
  
  public int ˋᴒ = 136;
  
  public boolean ʹл = true;
  
  public boolean ٴᖟ;
  
  public List<ᴶ> ﹳܕ = Collections.emptyList();
  
  public List<ᴶ> ˎאּ = Collections.emptyList();
  
  private ˎე ᐨẏ() {
    try {
      return (ˎე)super.clone();
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      throw new AssertionError(cloneNotSupportedException);
    } 
  }
  
  public final ˎე ᐨẏ(double paramDouble) {
    ˎე ˎე1;
    (ˎე1 = ᐨẏ()).ˊ = paramDouble;
    return ˎე1;
  }
  
  public final ˎე ᐨẏ(int... paramVarArgs) {
    ˎე ˎე1;
    (ˎე1 = ᐨẏ()).ˋᴒ = 0;
    int i = (paramVarArgs = paramVarArgs).length;
    for (byte b = 0; b < i; b++) {
      int j = paramVarArgs[b];
      ˎე1.ˋᴒ |= j;
    } 
    return ˎე1;
  }
  
  public final ˎე ˊ() {
    ˎე ˎე1;
    (ˎე1 = ᐨẏ()).ʹл = false;
    return ˎე1;
  }
  
  public final ˎე ᴵʖ() {
    ˎე ˎე1;
    (ˎე1 = ᐨẏ()).ٴᖟ = true;
    return ˎე1;
  }
  
  public final ˎე ᐨẏ(ᴶ paramᴶ, boolean paramBoolean1, boolean paramBoolean2) {
    ˎე ˎე1 = ᐨẏ();
    if (paramBoolean1) {
      ˎე1.ﹳܕ = new ArrayList<>(this.ﹳܕ);
      ˎე1.ﹳܕ.add(paramᴶ);
    } 
    if (paramBoolean2) {
      ˎე1.ˎאּ = new ArrayList<>(this.ˎאּ);
      ˎე1.ˎאּ.add(paramᴶ);
    } 
    return ˎე1;
  }
  
  public final <T> ٴۉ<T> ᐨẏ(ˑĴ paramˑĴ, ʸ<T> paramʸ) {
    ʸ<T> ʸ1;
    Class<? super T> clazz = (ʸ1 = paramʸ).ᐨم;
    boolean bool2 = ᐨẏ(clazz, true);
    boolean bool1 = ᐨẏ(clazz, false);
    return (!bool2 && !bool1) ? null : new ᐝᴾ(this, bool1, bool2, paramˑĴ, paramʸ);
  }
  
  public final boolean ᐨẏ(Field paramField, boolean paramBoolean) {
    if ((this.ˋᴒ & paramField.getModifiers()) != 0)
      return true; 
    if (this.ˊ != -1.0D && !ᐨẏ(paramField.<ˌদ>getAnnotation(ˌদ.class), paramField.<ʻⅬ>getAnnotation(ʻⅬ.class)))
      return true; 
    if (paramField.isSynthetic())
      return true; 
    ʻṿ ʻṿ;
    if (this.ٴᖟ && ((ʻṿ = paramField.<Annotation>getAnnotation(ʻṿ.class)) == null || (paramBoolean ? !ʻṿ.ʿপ() : !ʻṿ.ʻล())))
      return true; 
    if (!this.ʹл && ˊ(paramField.getType()))
      return true; 
    if (ᐨẏ(paramField.getType()))
      return true; 
    List<ᴶ> list;
    if (!(list = paramBoolean ? this.ﹳܕ : this.ˎאּ).isEmpty()) {
      Iterator<ᴶ> iterator = list.iterator();
      while (iterator.hasNext()) {
        ᴶ ᴶ;
        if ((ᴶ = iterator.next()).ՙᗮ())
          return true; 
      } 
    } 
    return false;
  }
  
  public final boolean ᐨẏ(Class<?> paramClass, boolean paramBoolean) {
    if (this.ˊ != -1.0D && !ᐨẏ(paramClass.<ˌদ>getAnnotation(ˌদ.class), paramClass.<ʻⅬ>getAnnotation(ʻⅬ.class)))
      return true; 
    if (!this.ʹл && ˊ(paramClass))
      return true; 
    if (ᐨẏ(paramClass))
      return true; 
    List<ᴶ> list;
    Iterator<ᴶ> iterator = (list = paramBoolean ? this.ﹳܕ : this.ˎאּ).iterator();
    while (iterator.hasNext()) {
      ᴶ ᴶ;
      if ((ᴶ = iterator.next()).ˍɫ())
        return true; 
    } 
    return false;
  }
  
  public static boolean ᐨẏ(Class<?> paramClass) {
    return (!Enum.class.isAssignableFrom(paramClass) && (paramClass.isAnonymousClass() || paramClass.isLocalClass()));
  }
  
  public boolean ˊ(Class<?> paramClass) {
    return (paramClass.isMemberClass() && !ᴵʖ(paramClass));
  }
  
  private static boolean ᴵʖ(Class<?> paramClass) {
    return ((paramClass.getModifiers() & 0x8) != 0);
  }
  
  public boolean ᐨẏ(ˌদ paramˌদ, ʻⅬ paramʻⅬ) {
    return (ᐨẏ(paramˌদ) && ᐨẏ(paramʻⅬ));
  }
  
  private boolean ᐨẏ(ˌদ paramˌদ) {
    double d;
    return !(paramˌদ != null && (d = paramˌদ.ˊ()) > this.ˊ);
  }
  
  private boolean ᐨẏ(ʻⅬ paramʻⅬ) {
    double d;
    return !(paramʻⅬ != null && (d = paramʻⅬ.ˊ()) <= this.ˊ);
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˎე.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */