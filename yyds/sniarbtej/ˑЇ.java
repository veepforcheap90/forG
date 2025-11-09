package yyds.sniarbtej;

import java.util.concurrent.atomic.AtomicLong;

final class ˑЇ extends ٴۉ<AtomicLong> {
  ˑЇ(ٴۉ paramٴۉ) {}
  
  private void ᐨẏ(Ⴡ paramჁ, AtomicLong paramAtomicLong) {
    this.ᐨẏ.ᐨẏ(paramჁ, Long.valueOf(paramAtomicLong.get()));
  }
  
  private AtomicLong ᐨẏ(יּ paramיּ) {
    Number number = this.ᐨẏ.ᐨẏ(paramיּ);
    return new AtomicLong(number.longValue());
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ˑЇ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */