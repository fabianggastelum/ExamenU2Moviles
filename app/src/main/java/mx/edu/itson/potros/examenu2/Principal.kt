package mx.edu.itson.potros.examenu2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class Principal : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val buttonDetalles: Button = findViewById(R.id.btn_detalles)
        val buttonGlobos: Button = findViewById(R.id.btn_globos)
        val buttonPeluches: Button = findViewById(R.id.btn_peluches)
        val buttonRegalos: Button = findViewById(R.id.btn_regalos)
        val buttonTazas: Button = findViewById(R.id.btn_tazas)

        buttonDetalles.setOnClickListener(){
            var intent: Intent = Intent(this, CatalogoDetalles::class.java)
            startActivity(intent)
        }
        buttonGlobos.setOnClickListener(){
            var intent: Intent = Intent(this, CatalogoGlobos::class.java)
            startActivity(intent)
        }
        buttonPeluches.setOnClickListener(){
            var intent: Intent = Intent(this, CatalogoPeluches::class.java)
            startActivity(intent)
        }
        buttonRegalos.setOnClickListener(){
            var intent: Intent = Intent(this, CatalogoGlobos::class.java)
            startActivity(intent)
        }
        buttonTazas.setOnClickListener(){
            var intent: Intent = Intent(this, CatalogoTazas::class.java)
            startActivity(intent)
        }

    }
}