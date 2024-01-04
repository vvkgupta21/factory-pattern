package withfactory

class FactClient {

    private var pVehicle: Vehicle? = null

    fun buildVehicle(vehicleType: VehicleType){
        val vf = VehicleFactory()
        pVehicle = vf.build(vehicleType)
    }
    fun getVehicle(): Vehicle?{
        return pVehicle
    }

}