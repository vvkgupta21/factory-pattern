package withoutfactory

class Client(type: Int) {

    private var pVehicle: Vehicle? = null

    init {
        when(type){
            2 -> pVehicle = TwoWheeler()
            3 -> pVehicle = ThreeWheeler()
            4 -> pVehicle = FourWheeler()
        }
    }

    fun cleanUp(){
        if (pVehicle != null){
            pVehicle = null
        }
    }

    fun getVehicle(): Vehicle?{
        return pVehicle
    }

}

//What are the problems with the above design?
//
//As you must have observed in the above example, the Client creates objects of either TwoWheeler or FourWheeler
//based on some input during the construction of its object.
//
//Say, the library introduces a new class ThreeWheeler to incorporate three-wheeler vehicles also. What would
//happen? The client will end up chaining a new else if in the conditional ladder to create objects of
//ThreeWheeler. Which in turn will need the Client to be recompiled. So, each time a new change is made on
//the library side, the Client would need to make some corresponding changes at its end and recompile the code.
//Sounds bad? This is a very bad practice of design.