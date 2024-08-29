package com.example.animation

import android.animation.ObjectAnimator
import android.os.Bundle
import android.util.TypedValue
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.animation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // vectorOne için animasyon (sol üst köşeden)
        binding.vectorOne.translationX = -1000f
        binding.vectorOne.translationY = -1500f
        val targetXOne = 0f
        val targetYOne = 0f
        val animXOne = ObjectAnimator.ofFloat(binding.vectorOne, "translationX", targetXOne)
        val animYOne = ObjectAnimator.ofFloat(binding.vectorOne, "translationY", targetYOne)
        animXOne.duration = 2000
        animYOne.duration = 2000
        animXOne.start()
        animYOne.start()

        // vectorTwo için animasyon (sağ üst köşeden)
        binding.vectorTwo.translationX = 1000f
        binding.vectorTwo.translationY = -1500f
        val targetXTwo = 0f
        val targetYTwo = 0f
        val animXTwo = ObjectAnimator.ofFloat(binding.vectorTwo, "translationX", targetXTwo)
        val animYTwo = ObjectAnimator.ofFloat(binding.vectorTwo, "translationY", targetYTwo)
        animXTwo.duration = 2000
        animYTwo.duration = 2000
        animXTwo.start()
        animYTwo.start()


        binding.vectorThree.translationX = 1000f
        binding.vectorThree.translationY = -50f
        val targetX3 = 0f
        val targetY3 = 0f
        val animX3 = ObjectAnimator.ofFloat(binding.vectorThree, "translationX", targetX3)
        val animY3 = ObjectAnimator.ofFloat(binding.vectorThree, "translationY", targetY3)
        animX3.duration = 2000
        animY3.duration = 2000
        animX3.start()
        animY3.start()


        binding.vectorFour.translationX = 1300f
        binding.vectorFour.translationY = 1500f
        val targetX4 = 0f
        val targetY4 = 0f
        val animX4 = ObjectAnimator.ofFloat(binding.vectorFour, "translationX", targetX4)
        val animY4 = ObjectAnimator.ofFloat(binding.vectorFour, "translationY", targetY4)
        animX4.duration = 2000
        animY4.duration = 2000
        animX4.start()
        animY4.start()

        binding.vectorFive.translationX = -1700f
        binding.vectorFive.translationY = -1500f
        val targetX5 = 0f
        val targetY5 = 0f
        val animX5 = ObjectAnimator.ofFloat(binding.vectorFive, "translationX", targetX5)
        val animY5 = ObjectAnimator.ofFloat(binding.vectorFive, "translationY", targetY5)
        animX5.duration = 2000
        animY5.duration = 2000
        animX5.start()
        animY5.start()

        binding.vectorSix.translationX = -2400f
        binding.vectorSix.translationY = 1500f
        val targetX6 = 0f
        val targetY6 = 0f
        val animX6 = ObjectAnimator.ofFloat(binding.vectorSix, "translationX", targetX6)
        val animY6 = ObjectAnimator.ofFloat(binding.vectorSix, "translationY", targetY6)
        animX6.duration = 2000
        animY6.duration = 2000
        animX6.start()
        animY6.start()

        binding.vectorSeven.translationX = -1200f
        binding.vectorSeven.translationY = 1500f
        val targetX7 = 0f
        val targetY7 = 0f
        val animX7 = ObjectAnimator.ofFloat(binding.vectorSeven, "translationX", targetX7)
        val animY7 = ObjectAnimator.ofFloat(binding.vectorSeven, "translationY", targetY7)
        animX7.duration = 2000
        animY7.duration = 2000
        animX7.start()
        animY7.start()


    }

}