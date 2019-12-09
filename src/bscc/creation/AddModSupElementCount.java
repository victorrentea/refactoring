package bscc.creation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



class CodClientSaracu {
   public static void main(String[] args) {

      List<AddModSupElementCount> collect = Stream.of("ALIAS", "ADDRESS").map(AddModSupElementCount::createEmpty).collect(Collectors.toList());

      AddModSupElementCount.createEmpty("ALIAS");
      new AddModSupElementCount("ALIAS",1,2,3,6);
   }

}

public class AddModSupElementCount {
  
   public static final String[] ELEMENT_TYPES = {"PRIMARY_NAME", "ALIAS", "BIC", "PASSPORT", "ISIN"};
   private final String ADD_ACTION = "ADD";
   private final String MOD_ACTION = "MOD";
   private final String SUP_ACTION = "SUP";

   private final String elementType;
   private final int addCount;
   private final int modCount;
   private final int supCount;
   private final int totalCount;

   // constructor canonic
   public AddModSupElementCount(String elementType, int addCount, int modCount, int supCount, int totalCount) {
      this.elementType = elementType;
      this.addCount = addCount;
      this.modCount = modCount;
      this.supCount = supCount;
      this.totalCount = totalCount;
   }

   public static AddModSupElementCount createEmpty(String elementType) {
      return new AddModSupElementCount(elementType, 0,0,0,0);
   }

   public AddModSupElementCount(List<Object[]> columns) {
      String type = "";
      int resolvedAddCount = 0;
      int resolvedModCount = 0;
      int resolvedSupCount = 0;
      for (Object[] column : columns) {
         type = (String) column[0];
         String action = (String) column[1];
         int count = (int)column[2];
        
         switch (action) {
         case ADD_ACTION:
            resolvedAddCount = count;
            break;
         case MOD_ACTION:
            resolvedModCount = count;
            break;
         case SUP_ACTION:
            resolvedSupCount = count;
            break;
         default:
            throw new IllegalArgumentException("Not a valid action: " + action);
         }
      }
      this.elementType = type;
      this.addCount = resolvedAddCount;
      this.modCount = resolvedModCount;
      this.supCount =resolvedSupCount;
      this.totalCount = resolvedAddCount + resolvedModCount + resolvedSupCount;
   }
  
   public boolean isOfType(String elementType) {
      return elementType.equals(this.elementType);
   }


}