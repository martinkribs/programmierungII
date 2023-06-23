package Entwurfsmuster.Singleton.Uebungen.ChoclateBoilerEnum;

public class ChocolateBoilerStart {
    private boolean empty;
	private boolean boiled;
	private static ChocolateBoilerStart chocolateBoiler;
  
	private ChocolateBoilerStart() {
		empty = true;
		boiled = false;
	}

	public static ChocolateBoilerStart getInstance(){
		if (chocolateBoiler == null){
			chocolateBoiler = new ChocolateBoilerStart();
		}
		return chocolateBoiler;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// fill the boiler with a milk/chocolate mixture
		}
	}
 
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// drain the boiled milk and chocolate
			empty = true;
		}
	}
 
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// bring the contents to a boil
			boiled = true;
		}
	}
  
	public boolean isEmpty() {
		return empty;
	}
 
	public boolean isBoiled() {
		return boiled;
	}
}
