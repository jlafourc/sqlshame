package org.cocktail.sqlshame

import org.cocktail.sqlshame.dao.ShameRepository
import org.cocktail.sqlshame.domain.Shame
import org.joda.time.DateTime
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

import javax.annotation.PostConstruct
import javax.transaction.Transactional

@SpringBootApplication
class SqlshameApplication {

	@Autowired
	ShameRepository shameRepository

	static void main(String[] args) {
		SpringApplication.run SqlshameApplication, args
	}

	@PostConstruct
	@Transactional
	void insertData() {
		shameRepository.save(new Shame(version: '20160101.000000', action: "UPDATE",
				saved: DateTime.now(),
				username: "jlafourc"))
		println shameRepository.findAll().each { println it.class.name }
		shameRepository.findAll().each { Shame s ->
			println("$s.id - $s.version - $s.action - $s.saved -  $s.username")
		}
	}
}
