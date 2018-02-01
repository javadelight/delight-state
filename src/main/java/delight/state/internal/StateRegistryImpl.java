package delight.state.internal;

import java.util.HashMap;
import java.util.Map;

import delight.state.StateProvider;
import delight.state.StateRegistry;

public class StateRegistryImpl implements StateRegistry {

	Map<String, StateProvider> providers;
	
	@Override
	public void addProvider(String path, StateProvider provider) {
		synchronized (providers) {
			providers.put(path, provider);
		}
	}

	@Override
	public void removeProvider(String path) {
		synchronized (providers) {
			providers.remove(path);
		}
	}

	@Override
	public StateProvider getProvider(String path) {
		synchronized (providers) {
			return providers.get(path);
		}
	}
	
	public StateRegistryImpl() {
		super();
		this.providers = new HashMap<String, StateProvider>();
	}

	
	
	

}
