package br.com.igorvd.testereports

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    lateinit var controller: Controller

    @Before
    fun setup() {
        controller = Controller()
    }

    @Test
    fun addition_isCorrect() {

        val x = controller.controlSomething(true)

        assertEquals(0, x)

    }
}
