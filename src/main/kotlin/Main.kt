import withoutfactory.Client

fun main(args: Array<String>) {
    val client = Client(2)
    val vehicle = client.getVehicle()
    vehicle?.printVehicle()
    client.cleanUp()
}