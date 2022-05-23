package com.sytyy.example.view.activities

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.sytyy.example.R
import com.sytyy.example.databinding.ActivityAddUpdateFilmBinding
import com.sytyy.example.databinding.DialogFilmImgSelectionBinding

class AddUpdateFilmActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mBinding: ActivityAddUpdateFilmBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityAddUpdateFilmBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        setupActionBar()
        mBinding.addFilmImgButton.setOnClickListener(this)
    }

    //setup toolbar
    private fun setupActionBar() {
        setSupportActionBar(mBinding.addFilmToolBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true) //shosw backbutton

        mBinding.addFilmToolBar.setNavigationOnClickListener {
            onBackPressed()
        }
    }

    //add picture
    override fun onClick(p0: View?) {
        if (p0 != null) {
            when (p0.id) {
                R.id.add_film_img_button -> {
                    customImageSelectionDialog()
                    return
                }
            }
        }
    }

    //fetch dialog
    private fun customImageSelectionDialog() {
        val dialog = Dialog(this)
        val binding = DialogFilmImgSelectionBinding.inflate(layoutInflater)
        dialog.setContentView(binding.root)

        dialog.show()

    }
}