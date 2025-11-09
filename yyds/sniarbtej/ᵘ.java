package yyds.sniarbtej;

import java.util.ArrayList;
import java.util.List;
import ylt.pmn.zubdqvgt;

public class ᵘ extends ˍɫ {
  public int ᔪ;
  
  public int ᒬ;
  
  public String name;
  
  public String ˊﮈ;
  
  public String ʼᐡ;
  
  public List<String> ᐨم = new ArrayList<>();
  
  public String ᴵઽ;
  
  public String ᐧṙ;
  
  public ٴﾗ ᐨẏ;
  
  public String ᐨר;
  
  public String ͺĹ;
  
  public String ᴵЃ;
  
  public List<ʾא> ʾ;
  
  public List<ʾא> ͺо;
  
  public List<ʽ冫> ˍɫ;
  
  public List<ʽ冫> ʽ;
  
  public List<ᴵʖ> ٴӵ;
  
  public List<ﹱ> ᴵƚ = new ArrayList<>();
  
  public String ᗮ;
  
  public List<String> ˌ;
  
  public List<String> ˍ;
  
  public List<ˑゞ> ʹō;
  
  public List<ᐨ> ᐝᵣ = new ArrayList<>();
  
  public List<ᐧє> ᔪ = new ArrayList<>();
  
  public ᵘ() {
    this(589824);
    if (!zubdqvgt.G(getClass(), ᵘ.class))
      throw new IllegalStateException(); 
  }
  
  public ᵘ(int paramInt) {
    super(paramInt);
  }
  
  public final void ᐨẏ(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) {
    this.ᔪ = paramInt1;
    this.ᒬ = paramInt2;
    this.name = paramString1;
    this.ˊﮈ = paramString2;
    this.ʼᐡ = paramString3;
    this.ᐨم = ٴᐤ.ᐨẏ(paramArrayOfString);
  }
  
  public final void ᐨẏ(String paramString1, String paramString2) {
    this.ᴵઽ = paramString1;
    this.ᐧṙ = paramString2;
  }
  
  public final ʻล ᐨẏ(String paramString1, int paramInt, String paramString2) {
    this.ᐨẏ = new ٴﾗ(paramString1, paramInt, paramString2);
    return this.ᐨẏ;
  }
  
  public final void ᐨẏ(String paramString) {
    this.ᗮ = paramString;
  }
  
  public final void ˊ(String paramString1, String paramString2, String paramString3) {
    this.ᐨר = paramString1;
    this.ͺĹ = paramString2;
    this.ᴵЃ = paramString3;
  }
  
  public final ᐨẏ ᐨẏ(String paramString, boolean paramBoolean) {
    ʾא ʾא = new ʾא(paramString);
    if (paramBoolean) {
      this.ʾ = ٴᐤ.ᐨẏ(this.ʾ, ʾא);
    } else {
      this.ͺо = ٴᐤ.ᐨẏ(this.ͺо, ʾא);
    } 
    return ʾא;
  }
  
  public final ᐨẏ ᐨẏ(int paramInt, ˏɪ paramˏɪ, String paramString, boolean paramBoolean) {
    ʽ冫 ʽ冫 = new ʽ冫(paramInt, paramˏɪ, paramString);
    if (paramBoolean) {
      this.ˍɫ = ٴᐤ.ᐨẏ(this.ˍɫ, ʽ冫);
    } else {
      this.ʽ = ٴᐤ.ᐨẏ(this.ʽ, ʽ冫);
    } 
    return ʽ冫;
  }
  
  public final void ᴵʖ(ᴵʖ paramᴵʖ) {
    this.ٴӵ = ٴᐤ.ᐨẏ(this.ٴӵ, paramᴵʖ);
  }
  
  public final void ˊ(String paramString) {
    this.ˌ = ٴᐤ.ᐨẏ(this.ˌ, paramString);
  }
  
  public final void ᴵʖ(String paramString) {
    this.ˍ = ٴᐤ.ᐨẏ(this.ˍ, paramString);
  }
  
  public final void ᐨẏ(String paramString1, String paramString2, String paramString3, int paramInt) {
    ﹱ ﹱ = new ﹱ(paramString1, paramString2, paramString3, paramInt);
    this.ᴵƚ.add(ﹱ);
  }
  
  public final ʼᵖ ᐨẏ(String paramString1, String paramString2, String paramString3) {
    ˑゞ ˑゞ = new ˑゞ(paramString1, paramString2, paramString3);
    this.ʹō = ٴᐤ.ᐨẏ(this.ʹō, ˑゞ);
    return ˑゞ;
  }
  
  public final ᴵƚ ᐨẏ(int paramInt, String paramString1, String paramString2, String paramString3, Object paramObject) {
    ᐨ ᐨ = new ᐨ(paramInt, paramString1, paramString2, paramString3, paramObject);
    this.ᐝᵣ.add(ᐨ);
    return ᐨ;
  }
  
  public final ˉｓ ᐨẏ(int paramInt, String paramString1, String paramString2, String paramString3, String[] paramArrayOfString) {
    ᐧє ᐧє = new ᐧє(paramInt, paramString1, paramString2, paramString3, paramArrayOfString);
    this.ᔪ.add(ᐧє);
    return ᐧє;
  }
  
  public final void ᐨẏ() {}
  
  private void ͺо(int paramInt) {
    if (paramInt < 589824 && this.ˍ != null)
      throw new ˈח(); 
    if (paramInt < 524288 && ((this.ᒬ & 0x10000) != 0 || this.ʹō != null))
      throw new ˈח(); 
    if (paramInt < 458752 && (this.ᗮ != null || this.ˌ != null))
      throw new ˈח(); 
    if (paramInt < 393216 && this.ᐨẏ != null)
      throw new ˈח(); 
    if (paramInt < 327680) {
      if (this.ˍɫ != null && !this.ˍɫ.isEmpty())
        throw new ˈח(); 
      if (this.ʽ != null && !this.ʽ.isEmpty())
        throw new ˈח(); 
    } 
    if (this.ʾ != null)
      for (int j = this.ʾ.size() - 1; j >= 0; j--)
        this.ʾ.get(j);  
    if (this.ͺо != null)
      for (int j = this.ͺо.size() - 1; j >= 0; j--)
        this.ͺо.get(j);  
    if (this.ˍɫ != null)
      for (int j = this.ˍɫ.size() - 1; j >= 0; j--)
        this.ˍɫ.get(j);  
    if (this.ʽ != null)
      for (int j = this.ʽ.size() - 1; j >= 0; j--)
        this.ʽ.get(j);  
    if (this.ʹō != null)
      for (int j = this.ʹō.size() - 1; j >= 0; j--) {
        this.ʹō.get(j);
        ˑゞ.ͺо(paramInt);
      }  
    int i;
    for (i = this.ᐝᵣ.size() - 1; i >= 0; i--) {
      int j = paramInt;
      ᐨ ᐨ = this.ᐝᵣ.get(i);
      if (j == 262144) {
        if (ᐨ.ˍɫ != null && !ᐨ.ˍɫ.isEmpty())
          throw new ˈח(); 
        if (ᐨ.ʽ != null && !ᐨ.ʽ.isEmpty())
          throw new ˈח(); 
      } 
    } 
    for (i = this.ᔪ.size() - 1; i >= 0; i--)
      ((ᐧє)this.ᔪ.get(i)).ͺо(paramInt); 
  }
  
  public final void ᐨẏ(ˍɫ paramˍɫ) {
    String[] arrayOfString = new String[this.ᐨم.size()];
    this.ᐨم.toArray(arrayOfString);
    paramˍɫ.ᐨẏ(this.ᔪ, this.ᒬ, this.name, this.ˊﮈ, this.ʼᐡ, arrayOfString);
    if (this.ᴵઽ != null || this.ᐧṙ != null)
      paramˍɫ.ᐨẏ(this.ᴵઽ, this.ᐧṙ); 
    ˍɫ ˍɫ1 = paramˍɫ;
    ٴﾗ ٴﾗ1 = this.ᐨẏ;
    ʻล ʻล;
    if (this.ᐨẏ != null && (ʻล = ˍɫ1.ᐨẏ(ٴﾗ1.name, ٴﾗ1.ᒬ, ٴﾗ1.ˏﬤ)) != null) {
      if (ٴﾗ1.ـᘢ != null)
        ʻล.ʿᵉ(ٴﾗ1.ـᘢ); 
      if (ٴﾗ1.ʻւ != null) {
        byte b1 = 0;
        int j = ٴﾗ1.ʻւ.size();
        while (b1 < j) {
          ʻล.ʹﮃ(ٴﾗ1.ʻւ.get(b1));
          b1++;
        } 
      } 
      if (ٴﾗ1.ˑܘ != null) {
        byte b1 = 0;
        int j = ٴﾗ1.ˑܘ.size();
        while (b1 < j) {
          ((ͺﮈ)ٴﾗ1.ˑܘ.get(b1)).ᐨẏ(ʻล);
          b1++;
        } 
      } 
      if (ٴﾗ1.ᐧפ != null) {
        byte b1 = 0;
        int j = ٴﾗ1.ᐧפ.size();
        while (b1 < j) {
          ((ـיּ)ٴﾗ1.ᐧפ.get(b1)).ᐨẏ(ʻล);
          b1++;
        } 
      } 
      if (ٴﾗ1.ιˠ != null) {
        byte b1 = 0;
        int j = ٴﾗ1.ιˠ.size();
        while (b1 < j) {
          ((ˈօ)ٴﾗ1.ιˠ.get(b1)).ᐨẏ(ʻล);
          b1++;
        } 
      } 
      if (ٴﾗ1.ˈהּ != null) {
        byte b1 = 0;
        int j = ٴﾗ1.ˈהּ.size();
        while (b1 < j) {
          ʻล.ՙᗮ(ٴﾗ1.ˈהּ.get(b1));
          b1++;
        } 
      } 
      if (ٴﾗ1.ﹳיִ != null) {
        byte b1 = 0;
        int j = ٴﾗ1.ﹳיִ.size();
        while (b1 < j) {
          ((ˋﺯ)ٴﾗ1.ﹳיִ.get(b1)).ᐨẏ(ʻล);
          b1++;
        } 
      } 
    } 
    if (this.ᗮ != null)
      paramˍɫ.ᐨẏ(this.ᗮ); 
    if (this.ᐨר != null)
      paramˍɫ.ˊ(this.ᐨר, this.ͺĹ, this.ᴵЃ); 
    if (this.ʾ != null) {
      byte b1 = 0;
      int j = this.ʾ.size();
      while (b1 < j) {
        ʾא ʾא;
        (ʾא = this.ʾ.get(b1)).ᐨẏ(paramˍɫ.ᐨẏ(ʾא.ˎᴗ, true));
        b1++;
      } 
    } 
    if (this.ͺо != null) {
      byte b1 = 0;
      int j = this.ͺо.size();
      while (b1 < j) {
        ʾא ʾא;
        (ʾא = this.ͺо.get(b1)).ᐨẏ(paramˍɫ.ᐨẏ(ʾא.ˎᴗ, false));
        b1++;
      } 
    } 
    if (this.ˍɫ != null) {
      byte b1 = 0;
      int j = this.ˍɫ.size();
      while (b1 < j) {
        ʽ冫 ʽ冫;
        (ʽ冫 = this.ˍɫ.get(b1)).ᐨẏ(paramˍɫ.ᐨẏ(ʽ冫.ٱ, ʽ冫.ˊ, ʽ冫.ˎᴗ, true));
        b1++;
      } 
    } 
    if (this.ʽ != null) {
      byte b1 = 0;
      int j = this.ʽ.size();
      while (b1 < j) {
        ʽ冫 ʽ冫;
        (ʽ冫 = this.ʽ.get(b1)).ᐨẏ(paramˍɫ.ᐨẏ(ʽ冫.ٱ, ʽ冫.ˊ, ʽ冫.ˎᴗ, false));
        b1++;
      } 
    } 
    if (this.ٴӵ != null) {
      byte b1 = 0;
      int j = this.ٴӵ.size();
      while (b1 < j) {
        paramˍɫ.ᴵʖ(this.ٴӵ.get(b1));
        b1++;
      } 
    } 
    if (this.ˌ != null) {
      byte b1 = 0;
      int j = this.ˌ.size();
      while (b1 < j) {
        paramˍɫ.ˊ(this.ˌ.get(b1));
        b1++;
      } 
    } 
    if (this.ˍ != null) {
      byte b1 = 0;
      int j = this.ˍ.size();
      while (b1 < j) {
        paramˍɫ.ᴵʖ(this.ˍ.get(b1));
        b1++;
      } 
    } 
    byte b = 0;
    int i = this.ᴵƚ.size();
    while (b < i) {
      ((ﹱ)this.ᴵƚ.get(b)).ᐨẏ(paramˍɫ);
      b++;
    } 
    if (this.ʹō != null) {
      b = 0;
      i = this.ʹō.size();
      while (b < i) {
        ˍɫ1 = paramˍɫ;
        ˑゞ ˑゞ = this.ʹō.get(b);
        ʼᵖ ʼᵖ;
        if ((ʼᵖ = ˍɫ1.ᐨẏ(ˑゞ.name, ˑゞ.ᴵʖ, ˑゞ.ˊﮈ)) != null) {
          if (ˑゞ.ʾ != null) {
            byte b1 = 0;
            int j = ˑゞ.ʾ.size();
            while (b1 < j) {
              ʾא ʾא;
              (ʾא = ˑゞ.ʾ.get(b1)).ᐨẏ(ʼᵖ.ᐨẏ(ʾא.ˎᴗ, true));
              b1++;
            } 
          } 
          if (ˑゞ.ͺо != null) {
            byte b1 = 0;
            int j = ˑゞ.ͺо.size();
            while (b1 < j) {
              ʾא ʾא;
              (ʾא = ˑゞ.ͺо.get(b1)).ᐨẏ(ʼᵖ.ᐨẏ(ʾא.ˎᴗ, false));
              b1++;
            } 
          } 
          if (ˑゞ.ˍɫ != null) {
            byte b1 = 0;
            int j = ˑゞ.ˍɫ.size();
            while (b1 < j) {
              ʽ冫 ʽ冫;
              (ʽ冫 = ˑゞ.ˍɫ.get(b1)).ᐨẏ(ʼᵖ.ᐨẏ(ʽ冫.ٱ, ʽ冫.ˊ, ʽ冫.ˎᴗ, true));
              b1++;
            } 
          } 
          if (ˑゞ.ʽ != null) {
            byte b1 = 0;
            int j = ˑゞ.ʽ.size();
            while (b1 < j) {
              ʽ冫 ʽ冫;
              (ʽ冫 = ˑゞ.ʽ.get(b1)).ᐨẏ(ʼᵖ.ᐨẏ(ʽ冫.ٱ, ʽ冫.ˊ, ʽ冫.ˎᴗ, false));
              b1++;
            } 
          } 
          if (ˑゞ.ٴӵ != null) {
            byte b1 = 0;
            int j = ˑゞ.ٴӵ.size();
            while (b1 < j) {
              ʼᵖ.ᴵʖ(ˑゞ.ٴӵ.get(b1));
              b1++;
            } 
          } 
          ʼᵖ.ᐨẏ();
        } 
        b++;
      } 
    } 
    b = 0;
    i = this.ᐝᵣ.size();
    while (b < i) {
      ˍɫ1 = paramˍɫ;
      ᐨ ᐨ = this.ᐝᵣ.get(b);
      ᴵƚ ᴵƚ;
      if ((ᴵƚ = ˍɫ1.ᐨẏ(ᐨ.ᒬ, ᐨ.name, ᐨ.ˎᴗ, ᐨ.ˊﮈ, ᐨ.ﾞл)) != null) {
        if (ᐨ.ʾ != null) {
          byte b1 = 0;
          int j = ᐨ.ʾ.size();
          while (b1 < j) {
            ʾא ʾא;
            (ʾא = ᐨ.ʾ.get(b1)).ᐨẏ(ᴵƚ.ᐨẏ(ʾא.ˎᴗ, true));
            b1++;
          } 
        } 
        if (ᐨ.ͺо != null) {
          byte b1 = 0;
          int j = ᐨ.ͺо.size();
          while (b1 < j) {
            ʾא ʾא;
            (ʾא = ᐨ.ͺо.get(b1)).ᐨẏ(ᴵƚ.ᐨẏ(ʾא.ˎᴗ, false));
            b1++;
          } 
        } 
        if (ᐨ.ˍɫ != null) {
          byte b1 = 0;
          int j = ᐨ.ˍɫ.size();
          while (b1 < j) {
            ʽ冫 ʽ冫;
            (ʽ冫 = ᐨ.ˍɫ.get(b1)).ᐨẏ(ᴵƚ.ᐨẏ(ʽ冫.ٱ, ʽ冫.ˊ, ʽ冫.ˎᴗ, true));
            b1++;
          } 
        } 
        if (ᐨ.ʽ != null) {
          byte b1 = 0;
          int j = ᐨ.ʽ.size();
          while (b1 < j) {
            ʽ冫 ʽ冫;
            (ʽ冫 = ᐨ.ʽ.get(b1)).ᐨẏ(ᴵƚ.ᐨẏ(ʽ冫.ٱ, ʽ冫.ˊ, ʽ冫.ˎᴗ, false));
            b1++;
          } 
        } 
        if (ᐨ.ٴӵ != null) {
          byte b1 = 0;
          int j = ᐨ.ٴӵ.size();
          while (b1 < j) {
            ᴵƚ.ᴵʖ(ᐨ.ٴӵ.get(b1));
            b1++;
          } 
        } 
        ᴵƚ.ᐨẏ();
      } 
      b++;
    } 
    b = 0;
    i = this.ᔪ.size();
    while (b < i) {
      ˍɫ1 = paramˍɫ;
      ᐧє ᐧє;
      String[] arrayOfString1 = ((ᐧє = this.ᔪ.get(b)).ـﭔ == null) ? null : ᐧє.ـﭔ.<String>toArray(new String[0]);
      ˉｓ ˉｓ;
      if ((ˉｓ = ˍɫ1.ᐨẏ(ᐧє.ᒬ, ᐧє.name, ᐧє.ˎᴗ, ᐧє.ˊﮈ, arrayOfString1)) != null)
        ᐧє.ᐨẏ(ˉｓ); 
      b++;
    } 
    paramˍɫ.ᐨẏ();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ᵘ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */