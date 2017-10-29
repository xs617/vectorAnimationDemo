package com.wen.animation

import android.content.Intent
import android.graphics.drawable.AnimatedVectorDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.support.graphics.drawable.AnimatedVectorDrawableCompat
import android.view.View
import android.widget.ImageView
import com.umeng.analytics.MobclickAgent

class MainActivity : BaseActivity() {
    lateinit var animationView: ImageView
    lateinit var tweenAnimationView: ImageView
    lateinit var trimDragon: ImageView
    lateinit var handle: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        animationView = findViewById(R.id.animationView) as ImageView
//        tweenAnimationView = findViewById(R.id.tweenAnimationView) as ImageView
        trimDragon = findViewById(R.id.trim_dragon) as ImageView
//        handle = Handler()

        MobclickAgent.setScenarioType(this, MobclickAgent.EScenarioType.E_UM_NORMAL)
//        tweenAnimationView.setOnClickListener(View.OnClickListener {
//            //            var alphaAnimation = AnimationUtils.loadAnimation(this,R.anim.tween_alpha)
////            tweenAnimationView.startAnimation(alphaAnimation)
////            var translateAnimation = AnimationUtils.loadAnimation(this,R.anim.tween_tran)
////            tweenAnimationView.startAnimation(translateAnimation)
//            var animationDrawable = tweenAnimationView.background as AnimationDrawable
//            animationDrawable.start()
//
//            var translateAnimation = AnimationUtils.loadAnimation(this, R.anim.tween_set)
//            (tweenAnimationView as View).startAnimation(translateAnimation)
//            var i = 0
//            var run = Runnable {
//                //                tweenAnimationView.x = 100f
////                tweenAnimationView.y = 100f
////                tweenAnimationView.invalidate()
////                tweenAnimationView.forceLayout()
////                tweenAnimationView.requestLayout()
//                tweenAnimationView.setImageLevel(i * 5)
//                if (i < 10) {
//
//                }
//            }
//            handle.postDelayed(run, 1000)
//        })


        trimDragon.setOnClickListener(View.OnClickListener {
            var drawable :AnimatedVectorDrawable = trimDragon.drawable as AnimatedVectorDrawable
//            var drawable : AnimatedVectorDrawableCompat = trimDragon.drawable as AnimatedVectorDrawableCompat
            drawable.start()
        })

//        animationView.setOnClickListener(View.OnClickListener {
//
////                        var objectAnimatior = ObjectAnimator.ofFloat(animationView, "translationX", 10f, 1080f, 300f, 600f)
//            var objectAnimatior = ObjectAnimator.ofFloat(animationView, "ss", 1.0f, 0.0f)
//            objectAnimatior.setDuration(2000)
//            objectAnimatior.repeatCount = 1
//            objectAnimatior.setRepeatMode(ValueAnimator.REVERSE)
//            objectAnimatior.start()
//            objectAnimatior.addUpdateListener(ValueAnimator.AnimatorUpdateListener {
//                val value = objectAnimatior.animatedValue as Float
//                animationView.scaleX = value
//                animationView.scaleY = value
//                animationView.alpha = value
//
//            })
//
//            var it = Intent()
//            it.setAction("action.test")
//            startActivity(it)
//        })


//        var valueAnimation = ValueAnimator.ofFloat(1.0f, 0f)
//        valueAnimation.setDuration(2000)
//        Log.e("launchMode", " cur TaskId :" + this.taskId)
    }


}
