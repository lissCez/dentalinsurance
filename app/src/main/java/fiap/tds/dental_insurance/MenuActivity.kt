package fiap.tds.dental_insurance

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.navigation.NavigationView
import fiap.tds.dental_insurance.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navView: NavigationView
    private lateinit var toolbar: Toolbar
    private lateinit var menuIcon: AppCompatImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawerLayout)
        navView = findViewById(R.id.navView)
        toolbar = findViewById(R.id.toolbar)
        menuIcon = findViewById(R.id.menuIcon)

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        menuIcon.setOnClickListener {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        // Configurar a navegação do menu
        navView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.navProfile -> {
                    startActivity(Intent(this, ProfileActivity::class.java))
                }
                R.id.navCalendar -> {
                    startActivity(Intent(this, CalendarActivity::class.java))
                }
                R.id.navPatients -> {
                    startActivity(Intent(this, Paciente_Activity::class.java))
                }
                R.id.navFAQ -> {
                    Toast.makeText(this, "Tela de Perguntas Frequentes será criada em breve", Toast.LENGTH_SHORT).show()
                }
                R.id.navConsciousness -> {
                    Toast.makeText(this, "Tela Conscientize-se/Blog será criada em breve", Toast.LENGTH_SHORT).show()
                }
                R.id.navSettings -> {
                    Toast.makeText(this, "Tela de Configurações será criada em breve", Toast.LENGTH_SHORT).show()
                }
                R.id.navLogout -> {
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                }
            }
            drawerLayout.closeDrawer(GravityCompat.START)
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                drawerLayout.openDrawer(GravityCompat.START)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
