package org.config_reader.com;

import java.io.IOException;

public class F_R_M {
	
	private F_R_M() {
	}
	
	
	public static F_R_M getinstanceFRM() {
		F_R_M f_r_m = new F_R_M();
return f_r_m;

	}

	public Conf_reader getinstanceCR() throws IOException {
Conf_reader conf_reader = new Conf_reader();
return conf_reader;
	}

}
