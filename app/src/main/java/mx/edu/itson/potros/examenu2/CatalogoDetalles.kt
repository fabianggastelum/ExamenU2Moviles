package mx.edu.itson.potros.examenu2

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity

class CatalogoDetalles : ComponentActivity() {
    var adapter: DetallesAdapter? = null
    var detalles = ArrayList<Detalles>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.regalos)

        cargarDetalles()

        adapter = DetallesAdapter(this, detalles)
        var gridDetalles: GridView = findViewById(R.id.grid_detalles)

        gridDetalles.adapter = adapter
    }

    fun cargarDetalles() {
        detalles.add(
            Detalles(
                R.drawable.cumplebotanas,
                "100",
            )
        )
        detalles.add(
            Detalles(
                R.drawable.cumplecheve,
                "111",
            )
        )
        detalles.add(
            Detalles(
                R.drawable.cumpleescolar,
                "33",
            )
        )
        detalles.add(
            Detalles(
                R.drawable.cumplepaletas,
                "55",
            )
        )
        detalles.add(
            Detalles(
                R.drawable.cumplesnack,
                "100",
            )
        )
        detalles.add(
            Detalles(
                R.drawable.cumplevinos,
                "200",
            )
        )
    }

    class DetallesAdapter : BaseAdapter {
        var detalles = ArrayList<Detalles>()
        var context: Context? = null

        constructor(context: Context, detalles: ArrayList<Detalles>) : super() {
            this.detalles = detalles
            this.context = context
        }

        override fun getCount(): Int {
            return detalles.size
        }

        override fun getItem(p0: Int): Any {
            return detalles[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(pe: Int, p1: View?, p2: ViewGroup?): View {
            var detalle = detalles[pe]
            var inflator =
                context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var vista = inflator.inflate(R.layout.detalle_regalos, null)
            var image: ImageView = vista.findViewById(R.id.iv_regalo_imagen)
            var title: TextView = vista.findViewById(R.id.tv_regalo_precio)

            image.setImageResource(detalle.image)
            title.setText(detalle.precio)

            image.setOnClickListener() {
                val intent = Intent(context, detalles::class.java)
                intent.putExtra("precio", detalle.precio)
                intent.putExtra("imagen", detalle.image)
                context!!.startActivity(intent)

            }
            return vista
        }

    }
}