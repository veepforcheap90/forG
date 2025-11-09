package yyds.sniarbtej;

import java.util.ArrayList;
import java.util.List;

public final class ᵕ extends ᴵʖ {
  private String ʻᒱ;
  
  public List<String> ʹﮃ;
  
  private List<byte[]> ՙᗮ;
  
  private ᵕ(String paramString, List<String> paramList, List<byte[]> paramList1) {
    super(ˍɫ$יς.J("淬飂㶷䐺俧⊙먲햄㋕훛ꤨ歫".toCharArray(), (short)10230, (short)4, (byte)0));
    this.ʻᒱ = paramString;
    this.ʹﮃ = paramList;
    this.ՙᗮ = paramList1;
  }
  
  public ᵕ() {
    this(null, null, null);
  }
  
  public final ᴵʖ ᐨẏ(ᐨم paramᐨم, int paramInt1, int paramInt2, char[] paramArrayOfchar) {
    paramInt1 = paramInt1;
    String str = paramᐨم.ᐨẏ(paramInt1, paramArrayOfchar);
    paramInt1 += 2;
    int i = paramᐨم.ᴵʖ(paramInt1);
    paramInt1 += 2;
    ArrayList<String> arrayList = new ArrayList(i);
    ArrayList<byte[]> arrayList1 = new ArrayList(i);
    for (byte b = 0; b < i; b++) {
      String str1 = paramᐨم.ʿᵉ(paramInt1, paramArrayOfchar);
      paramInt1 += 2;
      arrayList.add(str1);
      int j = paramᐨم.ᴵʖ(paramInt1);
      paramInt1 += 2;
      byte[] arrayOfByte = new byte[j];
      for (byte b1 = 0; b1 < j; b1++) {
        arrayOfByte[b1] = (byte)paramᐨم.ˊ(paramInt1);
        paramInt1++;
      } 
      arrayList1.add(arrayOfByte);
    } 
    return new ᵕ(str, arrayList, (List<byte[]>)arrayList1);
  }
  
  public final ʿᵉ ᐨẏ(ʽ paramʽ) {
    ʿᵉ ʿᵉ;
    (ʿᵉ = new ʿᵉ()).ˊ(paramʽ.ˊ(this.ʻᒱ));
    if (this.ʹﮃ == null) {
      ʿᵉ.ˊ(0);
    } else {
      int i = this.ʹﮃ.size();
      ʿᵉ.ˊ(i);
      for (byte b = 0; b < i; b++) {
        String str1 = this.ʹﮃ.get(b);
        byte[] arrayOfByte = this.ՙᗮ.get(b);
        String str2 = str1;
        str2 = str2;
        ʽ ʽ1;
        ﾞǰ ﾞǰ;
        ʿᵉ.ˊ(((ﾞǰ = (ʽ1 = paramʽ).ᐨẏ).ᐨẏ(19, str2)).ͺᴲ).ˊ(arrayOfByte.length).ᐨẏ(arrayOfByte, 0, arrayOfByte.length);
      } 
    } 
    return ʿᵉ;
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ᵕ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */