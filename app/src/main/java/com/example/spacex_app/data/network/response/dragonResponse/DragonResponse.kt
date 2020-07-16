package com.example.spacex_app.data.network.response.dragonResponse

data class DragonResponse(
    var id: String? = "",
    var name: String? = "",
    var type: String? = "",
    var active: Boolean? = false,
    var crew_capacity: Int? = 0,
    var sidewall_angle_deg: Int? = 0,
    var orbit_duration_yr: Int? = 0,
    var dry_mass_kg: Int? = 0,
    var dry_mass_lb: Int? = 0,
    var first_flight: String? = "",
    var heat_shield: HeatShieldResponse? = HeatShieldResponse(),
    var thrusters: List<ThrusterResponse>? = emptyList(),
    var launch_payload_mass: LaunchPayloadMassResponse? = LaunchPayloadMassResponse(),
    var launch_payload_vol: LaunchPayloadVolResponse? = LaunchPayloadVolResponse(),
    var return_payload_mass: ReturnPayloadMassResponse? = ReturnPayloadMassResponse(),
    var return_payload_vol: ReturnPayloadVolResponse? = ReturnPayloadVolResponse(),
    var pressurized_capsule: PressurizedCapsuleResponse? = PressurizedCapsuleResponse(),
    var trunk: TrunkResponse? = TrunkResponse(),
    var height_w_trunk: HeightWTrunkResponse? = HeightWTrunkResponse(),
    var diameter: DiameterResponse? = DiameterResponse(),
    var flickr_images: List<String>? = emptyList(),
    var wikipedia: String? = "",
    var description: String? = ""
)