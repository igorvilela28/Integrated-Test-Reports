
package br.com.igorvd.testereports

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val controller = Controller()

        val x = controller.controlSomething(false)

        text.setText(x.toString())

        text2.setText(controller.getString())


    }
}
