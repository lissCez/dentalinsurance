package fiap.tds.dental_insurance

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

data class Paciente(val nome: String, val dataNasc: String, val sexo: String, val localNasc: String)
class PacientesAdapter(private val patients: List<Paciente>) : RecyclerView.Adapter<PacientesAdapter.PatientViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PatientViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_paciente, parent, false)
        return PatientViewHolder(view)
    }
    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: PatientViewHolder, position: Int) {
        val patient = patients[position]
        holder.nameTextView.text = "Nome: ${patient.nome}";
        holder.dataNascTextView.text = "Data de nascimento: ${patient.dataNasc}";
        holder.sexoTextView.text = "Sexo: ${patient.sexo}";
        holder.localNasc.text = "Local de Nascimento: ${patient.localNasc}";
    }
    override fun getItemCount() = patients.size
    inner class PatientViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val localNasc: TextView = itemView.findViewById(R.id.tvPatientCityOfBirth)
        val nameTextView: TextView = itemView.findViewById(R.id.tvPatientName)
        val sexoTextView: TextView = itemView.findViewById(R.id.tvPatientSexo)
        val dataNascTextView: TextView = itemView.findViewById(R.id.tvPatientAge)
    }
}
