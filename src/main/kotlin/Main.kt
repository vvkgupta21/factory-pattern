import withfactory.FactClient
import withfactory.VehicleType
import withoutfactory.Client

fun main(args: Array<String>) {
    // without factory method
//    val client = Client(2)
//    val vehicle = client.getVehicle()
//    vehicle?.printVehicle()
//    client.cleanUp()

    val factoryClient = FactClient()
    factoryClient.buildVehicle(VehicleType.VT_TwoWheeler)
    factoryClient.getVehicle()?.printVehicleInfo()

    factoryClient.buildVehicle(VehicleType.VT_ThreeWheeler)
    factoryClient.getVehicle()?.printVehicleInfo()

    factoryClient.buildVehicle(VehicleType.VT_FourWheeler)
    factoryClient.getVehicle()?.printVehicleInfo()
}