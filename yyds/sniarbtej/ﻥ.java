package yyds.sniarbtej;

import java.util.List;
import ylt.pmn.zubdqvgt;

public class ﻥ extends ᐧǏ {
  private final ˑܘ ˍ;
  
  private final ˑܘ ʹō;
  
  private final List<ˑܘ> ˌᵋ;
  
  private final boolean ˊ;
  
  public ClassLoader ᐨẏ = getClass().getClassLoader();
  
  public ﻥ() {
    this(null, null, false);
  }
  
  private ﻥ(ˑܘ paramˑܘ1, ˑܘ paramˑܘ2, boolean paramBoolean) {
    this(paramˑܘ1, paramˑܘ2, null, false);
  }
  
  public ﻥ(ˑܘ paramˑܘ1, ˑܘ paramˑܘ2, List<ˑܘ> paramList, boolean paramBoolean) {
    this(589824, paramˑܘ1, paramˑܘ2, paramList, paramBoolean);
    if (!zubdqvgt.G(getClass(), ﻥ.class))
      throw new IllegalStateException(); 
  }
  
  private ﻥ(int paramInt, ˑܘ paramˑܘ1, ˑܘ paramˑܘ2, List<ˑܘ> paramList, boolean paramBoolean) {
    super(589824);
    this.ˍ = paramˑܘ1;
    this.ʹō = paramˑܘ2;
    this.ˌᵋ = paramList;
    this.ˊ = paramBoolean;
  }
  
  public final void ᐨẏ(ClassLoader paramClassLoader) {
    this.ᐨẏ = paramClassLoader;
  }
  
  public final ﹳه ᐨẏ(ˑܘ paramˑܘ) {
    if (paramˑܘ == null)
      return ﹳه.ᐨẏ; 
    boolean bool;
    if (bool = (paramˑܘ.ˉｓ() == 9) ? true : false)
      switch (paramˑܘ.ᐨẏ().ˉｓ()) {
        case 1:
        case 2:
        case 3:
        case 4:
          return new ﹳه(paramˑܘ);
      }  
    ﹳه ﹳه = super.ᐨẏ(paramˑܘ);
    if (ﹳه.ʹﮃ.equals(ﹳه)) {
      ﹳه ﹳه1;
      if (bool) {
        ﹳه = ᐨẏ(paramˑܘ.ᐨẏ());
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b = 0; b < paramˑܘ.ʿপ(); b++)
          stringBuilder.append('['); 
        stringBuilder.append((ﹳه1 = ﹳه).ˌ.ᴵʖ());
        ﹳه = new ﹳه(ˑܘ.ᐨẏ(stringBuilder.toString()));
      } else {
        ﹳه = new ﹳه((ˑܘ)ﹳه1);
      } 
    } 
    return ﹳه;
  }
  
  protected final boolean ᐨẏ(ﹳه paramﹳه) {
    ˑܘ ˑܘ1;
    return ((ˑܘ1 = (paramﹳه = paramﹳه).ˌ) != null && (ˑܘ1.ˉｓ() == 9 || ˑܘ1.equals(ᴵƚ)));
  }
  
  protected final ﹳه ᐨẏ(ﹳه paramﹳه) {
    ˑܘ ˑܘ1;
    ﹳه ﹳه1;
    if ((ˑܘ1 = (ﹳه1 = paramﹳه).ˌ) != null) {
      if (ˑܘ1.ˉｓ() == 9)
        return ᐨẏ(ˑܘ.ᐨẏ(ˑܘ1.ᴵʖ().substring(1))); 
      if (ˑܘ1.equals(ᴵƚ))
        return paramﹳه; 
    } 
    throw new AssertionError();
  }
  
  protected final boolean ᐨẏ(ﹳه paramﹳه1, ﹳه paramﹳه2) {
    ﹳه ﹳه1;
    ˑܘ ˑܘ2 = (ﹳه1 = paramﹳه2).ˌ;
    ˑܘ ˑܘ1 = (ﹳه1 = paramﹳه1).ˌ;
    switch (ˑܘ2.ˉｓ()) {
      case 5:
      case 6:
      case 7:
      case 8:
        return ˑܘ1.equals(ˑܘ2);
      case 9:
      case 10:
        return ˑܘ1.equals(ᴵƚ) ? true : ((ˑܘ1.ˉｓ() == 10 || ˑܘ1.ˉｓ() == 9) ? (ᐨẏ(ˑܘ2, ˑܘ1) ? true : (ᐨẏ(ˑܘ2).isInterface() ? Object.class.isAssignableFrom(ᐨẏ(ˑܘ1)) : false)) : false);
    } 
    throw new AssertionError();
  }
  
  public final ﹳه ᐨẏ(ﹳه paramﹳه1, ﹳه paramﹳه2) {
    int i;
    if (!paramﹳه1.equals(paramﹳه2)) {
      ﹳه ﹳه1;
      ˑܘ ˑܘ1 = (ﹳه1 = paramﹳه1).ˌ;
      ˑܘ ˑܘ2 = (ﹳه1 = paramﹳه2).ˌ;
      if (ˑܘ1 != null && (ˑܘ1.ˉｓ() == 10 || ˑܘ1.ˉｓ() == 9) && ˑܘ2 != null && (ˑܘ2.ˉｓ() == 10 || ˑܘ2.ˉｓ() == 9)) {
        if (ˑܘ1.equals(ᴵƚ))
          return paramﹳه2; 
        if (ˑܘ2.equals(ᴵƚ))
          return paramﹳه1; 
        if (ᐨẏ(ˑܘ1, ˑܘ2))
          return paramﹳه1; 
        if (ᐨẏ(ˑܘ2, ˑܘ1))
          return paramﹳه2; 
        i = 0;
        if (ˑܘ1.ˉｓ() == 9 && ˑܘ2.ˉｓ() == 9 && ˑܘ1.ʿপ() == ˑܘ2.ʿপ() && ˑܘ1.ᐨẏ().ˉｓ() == 10 && ˑܘ2.ᐨẏ().ˉｓ() == 10) {
          i = ˑܘ1.ʿপ();
          ˑܘ1 = ˑܘ1.ᐨẏ();
          ˑܘ2 = ˑܘ2.ᐨẏ();
        } 
        while (true) {
          ˑܘ ˑܘ3 = ˑܘ1;
          ﻥ ﻥ1;
          if (ˑܘ1 == null || (((ﻥ1 = this).ˍ != null && ﻥ1.ˍ.equals(ˑܘ3)) ? ﻥ1.ˊ : ﻥ1.ᐨẏ(ˑܘ3).isInterface())) {
            "㮧̇㮊벘ⷡఓ蝭삖꟝뼑쌨抜衐匿切헳ㅨ".toCharArray()[4] = (char)("㮧̇㮊벘ⷡఓ蝭삖꟝뼑쌨抜衐匿切헳ㅨ".toCharArray()[4] ^ 0x77C0);
            return ᐨẏ(ˑܘ.ˊ(ˍɫ$יς.J("㮧̇㮊벘ⷡఓ蝭삖꟝뼑쌨抜衐匿切헳ㅨ".toCharArray(), (short)14957, (short)4, (byte)0)), i);
          } 
          ˑܘ1 = ᴵʖ(ˑܘ1);
          if (ᐨẏ(ˑܘ1, ˑܘ2))
            return ᐨẏ(ˑܘ1, i); 
        } 
      } 
      return ﹳه.ᐨẏ;
    } 
    return i;
  }
  
  private ﹳه ᐨẏ(ˑܘ paramˑܘ, int paramInt) {
    if (paramInt == 0)
      return ᐨẏ(paramˑܘ); 
    StringBuilder stringBuilder = new StringBuilder();
    for (byte b = 0; b < paramInt; b++)
      stringBuilder.append('['); 
    stringBuilder.append(paramˑܘ.ᴵʖ());
    return ᐨẏ(ˑܘ.ᐨẏ(stringBuilder.toString()));
  }
  
  private boolean ᐨẏ(ˑܘ paramˑܘ) {
    return (this.ˍ != null && this.ˍ.equals(paramˑܘ)) ? this.ˊ : ᐨẏ(paramˑܘ).isInterface();
  }
  
  private ˑܘ ᴵʖ(ˑܘ paramˑܘ) {
    Class<?> clazz;
    return (this.ˍ != null && this.ˍ.equals(paramˑܘ)) ? this.ʹō : (((clazz = ᐨẏ(paramˑܘ).getSuperclass()) == null) ? null : ˑܘ.ᐨẏ(clazz));
  }
  
  private boolean ᐨẏ(ˑܘ paramˑܘ1, ˑܘ paramˑܘ2) {
    while (true) {
      if (paramˑܘ1.equals(paramˑܘ2))
        return true; 
      if (this.ˍ != null && this.ˍ.equals(paramˑܘ1)) {
        if (ᴵʖ(paramˑܘ2) == null)
          return false; 
        if (this.ˊ)
          return (paramˑܘ2.ˉｓ() == 10 || paramˑܘ2.ˉｓ() == 9); 
        paramˑܘ2 = ᴵʖ(paramˑܘ2);
        paramˑܘ1 = paramˑܘ1;
        this = this;
        continue;
      } 
      break;
    } 
    if (this.ˍ != null && this.ˍ.equals(paramˑܘ2)) {
      if (ᐨẏ(paramˑܘ1, this.ʹō))
        return true; 
      if (this.ˌᵋ != null)
        for (ˑܘ ˑܘ1 : this.ˌᵋ) {
          if (ᐨẏ(paramˑܘ1, ˑܘ1))
            return true; 
        }  
      return false;
    } 
    return ᐨẏ(paramˑܘ1).isAssignableFrom(ᐨẏ(paramˑܘ2));
  }
  
  private Class<?> ᐨẏ(ˑܘ paramˑܘ) {
    try {
      return (paramˑܘ.ˉｓ() == 9) ? Class.forName(paramˑܘ.ᴵʖ().replace('/', '.'), false, this.ᐨẏ) : Class.forName(paramˑܘ.ᐨẏ(), false, this.ᐨẏ);
    } catch (ClassNotFoundException classNotFoundException) {
      throw new TypeNotPresentException(classNotFoundException.toString(), classNotFoundException);
    } 
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ﻥ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */