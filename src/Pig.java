
public class Pig {
   private String name;
   private boolean isSheepHerder;

   public Pig(String name, boolean canHerdSheep) {
	   this.name = name;
	   this.isSheepHerder = canHerdSheep;
   }
   
   public boolean willBecomeBacon() {
        if(this.isSheepHerder) {
        	  System.out.println("eggs for breakfast");
              return false;
        }
        else {
        	System.out.println("bacon for breakfast");
        	return true;
        }
   }
}
