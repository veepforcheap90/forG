package yyds.sniarbtej;

public final class ˏﬤ {
  private final String ˌᔹ;
  
  public ˏﬤ(String paramString) {
    this.ˌᔹ = paramString;
  }
  
  public final void ᐨẏ(ـᘢ paramـᘢ) {
    int j;
    String str;
    int i = (str = this.ˌᔹ).length();
    if (str.charAt(0) == '<') {
      int k;
      j = 2;
      do {
        k = str.indexOf(':', j);
        paramـᘢ.ʾ(str.substring(j - 1, k));
        j = k + 1;
        if ((k = str.charAt(j)) == 76 || k == 91 || k == 84)
          j = ᐨẏ(str, j, paramـᘢ.ˊ()); 
        while ((k = str.charAt(j++)) == 58)
          j = ᐨẏ(str, j, paramـᘢ.ʿᵉ()); 
      } while (k != 62);
    } else {
      j = 0;
    } 
    if (str.charAt(j) == '(') {
      while (str.charAt(++j) != ')')
        j = ᐨẏ(str, j, paramـᘢ.ʹﮃ()); 
      for (j = ᐨẏ(str, j + 1, paramـᘢ.ՙᗮ()); j < i; j = ᐨẏ(str, j + 1, paramـᘢ.ᴵʖ()));
    } else {
      for (j = ᐨẏ(str, j, paramـᘢ.ˍɫ()); j < i; j = ᐨẏ(str, j, paramـᘢ.ﾞл()));
    } 
  }
  
  public final void ˊ(ـᘢ paramـᘢ) {
    ᐨẏ(this.ˌᔹ, 0, paramـᘢ);
  }
  
  private static int ᐨẏ(String paramString, int paramInt, ـᘢ paramـᘢ) {
    while (true) {
      int i;
      int j;
      boolean bool1;
      boolean bool2;
      paramInt = paramInt;
      char c;
      switch (c = paramString.charAt(paramInt++)) {
        case 'B':
        case 'C':
        case 'D':
        case 'F':
        case 'I':
        case 'J':
        case 'S':
        case 'V':
        case 'Z':
          paramـᘢ.ᐨẏ(c);
          return paramInt;
        case '[':
          paramـᘢ = paramـᘢ.ᐨẏ();
          paramInt = paramInt;
          paramString = paramString;
          continue;
        case 'T':
          i = paramString.indexOf(';', paramInt);
          paramـᘢ.ͺо(paramString.substring(paramInt, i));
          return i + 1;
        case 'L':
          j = paramInt;
          bool1 = false;
          bool2 = false;
          while (true) {
            if ((i = paramString.charAt(paramInt++)) == 46 || i == 59) {
              if (!bool1) {
                String str = paramString.substring(j, paramInt - 1);
                if (bool2) {
                  paramـᘢ.ᐨم(str);
                } else {
                  paramـᘢ.ʾܪ(str);
                } 
              } 
              if (i == 59) {
                paramـᘢ.ᐨẏ();
              } else {
                j = paramInt;
                bool1 = false;
                bool2 = true;
                continue;
              } 
            } else {
              if (i == 60) {
                String str = paramString.substring(j, paramInt - 1);
                if (bool2) {
                  paramـᘢ.ᐨم(str);
                } else {
                  paramـᘢ.ʾܪ(str);
                } 
                boolean bool = true;
                while ((i = paramString.charAt(paramInt)) != 62) {
                  switch (i) {
                    case 42:
                      paramInt++;
                      paramـᘢ.ʹл();
                      continue;
                    case 43:
                    case 45:
                      paramInt = ᐨẏ(paramString, paramInt + 1, paramـᘢ.ᐨẏ(i));
                      continue;
                  } 
                  paramInt = ᐨẏ(paramString, paramInt, paramـᘢ.ᐨẏ('='));
                } 
              } 
              continue;
            } 
            return paramInt;
          } 
      } 
      throw new IllegalArgumentException();
    } 
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˏﬤ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */