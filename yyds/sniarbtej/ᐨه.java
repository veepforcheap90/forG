package yyds.sniarbtej;

import java.util.BitSet;
import ylt.pmn.zubdqvgt;

final class ᐨه extends ٴۉ<BitSet> {
  private static BitSet ᐨẏ(יּ paramיּ) {
    if (zubdqvgt.G(paramיּ.ᐨẏ(), כ.ʽ)) {
      paramיּ.ۦ();
      return null;
    } 
    BitSet bitSet = new BitSet();
    paramיּ.ᵘ();
    byte b = 0;
    כ כ = paramיּ.ᐨẏ();
    while (!zubdqvgt.G(כ, כ.ˊ)) {
      boolean bool;
      String str;
      switch (ᴵᔿ.ʹō[כ.ordinal()]) {
        case 1:
          bool = (paramיּ.ˊɼ() != 0);
          break;
        case 2:
          bool = paramיּ.ˈے();
          break;
        case 3:
          str = paramיּ.ٴӵ();
          try {
            bool = (Integer.parseInt(str) != 0);
          } catch (NumberFormatException numberFormatException) {
            "锟㏰䧬統㡤ⵌഌ씗ĸ常᪛檙㮎蕼璞㨗ꍹ鑸駊骊뗒隰㩤◘ⱙ㗴鴠䢋ៀ멒䷺ꉈᾒ诳臽氅䜯䘼痫ᔧ俓作韶⒐쀅钧ᘨ欧".toCharArray()[8] = (char)("锟㏰䧬統㡤ⵌഌ씗ĸ常᪛檙㮎蕼璞㨗ꍹ鑸駊骊뗒隰㩤◘ⱙ㗴鴠䢋ៀ멒䷺ꉈᾒ诳臽氅䜯䘼痫ᔧ俓作韶⒐쀅钧ᘨ欧".toCharArray()[8] ^ 0x672B);
            throw new ՙĩ(ᐨẏ$ᐝт.W("锟㏰䧬統㡤ⵌഌ씗ĸ常᪛檙㮎蕼璞㨗ꍹ鑸駊骊뗒隰㩤◘ⱙ㗴鴠䢋ៀ멒䷺ꉈᾒ诳臽氅䜯䘼痫ᔧ俓作韶⒐쀅钧ᘨ欧".toCharArray(), (short)31290, (byte)3, (short)1) + str);
          } 
          break;
        default:
          "偕?ꕗ媩렰櫞ቓ㳦ꂈ沑쌴农ൎႀ뎧诟Ⱑ몇蛼念핟䡔".toCharArray()[24] = (char)("偕?ꕗ媩렰櫞ቓ㳦ꂈ沑쌴农ൎႀ뎧诟Ⱑ몇蛼念핟䡔".toCharArray()[24] ^ 0x6384);
          throw new ՙĩ(ᐨẏ$ᐝт.W("偕?ꕗ媩렰櫞ቓ㳦ꂈ沑쌴农ൎႀ뎧诟Ⱑ몇蛼念핟䡔".toCharArray(), (short)30273, (byte)4, (short)0) + bool);
      } 
      if (bool)
        bitSet.set(b); 
      b++;
      כ כ1 = paramיּ.ᐨẏ();
    } 
    paramיּ.ˑܥ();
    return bitSet;
  }
  
  private static void ᐨẏ(Ⴡ paramჁ, BitSet paramBitSet) {
    if (paramBitSet == null) {
      paramჁ.ʿᵉ();
      return;
    } 
    paramჁ.ᐨẏ();
    for (byte b = 0; b < paramBitSet.length(); b++) {
      boolean bool = paramBitSet.get(b) ? true : false;
      paramჁ.ᐨẏ(bool);
    } 
    paramჁ.ˊ();
  }
}


/* Location:              C:\Users\kb\Downloads\ja-netfilter.jar!\yyds\sniarbtej\ᐨه.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */