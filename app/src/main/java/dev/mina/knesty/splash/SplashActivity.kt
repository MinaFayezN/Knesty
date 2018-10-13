package dev.mina.knesty.splash

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.animation.AccelerateDecelerateInterpolator
import com.eftimoff.androipathview.PathView
import dev.mina.knesty.R


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        initializePathView()
    }

    private fun initializePathView() {
        val pathView = findViewById<PathView>(R.id.splash_logo_pathView)
        pathView.useNaturalColors()
        pathView.setFillAfter(true)
        pathView.pathAnimator
                .delay(100)
                .duration(2000)
                .listenerStart { }
                .listenerEnd { }
                .interpolator(AccelerateDecelerateInterpolator())
                .start()
    }
}
