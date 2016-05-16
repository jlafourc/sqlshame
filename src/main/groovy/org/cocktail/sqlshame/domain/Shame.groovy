package org.cocktail.sqlshame.domain

import org.hibernate.annotations.Type
import org.joda.time.DateTime

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Shame implements Serializable {

    @Id
    @GeneratedValue
    Long id

    @Column(nullable = false)
    String version

    @Column(nullable = false)
    String action

    @Column
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    DateTime saved

    @Column(nullable = false)
    String username


}
