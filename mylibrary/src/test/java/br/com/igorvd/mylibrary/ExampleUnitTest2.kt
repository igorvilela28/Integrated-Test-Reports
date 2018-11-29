package br.com.igorvd.mylibrary

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest2 {

    lateinit var controller: Presenter

    @Before
    fun setup() {
        controller = Presenter()
    }

    @Test
    fun addition_isCorrect() {

        val x = controller.presentSomething(true)

        assertEquals(0, x)

    }
}
