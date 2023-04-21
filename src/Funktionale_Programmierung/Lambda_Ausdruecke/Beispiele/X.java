package Funktionale_Programmierung.Lambda_Ausdruecke.Beispiele;
@FunctionalInterface
public interface X {
	
	void m();
	
	boolean equals(Object obj);
	
	String toString();
	
	default void a() {
		System.out.println("Hallo");
	}
	
	static void b() {
		System.out.println("Welt");
	}
}
