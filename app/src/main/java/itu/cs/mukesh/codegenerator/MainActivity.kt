package itu.cs.mukesh.codegenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidmads.library.qrgenearator.QRGContents
import androidmads.library.qrgenearator.QRGEncoder
import itu.cs.mukesh.codegenerator.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.generate.setOnClickListener{
            val text = binding.textField.text.toString()
            val qrgEncoder = QRGEncoder(text, null, QRGContents.Type.TEXT, 800)
            qrcode.setImageBitmap(qrgEncoder.bitmap)
        }
    }
}