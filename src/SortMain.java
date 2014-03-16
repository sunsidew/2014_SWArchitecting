
public class SortMain {

	public static void main(String[] args) {
		int data[] = {4,3,6};
		
		SortCall sortPlay = null;
		try {
			sortPlay = (SortCall) Class.forName(ReadXml.className()).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sortPlay.sorting(data);
	}
}
