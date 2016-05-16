package org.cocktail.sqlshame.controllers

import org.cocktail.sqlshame.dao.ShameRepository
import org.cocktail.sqlshame.domain.Shame
import org.joda.time.DateTime
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController("/api/shames")
class ShameController {

    @Autowired
    ShameRepository shameRepository

    @RequestMapping
    Iterable<Shame> index() {
        return shameRepository.findAll()
    }

    @RequestMapping(method = RequestMethod.POST)
    Shame save(@RequestBody Shame shame) {
        shame.saved = DateTime.now()
        return shameRepository.save(shame)
    }


}
