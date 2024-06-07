package mx.itson.edu.e1floresmanuel

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val price: EditText = findViewById(R.id.price)
        val percentage: TextView = findViewById(R.id.percentage)
        val total: TextView = findViewById(R.id.total)
        val ten: Button = findViewById(R.id.ten)
        val fifteen: Button = findViewById(R.id.fifteen)
        val twenty: Button = findViewById(R.id.twenty)
        val twentyfive: Button = findViewById(R.id.twentyfive)
        val thirty: Button = findViewById(R.id.thirteen)
        val fourty: Button = findViewById(R.id.fourteen)
        val tip: Button = findViewById(R.id.tip)
        val discount: Button = findViewById(R.id.discount)

        var precio = 0.0
        var descuento = 0.0

//        try {
//            precio = price.text.toString().toDouble()
//        } catch(e: java.lang.Exception){
//            total.setText("Enter a valid number")
//        }

        ten.setOnClickListener{
            try{
                precio = price.text.toString().toDouble()
            } catch(e: java.lang.Exception){
                total.setText("Enter a valid number")
            }
            descuento = 0.10
            percentage.setText("%.2f".format(calculaPercentage(precio, descuento)))
        }

        fifteen.setOnClickListener{
            try{
                precio = price.text.toString().toDouble()
            } catch(e: java.lang.Exception){
                total.setText("Enter a valid number")
            }
            descuento = 0.15
            percentage.setText("%.2f".format(calculaPercentage(precio, descuento)))
        }

        twenty.setOnClickListener {
            try{
                precio = price.text.toString().toDouble()
            } catch(e: java.lang.Exception){
                total.setText("Enter a valid number")
            }
            descuento = 0.20
            percentage.setText("%.2f".format(calculaPercentage(precio, descuento)))
        }

        twentyfive.setOnClickListener {
            try{
                precio = price.text.toString().toDouble()
            } catch(e: java.lang.Exception){
                total.setText("Enter a valid number")
            }
            descuento = 0.25
            percentage.setText("%.2f".format(calculaPercentage(precio, descuento)))
        }

        thirty.setOnClickListener {
            try{
                precio = price.text.toString().toDouble()
            } catch(e: java.lang.Exception){
                total.setText("Enter a valid number")
            }
            descuento = 0.30
            percentage.setText("%.2f".format(calculaPercentage(precio, descuento)))
        }

        fourty.setOnClickListener {
            try{
                precio = price.text.toString().toDouble()
            } catch(e: java.lang.Exception){
                total.setText("Enter a valid number")
            }
            descuento = 0.40
            percentage.setText("%.2f".format(calculaPercentage(precio, descuento)))
        }

        tip.setOnClickListener{
            total.setText("%.2f".format(calculaTip(precio, descuento)))
        }

        discount.setOnClickListener {
            total.setText("%.2f".format(calculaDiscount(precio, descuento)))
        }

    }

    fun calculaTip(precio: Double, descuento: Double): Double{
        var per = precio * descuento
        return precio + per
    }

    fun calculaDiscount(precio: Double, descuento: Double): Double{
        var per = precio * descuento
        return precio - per
    }

    fun calculaPercentage(precio: Double, descuento: Double): Double{
        return precio * descuento
    }

}
