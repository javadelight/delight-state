package delight.state;

import delight.state.internal.StateRegistryImpl;

public class State {

	public static StateRegistry create() {
		return new StateRegistryImpl();
	}
	
	public static StateRegistry registry=null;
	
	public static StateRegistry get() {
		if (registry == null) {
			registry = create();
		}
		return registry;
	}
	
}
