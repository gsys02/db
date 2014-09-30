package tes;

import static org.junit.Assert.*
import groovy.util.logging.Log4j
import net.go_sharp.db_web_rest.web.RootConfig

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.env.Environment
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.web.AnnotationConfigWebContextLoader
import org.springframework.test.context.web.WebAppConfiguration

@Log4j
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=RootConfig.class)
class TestSpring {

	@Autowired
	Environment env;

	@Test
	void tetst() {
		log.info env.getProperty("cas.callback")
	}


	@Test
	void test2() {
		log.info "as2"
	}
}
