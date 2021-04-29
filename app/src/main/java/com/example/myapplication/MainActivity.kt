package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.example.myapplication.ui.main.SectionsPagerAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)
        val fab: FloatingActionButton = findViewById(R.id.fab)

        fab.setOnClickListener {

//                view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show()

            val backbutton = Intent(this,OurActivity::class.java)
            startActivity(backbutton)
        }
    }

    fun linkRedirect(v: View) {

//                Toast.makeText(this, "name is name", Toast.LENGTH_LONG).show()

        when(v.id){
            R.id.button7 -> startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://cm.bell-labs.com/cm/cs/cbook/")))
            R.id.button8 -> startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1zH6LrCRO5cyHxggdAz7ubXPeB77qCFQq?usp=sharing")))
            R.id.button9 -> startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1s22nKV6lxeruqqRXXedDrWKKi2S8232y?usp=sharing")))
            R.id.button10 -> startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1jNGrqUAjdycbPIV-Qxcthv62ReZ-t3sE?usp=sharing")))
            R.id.button11 -> startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1DGOTaX6K8kNhAeD1xUrYZAiivxecBUYa?usp=sharing")))
//            R.id.button8 -> Toast.makeText(this, "name is button 8", Toast.LENGTH_LONG).show()
//            R.id.button9 -> Toast.makeText(this, "name is button 9", Toast.LENGTH_LONG).show()
//            R.id.button10 -> Toast.makeText(this, "name is button 10", Toast.LENGTH_LONG).show()
//            R.id.button11-> Toast.makeText(this, "name is button 11", Toast.LENGTH_LONG).show()

        }
//
//         switch (v.id) {
//             case "@+id/button7":
//             {
//                 Toast.makeText(this, "name is button 7", Toast.LENGTH_LONG).show()
//
//
////                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com")));
////                Snackbar.make(v, "Replace with your own action", Snackbar.LENGTH_LONG)
////                    .setAction("Action", null).show();
//
////                Toast myToast = Toast.makeText(this, "I'm a toast!", Toast.LENGTH_LONG);
////                myToast.show();
//
////                        Toast.makeText(this, "name is name", Toast.LENGTH_LONG).show()
//
//
//                 break;
//             }
//
//
//             case R . id . button8 :
//             startActivity(new Intent (Intent.ACTION_VIEW, Uri.parse("http://www.google.com")));
//             case R . id . button9 :
//             startActivity(new Intent (Intent.ACTION_VIEW, Uri.parse("http://www.google.com")));
//             case R . id . button10 :
//             startActivity(new Intent (Intent.ACTION_VIEW, Uri.parse("http://www.google.com")));
//             case R . id . button11 :
//             startActivity(new Intent (Intent.ACTION_VIEW, Uri.parse("http://www.google.com")));
//         }

    }
}