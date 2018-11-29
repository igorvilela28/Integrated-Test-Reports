package br.com.igorvd.testereports

/**
 *
 * @author Igor Vilela
 * @since 28/11/2018
 */
class Controller {

    fun controlSomething(isBad: Boolean) : Int {

        val value = if (isBad) {
            0
        } else {
            1
        }

        return value

    }

}