package co.uk.howardpaget.paidia.state

class State {
    var contents: HashMap<String, Any> = HashMap()

    fun getString(key: String): String{
        return this.contents[key] as String
    }

    fun getDecimal(key: String): Double {
        return this.contents[key] as Double
    }

    fun getInteger(key: String):Int {
        return this.contents[key] as Int
    }

    fun putValue(key: String, value: String) {
        this.contents[key] = value
    }

    fun putValue(key: String, value: Double) {
        this.contents[key] = value
    }

    fun putValue(key: String, value: Int) {
        this.contents[key] = value
    }

}