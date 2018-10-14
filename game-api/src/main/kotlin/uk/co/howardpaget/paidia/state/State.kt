package uk.co.howardpaget.paidia.state

class State {
    private val contents: HashMap<String, Any> = HashMap()

    init{}

    fun remove(key: String) {
        this.contents.remove(key)
    }

    fun isEmpty(): Boolean {
        return this.contents.isEmpty()
    }

    fun containsKey(key: String): Boolean {
        return this.contents.containsKey(key)
    }

    fun getString(key: String): String{
        return this.contents[key] as String
    }

    fun getDecimal(key: String): Double {
        return this.contents[key] as Double
    }

    fun getInteger(key: String):Int {
        return this.contents[key] as Int
    }

    fun getBoolean(key: String):Boolean{
        return this.contents[key] as Boolean
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

    fun putValue(key: String, value: Boolean) {
        this.contents[key] = value
    }
}