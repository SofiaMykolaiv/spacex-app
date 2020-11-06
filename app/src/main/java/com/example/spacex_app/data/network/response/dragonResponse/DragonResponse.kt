package com.example.spacex_app.data.network.response.dragonResponse

import com.google.gson.annotations.SerializedName

data class DragonResponse(
    @SerializedName(value = "id") var id: String = "",
    @SerializedName(value = "name") var name: String? = "",
    @SerializedName(value = "type") var type: String? = "",
    @SerializedName(value = "active") var active: Boolean? = false,
    @SerializedName(value = "crew_capacity") var crew_capacity: Int? = 0,
    @SerializedName(value = "sidewall_angle_deg") var sidewall_angle_deg: Int? = 0,
    @SerializedName(value = "orbit_duration_yr") var orbit_duration_yr: Int? = 0,
    @SerializedName(value = "dry_mass_kg") var dry_mass_kg: Int? = 0,
    @SerializedName(value = "dry_mass_lb") var dry_mass_lb: Int? = 0,
    @SerializedName(value = "first_flight") var first_flight: String? = "",
    @SerializedName(value = "heat_shield") var heat_shield: HeatShieldResponse? = HeatShieldResponse(),
    @SerializedName(value = "thrusters") var thrusters: List<ThrusterResponse>? = emptyList(),
    @SerializedName(value = "launch_payload_mass") var launch_payload_mass: LaunchPayloadMassResponse? = LaunchPayloadMassResponse(),
    @SerializedName(value = "launch_payload_vol") var launch_payload_vol: LaunchPayloadVolResponse? = LaunchPayloadVolResponse(),
    @SerializedName(value = "return_payload_mass") var return_payload_mass: ReturnPayloadMassResponse? = ReturnPayloadMassResponse(),
    @SerializedName(value = "return_payload_vol") var return_payload_vol: ReturnPayloadVolResponse? = ReturnPayloadVolResponse(),
    @SerializedName(value = "pressurized_capsule") var pressurized_capsule: PressurizedCapsuleResponse? = PressurizedCapsuleResponse(),
    @SerializedName(value = "trunk") var trunk: TrunkResponse? = TrunkResponse(),
    @SerializedName(value = "height_w_trunk") var height_w_trunk: HeightWTrunkResponse? = HeightWTrunkResponse(),
    @SerializedName(value = "diameter") var diameter: DiameterResponse? = DiameterResponse(),
    @SerializedName(value = "flickr_images") var flickr_images: List<String>? = emptyList(),
    @SerializedName(value = "wikipedia") var wikipedia: String? = "",
    @SerializedName(value = "description") var description: String? = ""
)