package com.example.portfolioapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSkills = findViewById<Button>(R.id.butSkills)
        buttonSkills.setOnClickListener{
            intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }

        val buttonAchievement = findViewById<Button>(R.id.butAch)
        buttonAchievement.setOnClickListener{
            intent  = Intent(this, AchievementActivity::class.java)
            startActivity(intent)
        }

        val buttonEdu = findViewById<Button>(R.id.butEdu)
        buttonEdu.setOnClickListener{
            intent = Intent(this, EduActivity::class.java)
            startActivity(intent)
        }

        val buttonExp = findViewById<Button>(R.id.butExp)
        buttonExp.setOnClickListener{
            intent = Intent(this, WorkExpActivity::class.java)
            startActivity(intent)
        }
    }
}