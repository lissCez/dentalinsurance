package fiap.tds.dental_insurance

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnProfile: Button = findViewById(R.id.btnProfile)
        val btnCalendar: Button = findViewById(R.id.btnCalendar)
        val btnPatients: Button = findViewById(R.id.btnPatients)

        btnProfile.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }

        btnCalendar.setOnClickListener {
            startActivity(Intent(this, CalendarActivity::class.java))
        }

        btnPatients.setOnClickListener {
            startActivity(Intent(this, Paciente::class.java))
        }
    }
}
