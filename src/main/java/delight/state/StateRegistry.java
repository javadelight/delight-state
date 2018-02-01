package delight.state;

public interface StateRegistry {
	
	public void addProvider(String path, StateProvider provider);
	
	public void removeProvider(String path);
	
	public StateProvider getProvider(String path);
	
}
