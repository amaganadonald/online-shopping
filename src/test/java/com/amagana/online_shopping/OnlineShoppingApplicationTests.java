package com.amagana.online_shopping;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;

@SpringBootTest
class OnlineShoppingApplicationTests {

	static ApplicationModules modules = ApplicationModules.of(OnlineShoppingApplication.class);
	@Test
	void verifiesModularStructure() {
		modules.verify();
	}

}
