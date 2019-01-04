package br.com.mhbp.rest.restfulwebservice.model

import javax.persistence.*

@Entity
@Table(schema = "user_mgmt", name = "Groups")
class GroupEntity() : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected  var id: Long? = null

    @Column(nullable = false)
    protected var name: String? = null

    constructor(id: Long, name: String) : this() {
        this.id = id
        this.name = name
    }

    override fun toString(): String {
        return "GroupEntity(id=$id, name=$name)"
    }

}