package org.cocktail.sqlshame.dao

import org.cocktail.sqlshame.domain.Shame
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ShameRepository extends CrudRepository<Shame,Long> {

}
