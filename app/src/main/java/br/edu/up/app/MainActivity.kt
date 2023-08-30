package br.edu.up.app

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showFirst(view: View) {
        supportFragmentManager.commit {
            replace<FirstFragment>(R.id.fragmentContainerView4)
        }
    }
    fun showSecond(view: View) {
        supportFragmentManager.commit {
            replace<SecondFragment>(R.id.fragmentContainerView4)
        }
    }
    fun showThird(view: View) {
        supportFragmentManager.commit {
            replace<ThirdFragment>(R.id.fragmentContainerView4)
        }
    }

}