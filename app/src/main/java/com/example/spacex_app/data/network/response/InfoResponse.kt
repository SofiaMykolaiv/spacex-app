package com.example.spacex_app.data.network.response

data class InfoResponse(
    var name: String? = "",
    var founder: String? = "",
    var employees: Int? = 0,
    var vehicles: Int? = 0,
    var launch_sites: Int? = 0,
    var test_sites: Int? = 0,
    var ceo: String? = "",
    var cto: String? = "",
    var coo: String? = "",
    var cto_propulsion: String? = "",
    var valuation: Long? = 0L,
    var headquarters: HeadquartersResponse? = HeadquartersResponse(),
    var links: LinkResponse? = LinkResponse(),
    var summary: String? = ""
)