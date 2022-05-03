package com.example.newtaipeizookotlin

import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.RemoteViews
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat
import androidx.databinding.DataBindingUtil
import com.example.newtaipeizookotlin.databinding.ActivityMainBinding
import com.example.newtaipeizookotlin.firebase.TransformNotification
import com.example.newtaipeizookotlin.fragments.DetailPageFragment
import java.util.concurrent.locks.ReentrantLock
import kotlin.random.Random

open class MainActivity : AppCompatActivity() {
    private var activityMainBinding: ActivityMainBinding? = null
    private lateinit var myApplication: MyApplication
    private var mIntent = Intent()
    private val mBundle = Bundle()
    private var mTitleStr = ""
    private var mPageCode = -1
    private var mFormFirebase = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        myApplication = application as MyApplication
        val actionbar: android.app.ActionBar? = actionBar
        actionbar?.hide()//隱藏暗色主題actionBar
        supportActionBar?.hide()//隱藏亮色主題actionBar

        getBundle(intent)
        initView()
        fcmTest()
    }

    private fun initView() {
        funSelectPage()
    }

    private fun init() {
        /**
         * 執行緒範本
         */
        val pLock = ReentrantLock()
        /**
         * 方式1
         */
//        Thread {
//            pLock.lock()
//            myApplication.setViewPagerApi()
//            pLock.unlock()
//        }.start()
//
//        pLock.lock()
//
//        pLock.unlock()


        /**
         * 方式2
         */
//        if (pLock.tryLock()) {
//            try {
//                //處理任務
//                pLock.lock()
//                myApplication.setViewPagerApi()
//            } catch (e: Exception) {
//
//            } finally {
//                //釋放鎖
//                pLock.unlock()
//                getBundle(intent)
//                funSelectPage()
//            }
//        } else {
//            //如果不能獲取鎖，則直接做其他事情
//        }


        /**
         * 方式3
         */
//        runBlocking {
//            val p1 = async(Dispatchers.IO){
//                myApplication.setViewPagerApi()
//            }
//        }
    }

    override fun onBackPressed() {
        myApplication.goToPage()
    }

//    /**
//     * 禁止按鈕返回Activity
//     */
//    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
//        return if (keyCode == KeyEvent.KEYCODE_BACK) {
//            false;
//        } else {
//            super.onKeyDown(keyCode, event);
//        }
//    }


    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        if (intent != null) {
            getBundle(intent)
            funSelectPage()
        }
    }

    private fun getBundle(pIntent: Intent) {
        mTitleStr = pIntent.extras?.getString("TransformNotificationFirebasePageTitle") ?: ""
        mPageCode = pIntent.extras?.getInt("TransformNotificationFirebasePageCode") ?: -1
        mFormFirebase = pIntent.extras?.getBoolean("TransformNotificationFromFirebase") ?: false
    }

    private fun setBundle() {
        mBundle.putString("TitleName", mTitleStr)
        mBundle.putInt("MainPageCode", mPageCode)
        mBundle.putBoolean("FormFirebase", mFormFirebase)
    }

    private fun funSelectPage() {
        myApplication.setMyFragmentManager(this.supportFragmentManager)
        setBundle()

        if (mTitleStr != "" && mPageCode != -1) {
            myApplication.goToPage(DetailPageFragment(), mBundle)
        }
//        else if (mTitleStr != "" && mPageCode == -1) {
//            myApplication.goToPage(ListViewPager(), mBundle)
//        }
        else {
            // myApplication.goToPage(HomePageFragment(), null)
            myApplication.goToPage(ListViewPager(), null)
        }

    }


    private fun fcmTest() {
        checkNotification("Plant", 5)
    }

    @SuppressLint("UnspecifiedImmutableFlag")
    private fun checkNotification(pTitle: String, pPageCode: Int) {
        val bundle = Bundle()
        mIntent = Intent(this, TransformNotification::class.java)
        bundle.putString("FirebasePageTitle", pTitle)
        bundle.putInt("FirebasePageCode", pPageCode)
        mIntent.putExtras(bundle)
        sendNotification(pTitle, pPageCode)
    }

    @SuppressLint("UnspecifiedImmutableFlag", "LaunchActivityFromNotification")
    private fun sendNotification(pTitle: String, pMessage: Int) {
        val mChannelID = "notificationChannelID"
        val mChannelName = "com.example.taipeizookotlin"

        mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

        /**
         * PendingIntent.getActivity 正常activity流程
         * PendingIntent.getBroadcast走廣播改造流程
         */
//        val pendingIntent =
//            PendingIntent.getActivity(
//                this,
//                0,
//                mIntent, PendingIntent.FLAG_UPDATE_CURRENT
//            )
        val pendingIntent =
            mIntent.let {
                PendingIntent.getBroadcast(
                    this,
                    0,
                    it, PendingIntent.FLAG_IMMUTABLE
                )
            }


        /**
         * 兩種客製化版本
         */
//        var iNotification = NotificationCompat.Builder(this, mChannelID)
//            .setSmallIcon(R.drawable.logo)
////            .setContentTitle(pTitle)
////            .setContentText(pMessage.toString())
//            //.setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.button_radius))
//            .setStyle(NotificationCompat.DecoratedCustomViewStyle())
//            .setCustomContentView(getRemoteView(pTitle, pMessage?.toString()))
//            .setCustomBigContentView(getRemoteView(pTitle, pMessage?.toString()))
//            .setAutoCancel(true)
//            .setContentIntent(pendingIntent)

        val iNotification = NotificationCompat.Builder(applicationContext, mChannelID)
            //.setWhen(System.currentTimeMillis())
            .setContent(getRemoteView(pTitle, pMessage.toString()))
            .setSmallIcon(R.drawable.logo)
            .setContentTitle(pTitle)
            .setContentText(pMessage.toString())
            //.setLargeIcon(BitmapFactory.decodeResource(resources, R.drawable.button_radius))
            .setAutoCancel(true)
            .setContentIntent(pendingIntent)


        val mNotificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager


        /**檢查手機版本是否支援通知；若支援則新增"頻道"*/
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val iNotificationChannel =
                NotificationChannel(
                    mChannelID,
                    mChannelName,
                    NotificationManager.IMPORTANCE_HIGH
                )

            mNotificationManager.createNotificationChannel(iNotificationChannel)
        }
        mNotificationManager.notify(Random.nextInt(5), iNotification.build())
    }


    @SuppressLint("RemoteViewLayout")
    private fun getRemoteView(pTitle: String, pMessage: String?): RemoteViews {
        val iRemoteView = RemoteViews(packageName, R.layout.fcm_remoteview)
        iRemoteView.setTextViewText(R.id.mTitle, pTitle)
        iRemoteView.setTextViewText(R.id.mMessage, pMessage)
        iRemoteView.setImageViewResource(R.id.mSmallIcon, R.drawable.logo)
        return iRemoteView
    }
}