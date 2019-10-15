import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SyncroArraylist {

	private static ArrayList<String> synchronizedList;

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
   al.add("abc");
   al.add("pqr");
   al.add("RBC");
   al.add("WBC");
   List<String>sclist=Collections.synchronizedList(al);
  synchronized(sclist)
  {
	  Iterator ltr=sclist.iterator();
	  while(ltr.hasNext());
	  {
		  System.out.println(ltr.next());
	  }
  System.out.println(ltr);
  }
  
	}

}
