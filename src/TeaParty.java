public class TeaParty {

	public String welcome(String name, boolean isWoman, boolean isKnighted)
       {
			if(isKnighted) {
				if(isWoman) {
					return "Hello " + "Lady " + name;
				}
				else {
					return "Hello " + "Sir " + name;
				}
			}
			else {
				if(isWoman) {
					return "Hello " + "Ms. " + name;
				}
				else {
					return "Hello " + "Mr. " + name;
				}
			}
       }

}