package br.com.igorvd.mylibrary

/**
 *
 * @author Igor Vilela
 * @since 28/11/2018
 */
class Presenter {

    fun presentSomething(isBad: Boolean) : Int {

        val value = if (isBad) {
            0
        } else {
            1
        }

        return value

    }

}