package mx.edu.itson.potros.examenu2

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity

class DetalleRegalos :  ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detalle_regalos)

        val bundle = intent.extras

        val imageView : ImageView = findViewById(R.id.iv_regalo_imagen)
        val textView : TextView = findViewById(R.id.tv_regalo_precio)

        if(bundle == null) return;

        textView.setText(bundle.getString("precio"))
        imageView.setImageResource(bundle.getInt("imagen"))
    }

}