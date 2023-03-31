package com.example.firstkotlinhw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun main() {
            val words = listOf(
                "java",
                "kotlin",
                "python",
                "javascript",
                "nodejs",
                "go",
                "react",
                "react native",
                "swift"
            )
            val vowels = mutableListOf<Char>()
            val consonants = mutableListOf<Char>()

            for (word in words) {
                for (letter in word) {
                    if (letter in listOf('a', 'e', 'i', 'o', 'u')) {
                        vowels.add(letter)
                    } else {
                        consonants.add(letter)
                    }
                }
            }

            println("Гласные: $vowels")
            println("Согласные: $consonants")
        }
    }
}