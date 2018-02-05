package delight.state.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
	
	@Override
	public List<StateProvider> getProviders(String path) {
		
		List<StateProvider> matchingProviders = new ArrayList<StateProvider>(4);
		synchronized (providers) {
			
			for (Entry<String, StateProvider> e: providers.entrySet()) {
				if (e.getKey().startsWith(path)) {
					matchingProviders.add(e.getValue());
				}
			}
			
		}
		return matchingProviders;
	}
	
	public StateRegistryImpl() {
		super();
		this.providers = new HashMap<String, StateProvider>();
	}

	

	
	
	

}
