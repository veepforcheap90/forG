package yyds.sniarbtej;

final class ᐨר implements Comparable<ᐨר> {
  final String name;
  
  final int ᒬ;
  
  final String ᴵʖ;
  
  ᐨר(String paramString1, int paramInt, String paramString2) {
    this.name = paramString1;
    this.ᒬ = paramInt;
    this.ᴵʖ = paramString2;
  }
  
  private int ᐨẏ(ᐨר paramᐨר) {
    int i;
    if ((i = this.name.compareTo(paramᐨר.name)) == 0)
      i = this.ᴵʖ.compareTo(paramᐨר.ᴵʖ); 
    return i;
  }
  
  public final boolean equals(Object paramObject) {
    return (paramObject instanceof ᐨר) ? ((ᐨẏ((ᐨר)paramObject) == 0)) : false;
  }
  
  public final int hashCode() {
    return this.name.hashCode() ^ this.ᴵʖ.hashCode();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ᐨר.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */