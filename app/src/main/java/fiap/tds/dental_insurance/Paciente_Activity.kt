package fiap.tds.dental_insurance

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Paciente_Activity : AppCompatActivity() {
        @SuppressLint("MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_paciente2)

            val pacientes = listOf(
                Paciente("João Silva", "12-04-2012", "Masculino", "Xique-Xique, Bahia"),
                Paciente("Maria Oliveira", "23-09-2008", "Feminino", "Osasco, São Paulo"),
                Paciente("Carlos Pereira", "08-11-1997", "Masculino", "Carapicuiba, São Paulo")
            )

            val recyclerView: RecyclerView = findViewById(R.id.rvPacientes)
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = PacientesAdapter(pacientes)
        }
}