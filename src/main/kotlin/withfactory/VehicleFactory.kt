package withfactory

class VehicleFactory {
    fun build(vehicleType: VehicleType): Vehicle {
        return when(vehicleType){
            VehicleType.VT_TwoWheeler -> TwoWheeler()
            VehicleType.VT_ThreeWheeler -> ThreeWheeler()
            VehicleType.VT_FourWheeler -> FourWheeler()
        }
    }
}