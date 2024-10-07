package fiap.tds.dental_insurance

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import fiap.tds.dental_insurance.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()

        supportActionBar?.hide()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.messageTextView.visibility = View.GONE

        binding.imageButton.setOnClickListener {
            val username = binding.editTextText.text.toString()
            val password = binding.editTextTextPassword.text.toString()

            when {
                username.isEmpty() || password.isEmpty() -> {
                    binding.messageTextView.text = "Preencha todos os campos!"
                    binding.messageTextView.visibility = View.VISIBLE
                }

                else -> {
                    binding.messageTextView.text = "Credenciais inválidas, tente novamente."
                    binding.messageTextView.visibility = View.VISIBLE
                }
            }

        }
    }
}