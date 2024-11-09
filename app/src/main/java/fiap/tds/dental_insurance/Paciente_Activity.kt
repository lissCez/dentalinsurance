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
            setContentView(R.layout.activity_paciente)

            val pacientes = listOf(
                Paciente(
                    nome = "João Silva",
                    dataNasc = "12-04-2012",
                    sexo = "Masculino",
                    localNasc = "Xique-Xique, Bahia"
                ),
                Paciente(
                    nome = "Maria Oliveira",
                    dataNasc = "23-09-2008",
                    sexo = "Feminino",
                    localNasc = "Osasco, São Paulo"
                ),
                Paciente(
                    nome = "Carlos Pereira",
                    dataNasc = "08-11-1997",
                    sexo = "Masculino",
                    localNasc = "Carapicuiba, São Paulo"
                )
            )

            val recyclerView: RecyclerView = findViewById(R.id.rvPacientes)
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = PacientesAdapter(pacientes)
        }
}