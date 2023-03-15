package interlink;

public class Enum5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TrafficSignal [] signal = TrafficSignal.values();
		for( TrafficSignal c :signal) {
			System.out.println(c.getMethod());
			System.out.println(c);
		}
		
		TrafficSignal gg = TrafficSignal.GREEN;
		System.out.println(gg.getMethod());
		
		TrafficSignal ss = TrafficSignal.RED;
		System.out.println(ss.getMethod());
		
	}
	

}
enum TrafficSignal{
	RED("STOP"),
	GREEN("GO"),
	YELLOW("SLOW DOWN");
	
	private String method;
	private TrafficSignal(String md) {
		this.method = md;
		
	}
	public  String getMethod() {
		return this.method;
	}
	
	
	
	
	
}