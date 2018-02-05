package delight.state;

import java.util.List;

public interface StateRegistry {
	
	public void addProvider(String path, StateProvider provider);
	
	public void removeProvider(String path);
	
	public StateProvider getProvider(String path);
	
	public List<StateProvider> getProviders(String path);
	
}
