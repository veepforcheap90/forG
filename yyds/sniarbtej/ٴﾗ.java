package yyds.sniarbtej;

import java.util.ArrayList;
import java.util.List;
import ylt.pmn.zubdqvgt;

public class ٴﾗ extends ʻล {
  public String name;
  
  public int ᒬ;
  
  public String ˏﬤ;
  
  public String ـᘢ;
  
  public List<String> ʻւ;
  
  public List<ͺﮈ> ˑܘ;
  
  public List<ـיּ> ᐧפ;
  
  public List<ˈօ> ιˠ;
  
  public List<String> ˈהּ;
  
  public List<ˋﺯ> ﹳיִ;
  
  public ٴﾗ(String paramString1, int paramInt, String paramString2) {
    super(589824);
    if (!zubdqvgt.G(getClass(), ٴﾗ.class))
      throw new IllegalStateException(); 
    this.name = paramString1;
    this.ᒬ = paramInt;
    this.ˏﬤ = paramString2;
  }
  
  private ٴﾗ(int paramInt1, String paramString1, int paramInt2, String paramString2, List<ͺﮈ> paramList, List<ـיּ> paramList1, List<ˈօ> paramList2, List<String> paramList3, List<ˋﺯ> paramList4) {
    super(paramInt1);
    this.name = paramString1;
    this.ᒬ = paramInt2;
    this.ˏﬤ = paramString2;
    this.ˑܘ = paramList;
    this.ᐧפ = paramList1;
    this.ιˠ = paramList2;
    this.ˈהּ = paramList3;
    this.ﹳיִ = paramList4;
  }
  
  public final void ʿᵉ(String paramString) {
    this.ـᘢ = paramString;
  }
  
  public final void ʹﮃ(String paramString) {
    if (this.ʻւ == null)
      this.ʻւ = new ArrayList<>(5); 
    this.ʻւ.add(paramString);
  }
  
  public final void ᐨẏ(String paramString1, int paramInt, String paramString2) {
    if (this.ˑܘ == null)
      this.ˑܘ = new ArrayList<>(5); 
    this.ˑܘ.add(new ͺﮈ(paramString1, paramInt, paramString2));
  }
  
  public final void ᐨẏ(String paramString, int paramInt, String... paramVarArgs) {
    if (this.ᐧפ == null)
      this.ᐧפ = new ArrayList<>(5); 
    this.ᐧפ.add(new ـיּ(paramString, paramInt, ٴᐤ.ᐨẏ(paramVarArgs)));
  }
  
  public final void ˊ(String paramString, int paramInt, String... paramVarArgs) {
    if (this.ιˠ == null)
      this.ιˠ = new ArrayList<>(5); 
    this.ιˠ.add(new ˈօ(paramString, paramInt, ٴᐤ.ᐨẏ(paramVarArgs)));
  }
  
  public final void ՙᗮ(String paramString) {
    if (this.ˈהּ == null)
      this.ˈהּ = new ArrayList<>(5); 
    this.ˈהּ.add(paramString);
  }
  
  public final void ᐨẏ(String paramString, String... paramVarArgs) {
    if (this.ﹳיִ == null)
      this.ﹳיִ = new ArrayList<>(5); 
    this.ﹳיִ.add(new ˋﺯ(paramString, ٴᐤ.ᐨẏ(paramVarArgs)));
  }
  
  public final void ᐨẏ() {}
  
  public final void ᐨẏ(ˍɫ paramˍɫ) {
    ʻล ʻล1;
    if ((ʻล1 = paramˍɫ.ᐨẏ(this.name, this.ᒬ, this.ˏﬤ)) == null)
      return; 
    if (this.ـᘢ != null)
      ʻล1.ʿᵉ(this.ـᘢ); 
    if (this.ʻւ != null) {
      byte b = 0;
      int i = this.ʻւ.size();
      while (b < i) {
        ʻล1.ʹﮃ(this.ʻւ.get(b));
        b++;
      } 
    } 
    if (this.ˑܘ != null) {
      byte b = 0;
      int i = this.ˑܘ.size();
      while (b < i) {
        ((ͺﮈ)this.ˑܘ.get(b)).ᐨẏ(ʻล1);
        b++;
      } 
    } 
    if (this.ᐧפ != null) {
      byte b = 0;
      int i = this.ᐧפ.size();
      while (b < i) {
        ((ـיּ)this.ᐧפ.get(b)).ᐨẏ(ʻล1);
        b++;
      } 
    } 
    if (this.ιˠ != null) {
      byte b = 0;
      int i = this.ιˠ.size();
      while (b < i) {
        ((ˈօ)this.ιˠ.get(b)).ᐨẏ(ʻล1);
        b++;
      } 
    } 
    if (this.ˈהּ != null) {
      byte b = 0;
      int i = this.ˈהּ.size();
      while (b < i) {
        ʻล1.ՙᗮ(this.ˈהּ.get(b));
        b++;
      } 
    } 
    if (this.ﹳיִ != null) {
      byte b = 0;
      int i = this.ﹳיִ.size();
      while (b < i) {
        ((ˋﺯ)this.ﹳיִ.get(b)).ᐨẏ(ʻล1);
        b++;
      } 
    } 
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ٴﾗ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */